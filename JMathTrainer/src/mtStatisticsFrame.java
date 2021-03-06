package de.uliköhler.JMathTrainer;


import java.io.*;
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
        multTimeScrollPane = new javax.swing.JScrollPane();
        multTimeTable = new javax.swing.JTable(11,10);
        minusTimeScrollPane = new javax.swing.JScrollPane();
        minusTimeTable = new javax.swing.JTable(11,10);
        plusTimeScrollPane = new javax.swing.JScrollPane();
        plusTimeTable = new javax.swing.JTable(11,10);
        clockSymbolLabel = new javax.swing.JLabel();

        setTitle("Statistiken");
        setForeground(java.awt.Color.white);
        setName("statisticsFrame"); // NOI18N

        overallSolvedDescriptorLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        overallSolvedDescriptorLabel.setText("Gesamt:");
        overallSolvedDescriptorLabel.setToolTipText("Gesamt gelöste Aufgaben");

        correctSolvedDescriptorLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        correctSolvedDescriptorLabel.setText("Richtig:");
        correctSolvedDescriptorLabel.setToolTipText("Richtig gelöste Aufgaben");

        falseSolvedDescriptorLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        falseSolvedDescriptorLabel.setText("Falsch:");
        falseSolvedDescriptorLabel.setToolTipText("Falsch gelöste Aufgaben");

        overallSolvedLabel.setText("0");

        rightSolvedLabel.setText("0");

        falseSolvedLabel.setText("0");

        nameDescriptorLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        nameDescriptorLabel.setText("Name:");

        nameLabel.setText("Kein Name");

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
        multTableLable.setText("<html>&#9679;");

        plusTableLable.setFont(new java.awt.Font("Tahoma", 1, 24));
        plusTableLable.setText("+");

        minusTableLable.setFont(new java.awt.Font("Tahoma", 1, 24));
        minusTableLable.setText("-");

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

        clockSymbolLabel.setFont(new java.awt.Font("Tahoma", 0, 48));
        clockSymbolLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clock-pictogram.png"))); // NOI18N

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
                                .addComponent(multTimeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(minusTimeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(overallSolvedDescriptorLabel)
                                            .addComponent(correctSolvedDescriptorLabel)
                                            .addComponent(falseSolvedDescriptorLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(overallSolvedLabel)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(rightSolvedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(nameDescriptorLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(81, 81, 81))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(falseSolvedLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)))
                                        .addGap(134, 134, 134))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(118, 118, 118)
                                        .addComponent(multTableLable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(clockSymbolLabel)
                                .addGap(241, 241, 241))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(plusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(plusTimeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(plusTableLable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(minusTableLable)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(overallSolvedDescriptorLabel)
                            .addComponent(overallSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameDescriptorLabel)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rightSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(correctSolvedDescriptorLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(falseSolvedDescriptorLabel)
                                    .addComponent(falseSolvedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)))
                        .addGap(19, 19, 19)
                        .addComponent(multTableLable))
                    .addComponent(clockSymbolLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multTimeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minusTimeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(minusTableLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(minusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(plusTableLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusTimeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clockSymbolLabel;
    private javax.swing.JLabel correctSolvedDescriptorLabel;
    private javax.swing.JLabel falseSolvedDescriptorLabel;
    private javax.swing.JLabel falseSolvedLabel;
    private javax.swing.JScrollPane jScrollPane1;
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
    // End of variables declaration//GEN-END:variables

    public void setParentFrame(mtMainFrame parentFrame) {
        this.parentFrame = parentFrame;
    }
    
}
