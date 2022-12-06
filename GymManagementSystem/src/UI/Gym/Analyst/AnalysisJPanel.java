/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Gym.Analyst;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Window;
import javax.swing.JPanel;


/**
 *
 * @author keshni
 */
public class AnalysisJPanel extends javax.swing.JPanel {

    //private GymEnterprise fitenterprise;
    
   

    /**
     * Creates new form AnalysisJPanel
     */
    public AnalysisJPanel() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMostEnrolledPrograms = new javax.swing.JButton();
        btnMostActiveCustomers = new javax.swing.JButton();
        btnMostSoldProducts = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnMostEnrolledPrograms.setFont(new java.awt.Font("Bell MT", 1, 21)); // NOI18N
        btnMostEnrolledPrograms.setForeground(new java.awt.Color(153, 153, 0));
        btnMostEnrolledPrograms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/enroll.png"))); // NOI18N
        btnMostEnrolledPrograms.setText("View most enrolled programs");
        btnMostEnrolledPrograms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostEnrolledProgramsActionPerformed(evt);
            }
        });

        btnMostActiveCustomers.setFont(new java.awt.Font("Bell MT", 1, 21)); // NOI18N
        btnMostActiveCustomers.setForeground(new java.awt.Color(153, 153, 0));
        btnMostActiveCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/active.png"))); // NOI18N
        btnMostActiveCustomers.setText("View most active customers");
        btnMostActiveCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostActiveCustomersActionPerformed(evt);
            }
        });

        btnMostSoldProducts.setFont(new java.awt.Font("Bell MT", 1, 21)); // NOI18N
        btnMostSoldProducts.setForeground(new java.awt.Color(153, 153, 0));
        btnMostSoldProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/currency.png"))); // NOI18N
        btnMostSoldProducts.setText("View most sold products");
        btnMostSoldProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostSoldProductsActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/stocks.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        jLabel3.setText("View analytics reports");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostActiveCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnMostSoldProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnMostEnrolledPrograms, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostSoldProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostActiveCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(btnMostEnrolledPrograms, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostEnrolledProgramsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostEnrolledProgramsActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnMostEnrolledProgramsActionPerformed

    private void btnMostActiveCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostActiveCustomersActionPerformed
        // TODO add your handling code here:

     
    }//GEN-LAST:event_btnMostActiveCustomersActionPerformed

    private void btnMostSoldProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostSoldProductsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnMostSoldProductsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostActiveCustomers;
    private javax.swing.JButton btnMostEnrolledPrograms;
    private javax.swing.JButton btnMostSoldProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
