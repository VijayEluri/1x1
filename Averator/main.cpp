#include <stdio.h>
#include <cmath>
#include <gtk/gtk.h>
#include <libintl.h>
#include <vector>
#include <setjmp.h>
#include <boost/lexical_cast.hpp>
#include <boost/foreach.hpp>
using namespace boost;
using namespace std;
#define _(x) gettext(x)
#define root(x,n) pow(x, 1.0/n)

//Main window widgets
GtkWidget *win;
GtkWidget *vbox;
GtkWidget *hbox;
GtkWidget *label;
GtkWidget *addEntry;
GtkWidget *addButton;
GtkWidget *datasetLabel; //Shows how many datasets have been entered already
GtkWidget *clearButton;
GtkWidget *showButton;
GtkWidget *algorithmComboBox;
GtkWidget *nSpinButton;
GtkWidget *averageLabel;

//List window widgets
GtkWidget *listWindow;
GtkWidget *

vector<long double> nums;

///Function prototypes
static void update(void);
static void deleteDataset(GtkWidget *wid, gpointer data);
static void deleteDataset(GtkWidget *wid, gpointer data);
static void showData(void);
static void clearData(void);
static void addNumber(void);

///Update data in GUI, called especially to show the mean value
static void update(void)
{
    unsigned int size = nums.size();
    long double mean = 0.0;
    switch(gtk_combo_box_get_active(GTK_COMBO_BOX(algorithmComboBox)))
    {
        case 0: //Arithmetic
            {
                BOOST_FOREACH(long double e, nums)
                {
                    mean += e;
                }
                mean /= size;
                break;
            }
        case 1: //Geometric
            {
                mean = 1.0;
                BOOST_FOREACH(long double e, nums)
                {
                    mean *= e;
                }
                mean =  root(mean, size);
                break;
            }
        case 2: //Harmonic
            {
                BOOST_FOREACH(long double e, nums)
                {
                    mean += 1.0/e;
                }
                mean = size/mean;
                break;
            }
        case 3: //Power
            {
                static int n = floor(gtk_spin_button_get_value(GTK_SPIN_BUTTON(nSpinButton)));
                BOOST_FOREACH(long double e, nums)
                {
                    mean += pow(e, n);
                }
                mean /= size;
                mean = root(mean, n);
                break;
            }
        default: break;
    }
    gtk_label_set_text(GTK_LABEL(datasetLabel), lexical_cast<string>(size).c_str());
    if(size != 0)
        {
            gtk_label_set_text(GTK_LABEL(averageLabel), lexical_cast<string>(mean).c_str());
        }
}

///Delete dataset, callback function used by showData()
static void deleteDataset(GtkWidget *wid, gpointer data)
{
    nums.erase(nums.begin()+(GPOINTER_TO_INT(data)-1));;
    ///Remove 'deleted' hbox from the main hbox
    //Get pointers to widgets
    GtkWidget *listMainHbox = (GtkWidget*) g_object_get_data(G_OBJECT(wid), "mainHbox");
    GtkWidget *listHbox = (GtkWidget*) g_object_get_data(G_OBJECT(wid), "hbox");
    gtk_container_remove(GTK_CONTAINER(listMainHbox), listHbox);
    ///...and show
    showData();
}

///Show window with datasets and buttons to delete single values
static void showData(void)
{
    GtkWidget *listWindow = gtk_window_new(GTK_WINDOW_TOPLEVEL);
     gtk_container_set_border_width (GTK_CONTAINER (listWindow), 8);
     gtk_window_set_title (GTK_WINDOW (listWindow), _("Averator Data"));
     gtk_window_set_position (GTK_WINDOW (listWindow), GTK_WIN_POS_CENTER);
     //gtk_window_set_geometry_hints(GTK_WINDOW(listWindow), listWindow, &quadraticGeometry, GDK_HINT_ASPECT); //Make window (nearly) quadratic
     gtk_widget_show_all(listWindow);
    GtkWidget *listMainHbox;;
    GtkWidget *listLabel;
    GtkWidget *listDeleteButton;
    GtkWidget *listHbox;
    unsigned int size = nums.size();
    ///If we don't have data inform the user about it (via message dialog) and return.
    if(size == 0)
    {
        GtkWidget *msgDialog = gtk_message_dialog_new(GTK_WINDOW(listWindow), GTK_DIALOG_DESTROY_WITH_PARENT, GTK_MESSAGE_ERROR, GTK_BUTTONS_OK, _("No data available!"));
        gtk_dialog_run(GTK_DIALOG(msgDialog));
        gtk_widget_destroy(msgDialog);
        return;
    }
    ///If we have data show it
    short linesPerRow = floor(sqrt(size));
    listMainHbox = gtk_hbox_new(false, 3);
    short colIndex;
    short rowIndex;
    for(unsigned int i = 0; i < size; i++)
    {
        ///Init hbox to snap widgets in
        listHbox = gtk_hbox_new(false, 4);
         listLabel = gtk_label_new(lexical_cast<string>(nums[i]).c_str());
          gtk_box_pack_start_defaults(GTK_BOX(listHbox), listLabel);
        ///Init button to delete single datasets
        listDeleteButton = gtk_button_new_with_label(_("Delete"));
          gtk_box_pack_start_defaults(GTK_BOX(listHbox), listDeleteButton);
          //Attach widgets to the button (used by deleteDataset(...)
          g_object_set_data(G_OBJECT(listDeleteButton), "hbox", listHbox);
          g_object_set_data(G_OBJECT(listDeleteButton), "mainHbox", listMainHbox);
          g_signal_connect(listDeleteButton, "clicked", G_CALLBACK(deleteDataset), GINT_TO_POINTER(i));
        ///Calculate row and column index and attach listHbox to table
        colIndex = i%linesPerRow;
        rowIndex = floor(i/linesPerRow);
        gtk_box_pack_start_defaults(GTK_BOX(listMainHbox), listHbox);
    }
    gtk_container_add (GTK_CONTAINER(listWindow), listMainHbox);
    gtk_widget_show_all(listWindow);
}

