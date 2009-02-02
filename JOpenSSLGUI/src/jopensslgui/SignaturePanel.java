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
import java.util.ResourceBundle;
import javax.swing.JFileChooser;

/**
 *
 * @author uli
 */
public class SignaturePanel extends javax.swing.JPanel {

    /** Creates new form SignaturePanel */
    public SignaturePanel() {
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

        keyLabel = new javax.swing.JLabel();
        keyFileField = new javax.swing.JTextField();
        selectKeyFileButton = new javax.swing.JButton();
        selectInputFileButton = new javax.swing.JButton();
        encryptionInputField = new javax.swing.JTextField();
        inputFileLabel = new javax.swing.JLabel();
        outputFileLabel = new javax.swing.JLabel();
        outputFileField = new javax.swing.JTextField();
        selectOutputFileButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        dss1CheckBox = new javax.swing.JCheckBox();

        keyLabel.setText( i18n.getString("SignaturePanel.keyLabel.text")); // NOI18N

        selectKeyFileButton.setText(i18n.getString("SignaturePanel.selectKeyFileButton.text")); // NOI18N
        selectKeyFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectKeyFileButtonActionPerformed(evt);
            }
        });

        selectInputFileButton.setText(i18n.getString("SignaturePanel.selectInputFileButton.text")); // NOI18N
        selectInputFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectInputFileButtonActionPerformed(evt);
            }
        });

        encryptionInputField.setText( i18n.getString("SignaturePanel.encryptionInputField.text")); // NOI18N

        inputFileLabel.setText( i18n.getString("SignaturePanel.inputFileLabel.text")); // NOI18N

        outputFileLabel.setText( i18n.getString("SignaturePanel.outputFileLabel.text")); // NOI18N

        outputFileField.setText( i18n.getString("SignaturePanel.outputFileField.text")); // NOI18N

        selectOutputFileButton.setText(i18n.getString("SignaturePanel.selectOutputFileButton.text")); // NOI18N
        selectOutputFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOutputFileButtonActionPerformed(evt);
            }
        });

        okButton.setText( i18n.getString("SignaturePanel.okButton.text")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        dss1CheckBox.setText( i18n.getString("SignaturePanel.dss1CheckBox.text")); // NOI18N
        dss1CheckBox.setToolTipText( i18n.getString("SignaturePanel.dss1CheckBox.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFileLabel)
                            .addComponent(outputFileLabel)
                            .addComponent(keyLabel))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dss1CheckBox)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keyFileField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(outputFileField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(encryptionInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(selectInputFileButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(selectOutputFileButton)))
                            .addComponent(selectKeyFileButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(okButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyLabel)
                    .addComponent(keyFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectKeyFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFileLabel)
                    .addComponent(encryptionInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectInputFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputFileLabel)
                    .addComponent(outputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectOutputFileButton))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(dss1CheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectKeyFileButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_selectKeyFileButtonActionPerformed
    {//GEN-HEADEREND:event_selectKeyFileButtonActionPerformed
        fileChooser.setSelectedFile(new File(keyFileField.getText()));
        fileChooser.showSaveDialog(this);
        keyFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectKeyFileButtonActionPerformed

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

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okButtonActionPerformed
    {//GEN-HEADEREND:event_okButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okButtonActionPerformed


    private JFileChooser fileChooser = new JFileChooser();
    private ResourceBundle i18n = ResourceBundle.getBundle("jopensslgui/Bundle"); //NOI18N
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox dss1CheckBox;
    private javax.swing.JTextField encryptionInputField;
    private javax.swing.JLabel inputFileLabel;
    private javax.swing.JTextField keyFileField;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField outputFileField;
    private javax.swing.JLabel outputFileLabel;
    private javax.swing.JButton selectInputFileButton;
    private javax.swing.JButton selectKeyFileButton;
    private javax.swing.JButton selectOutputFileButton;
    // End of variables declaration//GEN-END:variables

}