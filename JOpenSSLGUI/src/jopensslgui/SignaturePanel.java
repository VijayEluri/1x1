/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SignaturePanel.java
 *
 * Created on 02.02.2009, 16:06:23
 */
package jopensslgui;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author uli
 */
public class SignaturePanel extends javax.swing.JPanel
{

    /** Creates new form SignaturePanel */
    public SignaturePanel()
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

        signPanel = new javax.swing.JPanel();
        privateKeyLabel = new javax.swing.JLabel();
        privateKeyFileField = new javax.swing.JTextField();
        selectPrivateKeyFileButton = new javax.swing.JButton();
        selectInputFileButton = new javax.swing.JButton();
        inputFileField = new javax.swing.JTextField();
        inputFileLabel = new javax.swing.JLabel();
        outputFileLabel = new javax.swing.JLabel();
        outputFileField = new javax.swing.JTextField();
        selectOutputFileButton = new javax.swing.JButton();
        signOkButton = new javax.swing.JButton();
        dss1CheckBox = new javax.swing.JCheckBox();
        verifyPanel = new javax.swing.JPanel();
        publicKeyFileField = new javax.swing.JTextField();
        publicKeyLabel = new javax.swing.JLabel();
        selectPublicKeyFileButton = new javax.swing.JButton();
        verifySelectInputFileButton = new javax.swing.JButton();
        verifyInputFileField = new javax.swing.JTextField();
        verifyInputLabel = new javax.swing.JLabel();
        verifyDss1CheckBox = new javax.swing.JCheckBox();
        verifyOkButton = new javax.swing.JButton();
        signatureFileLabel = new javax.swing.JLabel();
        signatureFileField = new javax.swing.JTextField();
        selectSignatureFileButton = new javax.swing.JButton();

        signPanel.setBorder(javax.swing.BorderFactory.createTitledBorder( i18n.getString("SignaturePanel.signPanel.border.title"))); // NOI18N

        privateKeyLabel.setText( i18n.getString("SignaturePanel.privateKeyLabel.text")); // NOI18N