///Remove all data from the container
static void clearData(void)
{
    nums.clear();
    gtk_label_set_text(GTK_LABEL(datasetLabel), "0");
    gtk_label_set_text(GTK_LABEL(averageLabel), "");
}

///Inserts a single value in the vector
static void addNumber(void)
{

    string value(gtk_entry_get_text(GTK_ENTRY(addEntry)));
    static string::size_type v = value.find(",", 0);
    if(v != string::npos)
        {
            value[v] = '.';
            gtk_entry_set_text(GTK_ENTRY(addEntry), value.c_str());
        }
    nums.push_back(lexical_cast<long double>(value));
    gtk_widget_grab_focus(addEntry);
    update();
}

int main (int argc, char *argv[])
{
  /* Initialize GTK+ */
  g_log_set_handler ("Gtk", G_LOG_LEVEL_WARNING, (GLogFunc) gtk_false, NULL);
  gtk_init (&argc, &argv);
  g_log_set_handler ("Gtk", G_LOG_LEVEL_WARNING, g_log_default_handler, NULL);

  /* Create the main window */
  win = gtk_window_new (GTK_WINDOW_TOPLEVEL);
  gtk_container_set_border_width (GTK_CONTAINER (win), 8);
  gtk_window_set_title (GTK_WINDOW (win), _("Averator"));
  gtk_window_set_position (GTK_WINDOW (win), GTK_WIN_POS_CENTER);
  g_signal_connect (win, "destroy", gtk_main_quit, NULL);

  /* Create a vertical box with buttons */
  vbox = gtk_vbox_new (false, 5);
  gtk_container_add (GTK_CONTAINER (win), vbox);
  ///Add main widgets
  //Row to add numbers
  hbox = gtk_hbox_new(false, 5);
  addEntry = gtk_entry_new();
   g_signal_connect(addEntry, "activate", addNumber, NULL);
   gtk_box_pack_start_defaults(GTK_BOX(hbox), addEntry);
  addButton = gtk_button_new_with_label(_("Add"));
   g_signal_connect (addButton, "clicked", addNumber, NULL);
   gtk_box_pack_start_defaults(GTK_BOX(hbox), addButton);
  label = gtk_label_new(_("Datasets:"));
   gtk_box_pack_start_defaults(GTK_BOX(hbox), label);
  datasetLabel = gtk_label_new("0");
   gtk_box_pack_start_defaults(GTK_BOX(hbox), datasetLabel);
  clearButton = gtk_button_new_with_label(_("Clear"));
   g_signal_connect (clearButton, "clicked", clearData, NULL);
   gtk_box_pack_start_defaults(GTK_BOX(hbox), clearButton);
  showButton = gtk_button_new_with_label(_("Show"));
   g_signal_connect (showButton, "clicked", showData, NULL);
   gtk_box_pack_start_defaults(GTK_BOX(hbox), showButton);
  gtk_box_pack_start_defaults(GTK_BOX(vbox), hbox);
  //Row to choose algorithm (and parameters)
  hbox = gtk_hbox_new(false, 5);
  label = gtk_label_new(_("Algorithm:"));
   gtk_box_pack_start_defaults(GTK_BOX(hbox), label);
  algorithmComboBox = gtk_combo_box_new_text();
   gtk_combo_box_append_text(GTK_COMBO_BOX(algorithmComboBox), _("Arithmetic mean"));
   gtk_combo_box_append_text(GTK_COMBO_BOX(algorithmComboBox), _("Geometric mean"));
   gtk_combo_box_append_text(GTK_COMBO_BOX(algorithmComboBox), _("Harmonic mean"));
   gtk_combo_box_append_text(GTK_COMBO_BOX(algorithmComboBox), _("Power mean"));
   gtk_combo_box_set_active(GTK_COMBO_BOX(algorithmComboBox), 0);
   g_signal_connect (algorithmComboBox, "changed", update, NULL);
   gtk_box_pack_start_defaults(GTK_BOX(hbox), algorithmComboBox);
  label = gtk_label_new(_("n:"));
   gtk_box_pack_start_defaults(GTK_BOX(hbox), label);
  nSpinButton = gtk_spin_button_new_with_range(2, 999999, 1.0);
   gtk_spin_button_set_value(GTK_SPIN_BUTTON(nSpinButton), 2);
   g_signal_connect (nSpinButton, "change-value", update, NULL);
   gtk_box_pack_start_defaults(GTK_BOX(hbox), nSpinButton);
  gtk_box_pack_start_defaults(GTK_BOX(vbox), hbox);
  //Result row
  hbox = gtk_hbox_new(false, 5);
  label = gtk_label_new(_("Mean:"));
   gtk_box_pack_start_defaults(GTK_BOX(hbox), label);
  averageLabel = gtk_label_new("");
   gtk_box_pack_start_defaults(GTK_BOX(hbox), averageLabel);
  gtk_box_pack_start_defaults(GTK_BOX(vbox), hbox);

  /* Enter the main loop */
  gtk_widget_show_all(win);
  gtk_main ();
  return 0;
}
