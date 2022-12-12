/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Sales.Manager;

import Business.EcoSystem;
import Business.Enterprise.SalesEnterprise;
import Business.Network.Network;
import Business.Organization.SalesOrganization;
import Business.Accounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yashbhatia
 */
public class SalesManagerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private SalesOrganization salesorganization;
    private SalesEnterprise salesenterprise;
    private Network network;
    private EcoSystem ecoSystem;
    
    
    /**
     * Creates new form OSManagerWorkAreaJPanel
     */
    public SalesManagerWorkAreaJPanel(JPanel container, UserAccount account, 
            SalesOrganization salesorganization, SalesEnterprise salesenterprise, Network network, EcoSystem business){
        initComponents();
        this.container = container;
        this.account = account;
        this.salesorganization = salesorganization;
        this.salesenterprise = salesenterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
        
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
        manageListButton = new javax.swing.JButton();
        manageOrdersButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Sales Manager! Choose from following actions");

        manageListButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageListButton.setForeground(new java.awt.Color(0, 102, 102));
        manageListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/supplementary-food.png"))); // NOI18N
        manageListButton.setText("Product");
        manageListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageListButtonActionPerformed(evt);
            }
        });

        manageOrdersButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageOrdersButton.setForeground(new java.awt.Color(0, 102, 102));
        manageOrdersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/to-do-list.png"))); // NOI18N
        manageOrdersButton.setText("Orders");
        manageOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersButtonActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Manage Products");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Orders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(512, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manageListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(521, 521, 521))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(287, 287, 287))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manageOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(509, 509, 509))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(562, 562, 562))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(565, 565, 565))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(manageListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(manageOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageListButtonActionPerformed
        // TODO add your handling code here:
        ManageProductListJPanel manageItemListJPanel = new ManageProductListJPanel(container, account, salesenterprise);
        container.add("manageListJPanel", manageItemListJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageListButtonActionPerformed

    private void manageOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersButtonActionPerformed
        // TODO add your handling code here:
        ManageOrderJPanel manageItemListJPanel = new ManageOrderJPanel(container, account, salesenterprise);
        container.add("manageItemJPanel", manageItemListJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageOrdersButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton manageListButton;
    private javax.swing.JButton manageOrdersButton;
    // End of variables declaration//GEN-END:variables
}
