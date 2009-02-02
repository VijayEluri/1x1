/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GenerateKeysTabbedPane.java
 *
 * Created on 01.02.2009, 15:00:20
 */

package jopensslgui;

import java.util.ResourceBundle;
import javax.swing.JTabbedPane;

/**
 *
 * @author uli
 */
public class GenerateKeysTabbedPane extends JTabbedPane {

    /** Creates new form BeanForm */
    public GenerateKeysTabbedPane() {
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

        generateRSAKeysPanel = new jopensslgui.GenerateRSAKeysPanel();
        generateDSAKeysPanel = new jopensslgui.GenerateDSAKeysPanel();
        generateDHKeysPanel = new jopensslgui.GenerateDHKeysPanel();
        generateECKeysPanel = new jopensslgui.GenerateECKeysPanel();
        extractPublicKeyPanel = new jopensslgui.ExtractPublicKeyPanel();

        addTab( i18n.getString("GenerateKeysTabbedPane.generateRSAKeysPanel.TabConstraints.tabTitle"), generateRSAKeysPanel); // NOI18N
        addTab( i18n.getString("GenerateKeysTabbedPane.generateDSAKeysPanel.TabConstraints.tabTitle"), generateDSAKeysPanel); // NOI18N
        addTab( i18n.getString("GenerateKeysTabbedPane.generateDHKeysPanel.TabConstraints.tabTitle"), generateDHKeysPanel); // NOI18N
        addTab( i18n.getString("GenerateKeysTabbedPane.generateECKeysPanel.TabConstraints.tabTitle"), generateECKeysPanel); // NOI18N
        addTab( i18n.getString("GenerateKeysTabbedPane.extractPublicKeyPanel.TabConstraints.tabTitle"), extractPublicKeyPanel); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private ResourceBundle i18n = ResourceBundle.getBundle("jopensslgui/Bundle"); //NOI18N
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jopensslgui.ExtractPublicKeyPanel extractPublicKeyPanel;
    private jopensslgui.GenerateDHKeysPanel generateDHKeysPanel;
    private jopensslgui.GenerateDSAKeysPanel generateDSAKeysPanel;
    private jopensslgui.GenerateECKeysPanel generateECKeysPanel;
    private jopensslgui.GenerateRSAKeysPanel generateRSAKeysPanel;
    // End of variables declaration//GEN-END:variables

}
