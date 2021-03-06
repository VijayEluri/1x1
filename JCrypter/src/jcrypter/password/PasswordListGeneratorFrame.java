/*
 * PasswordListGeneratorFrame.java
 *
 * Created on 16. Oktober 2008, 16:49
 */
package jcrypter.password;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import jcrypter.JCrypterFrame;

/**
 *
 * @author  uli
 */
public class PasswordListGeneratorFrame extends javax.swing.JFrame
{

    /** Creates new form PasswordListGeneratorFrame
     * @param parent 
     */
    public PasswordListGeneratorFrame(PasswordGeneratorFrame parent)
    {
        initComponents();
        this.parent = parent;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outputTypeRadioButton = new javax.swing.ButtonGroup();
        outputTypePanel = new javax.swing.JPanel();
        plaintextRadioButton = new javax.swing.JRadioButton();
        latexRadioButton = new javax.swing.JRadioButton();
        countLabel = new javax.swing.JLabel();
        countSpinner = new javax.swing.JSpinner();
        okButton = new javax.swing.JButton();
        columnsLabel = new javax.swing.JLabel();
        columnSpinner = new javax.swing.JSpinner();
        enumerateCheckbox = new javax.swing.JCheckBox();
        menuBar = new javax.swing.JMenuBar();
        settingsMenu = new javax.swing.JMenu();
        latexSettingsMenuItem = new javax.swing.JMenuItem();

        setTitle(i18n.getString("PasswordListGeneratorFrame.title")); // NOI18N

        outputTypePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(i18n.getString("PasswordListGeneratorFrame.outputTypePanel.border.title"))); // NOI18N

        outputTypeRadioButton.add(plaintextRadioButton);
        plaintextRadioButton.setMnemonic('p');
        plaintextRadioButton.setSelected(true);
        plaintextRadioButton.setText(i18n.getString("PasswordListGeneratorFrame.plaintextRadioButton.text")); // NOI18N
        outputTypePanel.add(plaintextRadioButton);

        outputTypeRadioButton.add(latexRadioButton);
        latexRadioButton.setMnemonic('l');
        latexRadioButton.setText(i18n.getString("PasswordListGeneratorFrame.latexRadioButton.text")); // NOI18N
        outputTypePanel.add(latexRadioButton);

        countLabel.setText(i18n.getString("PasswordListGeneratorFrame.countLabel.text")); // NOI18N

        countSpinner.setModel(new SpinnerNumberModel(100,0,2000000,1));

        okButton.setText(i18n.getString("PasswordListGeneratorFrame.okButton.text")); // NOI18N
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        columnsLabel.setText(i18n.getString("PasswordListGeneratorFrame.columnsLabel.text")); // NOI18N

        columnSpinner.setModel(new SpinnerNumberModel(2,0,50,1));

        enumerateCheckbox.setSelected(true);
        enumerateCheckbox.setText(i18n.getString("PasswordListGeneratorFrame.enumerateCheckbox.text")); // NOI18N

        settingsMenu.setText(i18n.getString("PasswordListGeneratorFrame.settingsMenu.text")); // NOI18N

        latexSettingsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        latexSettingsMenuItem.setText(i18n.getString("PasswordListGeneratorFrame.latexSettingsMenuItem.text")); // NOI18N
        latexSettingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latexSettingsMenuItemActionPerformed(evt);
            }
        });
        settingsMenu.add(latexSettingsMenuItem);

        menuBar.add(settingsMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputTypePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(columnsLabel)
                            .addComponent(countLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(enumerateCheckbox)
                            .addComponent(columnSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addComponent(okButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countLabel)
                    .addComponent(countSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columnsLabel)
                    .addComponent(columnSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enumerateCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
    //Update the password generator charset
    parent.updateCharset();
    //Show a file selection dialog to ask the user where to save the passwords
    fileChooser.showSaveDialog(this);
    File file = fileChooser.getSelectedFile();
    //Call the apropriate method (depending on the selected checkbox)
    if (plaintextRadioButton.isSelected())
    {
        generatePlaintextList(file);
    }
    else if (latexRadioButton.isSelected())
    {
        generateLaTeXList(file);
    }
}//GEN-LAST:event_okButtonMouseClicked

private void latexSettingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latexSettingsMenuItemActionPerformed
latexSettingsDialog.setVisible(true);
}//GEN-LAST:event_latexSettingsMenuItemActionPerformed

    private void generateLaTeXList(File file)
    {
        //Initialize the file writer
        FileWriter fw = null;
        try
        {
            PasswordGenerator pwgen = parent.getPwgen();
            int count = getCount();
            int cols = getColumns();
            fw = new FileWriter(file);
            //Generate the password list
            List<char[]> pwList =
                    pwgen.generatePasswordList(parent.getLength(), count);
            //Main write directives and loop
            //Write header
            fw.write(latexSettingsDialog.getDocumentclassDirective() + " \n"); //Write documentclass directive //NOI18N
            fw.write("\\usepackage{multicol}\n"); //NOI18N
            fw.write(latexSettingsDialog.getAdditionalDirectives() + " \n"); //NOI18N
            fw.write("\\parindent 0pt \n\n"); //NOI18N
            fw.write("\\begin{document} \n"); //NOI18N
            fw.write(latexSettingsDialog.getMulticolDirective().replaceAll("%n", Integer.toString(cols)) + "\n"); //NOI18N
            //Main loop preparations
            String passwordString;
            boolean enumerate = enumerateCheckbox.isSelected();
            Iterator<char[]> pwIterator = pwList.iterator();
            
            for (int i = 1; i <= count; i++)
            {
                //Write the formatted password number if selected
                if (enumerate)
                {
                    fw.write(latexSettingsDialog.getEnumMarkup().replaceAll("%n", Integer.toString(i) + ": ")); //NOI18N
                }
                //Write the formatted password
                passwordString = new String(pwIterator.next());
                fw.write(latexSettingsDialog.getPasswordMarkup().replaceAll("%s", passwordString) + "\\\\ \n"); //Write the password //NOI18N
            }
            //Write the end directives
            fw.write("\\end{multicols} \n"); //NOI18N
            fw.write("\\end{document}\\noindend \n"); //NOI18N
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), i18n.getString("IO_Error"), JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            try
            {
                fw.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(PasswordListGeneratorFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void generatePlaintextList(File file)
    {
        //Initialize the file writer
        FileWriter fw = null;
        try
        {
            PasswordGenerator pwgen = parent.getPwgen();
            int count = getCount();
            int cols = getColumns();
            fw = new FileWriter(file);
            //Generate the password list
            List<char[]> pwList =
                    pwgen.generatePasswordList(parent.getLength(), count);
            //Main write loop
            int colCount = 0;
            boolean enumerate = enumerateCheckbox.isSelected();
            Iterator<char[]> pwIterator = pwList.iterator();
            for (int i = 1; i <= count; i++)
            {
                if (enumerate)
                {
                    fw.write(i + ": "); //Write the password number if selected //NOI18N
                }
                fw.write(new String(pwIterator.next())); //Write the password
                fw.write(' '); //Put a space between two passwords
                colCount++;
                if (colCount == cols)
                {
                    fw.write("\n"); //NOI18N
                    colCount = 0;
                }
            }
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), i18n.getString("IO_Error"), JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            try
            {
                fw.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(PasswordListGeneratorFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (NullPointerException ex)
            {
            }
        }
    }
    
    private PasswordGeneratorFrame parent = null;
    private ResourceBundle i18n =
            ResourceBundle.getBundle("jcrypter/password/Bundle");
    private JFileChooser fileChooser = JCrypterFrame.mainFrame.fileChooser;
    private LaTeXSettingsDialog latexSettingsDialog = new LaTeXSettingsDialog(this, true);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner columnSpinner;
    private javax.swing.JLabel columnsLabel;
    private javax.swing.JLabel countLabel;
    private javax.swing.JSpinner countSpinner;
    private javax.swing.JCheckBox enumerateCheckbox;
    private javax.swing.JRadioButton latexRadioButton;
    private javax.swing.JMenuItem latexSettingsMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton okButton;
    private javax.swing.JPanel outputTypePanel;
    private javax.swing.ButtonGroup outputTypeRadioButton;
    private javax.swing.JRadioButton plaintextRadioButton;
    private javax.swing.JMenu settingsMenu;
    // End of variables declaration//GEN-END:variables
    private int getCount()
    {
        SpinnerNumberModel countModel =
                (SpinnerNumberModel) countSpinner.getModel();
        return countModel.getNumber().intValue();
    }

    private int getColumns()
    {
        SpinnerNumberModel columnModel =
                (SpinnerNumberModel) columnSpinner.getModel();
        return columnModel.getNumber().intValue();
    }
}
