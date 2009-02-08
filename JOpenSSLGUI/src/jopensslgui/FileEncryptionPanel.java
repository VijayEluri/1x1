/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileEncryptionPanel.java
 *
 * Created on 31.01.2009, 13:23:15
 */
package jopensslgui;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author uli
 */
public class FileEncryptionPanel extends javax.swing.JPanel
{

    /** Creates new form FileEncryptionPanel */
    public FileEncryptionPanel()
    {
        initComponents();
        initCryptoAlgorithms();
    }

    private void initCryptoAlgorithms()
    {
        try
        {
            Process p = Runtime.getRuntime().exec("openssl list-cipher-commands");
            p.waitFor();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while (r.ready())
            {
                algorithmComboBox.addItem(r.readLine().toUpperCase());
            }
            algorithmComboBox.setSelectedIndex(4);
            r.close();
        }

        catch (IOException ex)
        {
            Logger.getLogger(MessageDigestPanel.class.getName()).log(Level.SEVERE, null, ex);
        }        catch (InterruptedException ex)
        {
            Logger.getLogger(GenerateECKeysPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputFileLabel = new javax.swing.JLabel();
        outputFileLabel = new javax.swing.JLabel();
        outputFileField = new javax.swing.JTextField();
        encryptionInputField = new javax.swing.JTextField();
        selectInputFileButton = new javax.swing.JButton();
        selectOutputFileButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        decryptCheckbox = new javax.swing.JCheckBox();
        fileEncryptionOKButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        algorithmLabel = new javax.swing.JLabel();
        algorithmComboBox = new javax.swing.JComboBox();

        inputFileLabel.setText( i18n.getString("FileEncryptionPanel.inputFileLabel.text")); // NOI18N

        outputFileLabel.setText( i18n.getString("FileEncryptionPanel.outputFileLabel.text")); // NOI18N

        outputFileField.setText( i18n.getString("FileEncryptionPanel.outputFileField.text")); // NOI18N

        encryptionInputField.setText( i18n.getString("FileEncryptionPanel.encryptionInputField.text")); // NOI18N

        selectInputFileButton.setText(i18n.getString("FileEncryptionPanel.selectInputFileButton.text")); // NOI18N
        selectInputFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectInputFileButtonActionPerformed(evt);
            }
        });

        selectOutputFileButton.setText(i18n.getString("FileEncryptionPanel.selectOutputFileButton.text")); // NOI18N
        selectOutputFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOutputFileButtonActionPerformed(evt);
            }
        });

        passwordLabel.setDisplayedMnemonic('p');
        passwordLabel.setText(i18n.getString("FileEncryptionPanel.passwordLabel.text")); // NOI18N

        decryptCheckbox.setMnemonic('d');
        decryptCheckbox.setText(i18n.getString("FileEncryptionPanel.decryptCheckbox.text")); // NOI18N

        fileEncryptionOKButton.setMnemonic('o');
        fileEncryptionOKButton.setText(i18n.getString("FileEncryptionPanel.fileEncryptionOKButton.text")); // NOI18N
        fileEncryptionOKButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileEncryptionOKButtonMouseClicked(evt);
            }
        });

        algorithmLabel.setText( i18n.getString("FileEncryptionPanel.algorithmLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputFileLabel)
                                    .addComponent(outputFileLabel))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(outputFileField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(encryptionInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectInputFileButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectOutputFileButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordLabel)
                                .addGap(15, 15, 15)
                                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(algorithmLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(algorithmComboBox, 0, 298, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(decryptCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fileEncryptionOKButton, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFileLabel)
                    .addComponent(encryptionInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectInputFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputFileLabel)
                    .addComponent(outputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectOutputFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(algorithmLabel)
                    .addComponent(algorithmComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileEncryptionOKButton)
                    .addComponent(decryptCheckbox))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectInputFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectInputFileButtonActionPerformed
    {//GEN-HEADEREND:event_selectInputFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(encryptionInputField.getText()));
        fileChooser.showSaveDialog(this);
        encryptionInputField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectInputFileButtonActionPerformed

    private void selectOutputFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectOutputFileButtonActionPerformed
    {//GEN-HEADEREND:event_selectOutputFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(outputFileField.getText()));
        fileChooser.showSaveDialog(this);
        outputFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectOutputFileButtonActionPerformed

    private void fileEncryptionOKButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_fileEncryptionOKButtonMouseClicked
    {//GEN-HEADEREND:event_fileEncryptionOKButtonMouseClicked
        if (decryptCheckbox.isSelected())
        {
            cryptSymmetric(false);
        }
        else
        {
            cryptSymmetric(true);
        }
}//GEN-LAST:event_fileEncryptionOKButtonMouseClicked

    private void cryptSymmetric(boolean encrypt)
    {
        try
        {
            //Init the cipher
            Runtime r = Runtime.getRuntime();
            StringBuilder cmdBuilder = new StringBuilder("openssl aes-256-cbc");//NOI18N
            //I/O filenames
            cmdBuilder.append(" -in \"" + encryptionInputField.getText() + "\""); //NOI18N
            cmdBuilder.append(" -out \"" + outputFileField.getText() + "\""); //NOI18N
            //Encrypt/decrypt
            if (decryptCheckbox.isSelected())
            {
                cmdBuilder.append(" -d"); //NOI18N
            }
            else
            {
                cmdBuilder.append(" -e"); //NOI18N
            }
            //Password
            cmdBuilder.append(" -k \"" + new String(passwordField.getPassword()) + "\""); //NOI18N

            /**
             * Execute the command
             */
            r.exec(cmdBuilder.toString());
            System.out.println("\"" + cmdBuilder.toString() + "\""); //NOI18N

            //Display a success message
            JOpenSSLFrame.displaySuccessMessage();
            return; //Don't show the error dialog
        }
        catch (Exception ex)
        {
            Logger.getLogger(FileEncryptionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOpenSSLFrame.displayErrorMessage();
    }
    private JFileChooser fileChooser = new JFileChooser();
    private ResourceBundle i18n = ResourceBundle.getBundle("jopensslgui/Bundle"); //NOI18N
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox algorithmComboBox;
    private javax.swing.JLabel algorithmLabel;
    private javax.swing.JCheckBox decryptCheckbox;
    private javax.swing.JTextField encryptionInputField;
    private javax.swing.JButton fileEncryptionOKButton;
    private javax.swing.JLabel inputFileLabel;
    private javax.swing.JTextField outputFileField;
    private javax.swing.JLabel outputFileLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton selectInputFileButton;
    private javax.swing.JButton selectOutputFileButton;
    // End of variables declaration//GEN-END:variables
}
