package jcrypter.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import jcrypter.JCrypterFrame;
import jcrypter.signature.ECKeyGeneratorFrame;

/**
 *
 * @author  uli
 */
public class KeyGeneratorFrame extends javax.swing.JFrame
{

    /** Creates new form KeyGeneratorFrame */
    public KeyGeneratorFrame()
    {
        initComponents();
        //Add the items in the keysizes array to the keysize combo box
        for (int i : keysizes)
        {
            keysizeComboBox.addItem(i);
        }
        //Add the items to the key type combo box
        keyTypeComboBox.addItem("RSA");
        keyTypeComboBox.addItem("DSA");
        keyTypeComboBox.addItem("ElGamal");
        keyTypeComboBox.addItem("DH");
        keyTypeComboBox.addItem("ECC");
    }
    public static final int[] keysizes =
    {
        256, 512, 1024, 2048, 4096, 8192, 16384, 32768
    };

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        keysizeLabel = new javax.swing.JLabel();
        keysizeComboBox = new javax.swing.JComboBox();
        pubFileLabel = new javax.swing.JLabel();
        pubFileField = new javax.swing.JTextField();
        privFileLabel = new javax.swing.JLabel();
        privFileField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        keyTypeLabel = new javax.swing.JLabel();
        keyTypeComboBox = new javax.swing.JComboBox();
        selectPubFileButton = new javax.swing.JButton();
        selectPrivFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(i18n.getString("Generate_keys")); // NOI18N

        keysizeLabel.setText(i18n.getString("Key_size:")); // NOI18N

        pubFileLabel.setText(i18n.getString("Pub_file:")); // NOI18N

        pubFileField.setText("pub.rsp"); // NOI18N

        privFileLabel.setText(i18n.getString("Priv_file:")); // NOI18N

        privFileField.setText("sec.rss"); // NOI18N

        okButton.setText(i18n.getString("OK_1")); // NOI18N
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        keyTypeLabel.setText(i18n.getString("KeyTypeLabel.text")); // NOI18N

        keyTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyTypeComboBoxActionPerformed(evt);
            }
        });

        selectPubFileButton.setText(i18n.getString("Select")); // NOI18N
        selectPubFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPubFileButtonActionPerformed(evt);
            }
        });

        selectPrivFileButton.setText(i18n.getString("Select")); // NOI18N
        selectPrivFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPrivFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pubFileLabel)
                            .addComponent(keysizeLabel)
                            .addComponent(privFileLabel)
                            .addComponent(keyTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keysizeComboBox, 0, 214, Short.MAX_VALUE)
                            .addComponent(keyTypeComboBox, 0, 214, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(privFileField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(pubFileField, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectPrivFileButton)
                                    .addComponent(selectPubFileButton))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keysizeLabel)
                    .addComponent(keysizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pubFileLabel)
                    .addComponent(selectPubFileButton)
                    .addComponent(pubFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privFileLabel)
                    .addComponent(privFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPrivFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
    try
    {
        KeyPairGenerator kpgen =
                KeyPairGenerator.getInstance((String) keyTypeComboBox.getSelectedItem(), "BC");
        kpgen.initialize((Integer) keysizeComboBox.getSelectedItem(), JCrypterFrame.rand);

        //Generate the key pair
        KeyPair kp = kpgen.generateKeyPair();
        //Write the public key
        FileOutputStream fout = new FileOutputStream(pubFileField.getText());
        fout.write(kp.getPublic().getEncoded());
        fout.close();
        //Write the secret key
        fout = new FileOutputStream(privFileField.getText());
        fout.write(kp.getPrivate().getEncoded());
        fout.close();
    }
    catch (FileNotFoundException ex)
    {
        Logger.getLogger(KeyGeneratorFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IOException ex)
    {
        Logger.getLogger(KeyGeneratorFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (NoSuchAlgorithmException ex)
    {
        Logger.getLogger(KeyGeneratorFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (NoSuchProviderException ex)
    {
        Logger.getLogger(KeyGeneratorFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_okButtonMouseClicked

private void keyTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyTypeComboBoxActionPerformed
    String sel = (String) keyTypeComboBox.getSelectedItem();
    if (sel.equals("RSA"))
    {
        pubFileField.setText("pub.rsp");
        privFileField.setText("sec.rss");

        keysizeComboBox.removeAllItems();
        for (int i : keysizes)
        {
            keysizeComboBox.addItem(i);
        }
    }
    else if (sel.equals("DSA"))
    {
        pubFileField.setText("pub.dsp");
        privFileField.setText("sec.dss");

        keysizeComboBox.removeAllItems();
        for (int i : keysizes)
        {
            if (i <= 1024 && i >= 512)
            {
                keysizeComboBox.addItem(i);
            }
        }
    }
    else if (sel.equals("ElGamal"))
    {
        pubFileField.setText("pub.elp");
        privFileField.setText("sec.els");

        keysizeComboBox.removeAllItems();
        for (int i : keysizes)
        {
            keysizeComboBox.addItem(i);
        }
    }
    else if (sel.equals("DH"))
    {
        pubFileField.setText("pub.dhp");
        privFileField.setText("sec.dhs");

        keysizeComboBox.removeAllItems();
        for (int i : keysizes)
        {
            keysizeComboBox.addItem(i);
        }
    }
    else if (sel.equals("ECC"))
    {
        pubFileField.setText("pub.edp");
        privFileField.setText("sec.eds");

        keysizeComboBox.removeAllItems();
        for (int i : keysizes)
        {
            keysizeComboBox.addItem(i);
        }
        //Show the ECC key generator window and hide the standard keygen window
        this.setVisible(false);
        eckeygenFrame.setVisible(true);
    }
    //Set file chooser dialog selected frame
    fileChooser.setSelectedFile(new File(pubFileField.getText()));
    fileChooser.setSelectedFile(new File(privFileField.getText()));
}//GEN-LAST:event_keyTypeComboBoxActionPerformed

private void selectPubFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPubFileButtonActionPerformed
    fileChooser.setSelectedFile(new File(pubFileField.getText()));
    fileChooser.showSaveDialog(this);
    pubFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectPubFileButtonActionPerformed

private void selectPrivFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPrivFileButtonActionPerformed
    fileChooser.setSelectedFile(new File(privFileField.getText()));
    fileChooser.showSaveDialog(this);
    privFileField.setText(fileChooser.getSelectedFile().getAbsolutePath());
}//GEN-LAST:event_selectPrivFileButtonActionPerformed

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
                new KeyGeneratorFrame().setVisible(true);
            }
        });
    }

    public void setSelection(String selection)
    {
        if (keyTypeComboBox != null)
        {
            keyTypeComboBox.setSelectedItem(selection);
        }
    }
    ResourceBundle i18n = ResourceBundle.getBundle("jcrypter/utils/Bundle");
    ECKeyGeneratorFrame eckeygenFrame = new ECKeyGeneratorFrame(this);
    JFileChooser fileChooser = JCrypterFrame.mainFrame.fileChooser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox keyTypeComboBox;
    private javax.swing.JLabel keyTypeLabel;
    private javax.swing.JComboBox keysizeComboBox;
    private javax.swing.JLabel keysizeLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField privFileField;
    private javax.swing.JLabel privFileLabel;
    private javax.swing.JTextField pubFileField;
    private javax.swing.JLabel pubFileLabel;
    private javax.swing.JButton selectPrivFileButton;
    private javax.swing.JButton selectPubFileButton;
    // End of variables declaration//GEN-END:variables
}
