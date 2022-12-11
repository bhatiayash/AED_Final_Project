/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Program.Program;
import Business.Program.ProgramDirectory;
import Business.Enterprise.GymEnterprise;
import Business.Accounts.UserAccount;
import Business.WorkQueue.ProgramRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keshni
 */
public class CheckoutProgramJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private GymEnterprise fitenterprise;
    private ProgramDirectory myCourse;
    private Program course;
   
 
    CheckoutProgramJPanel(JPanel container, UserAccount account, ProgramDirectory myCourse, GymEnterprise fitenterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        this.fitenterprise = fitenterprise;
        this.myCourse = myCourse;
        populateCourse();
    }
    /**
     * Creates new form CheckoutProgramJPanel
     */
    public void populateCourse(){
        DefaultTableModel model = (DefaultTableModel) viewCourseJTable.getModel();
        
        model.setRowCount(0);
        for (Program course : myCourse.getProgramList()) {
                Object[] row = new Object[3];
                row[0] = course.getProgramId();
                row[1] = course;
                row[2] = course.getDifficulties();
                model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backjButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCourseJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 102, 102));

        backjButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        backjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/goback.png"))); // NOI18N
        backjButton.setText("Previous");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 102, 102));
        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/delete (1).png"))); // NOI18N
        removeButton.setText("Delete");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        viewCourseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Program ID", "Name", "Difficulty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewCourseJTable.setRowHeight(40);
        viewCourseJTable.setRowMargin(4);
        viewCourseJTable.setSelectionBackground(new java.awt.Color(215, 145, 54));
        jScrollPane1.setViewportView(viewCourseJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(backjButton)))
                .addGap(554, 554, 554))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ReserveProgramJPanel ReserveCourseJPanel = (ReserveProgramJPanel) component;
        ReserveCourseJPanel.populateCourse();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) viewCourseJTable.getModel();
        int n = model.getRowCount();
        if(model.getRowCount() == 0)
        JOptionPane.showMessageDialog(null, "No Gym program selected yet!");
        else{
            for (int i = 0; i < n; i ++) {
                ProgramRequest programRequest = new ProgramRequest();
                programRequest.setSender(account);
                programRequest.setStatus("Pending");
                programRequest.setProgram(myCourse.getProgramList().get(i));
                 
                fitenterprise.getProgramQueue().getProgramRequestList().add(programRequest);
                account.getProgramQueue().getProgramRequestList().add(programRequest);
                
            }
            
            for (Program c: myCourse.getProgramList()){
            c.setRemainSeats(c.getRemainSeats()-1);
            }
            
            myCourse.setProgramList(new ArrayList<Program> ());
            myCourse = new ProgramDirectory();
            JOptionPane.showMessageDialog(null, "The program you chose has been submitted!!");
            populateCourse();
            
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewCourseJTable.getSelectedRow();
        if(selectedRow >= 0){
            Program course = (Program)viewCourseJTable.getValueAt(selectedRow, 1);
            myCourse.getProgramList().remove(course);
            populateCourse();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_removeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JTable viewCourseJTable;
    // End of variables declaration//GEN-END:variables
}

