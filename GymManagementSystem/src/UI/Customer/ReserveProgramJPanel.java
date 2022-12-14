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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author keshni
 */
public class ReserveProgramJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private GymEnterprise fitenterprise;
    private ProgramDirectory myCourse;

    /**
     * Creates new form ReverseClassJPanel
     */
    ReserveProgramJPanel(JPanel container, UserAccount account, ProgramDirectory myCourse, GymEnterprise fitenterprise) {
        this.container = container;
        this.account = account;
        this.myCourse = myCourse;
        this.fitenterprise = fitenterprise;
        initComponents();
        populateCourse();
    }
    
    public void populateCourse(){
        DefaultTableModel model = (DefaultTableModel) viewCourseJTable.getModel();
        
        model.setRowCount(0);
        for (Program course : fitenterprise.getProgramDirectory().getProgramList()) {
                Object[] row = new Object[3];
                row[0] = course;
                row[1] = course.getDifficulties();
                row[2] = course.getRemainSeats();
                
                model.addRow(row);
        }
        
        for(int i = model.getRowCount() - 1; i >= 0; i--){
            if(myCourse.getProgramList().contains((Program)viewCourseJTable.getValueAt(i, 0))){
                model.removeRow(i);
            }
        }
         for(int i = model.getRowCount() - 1; i >= 0; i--){
            for(ProgramRequest courseRequest : account.getProgramQueue().getProgramRequestList())
                if(courseRequest.getStatus().equals("Accept") || courseRequest.getStatus().equals("Sent"))
                    if(courseRequest.getProgram().getProgramName()
                            .equals(((Program)viewCourseJTable.getValueAt(i, 0)).getProgramName()))
                        model.removeRow(i);
        }
    }

    public void populateCouse(String name){
        DefaultTableModel model = (DefaultTableModel) viewCourseJTable.getModel();
        model.setRowCount(0);
        for (Program course : fitenterprise.getProgramDirectory().getProgramList()) {
            if(course.getProgramName().equals(name)){
                Object[] row = new Object[3];
                row[0] = course;
                row[1] = course.getDifficulties();
                row[2] = course.getRemainSeats();
                
                model.addRow(row);
            }
        }
        
        for(int i = model.getRowCount() - 1; i >= 0; i--){
            if(myCourse.getProgramList().contains((Program)viewCourseJTable.getValueAt(i, 0))){
                model.removeRow(i);
            }
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

        btnViewDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCourseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        btnViewDetails.setBackground(new java.awt.Color(0, 102, 102));
        btnViewDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(0, 102, 102));
        btnViewDetails.setText("Show program details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/back (1).png"))); // NOI18N
        btnBack.setText("Previous");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        checkoutButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        checkoutButton.setForeground(new java.awt.Color(0, 102, 102));
        checkoutButton.setText("View your bookings and confirm..");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        viewCourseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Program", "Difficulty", "Remain Seats"
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

        jLabel1.setFont(new java.awt.Font("Aurulent Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select desired program");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/search.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 51, 51));
        btnReset.setText("Reset selection");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        nameTxt.setToolTipText("");
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 102, 102));
        btnAdd.setText("Add this program to my schedule");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(38, 38, 38)
                                .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewCourseJTable.getSelectedRow();
        if(selectedRow >= 0){
            Program course = (Program)viewCourseJTable.getValueAt(selectedRow, 0);
            ProgramDetailsJPanel courseDetailJPanel = new ProgramDetailsJPanel(container, course);
            container.add("courseDetailJPanel", courseDetailJPanel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        // TODO add your handling code here:
        CheckoutProgramJPanel checkoutCourseJPanel = new CheckoutProgramJPanel(container, account, myCourse, fitenterprise);
        container.add("checkoutCourseJPanel", checkoutCourseJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       
        String name = nameTxt.getText();
        populateCouse(name);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      populateCourse();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewCourseJTable.getSelectedRow();
        if(selectedRow >= 0){
            Program course = (Program)viewCourseJTable.getValueAt(selectedRow, 0);
            if(myCourse.getProgramList().contains(course)){
                JOptionPane.showMessageDialog(null, "It's already in your cart!");
            }
            else{
                if(course.getRemainSeats() == 0){
                    JOptionPane.showMessageDialog(null, "This class is out of stock");
                }
                else{
                    myCourse.getProgramList().add(course);
                    JOptionPane.showMessageDialog(null, "Add Successfully");
                    DefaultTableModel model = (DefaultTableModel) viewCourseJTable.getModel();
                    populateCourse();
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTable viewCourseJTable;
    // End of variables declaration//GEN-END:variables
}
