/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Program.Program;
import Business.Enterprise.GymEnterprise;
import Business.Accounts.CustomerAccount;
import Business.Accounts.UserAccount;
import Business.WorkQueue.ProgramQueue;
import Business.WorkQueue.ProgramRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keshni
 */
public class ProgramViewJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAccount account;
    private GymEnterprise fitenterprise;
    //private Program course;

    /**
     * Creates new form CourseViewJPanel
     */
    public ProgramViewJPanel(JPanel container, UserAccount account, GymEnterprise fitenterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        this.fitenterprise = fitenterprise;
        //this.course =course;

        populateRequest();

    }
    
    public void populateRequest() {
        ProgramQueue courseQueue = account.getProgramQueue();
        DefaultTableModel model = (DefaultTableModel) myCourseJTable.getModel();

        model.setRowCount(0);
        for (ProgramRequest courseRequest : courseQueue.getProgramRequestList()) {
            Object[] row = new Object[3];
            row[0] = courseRequest;
            row[1] = courseRequest.getStatus();
            row[2] = courseRequest.getReceiver();
            
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

        renewBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myCourseJTable = new javax.swing.JTable();
        reviewBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        renewBtn.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        renewBtn.setForeground(new java.awt.Color(0, 102, 102));
        renewBtn.setText("Renew program duration");
        renewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/back (1).png"))); // NOI18N
        backBtn.setText("Previous");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your Programs");

        myCourseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Program", "Status", "Manager"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myCourseJTable.setRowHeight(40);
        myCourseJTable.setRowMargin(4);
        myCourseJTable.setSelectionBackground(new java.awt.Color(215, 145, 54));
        jScrollPane1.setViewportView(myCourseJTable);

        reviewBtn.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        reviewBtn.setForeground(new java.awt.Color(0, 102, 102));
        reviewBtn.setText("Rate this program");
        reviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(399, 399, 399)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(renewBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reviewBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(454, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(renewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void renewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = myCourseJTable.getSelectedRow();
        if (selectedRow >= 0) {
            ProgramRequest courseRequest = (ProgramRequest) myCourseJTable.getValueAt(selectedRow, 0);
            if (!courseRequest.getStatus().equals("Complete")) {
                JOptionPane.showMessageDialog(null, "This status cannot be changed");
            } else {
                courseRequest.setStatus("Renewed");
                for (Program course2 : fitenterprise.getProgramDirectory().getProgramList()) {
                    if (courseRequest.getProgram().equals(course2)) {
                        int remainSeats = course2.getRemainSeats();
                        course2.setRemainSeats(remainSeats - 1);
                    }
                }

                JOptionPane.showMessageDialog(null, "Renew Course Successfully!!");
                populateRequest();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateRequest();
    }//GEN-LAST:event_renewBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
      container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void reviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = myCourseJTable.getSelectedRow();

        if (selectedRow >= 0) {
            ProgramRequest courseRequest = (ProgramRequest) myCourseJTable.getValueAt(selectedRow, 0);
            if (!courseRequest.getStatus().equals("Complete")) {
                JOptionPane.showMessageDialog(null, "This status cannot be changed");
                return;
            }
            Program course =( (ProgramRequest) myCourseJTable.getValueAt(selectedRow, 0)).getProgram();
            ReviewProgramJPanel reviewCourseJPanel = new ReviewProgramJPanel(container, account, course, fitenterprise);
            container.add("reviewCourseJPanel", reviewCourseJPanel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }

    }//GEN-LAST:event_reviewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable myCourseJTable;
    private javax.swing.JButton renewBtn;
    private javax.swing.JButton reviewBtn;
    // End of variables declaration//GEN-END:variables

}
