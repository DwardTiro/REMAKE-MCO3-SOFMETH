/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofmeth.mco3.gui;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

/**
 *
 * @author owner
 */
public class Result3AFrame extends javax.swing.JFrame {

    /**
     * Creates new form Result3AFrame
     */
    private String nameField, profField, progField, progNumField, dateField, langField;
    public Result3AFrame() {
        initComponents();
    }
    
    public Result3AFrame(String comboValue, String nameField, String profField, String progField, String progNumField, String dateField, String langField){
        initComponents();
        this.setVisible(true);
        this.nameField = nameField;
        this.profField = profField;
        this.progField = progField;
        this.progNumField = progNumField;
        this.dateField = dateField;
        this.langField = langField;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doneButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Program Number", "Function Number", "Object LOC", "Total LOC"
            }
        ));
        jScrollPane1.setViewportView(resultTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton)
                .addGap(13, 13, 13))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        XWPFDocument document = new XWPFDocument();
        try{
            FileOutputStream out = new FileOutputStream(new File("program 3a results.docx"));
            //making of title
            XWPFParagraph para = document.createParagraph();
            para.setAlignment(ParagraphAlignment.CENTER);
            para.setSpacingAfter(500);
            XWPFRun run = para.createRun();
            run.setText("Program 3A Results");
            run.setBold(true);
            run.setFontSize(16);
            //end making of title
            //adding name etc to document
            XWPFTable details = document.createTable(2, 2);
            //setting cell width
            CTTblWidth width = details.getCTTbl().addNewTblPr().addNewTblW();
            width.setType(STTblWidth.DXA);
            width.setW(BigInteger.valueOf(9500));
            //end setting cell width
            //details.getCTTbl().getTblPr().unsetTblBorders();
            XWPFTableRow dtlRow = details.getRow(0);
            dtlRow.getCell(0).setText("Name: " + nameField);
            dtlRow.getCell(1).setText("Date: " + dateField);
            dtlRow = details.getRow(1);
            dtlRow.getCell(0).setText("Professor: " + profField);
            dtlRow.getCell(1).setText("Program#: " + progNumField);
            //end adding name to document
            para = document.createParagraph();
            run = para.createRun();
            run.addBreak();
            run.addBreak();
            
            //creating of TPT table
            XWPFTable table = document.createTable(11, 4);
        
            width = table.getCTTbl().addNewTblPr().addNewTblW();
            width.setType(STTblWidth.DXA);
            width.setW(BigInteger.valueOf(9500));
            /*
            
            TODO: make all loops like this while loops?
            */
            for(int i = -1; i < 11; i++){
                
                if(i == 10) break;
                if(i == -1){ //top row of the table
                    XWPFTableRow row1 = table.getRow(i + 1);
                    for(int j = 0; j < 4; j++){
                        
                        switch(j){ //no formatting yet like bold etc
                            case 0:  row1.getCell(j).setText("Program Number");
                                     break;
                            case 1:  row1.getCell(j).setText("Function Name");
                                     break;
                            case 2:  row1.getCell(j).setText("Object LOC");
                                     break;
                            case 3:  row1.getCell(j).setText("Total LOC");
                            
                        }
                        
                        
                    }
                }
                //although this code assumes that there are values inside
                //UPDATE1: ok i fixed it i think
                else{
                    XWPFTableRow row = table.getRow(i + 1);
                    for(int j = 0; j < 4; j++){
                        if(resultTable.getModel().getValueAt(i, 1) != null && !resultTable.getModel().getValueAt(i, j).toString().isEmpty()){
                            
                            if(resultTable.getModel().getValueAt(i, j) != null && !resultTable.getModel().getValueAt(i, j).toString().isEmpty())
                                
                                row.getCell(j).setText(resultTable.getModel().getValueAt(i, j).toString());
                        }
                        else break;
                    }
                }
            }
            document.write(out);
            out.close();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_doneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Result3AFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result3AFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result3AFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result3AFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result3AFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}
