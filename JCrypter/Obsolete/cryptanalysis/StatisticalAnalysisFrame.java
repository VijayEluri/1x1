/*
 * StatisticalAnalysisFrame.java
 *
 * Created on 20. Oktober 2008, 14:36
 */
package jcrypter.cryptanalysis;

import java.io.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import jcrypter.JCrypterFrame;

/**
 *
 * @author  uli
 */
public class StatisticalAnalysisFrame extends javax.swing.JFrame
{

    /** Creates new form StatisticalAnalysisFrame */
    public StatisticalAnalysisFrame()
    {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        charPercentagePanel = new javax.swing.JPanel();
        displayLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        charPercentageTable = new javax.swing.JTable();
        displaySpinner = new javax.swing.JSpinner();
        analyzeCharPercentageButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        extrasMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(i18n.getString("StatisticalAnalysisFrame.title")); // NOI18N

        charPercentagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(i18n.getString("StatisticalAnalysisFrame.charPercentagePanel.border.title"))); // NOI18N

        displayLabel.setText(i18n.getString("StatisticalAnalysisFrame.displayLabel.text")); // NOI18N

        charPercentageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Character", "Count", "Percentage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(charPercentageTable);

        displaySpinner.setModel(new SpinnerNumberModel(10,1,1000,1));
        displaySpinner.setToolTipText(i18n.getString("StatisticalAnalysisFrame.displaySpinner.toolTipText")); // NOI18N

        analyzeCharPercentageButton.setText(i18n.getString("StatisticalAnalysisFrame.analyzeCharPercentageButton.text")); // NOI18N
        analyzeCharPercentageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analyzeCharPercentageButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout charPercentagePanelLayout = new javax.swing.GroupLayout(charPercentagePanel);
        charPercentagePanel.setLayout(charPercentagePanelLayout);
        charPercentagePanelLayout.setHorizontalGroup(
            charPercentagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, charPercentagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(charPercentagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(analyzeCharPercentageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, charPercentagePanelLayout.createSequentialGroup()
                        .addComponent(displayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displaySpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        charPercentagePanelLayout.setVerticalGroup(
            charPercentagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(charPercentagePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(charPercentagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayLabel)
                    .addComponent(displaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(analyzeCharPercentageButton)
                .addContainerGap())
        );

        fileMenu.setText(i18n.getString("StatisticalAnalysisFrame.fileMenu.text")); // NOI18N

        loadFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        loadFileMenuItem.setText(i18n.getString("StatisticalAnalysisFrame.loadFileMenuItem.text")); // NOI18N
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadFileMenuItem);

        menuBar.add(fileMenu);

        extrasMenu.setText(i18n.getString("StatisticalAnalysisFrame.extrasMenu.text")); // NOI18N
        menuBar.add(extrasMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(charPercentagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(charPercentagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void analyzeCharPercentageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analyzeCharPercentageButtonMouseClicked
    analyzeFile(selectedFile);
}//GEN-LAST:event_analyzeCharPercentageButtonMouseClicked

private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed
    fc.showOpenDialog(this);
    selectedFile = fc.getSelectedFile();
}//GEN-LAST:event_loadFileMenuItemActionPerformed

    private void analyzeFile(File file)
    {
        InputStream f = null;
        try
        {
            //Init the main set
            charOccurrences = new TreeSet<CharLongPair>(new CharLongPairComparator());
            f = new BufferedInputStream(new FileInputStream(file));
            long totalLength = f.available();
            ///Count the characters
            char c;
            for (int i = 0; i < totalLength; i++)
            {
                c = (char) f.read();
                if (c == -1)
                {
                    break;
                }
                Iterator<CharLongPair> it = charOccurrences.iterator();
                while(it.hasNext())
                {
                    CharLongPair cp = new CharLongPair(it.next());
                    if (cp.getC() == c)
                    {
                        charOccurrences.remove(cp);
                        cp.setL(cp.getL() + 1);
                        charOccurrences.add(cp);
                    }
                    continue; //Don't create a new dataset
                }
                charOccurrences.add(new CharLongPair(c, 1));
            }
            ///Fill the table with the counts
            //Get the number of rows to display
            SpinnerNumberModel displayModel =
                    (SpinnerNumberModel) displaySpinner.getModel();
            int displayRows = displayModel.getNumber().intValue();
            Iterator<CharLongPair> it = charOccurrences.iterator();
            
            Vector tableData = new Vector();
            for(;displayRows > 0;displayRows--)
            {
                if(!it.hasNext()) {break;}
                CharLongPair cp = it.next();
                Vector rowData = new Vector();
                rowData.add(cp.getC());
                rowData.add(cp.getL());
                rowData.add(100*(cp.getL()/totalLength));
                tableData.add(rowData);
            }
            Vector colNames = new Vector();
            colNames.add("Character");
            colNames.add("Count");
            colNames.add("Percentage");
            charPercentageTable.setModel(new DefaultTableModel(tableData, colNames));
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(StatisticalAnalysisFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex)
        {
            Logger.getLogger(StatisticalAnalysisFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                f.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(StatisticalAnalysisFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {
                new StatisticalAnalysisFrame().setVisible(true);
            }
        });
    }
    private ResourceBundle i18n =
            ResourceBundle.getBundle("jcrypter/cryptanalysis/Bundle");
    
    private SortedSet<CharLongPair> charOccurrences;
    private JFileChooser fc = JCrypterFrame.mainFrame.fileChooser;
    private File selectedFile = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzeCharPercentageButton;
    private javax.swing.JPanel charPercentagePanel;
    private javax.swing.JTable charPercentageTable;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JSpinner displaySpinner;
    private javax.swing.JMenu extrasMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
    //Inner classes
    private static class CharLongPairComparator implements Comparator
    {
        @Override
        public int compare(Object o1, Object o2)
        {   
            CharLongPair e1 = (CharLongPair) o1;
            CharLongPair e2 = (CharLongPair) o2;
            
            if(e1.getL() < e2.getL()) {return -1;}
            if(e1.getL() == e2.getL()){return 0;}
            return 1; //Implies e1.l > e2.l
        }
    }

    /**
     * Simply a placeholder for a char and a long variable to use a Set
     * instead of a Map and so make value comparation easier
     * @see CharLongPairComparator
     */
    private static class CharLongPair
    {
        private char c;
        private long l;
        
        public CharLongPair(char c, long l)
        {
            this.c = c;
            this.l = l;
        }

        private CharLongPair(CharLongPair next)
        {
            this(next.getC(), next.getL());
        }

        public char getC()
        {
            return c;
        }

        public void setC(char c)
        {
            this.c = c;
        }

        public long getL()
        {
            return l;
        }

        public void setL(long l)
        {
            this.l = l;
        }
    }

}