        selectPrivateKeyFileButton.setText(i18n.getString("SignaturePanel.selectPrivateKeyFileButton.text")); // NOI18N
        selectPrivateKeyFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPrivateKeyFileButtonActionPerformed(evt);
            }
        });

        selectInputFileButton.setText(i18n.getString("SignaturePanel.selectInputFileButton.text")); // NOI18N
        selectInputFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectInputFileButtonActionPerformed(evt);
            }
        });

        inputFileField.setText( i18n.getString("SignaturePanel.inputFileField.text")); // NOI18N

        inputFileLabel.setText( i18n.getString("SignaturePanel.inputFileLabel.text")); // NOI18N

        outputFileLabel.setText( i18n.getString("SignaturePanel.outputFileLabel.text")); // NOI18N

        outputFileField.setText( i18n.getString("SignaturePanel.outputFileField.text")); // NOI18N

        selectOutputFileButton.setText(i18n.getString("SignaturePanel.selectOutputFileButton.text")); // NOI18N
        selectOutputFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOutputFileButtonActionPerformed(evt);
            }
        });

        signOkButton.setText( i18n.getString("SignaturePanel.signOkButton.text")); // NOI18N
        signOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOkButtonActionPerformed(evt);
            }
        });

        dss1CheckBox.setText( i18n.getString("SignaturePanel.dss1CheckBox.text")); // NOI18N
        dss1CheckBox.setToolTipText( i18n.getString("SignaturePanel.dss1CheckBox.toolTipText")); // NOI18N

        javax.swing.GroupLayout signPanelLayout = new javax.swing.GroupLayout(signPanel);
        signPanel.setLayout(signPanelLayout);
        signPanelLayout.setHorizontalGroup(
            signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(signPanelLayout.createSequentialGroup()
                        .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFileLabel)
                            .addComponent(outputFileLabel)
                            .addComponent(privateKeyLabel))
                        .addGap(7, 7, 7))
                    .addGroup(signPanelLayout.createSequentialGroup()
                        .addComponent(dss1CheckBox)
                        .addGap(18, 18, 18)))
                .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(signPanelLayout.createSequentialGroup()
                        .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(privateKeyFileField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(outputFileField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(inputFileField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selectInputFileButton)
                                .addComponent(selectOutputFileButton, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(selectPrivateKeyFileButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(signOkButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                .addContainerGap())
        );
        signPanelLayout.setVerticalGroup(
            signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signPanelLayout.createSequentialGroup()
                .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privateKeyLabel)
                    .addComponent(privateKeyFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPrivateKeyFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFileLabel)
                    .addComponent(inputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectInputFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputFileLabel)
                    .addComponent(outputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectOutputFileButton))
                .addGap(4, 4, 4)
                .addGroup(signPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signOkButton)
                    .addComponent(dss1CheckBox))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        verifyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder( i18n.getString("SignaturePanel.verifyPanel.border.title"))); // NOI18N

        publicKeyLabel.setText( i18n.getString("SignaturePanel.publicKeyLabel.text")); // NOI18N

        selectPublicKeyFileButton.setText(i18n.getString("SignaturePanel.selectPublicKeyFileButton.text")); // NOI18N
        selectPublicKeyFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPublicKeyFileButtonActionPerformed(evt);
            }
        });

        verifySelectInputFileButton.setText(i18n.getString("SignaturePanel.verifySelectInputFileButton.text")); // NOI18N
        verifySelectInputFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifySelectInputFileButtonActionPerformed(evt);
            }
        });

        verifyInputFileField.setText( i18n.getString("SignaturePanel.verifyInputFileField.text")); // NOI18N

        verifyInputLabel.setText( i18n.getString("SignaturePanel.verifyInputLabel.text")); // NOI18N

        verifyDss1CheckBox.setText( i18n.getString("SignaturePanel.verifyDss1CheckBox.text")); // NOI18N
        verifyDss1CheckBox.setToolTipText( i18n.getString("SignaturePanel.verifyDss1CheckBox.toolTipText")); // NOI18N

        verifyOkButton.setText( i18n.getString("SignaturePanel.verifyOkButton.text")); // NOI18N
        verifyOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyOkButtonActionPerformed(evt);
            }
        });

        signatureFileLabel.setText( i18n.getString("SignaturePanel.signatureFileLabel.text")); // NOI18N

        signatureFileField.setText( i18n.getString("SignaturePanel.signatureFileField.text")); // NOI18N

        selectSignatureFileButton.setText(i18n.getString("SignaturePanel.selectSignatureFileButton.text")); // NOI18N
        selectSignatureFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSignatureFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verifyPanelLayout = new javax.swing.GroupLayout(verifyPanel);
        verifyPanel.setLayout(verifyPanelLayout);
        verifyPanelLayout.setHorizontalGroup(
            verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verifyInputLabel)
                    .addComponent(publicKeyLabel))
                .addGap(7, 7, 7)
                .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicKeyFileField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(verifyInputFileField, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verifySelectInputFileButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectPublicKeyFileButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verifyPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(verifyDss1CheckBox)
                .addGap(18, 18, 18)
                .addComponent(verifyOkButton, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(verifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signatureFileLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signatureFileField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectSignatureFileButton)
                .addGap(16, 16, 16))
        );
        verifyPanelLayout.setVerticalGroup(
            verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verifyPanelLayout.createSequentialGroup()
                .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicKeyLabel)
                    .addComponent(publicKeyFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPublicKeyFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyInputLabel)
                    .addComponent(verifyInputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifySelectInputFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signatureFileLabel)
                    .addComponent(signatureFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectSignatureFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(verifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyOkButton)
                    .addComponent(verifyDss1CheckBox))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(verifyPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verifyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectPrivateKeyFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectPrivateKeyFileButtonActionPerformed
    {//GEN-HEADEREND:event_selectPrivateKeyFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(privateKeyFileField.getText()));
        fileChooser.showSaveDialog(this);
        privateKeyFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectPrivateKeyFileButtonActionPerformed

    private void selectInputFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectInputFileButtonActionPerformed
    {//GEN-HEADEREND:event_selectInputFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(inputFileField.getText()));
        fileChooser.showSaveDialog(this);
        inputFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectInputFileButtonActionPerformed

    private void selectOutputFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectOutputFileButtonActionPerformed
    {//GEN-HEADEREND:event_selectOutputFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(outputFileField.getText()));
        fileChooser.showSaveDialog(this);
        outputFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectOutputFileButtonActionPerformed

    private void signOkButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_signOkButtonActionPerformed
    {//GEN-HEADEREND:event_signOkButtonActionPerformed
        try
        {
            String keyFile = privateKeyFileField.getText();
            String inputFile = inputFileField.getText();
            String outputFile = outputFileField.getText();
            StringBuilder cmdBuilder = new StringBuilder("openssl dgst ");
            if (dss1CheckBox.isSelected())
            {
                cmdBuilder.append("-dss1 ");
            }
            cmdBuilder.append("-sign " + keyFile);
            cmdBuilder.append(" -out " + outputFile + " " + inputFile);
            logger.fine("Executing \'" + cmdBuilder.toString() + "\'");
            Process p = Runtime.getRuntime().exec(cmdBuilder.toString());
            p.waitFor();

            int exitCode = p.exitValue();
            if (exitCode != 0)
            {
                logger.log(Level.SEVERE, "OpenSSL returned exit status " + exitCode);
            }
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(SignaturePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex)
        {
            Logger.getLogger(SignaturePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_signOkButtonActionPerformed

    private void selectPublicKeyFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectPublicKeyFileButtonActionPerformed
    {//GEN-HEADEREND:event_selectPublicKeyFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(publicKeyFileField.getText()));
        fileChooser.showSaveDialog(this);
        publicKeyFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectPublicKeyFileButtonActionPerformed

    private void verifySelectInputFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_verifySelectInputFileButtonActionPerformed
    {//GEN-HEADEREND:event_verifySelectInputFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(verifyInputFileField.getText()));
        fileChooser.showSaveDialog(this);
        verifyInputFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_verifySelectInputFileButtonActionPerformed

    private void verifyOkButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_verifyOkButtonActionPerformed
    {//GEN-HEADEREND:event_verifyOkButtonActionPerformed
        try
        {
            String keyFile = publicKeyFileField.getText();
            String inputFile = verifyInputFileField.getText();
            String signatureFile = signatureFileField.getText();
            StringBuilder cmdBuilder = new StringBuilder("openssl dgst ");
            if (verifyDss1CheckBox.isSelected())
            {
                cmdBuilder.append("-dss1 ");
            }
            cmdBuilder.append("-verify " + keyFile);
            cmdBuilder.append(" -signature " + signatureFile + " ");
            cmdBuilder.append(inputFile + " ");
            logger.fine("Executing \'" + cmdBuilder.toString() + "\'");
            Process p = Runtime.getRuntime().exec(cmdBuilder.toString());
            p.waitFor();

            int exitCode = p.exitValue();

            if (exitCode == 0)
            {
                JOptionPane.showMessageDialog(this, i18n.getString("VerifiedSignatureSuccessfullyText"));
                logger.info("Successfully verified the signature");
            }
            else if (exitCode == 1)
            {
                JOptionPane.showMessageDialog(this, i18n.getString("SignatureVerifyingFailureTest"));
                logger.info("Failed to verify the signature");
            }

            if (exitCode > 1)
            {
                logger.log(Level.SEVERE, "OpenSSL returned exit status " + exitCode);
            }
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(SignaturePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex)
        {
            Logger.getLogger(SignaturePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_verifyOkButtonActionPerformed

    private void selectSignatureFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectSignatureFileButtonActionPerformed
    {//GEN-HEADEREND:event_selectSignatureFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(signatureFileField.getText()));
        fileChooser.showSaveDialog(this);
        signatureFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectSignatureFileButtonActionPerformed
    private JFileChooser fileChooser = new JFileChooser();
    private ResourceBundle i18n = ResourceBundle.getBundle("jopensslgui/Bundle"); //NOI18N
    private Logger logger = JOpenSSLFrame.logger;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox dss1CheckBox;
    private javax.swing.JTextField inputFileField;
    private javax.swing.JLabel inputFileLabel;
    private javax.swing.JTextField outputFileField;
    private javax.swing.JLabel outputFileLabel;
    private javax.swing.JTextField privateKeyFileField;
    private javax.swing.JLabel privateKeyLabel;
    private javax.swing.JTextField publicKeyFileField;
    private javax.swing.JLabel publicKeyLabel;
    private javax.swing.JButton selectInputFileButton;
    private javax.swing.JButton selectOutputFileButton;
    private javax.swing.JButton selectPrivateKeyFileButton;
    private javax.swing.JButton selectPublicKeyFileButton;
    private javax.swing.JButton selectSignatureFileButton;
    private javax.swing.JButton signOkButton;
    private javax.swing.JPanel signPanel;
    private javax.swing.JTextField signatureFileField;
    private javax.swing.JLabel signatureFileLabel;
    private javax.swing.JCheckBox verifyDss1CheckBox;
    private javax.swing.JTextField verifyInputFileField;
    private javax.swing.JLabel verifyInputLabel;
    private javax.swing.JButton verifyOkButton;
    private javax.swing.JPanel verifyPanel;
    private javax.swing.JButton verifySelectInputFileButton;
    // End of variables declaration//GEN-END:variables
}
