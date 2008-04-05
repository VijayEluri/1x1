
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/*
 * mtStatisticsFrame.java
 *
 * Created on 4. April 2008, 22:53
 */



/**
 *
 * @author  User
 */
public class mtStatisticsFrame extends javax.swing.JFrame {
    
    /** Creates new form mtStatisticsFrame */
    public mtStatisticsFrame() {
        initComponents();
    }
    
    //Semiglobal variables
    JFileChooser saveFileDialog = new JFileChooser();
    
    ///GUI Setters
    
    public void setName(String name)
    {
        nameLabel.setText(name);
    }
    
    public void setOverallSolved(int overallSolved)
    {
        overallSolvedLabel.setText(Integer.toString(overallSolved));
    }
    
    public void setRightSolved(int rightSolved)
    {
        rightSolvedLabel.setText(Integer.toString(rightSolved));
    }
    
    public void setFalseSolved(int falseSolved)
    {
        falseSolvedLabel.setText(Integer.toString(falseSolved));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        overallSolvedDescriptorLabel = new javax.swing.JLabel();
        correctSolvedDescriptorLabel = new javax.swing.JLabel();
        falseSolvedDescriptorLabel = new javax.swing.JLabel();
        overallSolvedLabel = new javax.swing.JLabel();
        rightSolvedLabel = new javax.swing.JLabel();
        falseSolvedLabel = new javax.swing.JLabel();
        nameDescriptorLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        resultsScrollPane = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable(11,10);
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();

        setTitle("Statistiken");

        overallSolvedDescriptorLabel.setText("Gesamt:");
        overallSolvedDescriptorLabel.setToolTipText("Gesamt gelöste Aufgaben");

        correctSolvedDescriptorLabel.setText("Richtig:");
        correctSolvedDescriptorLabel.setToolTipText("Richtig gelöste Aufgaben");

        falseSolvedDescriptorLabel.setText("Falsch:");
        falseSolvedDescriptorLabel.setToolTipText("Falsch gelöste Aufgaben");

        overallSolvedLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        overallSolvedLabel.setText("0");

        rightSolvedLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        rightSolvedLabel.setText("0");

        falseSolvedLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        falseSolvedLabel.setText("0");

        nameDescriptorLabel.setText("Name:");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 11));

        resultsTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultsTable.setFont(new java.awt.Font("Tahoma", 1, 12));
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, null, null, null, null, null, null, null, null, null},
                {2, null, null, null, null, null, null, null, null, null},
                {3, null, null, null, null, null, null, null, null, null},
                {4, null, null, null, null, null, null, null, null, null},
                {5, null, null, null, null, null, null, null, null, null},
                {6, null, null, null, null, null, null, null, null, null},
                {7, null, null, null, null, null, null, null, null, null},
                {8, null, null, null, null, null, null, null, null, null},
                {9, null, null, null, null, null, null, null, null, null},
                {10, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "","1","2","3","4","5","6","7","8","9","10"
            }
        ));
        resultsScrollPane.setViewportView(resultsTable);

        fileMenu.setText("Datei");

        saveMenuItem.setText("Speichern");
        saveMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMenuItemMouseClicked(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(falseSolvedDescriptorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(falseSolvedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(overallSolvedDescriptorLabel)
                                    .addComponent(correctSolvedDescriptorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(overallSolvedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rightSolvedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameDescriptorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(overallSolvedDescriptorLabel)
                            .addComponent(overallSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correctSolvedDescriptorLabel)
                            .addComponent(rightSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameDescriptorLabel))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(falseSolvedDescriptorLabel)
                            .addComponent(falseSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGap(18, 18, 18)
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMenuItemMouseClicked
        // TODO add your handling code here:
        //Show save dialog
        int returnVal = saveFileDialog.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            //Initalize save file output stream
            BufferedWriter fout = null;
            try
                {fout = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(saveFileDialog.getSelectedFile())));}
            catch (FileNotFoundException ex)
                {Logger.getLogger(mtStatisticsFrame.class.getName()).log(Level.SEVERE, null, ex);}
            
            //Write data to file 
            try
                {
                    fout.write("Name:" + nameLabel.getText()); //Write name
                    fout.write("Gesamt gelöst:" + overallSolvedLabel.getText());
                    fout.write("Richtig gelöst:" + rightSolvedLabel.getText());
                    fout.write("Falsch gelöst:" + falseSolvedLabel.getText());
                    //Write table
                    for(int i = 0; i < 9; i++)
                    {
                        for(int j = 0; j < 9; j++)
                        {
                            //First set background color of the appropriate cell
                            if(!solved[i][j]) {fout.write("<html><div bgcolor=dimgray align=center>&#160;&#160;&#160;</div><br/>", i+1, j+1);}
                            else if(solvingValues[i][j] == (i+1)*(j+1)) {fout.write("<html><div bgcolor=green align=center>&#160;" + Integer.toString(parent-solvingValues[i][j]) + "&#160;</div><br/>", i+1, j+1);}
                            else {fout.write("<html><div bgcolor=red align=center>&#160;" + Integer.toString(solvingValues[i][j]) + "&#160;</div>", i+1, j+1);}
                        }
                    }
                }
            catch (IOException ex)
                {Logger.getLogger(mtStatisticsFrame.class.getName()).log(Level.SEVERE, null, ex);}
        }
        
    }//GEN-LAST:event_saveMenuItemMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mtStatisticsFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correctSolvedDescriptorLabel;
    private javax.swing.JLabel falseSolvedDescriptorLabel;
    private javax.swing.JLabel falseSolvedLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nameDescriptorLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel overallSolvedDescriptorLabel;
    private javax.swing.JLabel overallSolvedLabel;
    private javax.swing.JScrollPane resultsScrollPane;
    public javax.swing.JTable resultsTable;
    private javax.swing.JLabel rightSolvedLabel;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
    
}
