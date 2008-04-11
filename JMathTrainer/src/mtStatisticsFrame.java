
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

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
    public mtStatisticsFrame(mtMainFrame pFrame) {
        initComponents();
        parentFrame = pFrame;
    }
    
    //Semiglobal variables
    private JFileChooser saveFileDialog = new JFileChooser();;
    private mtMainFrame parentFrame;
    
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
        multScrollPane = new javax.swing.JScrollPane();
        multResultsTable = new javax.swing.JTable(11,10);
        plusScrollPane = new javax.swing.JScrollPane();
        plusResultsTable = new javax.swing.JTable(11,10);
        minusScrollPane = new javax.swing.JScrollPane();
        minusResultsTable = new javax.swing.JTable(11,10);
        multTableLable = new javax.swing.JLabel();
        plusTableLable = new javax.swing.JLabel();
        minusTableLable = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        menuBar1 = new javax.swing.JMenuBar();
        fileMenu1 = new javax.swing.JMenu();
        saveMenuItem1 = new javax.swing.JMenuItem();
        menuBar2 = new javax.swing.JMenuBar();
        fileMenu2 = new javax.swing.JMenu();
        saveMenuItem2 = new javax.swing.JMenuItem();
        multTimeScrollPane = new javax.swing.JScrollPane();
        multTimeTable = new javax.swing.JTable(11,10);
        minusTimeScrollPane = new javax.swing.JScrollPane();
        minusTimeTable = new javax.swing.JTable(11,10);
        plusTimeScrollPane = new javax.swing.JScrollPane();
        plusTimeTable = new javax.swing.JTable(11,10);
        menuBar3 = new javax.swing.JMenuBar();
        fileMenu3 = new javax.swing.JMenu();
        saveMenuItem3 = new javax.swing.JMenuItem();

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

        multResultsTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multResultsTable.setFont(new java.awt.Font("Tahoma", 1, 12));
        multResultsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        multScrollPane.setViewportView(multResultsTable);

        plusResultsTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plusResultsTable.setFont(new java.awt.Font("Tahoma", 1, 12));
        plusResultsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        plusScrollPane.setViewportView(plusResultsTable);

        minusResultsTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minusResultsTable.setFont(new java.awt.Font("Tahoma", 1, 12));
        minusResultsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        minusScrollPane.setViewportView(minusResultsTable);

        multTableLable.setFont(new java.awt.Font("Tahoma", 1, 24));
        multTableLable.setText("X");

        plusTableLable.setFont(new java.awt.Font("Tahoma", 1, 24));
        plusTableLable.setText("+");

        minusTableLable.setFont(new java.awt.Font("Tahoma", 1, 24));
        minusTableLable.setText("-");

        fileMenu.setText("Datei");

        saveMenuItem.setText("Speichern");
        saveMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMenuItemMouseClicked(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        menuBar.add(fileMenu);

        fileMenu1.setText("Datei");

        saveMenuItem1.setText("Speichern");
        saveMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMenuItemMouseClicked(evt);
            }
        });
        fileMenu1.add(saveMenuItem1);

        menuBar1.add(fileMenu1);

        fileMenu2.setText("Datei");

        saveMenuItem2.setText("Speichern");
        saveMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMenuItemMouseClicked(evt);
            }
        });
        fileMenu2.add(saveMenuItem2);

        menuBar2.add(fileMenu2);

        multTimeTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multTimeTable.setFont(new java.awt.Font("Tahoma", 1, 12));
        multTimeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        multTimeScrollPane.setViewportView(multTimeTable);

        minusTimeTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minusTimeTable.setFont(new java.awt.Font("Tahoma", 1, 12));
        minusTimeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        minusTimeScrollPane.setViewportView(minusTimeTable);

        plusTimeTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plusTimeTable.setFont(new java.awt.Font("Tahoma", 1, 12));
        plusTimeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        plusTimeScrollPane.setViewportView(plusTimeTable);

        fileMenu3.setText("Datei");

        saveMenuItem3.setText("Speichern");
        saveMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMenuItemMouseClicked(evt);
            }
        });
        fileMenu3.add(saveMenuItem3);

        menuBar3.add(fileMenu3);

        setJMenuBar(menuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(multScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(multTimeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(minusTimeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multTableLable)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameDescriptorLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(minusTableLable))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(plusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(plusTimeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(plusTableLable)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGap(26, 26, 26)
                .addComponent(multTableLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multTimeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minusTimeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minusTableLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plusTableLable)
                        .addGap(15, 15, 15)
                        .addComponent(plusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(plusTimeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            if(!parentFrame.getSolved()[i][j]) {fout.write("<html><div bgcolor=dimgray align=center>&#160;&#160;&#160;</div><br/>", i+1, j+1);}
                            else if(parentFrame.getSolvingValues()[i][j] == (i+1)*(j+1)) {fout.write("<html><div bgcolor=green align=center>&#160;" + Integer.toString(parentFrame.getSolvingValues()[i][j]) + "&#160;</div><br/>", i+1, j+1);}
                            else {fout.write("<html><div bgcolor=red align=center>&#160;" + Integer.toString(parentFrame.getSolvingValues()[i][j]) + "&#160;</div>", i+1, j+1);}
                        }
                    }
                }
            catch (IOException ex)
                {Logger.getLogger(mtStatisticsFrame.class.getName()).log(Level.SEVERE, null, ex);}
        }
        
    }//GEN-LAST:event_saveMenuItemMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correctSolvedDescriptorLabel;
    private javax.swing.JLabel falseSolvedDescriptorLabel;
    private javax.swing.JLabel falseSolvedLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu fileMenu2;
    private javax.swing.JMenu fileMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JMenuBar menuBar2;
    private javax.swing.JMenuBar menuBar3;
    public javax.swing.JTable minusResultsTable;
    private javax.swing.JScrollPane minusScrollPane;
    private javax.swing.JLabel minusTableLable;
    private javax.swing.JScrollPane minusTimeScrollPane;
    public javax.swing.JTable minusTimeTable;
    public javax.swing.JTable multResultsTable;
    private javax.swing.JScrollPane multScrollPane;
    private javax.swing.JLabel multTableLable;
    private javax.swing.JScrollPane multTimeScrollPane;
    public javax.swing.JTable multTimeTable;
    private javax.swing.JLabel nameDescriptorLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel overallSolvedDescriptorLabel;
    private javax.swing.JLabel overallSolvedLabel;
    public javax.swing.JTable plusResultsTable;
    private javax.swing.JScrollPane plusScrollPane;
    private javax.swing.JLabel plusTableLable;
    private javax.swing.JScrollPane plusTimeScrollPane;
    public javax.swing.JTable plusTimeTable;
    private javax.swing.JLabel rightSolvedLabel;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem saveMenuItem1;
    private javax.swing.JMenuItem saveMenuItem2;
    private javax.swing.JMenuItem saveMenuItem3;
    // End of variables declaration//GEN-END:variables

    public void setParentFrame(mtMainFrame parentFrame) {
        this.parentFrame = parentFrame;
    }
    
}
