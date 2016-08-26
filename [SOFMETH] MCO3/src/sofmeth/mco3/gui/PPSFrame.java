/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofmeth.mco3.gui;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import javax.swing.SwingConstants;
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
public class PPSFrame extends javax.swing.JFrame {

    /**
     * Creates new form PIPFrame
     */
    private String nameField, profField, progField, progNumField, dateField, langField, comboValue;
    public PPSFrame() {
        initComponents();
    }
    
    public PPSFrame(String comboValue, String nameField, String profField, String progField, String progNumField, String dateField, String langField) {
        initComponents();
        this.nameField = nameField;
        this.profField = profField;
        this.progField = progField;
        this.progNumField = progNumField;
        this.dateField = dateField;
        this.langField = langField;
        this.comboValue = comboValue;
        if(comboValue=="1A"){
            psp11Panel.setVisible(false);
        }
        if(comboValue=="5A"||comboValue=="4A"){
            summaryPanel.setVisible(true);
            if(comboValue=="4A"){
                plannedField.setEditable(false);
                plannedField2.setEditable(false);
                actualField.setEditable(false);
                actualField2.setEditable(false);
                cpiField.setEditable(false);
                perreusedField.setEditable(false);
                perreusedField2.setEditable(false);
                perreusedField3.setEditable(false);
                newreusedField.setEditable(false);
                newreusedField2.setEditable(false);
                newreusedField3.setEditable(false);
            }
            else{
                plannedField.setEditable(true);
                plannedField2.setEditable(true);
                actualField.setEditable(true);
                actualField2.setEditable(true);
                cpiField.setEditable(true);
                perreusedField.setEditable(true);
                perreusedField2.setEditable(true);
                perreusedField3.setEditable(true);
                newreusedField.setEditable(true);
                newreusedField2.setEditable(true);
                newreusedField3.setEditable(true);
            }
        }
        else{
            summaryPanel.setVisible(false);
            
        }
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

        pipPanel = new javax.swing.JPanel();
        doneButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        summaryPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        locField = new javax.swing.JTextField();
        plannedField = new javax.swing.JTextField();
        perreusedField = new javax.swing.JTextField();
        newreusedField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        locField2 = new javax.swing.JTextField();
        actualField = new javax.swing.JTextField();
        perreusedField2 = new javax.swing.JTextField();
        newreusedField2 = new javax.swing.JTextField();
        locField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        plannedField2 = new javax.swing.JTextField();
        actualField2 = new javax.swing.JTextField();
        cpiField = new javax.swing.JTextField();
        perreusedField3 = new javax.swing.JTextField();
        newreusedField3 = new javax.swing.JTextField();
        psp11Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loc11Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        loc11Table2 = new javax.swing.JTable();
        timePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        timeTable = new javax.swing.JTable();
        defectiPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        defectiTable = new javax.swing.JTable();
        defectrPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        defectrTable = new javax.swing.JTable();

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

        jLabel1.setText("LOC/Hour");

        jLabel2.setText("Planned Time");

        jLabel3.setText("Actual Time");

        jLabel4.setText("CPI");

        locField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Planned");

        jLabel6.setText("% Reused");

        jLabel7.setText("New Reused");

        jLabel8.setText("Actual");

        jLabel9.setText("To Date");

        javax.swing.GroupLayout summaryPanelLayout = new javax.swing.GroupLayout(summaryPanel);
        summaryPanel.setLayout(summaryPanelLayout);
        summaryPanelLayout.setHorizontalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(summaryPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, summaryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(locField, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(plannedField)
                        .addComponent(perreusedField)
                        .addComponent(newreusedField)))
                .addGap(31, 31, 31)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(summaryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addComponent(actualField)
                    .addComponent(perreusedField2)
                    .addComponent(newreusedField2)
                    .addComponent(locField2))
                .addGap(18, 18, 18)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(locField3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(plannedField2)
                    .addComponent(actualField2)
                    .addComponent(cpiField)
                    .addComponent(perreusedField3)
                    .addComponent(newreusedField3))
                .addContainerGap())
        );
        summaryPanelLayout.setVerticalGroup(
            summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(locField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plannedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(plannedField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(actualField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(perreusedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perreusedField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perreusedField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(summaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(newreusedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newreusedField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newreusedField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loc11Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Base", null, null},
                {"Deleted", null, null},
                {"Modified", null, null},
                {"Added", null, null}

            },
            new String [] {
                "Program Size", "Plan", "Actual"
            }
        ));
        jScrollPane1.setViewportView(loc11Table);

        loc11Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Reused", null, null, null},
                {"Total New and Changed", null, null, null},
                {"Total LOC", null, null, null},
                {"Total New and Reused", null, null, null}
            },
            new String [] {
                "Program Size", "Actual", "Planned", "To Date"
            }
        ));
        jScrollPane2.setViewportView(loc11Table2);

        javax.swing.GroupLayout psp11PanelLayout = new javax.swing.GroupLayout(psp11Panel);
        psp11Panel.setLayout(psp11PanelLayout);
        psp11PanelLayout.setHorizontalGroup(
            psp11PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psp11PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(psp11PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        psp11PanelLayout.setVerticalGroup(
            psp11PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psp11PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        timeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Planning", null, null, null, null},
                {"Design", null, null, null, null},
                {"Code", null, null, null, null},
                {"Compile", null, null, null, null},
                {"Test", null, null, null, null},
                {"Postmortem", null, null, null, null},
                {"Total", null, null, null, null}
            },
            new String [] {
                "Time in Phase", "Plan", "Actual", "To Date","To Date %"
            }
        ));
        jScrollPane3.setViewportView(timeTable);

        defectiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Planning", null, null, null, null},
                {"Design", null, null, null, null},
                {"Code", null, null, null, null},
                {"Compile", null, null, null, null},
                {"Test", null, null, null, null},
                {"Total Development", null, null, null, null}
            },
            new String [] {
                "Defects Injected","Plan", "Actual", "To Date", "To Date %"
            }
        ));
        jScrollPane4.setViewportView(defectiTable);

        javax.swing.GroupLayout defectiPanelLayout = new javax.swing.GroupLayout(defectiPanel);
        defectiPanel.setLayout(defectiPanelLayout);
        defectiPanelLayout.setHorizontalGroup(
            defectiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defectiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );
        defectiPanelLayout.setVerticalGroup(
            defectiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defectiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout timePanelLayout = new javax.swing.GroupLayout(timePanel);
        timePanel.setLayout(timePanelLayout);
        timePanelLayout.setHorizontalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(timePanelLayout.createSequentialGroup()
                        .addComponent(defectiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        timePanelLayout.setVerticalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(defectiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        defectrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Planning", null, null, null, null},
                {"Design", null, null, null, null},
                {"Code", null, null, null, null},
                {"Compile", null, null, null, null},
                {"Test", null, null, null, null},
                {"Total Development", null, null, null, null},
                {"After Development", null, null, null, null}
            },
            new String [] {
                "Defects Removed", "Plan", "Actual", "To Date", "To Date %"
            }
        ));
        jScrollPane5.setViewportView(defectrTable);

        javax.swing.GroupLayout defectrPanelLayout = new javax.swing.GroupLayout(defectrPanel);
        defectrPanel.setLayout(defectrPanelLayout);
        defectrPanelLayout.setHorizontalGroup(
            defectrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defectrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        defectrPanelLayout.setVerticalGroup(
            defectrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defectrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pipPanelLayout = new javax.swing.GroupLayout(pipPanel);
        pipPanel.setLayout(pipPanelLayout);
        pipPanelLayout.setHorizontalGroup(
            pipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pipPanelLayout.createSequentialGroup()
                .addGroup(pipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pipPanelLayout.createSequentialGroup()
                        .addGroup(pipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pipPanelLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(summaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pipPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(psp11Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pipPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(doneButton))
                            .addComponent(defectrPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(pipPanelLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(closeButton)
                .addGap(13, 13, 13))
        );
        pipPanelLayout.setVerticalGroup(
            pipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pipPanelLayout.createSequentialGroup()
                        .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(defectrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doneButton)
                            .addComponent(closeButton)))
                    .addGroup(pipPanelLayout.createSequentialGroup()
                        .addComponent(summaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(psp11Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pipPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pipPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void locFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locFieldActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        XWPFDocument document = new XWPFDocument();
        
        try{
            FileOutputStream out = new FileOutputStream(new File("PPS 1A.docx"));
            switch(comboValue){
                
                case "1A": out = new FileOutputStream(new File("PPS 1A.docx"));
                           break;
                case "2A": out = new FileOutputStream(new File("PPS 2A.docx"));
                           break;
                case "3A": out = new FileOutputStream(new File("PPS 3A.docx"));
                           break;
                case "4A": out = new FileOutputStream(new File("PPS 4A.docx"));
                           break;
                case "5A": out = new FileOutputStream(new File("PPS 5A.docx"));
                           break;
            }
            
            //making of title
            XWPFParagraph para = document.createParagraph();
            para.setAlignment(ParagraphAlignment.CENTER);
            para.setSpacingAfter(500);
            XWPFRun run = para.createRun();
            run.setText("Project Plan Summary(" + comboValue + ")");
            run.setBold(true);
            run.setFontSize(16);
            //end making of title
            para = document.createParagraph();
            run = para.createRun();
            
            
            
            //adding name etc to document
            XWPFTable details = document.createTable(3, 2);
            //setting cell width
            CTTblWidth width = details.getCTTbl().addNewTblPr().addNewTblW();
            width.setType(STTblWidth.DXA);
            width.setW(BigInteger.valueOf(9000));
            //end setting cell width
            //details.getCTTbl().getTblPr().unsetTblBorders();
            XWPFTableRow row = details.getRow(0);
            row.getCell(0).setText("Name: " + nameField);
            row.getCell(1).setText("Date: " + dateField);
            row = details.getRow(1);
            row.getCell(0).setText("Program: " + progField);
            row.getCell(1).setText("Program#: " + progNumField);
            row = details.getRow(2);
            row.getCell(0).setText("Professor: " + profField);
            row.getCell(1).setText("Language: " + langField);
            
            para = document.createParagraph();
            run = para.createRun();
            run.addBreak();
            run.addBreak();
            
            XWPFTable table = document.createTable(8, 5);
            width = table.getCTTbl().addNewTblPr().addNewTblW();
            width.setType(STTblWidth.DXA);
            width.setW(BigInteger.valueOf(9000));
            //time
            for(int i = -1; i < 8; i++){
                
                if(i == 7) break;
                if(i == -1){ //top row of the table
                    XWPFTableRow row1 = table.getRow(i + 1);
                    for(int j = 0; j < 5; j++){
                        
                        switch(j){ //no formatting yet like bold etc
                        case 0:  row1.getCell(j).setText("Time in Phase");
                                 break;
                        case 1:  row1.getCell(j).setText("Plan");
                                 break;
                        case 2:  row1.getCell(j).setText("Actual");
                                 break;
                        case 3:  row1.getCell(j).setText("To Date");
                                 break;
                        case 4:  row1.getCell(j).setText("To Date %");
                                 break;   
                        }
                        
                        
                    }
                }
                //although this code assumes that there are values inside
                //UPDATE1: ok i fixed it i think
                else{
                    row = table.getRow(i + 1);
                    for(int j = 0; j < 5; j++){
                        
                        if(timeTable.getModel().getValueAt(i, j) != null && !timeTable.getModel().getValueAt(i, j).toString().isEmpty())
                                row.getCell(j).setText(timeTable.getModel().getValueAt(i, j).toString());
                        
                        
                    }
                }
            }
            System.out.print(timeTable.getModel().getValueAt(0, 0).toString());
            //defect inject
            para = document.createParagraph();
            run = para.createRun();
            run.addBreak();
            table = document.createTable(7, 5);
            width = table.getCTTbl().addNewTblPr().addNewTblW();
            width.setType(STTblWidth.DXA);
            width.setW(BigInteger.valueOf(9000));
            for(int i = -1; i < 7; i++){
                
                if(i == 6) break;
                if(i == -1){ //top row of the table
                    XWPFTableRow row1 = table.getRow(i + 1);
                    for(int j = 0; j < 5; j++){
                        
                        switch(j){ //no formatting yet like bold etc
                        case 0:  row1.getCell(j).setText("Defects Injected");
                                 break;
                        case 1:  row1.getCell(j).setText("Plan");
                                 break;
                        case 2:  row1.getCell(j).setText("Actual");
                                 break;
                        case 3:  row1.getCell(j).setText("To Date");
                                 break;
                        case 4:  row1.getCell(j).setText("To Date %");
                                 break;   
                        }
                        
                        
                    }
                }
                //although this code assumes that there are values inside
                //UPDATE1: ok i fixed it i think
                else{
                    row = table.getRow(i + 1);
                    for(int j = 0; j < 5; j++){
                        
                         if(defectiTable.getModel().getValueAt(i, j) != null && !defectiTable.getModel().getValueAt(i, j).toString().isEmpty())
                                
                                row.getCell(j).setText(defectiTable.getModel().getValueAt(i, j).toString());
                        
                        
                    }
                }
                
            }
            //defect removed
            para = document.createParagraph();
            run = para.createRun();
            run.addBreak();
            
            table = document.createTable(8, 5);
            width = table.getCTTbl().addNewTblPr().addNewTblW();
            width.setType(STTblWidth.DXA);
            width.setW(BigInteger.valueOf(9000));
            for(int i = -1; i < 8; i++){
                
                if(i == 7) break;
                if(i == -1){ //top row of the table
                    XWPFTableRow row1 = table.getRow(i + 1);
                    for(int j = 0; j < 5; j++){
                        
                        switch(j){ //no formatting yet like bold etc
                        case 0:  row1.getCell(j).setText("Time in Phase");
                                 break;
                        case 1:  row1.getCell(j).setText("Plan");
                                 break;
                        case 2:  row1.getCell(j).setText("Actual");
                                 break;
                        case 3:  row1.getCell(j).setText("To Date");
                                 break;
                        case 4:  row1.getCell(j).setText("To Date %");
                                 break;   
                        }
                        
                        
                    }
                }
                //although this code assumes that there are values inside
                //UPDATE1: ok i fixed it i think
                else{
                    row = table.getRow(i + 1);
                    for(int j = 0; j < 5; j++){
                        
                        
                            if(defectrTable.getModel().getValueAt(i, j) != null && !defectrTable.getModel().getValueAt(i, j).toString().isEmpty())
                                
                                row.getCell(j).setText(defectrTable.getModel().getValueAt(i, j).toString());
                        
                        
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
            java.util.logging.Logger.getLogger(PPSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PPSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PPSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PPSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PPSFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actualField;
    private javax.swing.JTextField actualField2;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField cpiField;
    private javax.swing.JPanel defectiPanel;
    private javax.swing.JTable defectiTable;
    private javax.swing.JPanel defectrPanel;
    private javax.swing.JTable defectrTable;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable loc11Table;
    private javax.swing.JTable loc11Table2;
    private javax.swing.JTextField locField;
    private javax.swing.JTextField locField2;
    private javax.swing.JTextField locField3;
    private javax.swing.JTextField newreusedField;
    private javax.swing.JTextField newreusedField2;
    private javax.swing.JTextField newreusedField3;
    private javax.swing.JTextField perreusedField;
    private javax.swing.JTextField perreusedField2;
    private javax.swing.JTextField perreusedField3;
    private javax.swing.JPanel pipPanel;
    private javax.swing.JTextField plannedField;
    private javax.swing.JTextField plannedField2;
    private javax.swing.JPanel psp11Panel;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JPanel timePanel;
    private javax.swing.JTable timeTable;
    // End of variables declaration//GEN-END:variables
}
