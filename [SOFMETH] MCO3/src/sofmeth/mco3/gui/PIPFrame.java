/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofmeth.mco3.gui;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.poi.xwpf.usermodel.*;
/**
 *
 * @author owner
 */
public class PIPFrame extends javax.swing.JFrame {

    /**
     * Creates new form PPSFrame
     */
    public PIPFrame() {
        initComponents();
    }
    
    public PIPFrame(float comboValue, String nameField, String profField, String sectionField, String dateField, String langField) {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesArea = new javax.swing.JTextArea();
        doneButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        probTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        propTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Notes and Comments");

        notesArea.setColumns(20);
        notesArea.setRows(5);
        jScrollPane1.setViewportView(notesArea);

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        probTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null}
            },
            new String [] {
                "Number", "Problem Description"
            }
        ));
        jScrollPane2.setViewportView(probTable);

        propTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null}
            },
            new String [] {
                "Number", "Proposal Description"
            }
        ));
        jScrollPane3.setViewportView(propTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(doneButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeButton)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        
         XWPFDocument document = new XWPFDocument();
        try{
            FileOutputStream out = new FileOutputStream(new File("pip form.docx"));
            XWPFTable table = document.createTable(6, 2);
            
            for(int i = -1; i < 6; i++){
                
                if(i == 5) break;
                if(i == -1){ //top row of the table
                    XWPFTableRow row1 = table.getRow(i + 1);
                    for(int j = 0; j < 2; j++){
                        
                        switch(j){ //no formatting yet like bold etc
                            case 0:  row1.getCell(j).setText("Number");
                                     break;
                            case 1:  row1.getCell(j).setText("Problem Description");
                                     break;
                            
                        }
                        
                        
                    }
                }
                //although this code assumes that there are values inside
                //UPDATE1: ok i fixed it i think
                else{
                    XWPFTableRow row = table.getRow(i + 1);
                    for(int j = 0; j < 2; j++){
                        if(probTable.getModel().getValueAt(i, 1) != null && !probTable.getModel().getValueAt(i, j).toString().isEmpty()){
                            
                            if(probTable.getModel().getValueAt(i, j) != null && !probTable.getModel().getValueAt(i, j).toString().isEmpty())
                                
                                row.getCell(j).setText(probTable.getModel().getValueAt(i, j).toString());
                        }
                        else break;
                    }
                }
                
            }
            XWPFParagraph pgraph = document.createParagraph();
            XWPFRun run = pgraph.createRun();
            run.addBreak();
            run.addBreak();
            XWPFTable table2 = document.createTable(6, 2);
            
            for(int i = -1; i < 6; i++){
                
                if(i == 5) break;
                if(i == -1){ //top row of the table
                    XWPFTableRow row1 = table2.getRow(i + 1);
                    for(int j = 0; j < 2; j++){
                        
                        switch(j){ //no formatting yet like bold etc
                            case 0:  row1.getCell(j).setText("Number");
                                     break;
                            case 1:  row1.getCell(j).setText("Problem Description");
                                     break;
                            
                        }
                        
                        
                    }
                }
                //although this code assumes that there are values inside
                //UPDATE1: ok i fixed it i think
                else{
                    XWPFTableRow row = table2.getRow(i + 1);
                    for(int j = 0; j < 2; j++){
                        if(probTable.getModel().getValueAt(i, 1) != null && !probTable.getModel().getValueAt(i, j).toString().isEmpty()){
                            
                            if(probTable.getModel().getValueAt(i, j) != null && !probTable.getModel().getValueAt(i, j).toString().isEmpty())
                                
                                row.getCell(j).setText(probTable.getModel().getValueAt(i, j).toString());
                        }
                        else break;
                    }
                }
                
            }
            document.write(out);
            
            out.close();
           
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_doneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PIPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PIPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PIPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PIPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PIPFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JTable probTable;
    private javax.swing.JTable propTable;
    // End of variables declaration//GEN-END:variables
}
