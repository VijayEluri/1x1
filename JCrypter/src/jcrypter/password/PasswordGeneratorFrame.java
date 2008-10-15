/*
 * PasswordGeneratorFrame.java
 *
 * Created on 29. September 2008, 19:21
 */
package jcrypter.password;

import jcrypter.*;
import java.security.SecureRandom;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author  uli
 */
public class PasswordGeneratorFrame extends javax.swing.JFrame
{

    /** Creates new form PasswordGeneratorFrame */
    public PasswordGeneratorFrame()
    {
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

        characterSetButtonGroup = new javax.swing.ButtonGroup();
        useCharacterGroupsRadioButton = new javax.swing.JRadioButton();
        useSpecifiedCharacterSetRadioButton = new javax.swing.JRadioButton();
        characterSetField = new javax.swing.JTextField();
        upperLetterCheckBox = new javax.swing.JCheckBox();
        lowerLetterCheckBox = new javax.swing.JCheckBox();
        numbersCheckBox = new javax.swing.JCheckBox();
        specialCharactersCheckBox = new javax.swing.JCheckBox();
        whiteSpacesCheckBox = new javax.swing.JCheckBox();
        minusCheckBox = new javax.swing.JCheckBox();
        underlineCheckBox = new javax.swing.JCheckBox();
        lengthLabel = new javax.swing.JLabel();
        lengthSpinner = new javax.swing.JSpinner();
        qualityLabel = new javax.swing.JLabel();
        qualityBar = new javax.swing.JProgressBar();
        newPasswordLabel = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JTextField();
        generatePasswordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(i18n.getString("PasswordGeneratorFrame.title")); // NOI18N

        characterSetButtonGroup.add(useCharacterGroupsRadioButton);
        useCharacterGroupsRadioButton.setSelected(true);
        useCharacterGroupsRadioButton.setText(i18n.getString("PasswordGeneratorFrame.useCharacterGroupsRadioButton.text")); // NOI18N

        characterSetButtonGroup.add(useSpecifiedCharacterSetRadioButton);
        useSpecifiedCharacterSetRadioButton.setText(i18n.getString("PasswordGeneratorFrame.useSpecifiedCharacterSetRadioButton.text")); // NOI18N

        upperLetterCheckBox.setSelected(true);
        upperLetterCheckBox.setText(i18n.getString("PasswordGeneratorFrame.upperLetterCheckBox.text")); // NOI18N

        lowerLetterCheckBox.setSelected(true);
        lowerLetterCheckBox.setText(i18n.getString("PasswordGeneratorFrame.lowerLetterCheckBox.text")); // NOI18N

        numbersCheckBox.setSelected(true);
        numbersCheckBox.setText(i18n.getString("PasswordGeneratorFrame.numbersCheckBox.text")); // NOI18N

        specialCharactersCheckBox.setText(i18n.getString("PasswordGeneratorFrame.specialCharactersCheckBox.text")); // NOI18N

        whiteSpacesCheckBox.setText(i18n.getString("PasswordGeneratorFrame.whiteSpacesCheckBox.text")); // NOI18N

        minusCheckBox.setText(i18n.getString("PasswordGeneratorFrame.minusCheckBox.text")); // NOI18N

        underlineCheckBox.setText(i18n.getString("PasswordGeneratorFrame.underlineCheckBox.text")); // NOI18N

        lengthLabel.setText(i18n.getString("PasswordGeneratorFrame.lengthLabel.text")); // NOI18N

        lengthSpinner.setModel(new SpinnerNumberModel(20, 1, 2500, 1));

        qualityLabel.setText(i18n.getString("PasswordGeneratorFrame.qualityLabel.text")); // NOI18N

        newPasswordLabel.setText(i18n.getString("PasswordGeneratorFrame.newPasswordLabel.text")); // NOI18N

        generatePasswordButton.setText(i18n.getString("PasswordGeneratorFrame.generatePasswordButton.text")); // NOI18N
        generatePasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generatePasswordButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(useCharacterGroupsRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specialCharactersCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(upperLetterCheckBox)
                                    .addComponent(lowerLetterCheckBox)
                                    .addComponent(numbersCheckBox))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(underlineCheckBox)
                                    .addComponent(minusCheckBox)
                                    .addComponent(whiteSpacesCheckBox))))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(useSpecifiedCharacterSetRadioButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(characterSetField, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newPasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generatePasswordButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lengthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lengthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qualityLabel)
                        .addGap(2, 2, 2)
                        .addComponent(qualityBar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(useCharacterGroupsRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upperLetterCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lowerLetterCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numbersCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(specialCharactersCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(useSpecifiedCharacterSetRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(whiteSpacesCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minusCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(underlineCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(characterSetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lengthLabel)
                        .addComponent(lengthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qualityLabel))
                    .addComponent(qualityBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generatePasswordButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void generatePasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatePasswordButtonMouseClicked
    //Build a charset
    StringBuilder charsetBuilder = new StringBuilder();
    if (useCharacterGroupsRadioButton.isSelected())
    {
        if (upperLetterCheckBox.isSelected())
        {
            charsetBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        if (lowerLetterCheckBox.isSelected())
        {
            charsetBuilder.append("abcdefghijklmnopqrstuvwxyz");
        }
        if (numbersCheckBox.isSelected())
        {
            charsetBuilder.append("0123456789");
        }
        if (specialCharactersCheckBox.isSelected())
        {
            charsetBuilder.append("^°!\"§$%&/()=?`'\\}][{³²@äöüÄÖÜ#'+*~,;.:<>|");
        }
        if (whiteSpacesCheckBox.isSelected())
        {
            charsetBuilder.append(" ");
        }
        if (minusCheckBox.isSelected())
        {
            charsetBuilder.append("-");
        }
        if (underlineCheckBox.isSelected())
        {
            charsetBuilder.append("_");
        }
    }
    else //Use only specified characters
    {
        charsetBuilder.append(characterSetField.getText());
    }
    String charsetString = charsetBuilder.toString();
    int charsetLength = charsetString.length();
    //If the user has not selected any character sets, show an error message and return
    if (charsetLength == 0)
    {
        JOptionPane.showMessageDialog(this,
                "No character sets selected",
                "Select some character sets before trying to generate a password!",
                JOptionPane.ERROR_MESSAGE);
        return;
    }
}//GEN-LAST:event_generatePasswordButtonMouseClicked

    public static void generatePasswordList(String charset, int length, int count)
    {
        //Generate a password char-by-char
        SecureRandom rand = JCrypterFrame.rand;

        StringBuilder passwordBuilder = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int randInt = rand.nextInt();
            if (randInt < 0)
            {
                randInt = -randInt;
            }
            passwordBuilder.append(charset.charAt(randInt % charset.length()));
        }
        //TODO Move to password generator
        //newPasswordField.setText(passwordBuilder.toString());
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordGeneratorFrame().setVisible(true);
            }
        });
    }
    
    ResourceBundle i18n = ResourceBundle.getBundle("jcrypter/Bundle");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup characterSetButtonGroup;
    private javax.swing.JTextField characterSetField;
    private javax.swing.JButton generatePasswordButton;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JSpinner lengthSpinner;
    private javax.swing.JCheckBox lowerLetterCheckBox;
    private javax.swing.JCheckBox minusCheckBox;
    private javax.swing.JTextField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JCheckBox numbersCheckBox;
    private javax.swing.JProgressBar qualityBar;
    private javax.swing.JLabel qualityLabel;
    private javax.swing.JCheckBox specialCharactersCheckBox;
    private javax.swing.JCheckBox underlineCheckBox;
    private javax.swing.JCheckBox upperLetterCheckBox;
    private javax.swing.JRadioButton useCharacterGroupsRadioButton;
    private javax.swing.JRadioButton useSpecifiedCharacterSetRadioButton;
    private javax.swing.JCheckBox whiteSpacesCheckBox;
    // End of variables declaration//GEN-END:variables

}
