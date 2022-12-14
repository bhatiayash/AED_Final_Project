/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;
import Utils.Mail.SendMail;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Customer.Customer;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Accounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import UI.MainJFrame;
import UI.Customer.NewCustomerRegJPanel;
import Business.Role.CustomerRole;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

/**
 *
 * @author keshni
 */
public class NewCustomerRegJPanel extends javax.swing.JPanel {

    private JPanel crpJPanel;
    private String username;
    private String password;
    private EcoSystem system;
    private Network network;
    private MainJFrame frame;

    /**
     * Creates new form CusRegistrationJPanel
     */
    public NewCustomerRegJPanel(EcoSystem system, JPanel crpJPanel, MainJFrame frame) {
        initComponents();
        this.system = system;
        this.crpJPanel = crpJPanel;
        this.frame = frame;
        NetworkCMB.removeAllItems();
        for (Network network : system.getNetworkList()) {
            NetworkCMB.addItem(network);
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

        jLabel8 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        firstNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        txtPhoneNum = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        PassField = new javax.swing.JPasswordField();
        CPassField = new javax.swing.JPasswordField();
        NetworkCMB = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPhoneNumMesg = new javax.swing.JLabel();

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Come");

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitButton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 204, 153));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 112, 50));

        cancelButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 153, 153));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 112, 50));

        firstNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 165, -1));

        lastNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 165, -1));

        addressTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 240, -1));

        txtPhoneNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumActionPerformed(evt);
            }
        });
        txtPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNumKeyPressed(evt);
            }
        });
        add(txtPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 165, -1));

        emailTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 165, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 340, -1));

        userNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 165, -1));

        PassField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 165, -1));

        CPassField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPassFieldActionPerformed(evt);
            }
        });
        add(CPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 165, -1));

        NetworkCMB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NetworkCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkCMBActionPerformed(evt);
            }
        });
        add(NetworkCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 165, 35));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User name :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("First Name :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Last Name :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, 18));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 20));

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Re-enter the password :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, 30));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address :");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone Number :");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Email :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Network :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/registration (1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 70, 130));
        add(lblPhoneNumMesg, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 130, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (userNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "User name can't be empty!");
            return;
        }
        if (PassField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Password can't be empty!");
            return;
        }
        if (CPassField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Confirm Password can't be empty!");
            return;
        }

        if (firstNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "First name can't be empty!");
            return;
        }
        if (lastNameTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Last name can't be empty!");
            return;
        }
        if (txtPhoneNum.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Phone number can't be empty!");
            return;
        }
        if (emailTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Email can't be empty!");
            return;
        }
        if(!checkEmailPattern()){
            JOptionPane.showMessageDialog(null, "Email must follow the format");
            return;
        }
        if(!passwordPatternCorrect()){
            JOptionPane.showMessageDialog(null, "Password must follow the format");
            return;
        }
        if(!PassField.getText().equals(CPassField.getText())){
            JOptionPane.showMessageDialog(null, "The password does not match");
            return;
        }
        if(!phonePattern()){
            JOptionPane.showMessageDialog(null, "Please follow the phone number format");
            return;
        }

        username = userNameTxt.getText();
        password = CPassField.getText();

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(username, password);

        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                userAccount = network.getUserAccountDirectory().authenticateUser(username, password);
                if (userAccount == null) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(username, password);
                        if (userAccount == null) {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(username, password);
                                if (userAccount != null) {
                                    JOptionPane.showMessageDialog(null, "Account already exist!");
                                    userNameTxt.setText("");
                                    PassField.setText("");
                                    CPassField.setText("");
//                                firstNameTxt.setText("");
//                                lastNameTxt.setText("");
                                    return;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Account already exist!");
                            userNameTxt.setText("");
                            PassField.setText("");
                            CPassField.setText("");
                            return;

                        }
                        //UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(username, password);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Account already exist!");
                    userNameTxt.setText("");
                    PassField.setText("");
                    CPassField.setText("");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Account already exist!");
            userNameTxt.setText("");
            PassField.setText("");
            CPassField.setText("");
            return;

        }


        Customer customer = new Customer(firstNameTxt.getText(), lastNameTxt.getText(),
                emailTxt.getText(), txtPhoneNum.getText());
        this.network = (Network) NetworkCMB.getSelectedItem();
        UserAccount ua = network.getUserAccountDirectory().createUserAccount(userNameTxt.getText(), CPassField.getText(), customer, new CustomerRole());
                                    SendMail.sendMail(customer.getEmail(), "Hello "+customer.getFirstName()+", Welcome to Marino Gym, your account has been successfully created!");

        //DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(null, "Account created successfully and email has been sent");
        userNameTxt.setEnabled(false);
        PassField.setEnabled(false);
        CPassField.setEnabled(false);
        firstNameTxt.setEnabled(false);
        lastNameTxt.setEnabled(false);
        addressTxt.setEnabled(false);
        txtPhoneNum.setEnabled(false);
        emailTxt.setEnabled(false);
        frame.setActivate();
        
    }                                            
    private Boolean checkEmailPattern(){
        String validName = "^[A-Z0-9a-z]+\\w*@[A-Z0-9a-z]+(\\.[A-Z0-9a-z]+)*$";
        Pattern p = Pattern.compile(validName);
        Matcher m = p.matcher(emailTxt.getText());
        boolean b = m.matches();
        
        return b;
    }

private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");  //must be of 6 characters, 1 LC, 1 UC, 1 spec., 1 num.
//                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$]"
        Matcher m = p.matcher(PassField.getText());
        boolean b = m.matches();
        
        return b;
    }
private boolean phonePattern(){
        Pattern p = Pattern.compile("^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$");        // must start from +1, then 10 digits
                //"^(\\+?1)?[2-9]\\d{2}[2-9](?!11)\\d{6}$"
        Matcher m = p.matcher(txtPhoneNum.getText());
        boolean b = m.matches();
        
        return b;
    }//GEN-LAST:event_submitButtonActionPerformed
   
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        CancelJPanel cp = new CancelJPanel(this.system, this.crpJPanel);
        this.crpJPanel.add("CancelJPanel", cp);
        CardLayout layout = (CardLayout) this.crpJPanel.getLayout();
        crpJPanel.remove(this.crpJPanel);
        layout.next(crpJPanel);
        frame.setActivate();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void CPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPassFieldActionPerformed

    private void NetworkCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkCMBActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NetworkCMBActionPerformed

    private void txtPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumActionPerformed

    private void txtPhoneNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumKeyPressed
        // TODO add your handling code here:
        int code = evt.getKeyCode();
        
        char c = evt.getKeyChar();
        
        if (Character.isLetter(c)) {                                                                                        // If user enters an input which is not number 
            
            txtPhoneNum.setEditable(false);
            
            txtPhoneNum.setBackground(Color.red);
            
            lblPhoneNumMesg.setText( " Please enter digits only");
        }
        
        else {
            
            txtPhoneNum.setEditable(true);
            
            txtPhoneNum.setBackground(Color.WHITE);
            
            lblPhoneNumMesg.setText( " ");
        }
    }//GEN-LAST:event_txtPhoneNumKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CPassField;
    private javax.swing.JComboBox NetworkCMB;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel lblPhoneNumMesg;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
