/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofmeth.mco3.gui;

/**
 *
 * @author owner
 */
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import panels.DRLPanel;
public class DRLFrame extends javax.swing.JFrame {

    /**
     * Creates new form DRLFrame
     */
    private ArrayList<DRLPanel> drlList = new ArrayList<DRLPanel>();
    private JPanel mainPanel = new JPanel();
    private JComboBox typeCombo = new JComboBox<>();
    private TableColumn tableColumn;
    public DRLFrame() {
        drlList.add(new DRLPanel());
        initComponents();
        defectPanel.setLayout(new GridBagLayout());
        defectPanel.add(new DRLPanel());
    }
    
    public DRLFrame(float comboValue, String nameField, String profField, String dateField, String langField) {
        initComponents();
        tableColumn = drlTable.getColumn(drlTable.getColumnName(2));
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        tableColumn.setCellEditor(new DefaultCellEditor(typeCombo));
         DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        tableColumn.setCellRenderer(renderer);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        defectPanel = new javax.swing.JPanel();
        doneButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        drlTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        doneButton.setText("Done");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        drlTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null},
                {null, null, "10", null, null, null, null, null}
            },
            new String [] {
                "Date", "Number", "Type", "Inject", "Remove", "Fix Time", "Fix Defect", "Description"
            }
        ));
        jScrollPane2.setViewportView(drlTable);

        javax.swing.GroupLayout defectPanelLayout = new javax.swing.GroupLayout(defectPanel);
        defectPanel.setLayout(defectPanelLayout);
        defectPanelLayout.setHorizontalGroup(
            defectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defectPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneButton)
                .addGap(34, 34, 34)
                .addComponent(closeButton)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                .addContainerGap())
        );
        defectPanelLayout.setVerticalGroup(
            defectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(defectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(defectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(defectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DRLFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DRLFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DRLFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DRLFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DRLFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel defectPanel;
    private javax.swing.JButton doneButton;
    private javax.swing.JTable drlTable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
