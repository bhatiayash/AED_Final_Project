/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Gym.Manager;

import Business.Employee.Employee;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yashbhatia
 */
public class EmployeeDetailJPanel extends javax.swing.JPanel {
    private JPanel container;
    private Employee employee;
    
    /**
     * Creates new form EmployeeDetailJPanel
     */
    public EmployeeDetailJPanel(JPanel container, Employee employee) {
        initComponents();
        this.employee = employee;
        this.container = container;
        
        txtEmpName.setText(employee.getName());
        txtEmpID.setText(String.valueOf(employee.getId()));
        
        String pg_name = employee.getProgram();
        //System.out.println (pg_name);
        txtProgram.setText(employee.getProgram());
        txtAssessment.setText(employee.getEvaluation());
        txtEmployeeTitle.setText(employee.getJobtitle());
        txtPhNo.setText (employee.getPhoneNumber());
        
        // can't change these fields
        
        //txtProgram.setEditable(false);
        txtProgram.setEnabled(false);
        txtEmployeeTitle.setEnabled(false);
        txtEmpName.setEnabled(false);
        txtEmpID.setEnabled(false);
        txtAssessment.setEnabled(false);  
        txtPhNo.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAssessment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backTxt = new javax.swing.JButton();
        btnUpdateDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        lblPrgName = new javax.swing.JLabel();
        txtProgram = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmployeeTitle = new javax.swing.JTextField();
        txtPhNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSaveDetails = new javax.swing.JButton();
        lblPhNoMesg = new javax.swing.JLabel();
        lblAssessErrMesg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 230, -1, -1));

        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDActionPerformed(evt);
            }
        });
        add(txtEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 225, 133, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Assessment");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 411, -1, -1));

        txtAssessment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAssessmentActionPerformed(evt);
            }
        });
        txtAssessment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAssessmentKeyPressed(evt);
            }
        });
        add(txtAssessment, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 407, 133, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee Details");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 36, -1, -1));

        backTxt.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        backTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/back (1).png"))); // NOI18N
        backTxt.setText("Previous");
        backTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTxtActionPerformed(evt);
            }
        });
        add(backTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 44, -1, 50));

        btnUpdateDetails.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnUpdateDetails.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdateDetails.setText("Update Employee Details");
        btnUpdateDetails.setActionCommand("Update Employee Details..");
        btnUpdateDetails.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnUpdateDetailsItemStateChanged(evt);
            }
        });
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });
        add(btnUpdateDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 183, -1, -1));

        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });
        add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 178, 133, -1));

        lblPrgName.setForeground(new java.awt.Color(255, 255, 255));
        lblPrgName.setText("Program name");
        add(lblPrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 345, -1, -1));

        txtProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProgramActionPerformed(evt);
            }
        });
        add(txtProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 345, 133, 28));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Employee Title");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 291, -1, -1));

        txtEmployeeTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeTitleActionPerformed(evt);
            }
        });
        add(txtEmployeeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 286, 133, -1));

        txtPhNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhNoActionPerformed(evt);
            }
        });
        txtPhNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhNoKeyPressed(evt);
            }
        });
        add(txtPhNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 451, 133, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone No.");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 456, -1, -1));

        btnSaveDetails.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btnSaveDetails.setForeground(new java.awt.Color(0, 102, 102));
        btnSaveDetails.setText("Save");
        btnSaveDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDetailsActionPerformed(evt);
            }
        });
        add(btnSaveDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 539, 108, 50));
        add(lblPhNoMesg, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 451, 187, 19));
        add(lblAssessErrMesg, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 407, 251, 26));
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDActionPerformed

    private void txtAssessmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAssessmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAssessmentActionPerformed

    private void backTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTxtActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backTxtActionPerformed

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        // TODO add your handling code here:
        btnUpdateDetails.setEnabled(false);
        
        txtPhNo.setEnabled (true);
        txtAssessment.setEnabled (true);
        txtPhNo.setEditable (true);
        txtAssessment.setEditable (true);
        
        

        if (txtEmployeeTitle.getText().equals("Trainer")){
            
        txtEmpName.setEnabled(false);
        txtEmpID.setEnabled(false);
        txtAssessment.setEnabled(true);
        txtEmployeeTitle.setEnabled(false);
        txtProgram.setEnabled(true);
        txtPhNo.setEnabled(true);
        
        txtProgram.setEditable(true);
        txtAssessment.setEditable (true);
        txtPhNo.setEditable(true);
        
        employee.setJobtitle(txtEmployeeTitle.getText());
        }
        
        else {                                          // if its an analyst or clerk
            
         txtProgram.setEnabled(false);
         txtEmpID.setEnabled(false);
         txtEmpName.setEnabled(false);
         txtEmployeeTitle.setEnabled(false);
         
         txtProgram.setEditable(false);
         txtAssessment.setEditable (true);
         txtPhNo.setEditable(true);
         txtAssessment.setEnabled(true);
         txtPhNo.setEnabled(true);
         
         
         
         employee.setJobtitle(txtEmployeeTitle.getText());
        }
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void txtProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProgramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProgramActionPerformed

    private void txtEmployeeTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeTitleActionPerformed

    private void btnUpdateDetailsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnUpdateDetailsItemStateChanged
 
        if(txtEmployeeTitle.getText().equals("Trainer") || txtEmployeeTitle.getText().equals("Clerk"))
        {
            txtProgram.setEnabled(true);
        }
        
        else
        {
            txtProgram.setEnabled(false);
        }
        
        //txtProgram.setText(txtProgram.getText());
        employee.setProgram(txtProgram.getText());
    }//GEN-LAST:event_btnUpdateDetailsItemStateChanged

    private void btnSaveDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDetailsActionPerformed
       
        txtEmpName.setEditable(false);
        txtEmpID.setEditable(false);
        txtProgram.setEditable(false);
        txtAssessment.setEditable(false);

        btnSaveDetails.setEnabled(false);
        btnUpdateDetails.setEnabled(true);

        
        String pg_name = txtProgram.getText ();
        
        employee.setProgram(pg_name);
        
        String phno = txtPhNo.getText();
        
        employee.setPhoneNumber(phno);
        
        JOptionPane.showMessageDialog(null, "Employee details updated successfully");
        
    }//GEN-LAST:event_btnSaveDetailsActionPerformed

    private void txtPhNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhNoKeyPressed
       
        String s = txtPhNo.getText();
        
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'  || evt.getKeyChar() == '+')
        {
            
        if(s.length() < 12){
            
            // allow to enter +1 and 10 digits
            
            txtPhNo.setBackground(Color.WHITE);                                               //see
            txtPhNo.setEditable(true);
            
        }
        else{
            txtPhNo.setEditable(false);
        }
        }
        else{
            //allow for backspace
            if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE){
                txtPhNo.setEditable(true);
            }
            else{
                txtPhNo.setEditable(false);
                txtPhNo.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_txtPhNoKeyPressed

    private void txtPhNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhNoActionPerformed

    private void txtAssessmentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAssessmentKeyPressed
        // TODO add your handling code here:
       if (evt.getKeyChar() >= '1' && evt.getKeyChar() <= '5')
        {
            txtAssessment.setEditable ( true);
            txtAssessment.setBackground(Color.WHITE);
        }
        
        else
        {
            txtAssessment.setEditable (false);
            txtAssessment.setBackground(Color.RED);
            lblAssessErrMesg.setText ("Please enter a value between 1 to 5 stars as assessment");
        }
    }//GEN-LAST:event_txtAssessmentKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backTxt;
    private javax.swing.JButton btnSaveDetails;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAssessErrMesg;
    private javax.swing.JLabel lblPhNoMesg;
    private javax.swing.JLabel lblPrgName;
    private javax.swing.JTextField txtAssessment;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmployeeTitle;
    private javax.swing.JTextField txtPhNo;
    private javax.swing.JTextField txtProgram;
    // End of variables declaration//GEN-END:variables
}
