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

        generateRSADHKeysPanel = new jopensslgui.GenerateRSADHKeysPanel();
        generateDSAKeysPanel = new jopensslgui.GenerateDSAKeysPanel();
        generateECKeysPanel1 = new jopensslgui.GenerateECKeysPanel();

        addTab( i18n.getString("GenerateKeysTabbedPane.generateRSADHKeysPanel.TabConstraints.tabTitle"), generateRSADHKeysPanel); // NOI18N
        addTab( i18n.getString("GenerateKeysTabbedPane.generateDSAKeysPanel.TabConstraints.tabTitle"), generateDSAKeysPanel); // NOI18N
        addTab( i18n.getString("GenerateKeysTabbedPane.generateECKeysPanel1.TabConstraints.tabTitle"), generateECKeysPanel1); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private ResourceBundle i18n = ResourceBundle.getBundle("jopensslgui/Bundle"); //NOI18N
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jopensslgui.GenerateDSAKeysPanel generateDSAKeysPanel;
    private jopensslgui.GenerateECKeysPanel generateECKeysPanel1;
    private jopensslgui.GenerateRSADHKeysPanel generateRSADHKeysPanel;
    // End of variables declaration//GEN-END:variables

}