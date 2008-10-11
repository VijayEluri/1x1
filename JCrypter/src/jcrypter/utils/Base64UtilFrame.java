/*
 * Base64UtilFrame.java
 *
 * Created on 10. Oktober 2008, 21:19
 */

package jcrypter.utils;

import java.io.*;
import java.util.ResourceBundle;
import java.util.logging.*;
import javax.swing.JFileChooser;
import jcrypter.JCrypterFrame;
import org.bouncycastle.util.encoders.Base64;

/**
 *
 * @author  uli
 */
public class Base64UtilFrame extends javax.swing.JFrame {

    /** Creates new form Base64UtilFrame */
    public Base64UtilFrame() {
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

        inputLabel = new javax.swing.JLabel();
        inputScrollPane = new javax.swing.JScrollPane();
        inputField = new javax.swing.JTextArea();
        outputLabel = new javax.swing.JLabel();
        decodeCheckbox = new javax.swing.JCheckBox();
        okButton = new javax.swing.JButton();
        outputScrollPane = new javax.swing.JScrollPane();
        outputField = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadFromFileMenuItem = new javax.swing.JMenuItem();
        saveToFileMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(i18n.getString("Base64UtilFrame.title")); // NOI18N

        inputLabel.setText(i18n.getString("Base64UtilFrame.inputLabel.text")); // NOI18N

        inputField.setColumns(20);
        inputField.setRows(5);
        inputScrollPane.setViewportView(inputField);

        outputLabel.setText(i18n.getString("Base64UtilFrame.outputLabel.text")); // NOI18N

        decodeCheckbox.setText(i18n.getString("Base64UtilFrame.decodeCheckbox.text")); // NOI18N

        okButton.setText(i18n.getString("Base64UtilFrame.okButton.text")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        outputField.setColumns(20);
        outputField.setRows(5);
        outputScrollPane.setViewportView(outputField);

        fileMenu.setText(i18n.getString("Base64UtilFrame.fileMenu.text")); // NOI18N

        loadFromFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        loadFromFileMenuItem.setMnemonic('l');
        loadFromFileMenuItem.setText(i18n.getString("Base64UtilFrame.loadFromFileMenuItem.text")); // NOI18N
        loadFromFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFromFileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadFromFileMenuItem);

        saveToFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveToFileMenuItem.setMnemonic('s');
        saveToFileMenuItem.setText(i18n.getString("Base64UtilFrame.saveToFileMenuItem.text")); // NOI18N
        saveToFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToFileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveToFileMenuItem);

        jMenuBar1.add(fileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decodeCheckbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                            .addComponent(inputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputLabel)
                    .addComponent(inputScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decodeCheckbox)
                    .addComponent(okButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outputLabel)
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outputScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void loadFromFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFromFileMenuItemActionPerformed
FileInputStream fin = null;
        try
        {
            fileChooser.showOpenDialog(this);
            File file = fileChooser.getSelectedFile();
            byte[] buffer = new byte[(int) file.length()];
            fin = new FileInputStream(file);
            fin.read(buffer);
            fin.close();
            inputField.setText(new String(buffer));
        }
        catch (IOException ex)
        {
            Logger.getLogger(JCrypterFrame.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(JCrypterFrame.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
}//GEN-LAST:event_loadFromFileMenuItemActionPerformed

private void saveToFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToFileMenuItemActionPerformed
FileOutputStream fout = null;
        try
        {
            fileChooser.showSaveDialog(this);
            File file = fileChooser.getSelectedFile();
            byte[] buffer = outputField.getText().getBytes();
            fout = new FileOutputStream(file);
            fout.write(buffer);
            fout.close();
        }
        catch (IOException ex)
        {
            Logger.getLogger(JCrypterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try
            {
                fout.close();
            }
            catch (IOException ex)
            {
                Logger.getLogger(JCrypterFrame.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
}//GEN-LAST:event_saveToFileMenuItemActionPerformed

private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
    if(decodeCheckbox.isSelected()) //Decode the input
    {
        outputField.setText(new String(Base64.decode(inputField.getText())));
    }
    else
    {        
        outputField.setText(new String(Base64.encode(inputField.getText().getBytes())));
    }
}//GEN-LAST:event_okButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Base64UtilFrame().setVisible(true);
            }
        });
    }

    JFileChooser fileChooser = JCrypterFrame.mainFrame.fileChooser;
    ResourceBundle i18n = ResourceBundle.getBundle("jcrypter/utils/Bundle");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox decodeCheckbox;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextArea inputField;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JScrollPane inputScrollPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem loadFromFileMenuItem;
    private javax.swing.JButton okButton;
    private javax.swing.JTextArea outputField;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JScrollPane outputScrollPane;
    private javax.swing.JMenuItem saveToFileMenuItem;
    // End of variables declaration//GEN-END:variables

}
