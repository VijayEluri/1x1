

/*
 * mtSettingsFrame.java
 *
 * Created on 4. April 2008, 17:14
 */
import java.util.Vector;



/**
 *
 * @author  User
 */
public class mtSettingsFrame extends javax.swing.JFrame {
    
    //Variables
    private Vector<Integer> rows = new Vector<Integer>();
    private Vector<mtOperator> operators = new Vector<mtOperator>();
    private boolean[] options = new boolean[2];

    
    /** Creates new form mtSettingsFrame */
    public mtSettingsFrame() {
        initComponents();
        
        ///Set default options to avoid Nullpointer exceptions
        //Init options array
        options[0] = true; //Unique exercises
        options[1] = false; //Live update
        
        //Init rows vector
        rows.add(1);
        rows.add(2);
        rows.add(3);
        rows.add(4);
        rows.add(5);
        rows.add(6);
        rows.add(7);
        rows.add(8);
        rows.add(9);
        rows.add(10);
        
        //Init operators vector
        operators.add(mtOperator.MULT);
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rowsLabel = new javax.swing.JLabel();
        oneToggleButton = new javax.swing.JToggleButton();
        twoToggleButton = new javax.swing.JToggleButton();
        threeToggleButton = new javax.swing.JToggleButton();
        fourToggleButton = new javax.swing.JToggleButton();
        fiveToggleButton = new javax.swing.JToggleButton();
        sixToggleButton = new javax.swing.JToggleButton();
        sevenToggleButton = new javax.swing.JToggleButton();
        eightToggleButton = new javax.swing.JToggleButton();
        nineToggleButton = new javax.swing.JToggleButton();
        tenToggleButton = new javax.swing.JToggleButton();
        optionsLabel = new javax.swing.JLabel();
        askOnceToggleButton = new javax.swing.JToggleButton();
        okButton = new javax.swing.JButton();
        multCheckBox = new javax.swing.JCheckBox();
        plusCheckBox = new javax.swing.JCheckBox();
        minusCheckBox = new javax.swing.JCheckBox();
        liveUpdateToggleButton = new javax.swing.JToggleButton();

        setTitle("Einstellungen");

        rowsLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        rowsLabel.setText("Reihen:");

        oneToggleButton.setSelected(true);
        oneToggleButton.setText("1");

        twoToggleButton.setSelected(true);
        twoToggleButton.setText("2");

        threeToggleButton.setSelected(true);
        threeToggleButton.setText("3");

        fourToggleButton.setSelected(true);
        fourToggleButton.setText("4");

        fiveToggleButton.setSelected(true);
        fiveToggleButton.setText("5");

        sixToggleButton.setSelected(true);
        sixToggleButton.setText("6");

        sevenToggleButton.setSelected(true);
        sevenToggleButton.setText("7");

        eightToggleButton.setSelected(true);
        eightToggleButton.setText("8");

        nineToggleButton.setSelected(true);
        nineToggleButton.setText("9");

        tenToggleButton.setSelected(true);
        tenToggleButton.setText("10");

        optionsLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        optionsLabel.setText("Optionen:");

        askOnceToggleButton.setSelected(true);
        askOnceToggleButton.setText("Keine Doppelten Aufgaben");
        askOnceToggleButton.setToolTipText("Aufgaben nur einmal stellen, bis alle ");

        okButton.setText("OK");
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okButtonMouseClicked(evt);
            }
        });

        multCheckBox.setFont(new java.awt.Font("Tahoma", 1, 18));
        multCheckBox.setSelected(true);
        multCheckBox.setText("<html>&#9679;");

        plusCheckBox.setFont(new java.awt.Font("Tahoma", 1, 18));
        plusCheckBox.setText("+");

        minusCheckBox.setFont(new java.awt.Font("Tahoma", 1, 18));
        minusCheckBox.setText("-");

        liveUpdateToggleButton.setText("Live Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rowsLabel)
                    .addComponent(tenToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nineToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eightToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sevenToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(threeToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twoToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(optionsLabel)
                    .addComponent(askOnceToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minusCheckBox)
                        .addComponent(plusCheckBox)
                        .addComponent(multCheckBox))
                    .addComponent(liveUpdateToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rowsLabel)
                    .addComponent(optionsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneToggleButton)
                    .addComponent(askOnceToggleButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(twoToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sevenToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eightToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nineToggleButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(liveUpdateToggleButton)
                        .addGap(18, 18, 18)
                        .addComponent(multCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(plusCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(minusCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenToggleButton)
                    .addComponent(okButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
        // TODO add your handling code here:
        //Get list of options
        
        //Reset variables
        options[0] = false;
        rows.removeAllElements();
        operators.removeAllElements();
        
        //Get list of options
        if(askOnceToggleButton.isSelected())
            {options[0] = true;}
        
        //Get vector of selected rows
        if(oneToggleButton.isSelected()) {rows.add(1);}
        if(twoToggleButton.isSelected()) {rows.add(2);}
        if(threeToggleButton.isSelected()) {rows.add(3);}
        if(fourToggleButton.isSelected()) {rows.add(4);}
        if(fiveToggleButton.isSelected()) {rows.add(5);}
        if(sixToggleButton.isSelected()) {rows.add(6);}
        if(sevenToggleButton.isSelected()) {rows.add(7);}
        if(eightToggleButton.isSelected()) {rows.add(8);}
        if(nineToggleButton.isSelected()) {rows.add(9);}
        if(tenToggleButton.isSelected()) {rows.add(10);}
        
        //Get vector of selected operators
        if(multCheckBox.isSelected()) {operators.add(mtOperator.MULT);}
        if(plusCheckBox.isSelected()) {operators.add(mtOperator.PLUS);}
        if(minusCheckBox.isSelected()) {operators.add(mtOperator.MINUS);}
        
        //Check if live update is enabled
        options[1] = liveUpdateToggleButton.isSelected();
        
        //Hide settings window
        this.setVisible(false);
    }//GEN-LAST:event_okButtonMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mtSettingsFrame().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton askOnceToggleButton;
    private javax.swing.JToggleButton eightToggleButton;
    private javax.swing.JToggleButton fiveToggleButton;
    private javax.swing.JToggleButton fourToggleButton;
    private javax.swing.JToggleButton liveUpdateToggleButton;
    private javax.swing.JCheckBox minusCheckBox;
    private javax.swing.JCheckBox multCheckBox;
    private javax.swing.JToggleButton nineToggleButton;
    private javax.swing.JButton okButton;
    private javax.swing.JToggleButton oneToggleButton;
    private javax.swing.JLabel optionsLabel;
    private javax.swing.JCheckBox plusCheckBox;
    private javax.swing.JLabel rowsLabel;
    private javax.swing.JToggleButton sevenToggleButton;
    private javax.swing.JToggleButton sixToggleButton;
    private javax.swing.JToggleButton tenToggleButton;
    private javax.swing.JToggleButton threeToggleButton;
    private javax.swing.JToggleButton twoToggleButton;
    // End of variables declaration//GEN-END:variables

    
    private boolean getLiveUpdateEnabled()
    {
        return getOptions()[1];
    }

    public Vector<Integer> getRows() {
        return rows;
    }

    public Vector<mtOperator> getOperators() {
        return operators;
    }

    public boolean[] getOptions() {
        return options;
    }
    
}
