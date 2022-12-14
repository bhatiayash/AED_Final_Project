/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.Customer;

import Business.Program.ProgramDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GymEnterprise;
import Business.Enterprise.SalesEnterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Sales.Sales;
import Business.Accounts.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author keshni
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private Network network;
    private ProgramDirectory myCourse;
    private EcoSystem ecoSystem;
    private HashMap<Sales, Integer> cart;

    /** Creates new form CustomerAreaJPanel */
    public CustomerWorkAreaJPanel(JPanel container, UserAccount account, CustomerOrganization organization,
            Enterprise enterprise, Network network, EcoSystem ecoSystem) {
        this.container = container;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.network = network;
        myCourse = new ProgramDirectory();
        this.cart = new HashMap();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        btnRequest = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnReserveCourse = new javax.swing.JButton();
        btnCheckHistory = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BtnOrderOnline = new javax.swing.JButton();
        BtnViewOrder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnRequest.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(0, 102, 102));
        btnRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/calendar (1).png"))); // NOI18N
        btnRequest.setText("    Request an appointment with a trainer");
        btnRequest.setPreferredSize(new java.awt.Dimension(130, 110));
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Have any questions regarding program?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 157, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 742, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View available slots");

        btnReserveCourse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReserveCourse.setForeground(new java.awt.Color(0, 102, 102));
        btnReserveCourse.setText("Book a seat for a program");
        btnReserveCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveCourseActionPerformed(evt);
            }
        });

        btnCheckHistory.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCheckHistory.setForeground(new java.awt.Color(0, 102, 102));
        btnCheckHistory.setText("View your past bookings");
        btnCheckHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnReserveCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnCheckHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(254, 254, 254))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReserveCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 300, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        BtnOrderOnline.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnOrderOnline.setForeground(new java.awt.Color(0, 102, 102));
        BtnOrderOnline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/search.png"))); // NOI18N
        BtnOrderOnline.setText("Browse Shop for new items");
        BtnOrderOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderOnlineActionPerformed(evt);
            }
        });

        BtnViewOrder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnViewOrder.setForeground(new java.awt.Color(0, 102, 102));
        BtnViewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/to-do-list.png"))); // NOI18N
        BtnViewOrder.setText("View your past orders");
        BtnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewOrderActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Supplements Shop");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BtnOrderOnline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(BtnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(229, 229, 229))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOrderOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 537, 742, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckHistoryActionPerformed
        // TODO add your handling code here:
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof GymEnterprise){
        ProgramViewJPanel courseHistoryViewJPanel = new ProgramViewJPanel(container, account, (GymEnterprise) ent);
        container.add("courseHistoryViewJPanel", courseHistoryViewJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
            }
        }
    }//GEN-LAST:event_btnCheckHistoryActionPerformed

    private void BtnOrderOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderOnlineActionPerformed
        // TODO add your handling code here:
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof SalesEnterprise){
        OrderItemJPanel orderItemJPanel = new OrderItemJPanel(container, account, cart, (SalesEnterprise) ent);
        container.add("orderItemJPanel", orderItemJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
            }
        }
    }//GEN-LAST:event_BtnOrderOnlineActionPerformed

    private void BtnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewOrderActionPerformed
        // TODO add your handling code here:
        
        ViewPastOrdersJPanel viewOrderJPanel = new ViewPastOrdersJPanel(container, account);
        container.add("viewOrderJPanel", viewOrderJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
            
        
    }//GEN-LAST:event_BtnViewOrderActionPerformed

    private void btnReserveCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveCourseActionPerformed
        // TODO add your handling code here:
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof GymEnterprise){
        ReserveProgramJPanel reverseClassJPanel = new ReserveProgramJPanel(container, account, myCourse, (GymEnterprise) ent);
        container.add("reverseClassJPanel", reverseClassJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
            }
        }
    }//GEN-LAST:event_btnReserveCourseActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
            if(ent instanceof GymEnterprise){
                RequestTrainerJPanel makeRequestJPanel = new RequestTrainerJPanel(container, account, (GymEnterprise) ent);
                container.add("makeRequestJPanel", makeRequestJPanel);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
            }
        }
    }//GEN-LAST:event_btnRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOrderOnline;
    private javax.swing.JButton BtnViewOrder;
    private javax.swing.JButton btnCheckHistory;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnReserveCourse;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

}
