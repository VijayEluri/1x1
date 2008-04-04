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
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        overallSolvedDescriptorLabel = new javax.swing.JLabel();
        correctSolvedDescriptorLabel = new javax.swing.JLabel();
        falseSolvedDescriptorLabel = new javax.swing.JLabel();
        overallSolvedLabel = new javax.swing.JLabel();
        rightSolvedLabel = new javax.swing.JLabel();
        falseSolvedLabel = new javax.swing.JLabel();
        nameDescriptorLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        resultsScrollPane = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable(10,10);
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();

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

        resultsTable.setAutoCreateRowSorter(true);
        resultsTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        resultsScrollPane.setViewportView(resultsTable);

        fileMenu.setText("Datei");
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(falseSolvedDescriptorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(falseSolvedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(overallSolvedDescriptorLabel)
                            .addComponent(correctSolvedDescriptorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rightSolvedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(overallSolvedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameDescriptorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
            .addGroup(layout.createSequentialGroup()
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overallSolvedDescriptorLabel)
                    .addComponent(overallSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correctSolvedDescriptorLabel)
                    .addComponent(rightSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameDescriptorLabel)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(falseSolvedDescriptorLabel)
                    .addComponent(falseSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nameDescriptorLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel overallSolvedDescriptorLabel;
    private javax.swing.JLabel overallSolvedLabel;
    private javax.swing.JScrollPane resultsScrollPane;
    private javax.swing.JTable resultsTable;
    private javax.swing.JLabel rightSolvedLabel;
    // End of variables declaration//GEN-END:variables
    
}
