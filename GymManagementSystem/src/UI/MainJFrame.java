/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import Business.Enterprise.Enterprise;
import Business.ConfigureASystem;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Accounts.UserAccount;
import UI.Customer.NewCustomerRegJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;

/**
 *
 * @author akash
 */
public class MainJFrame extends javax.swing.JFrame {
    //private JPanel container;

    //private JFrame frame;
    /**
     * Creates new form MainJFrame
     */
    private JPanel mPanel;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    

    public MainJFrame() {
        initComponents();
        system = ConfigureASystem.configure();
        //system = dB4OUtil.retrieveSystem();
        this.setSize(1450, 830);
        //this.container = container;
    }
    
    public MainJFrame (JPanel mPanel){
        initComponents();
        this.system = system;
        this.mPanel = mPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        pfPasswd = new javax.swing.JPasswordField();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnNewUserRegistration = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnNewApplication = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginJButton.setBackground(new java.awt.Color(204, 255, 204));
        loginJButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 165, 40));

        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 165, 30));

        pfPasswd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pfPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswdActionPerformed(evt);
            }
        });
        jPanel1.add(pfPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 165, 30));
        jPanel1.add(loginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 395, -1, -1));

        logoutJButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutJButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 165, 40));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 551, 165, -1));

        btnNewUserRegistration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNewUserRegistration.setText("Register");
        btnNewUserRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserRegistrationActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewUserRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 573, 165, 40));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel4.setText("  Login");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setText("Want to apply for a job here?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        btnNewApplication.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNewApplication.setText("Click Here!");
        btnNewApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewApplicationActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewApplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 670, 160, 40));

        jLabel7.setText("New User?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = txtUserName.getText();
        // Get Password
        char[] passwordCharArray = pfPasswd.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;
        
        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                userAccount = network.getUserAccountDirectory().authenticateUser(userName, password);
                if (userAccount == null) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        if (userAccount == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                if (userAccount != null) {
                                    inEnterprise = enterprise;
                                    inOrganization = organization;
                                    inNetwork = network;
                                    break;
                                }
                            }

                        } else {
                            inNetwork = network;
                            break;
                        }
                        if (inOrganization != null) {
                            break;
                        }
                    }
                } else {
                    inEnterprise = enterprise;
                    break;
                }
                
            }
        }
        

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        txtUserName.setEnabled(false);
        pfPasswd.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        txtUserName.setEnabled(true);
        pfPasswd.setEnabled(true);
        loginJButton.setEnabled(true);

        txtUserName.setText("");
        pfPasswd.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btnNewUserRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserRegistrationActionPerformed

        NewCustomerRegJPanel newCust = new NewCustomerRegJPanel(this.system, this.container, this);
        //this.container.add("CusRegistraionJPanel", crp);
        this.container.add("NewCustomerRegJPanel", newCust);
        CardLayout layout = (CardLayout) this.container.getLayout();
        container.remove(this);
        layout.next(this.container);
        txtUserName.setEnabled(true);
        pfPasswd.setEnabled(true);
        loginJButton.setEnabled(true);
        logoutJButton.setEnabled(true);
    }//GEN-LAST:event_btnNewUserRegistrationActionPerformed

    private void pfPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswdActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnNewApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewApplicationActionPerformed
        
        NewHireJPanel newHire = new NewHireJPanel(this.system, this.container, this);
        this.container.add ("NewHireJPanel", newHire);
        CardLayout layout = (CardLayout) this.container.getLayout();
        container.remove(this);
        layout.next(this.container);
        txtUserName.setEnabled(false);
        pfPasswd.setEnabled(false);
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(false);
    }//GEN-LAST:event_btnNewApplicationActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    public void setActivate() {
        logoutJButton.setEnabled(false);
        txtUserName.setEnabled(true);
        pfPasswd.setEnabled(true);
        loginJButton.setEnabled(true);

        txtUserName.setText("");
        pfPasswd.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewApplication;
    private javax.swing.JButton btnNewUserRegistration;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField pfPasswd;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
