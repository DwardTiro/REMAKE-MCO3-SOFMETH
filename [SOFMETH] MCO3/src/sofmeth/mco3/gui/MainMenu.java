/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofmeth.mco3.gui;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sofmeth.mco3.gui.SourceCodeFrame;
import sofmeth.mco3.gui.DRLFrame;
import sofmeth.mco3.gui.PPSFrame;
import sofmeth.mco3.gui.PIPFrame;
import sofmeth.mco3.gui.SETFrame;
import sofmeth.mco3.gui.SPTFrame;
import sofmeth.mco3.gui.TPTFrame;
import sofmeth.mco3.gui.TRLFrame;
import sofmeth.mco3.gui.TRTFrame;
/**
 *
 * @author owner
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    //private MainMenu mainMenu = new MainMenu();
    //private final CardLayout cl = new CardLayout();
    private SourceCodeFrame sourceCodeFrame;
    private DRLFrame drlFrame;
    private TRLFrame trlFrame;
    private PPSFrame ppsFrame;
    private PIPFrame pipFrame;
    private SETFrame sestFrame;
    private SPTFrame sptFrame;
    private TPTFrame tptFrame;
    private TRTFrame trtFrame;
    private float comboValue;
    public MainMenu() {
        //menuPanel.setLayout(cl);
        initComponents();
        trtButton.setEnabled(false);
        pipButton.setEnabled(false);
        sestButton.setEnabled(false);
        tptButton.setEnabled(false);
        sptButton.setEnabled(false);
        addListener_menu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ppsButton = new javax.swing.JButton();
        tptButton = new javax.swing.JButton();
        trtButton = new javax.swing.JButton();
        sptButton = new javax.swing.JButton();
        pipButton = new javax.swing.JButton();
        trlButton = new javax.swing.JButton();
        sestButton = new javax.swing.JButton();
        drlButton = new javax.swing.JButton();
        scButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pspCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        profField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        langField = new javax.swing.JTextField();
        progField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        progNumField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sectionField = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Form Builder");

        ppsButton.setText("Project Plan Summary");

        tptButton.setText("Task Planning Template");

        trtButton.setText("Test Report Template");

        sptButton.setText("Schedule Planning Template");

        pipButton.setText("Process Improvement Plan");

        trlButton.setText("Time Recording Log");

        sestButton.setText("Size Estimating Template");

        drlButton.setText("Defect Recording Log");

        scButton.setText("Source Code");
        scButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("PSP Level");

        pspCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.1", "1", "1.1" }));
        pspCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pspComboItemStateChanged(evt);
            }
        });
        pspCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pspComboActionPerformed(evt);
            }
        });

        jLabel3.setText("Name of student:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Name of Professor:");

        jLabel5.setText("Date:");

        jLabel6.setText("Program:");

        jLabel7.setText("Language:");

        jLabel8.setText("Program#:");

        progNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progNumFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Section:");

        sectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(scButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pspCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ppsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sectionField))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(progField))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profField))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateField))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(langField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(menuPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(progNumField)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(48, 48, 48))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(profField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(langField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(progField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(progNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pspCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsButton)
                    .addComponent(tptButton))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trtButton)
                    .addComponent(sptButton))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pipButton)
                    .addComponent(trlButton))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drlButton)
                    .addComponent(sestButton))
                .addGap(32, 32, 32)
                .addComponent(scButton)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scButtonActionPerformed

    private void pspComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pspComboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pspComboActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void pspComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pspComboItemStateChanged
        // TODO add your handling code here:
        if(pspCombo.getSelectedIndex()==0){
            trtButton.setEnabled(false);
            pipButton.setEnabled(false);
            sestButton.setEnabled(false);
            tptButton.setEnabled(false);
            sptButton.setEnabled(false);
        }
        if(pspCombo.getSelectedIndex()==1){
            trtButton.setEnabled(false);
            pipButton.setEnabled(true);
            sestButton.setEnabled(false);
            tptButton.setEnabled(false);
            sptButton.setEnabled(false);
        }
        if(pspCombo.getSelectedIndex()==2){
            trtButton.setEnabled(true);
            pipButton.setEnabled(true);
            sestButton.setEnabled(true);
            tptButton.setEnabled(false);
            sptButton.setEnabled(false);
        }
        if(pspCombo.getSelectedIndex()==3){
            trtButton.setEnabled(true);
            pipButton.setEnabled(true);
            sestButton.setEnabled(true);
            tptButton.setEnabled(true);
            sptButton.setEnabled(true);
        }
    }//GEN-LAST:event_pspComboItemStateChanged

    private void progNumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progNumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_progNumFieldActionPerformed

    private void sectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    private void addListener_menu(){
        scButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty()) &&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    sourceCodeFrame = new SourceCodeFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
            }
        });
        
        drlButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty())&&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    drlFrame = new DRLFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
            }
        });
        
        trlButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty())&&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    trlFrame = new TRLFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
            }
        });
        
        pipButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty())&&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    pipFrame = new PIPFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
            }
        });
        
        ppsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty())&&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    ppsFrame = new PPSFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
            }
        });
        
        sestButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty())&&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    sestFrame = new SETFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
                
            }
        });
        
        sptButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty())&&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    sptFrame = new SPTFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
            }
        });
        
        tptButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty())&&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    tptFrame = new TPTFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
            }
        });
        
        trtButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if((!progNumField.getText().isEmpty())&&(!progField.getText().isEmpty())&&(!nameField.getText().isEmpty())&&(!profField.getText().isEmpty())&&(!dateField.getText().isEmpty())&&(!langField.getText().isEmpty())&&(!progField.getText().isEmpty())){
                    comboValue = Float.valueOf(String.valueOf(pspCombo.getSelectedItem()));
                    trtFrame = new TRTFrame(comboValue, nameField.getText(), profField.getText(), progField.getText(), progNumField.getText(), dateField.getText(), langField.getText());    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please provide input on all of the fields");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateField;
    private javax.swing.JButton drlButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField langField;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton pipButton;
    private javax.swing.JButton ppsButton;
    private javax.swing.JTextField profField;
    private javax.swing.JTextField progField;
    private javax.swing.JTextField progNumField;
    private javax.swing.JComboBox<String> pspCombo;
    private javax.swing.JButton scButton;
    private javax.swing.JTextField sectionField;
    private javax.swing.JButton sestButton;
    private javax.swing.JButton sptButton;
    private javax.swing.JButton tptButton;
    private javax.swing.JButton trlButton;
    private javax.swing.JButton trtButton;
    // End of variables declaration//GEN-END:variables
}
