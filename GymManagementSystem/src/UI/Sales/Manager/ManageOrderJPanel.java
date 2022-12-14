/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Sales.Manager;

import Business.Enterprise.SalesEnterprise;
import Business.Sales.Sales;
import Business.Accounts.UserAccount;
import Business.WorkQueue.SalesRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author akash
 */
public class ManageOrderJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private SalesEnterprise salesenterprise;


    /**
     * Creates new form ManagerOrderJPanel
     */
    public ManageOrderJPanel(JPanel container, UserAccount account, SalesEnterprise salesenterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        this.salesenterprise = salesenterprise;
        populateOrders();
        
    }

    public void populateOrders() {
         DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);
        for (SalesRequest itemRequest : salesenterprise.getSalesQueue().getOnlinesalesRequestList()) {
            Object[] row = new Object[5];
            row[0] = itemRequest.getSender();
            row[1] = itemRequest;
            row[2] = itemRequest.getQuantity();
            row[3] = itemRequest.getTotalPrice();
            row[4] = itemRequest.getStatus();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        completeBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Product", "No. of products..", "Amount total", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderJTable.setRowHeight(40);
        orderJTable.setRowMargin(4);
        orderJTable.setSelectionBackground(new java.awt.Color(215, 145, 54));
        jScrollPane2.setViewportView(orderJTable);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("List of your orders ..");

        completeBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        completeBtn.setText("Complete");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/goback.png"))); // NOI18N
        BackBtn.setText("Previous");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(completeBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBtn)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(350, 350, 350))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();
        if (selectedRow >= 0) {
            SalesRequest itemRequest = (SalesRequest) orderJTable.getValueAt(selectedRow, 1);
            if (itemRequest.getStatus().equals("Paid")) {
                itemRequest.setStatus("Complete");
                JOptionPane.showMessageDialog(null, "Completed Successful!!");
                itemRequest.setReceiver(account);
                populateOrders();
            } else {
                JOptionPane.showMessageDialog(null, "It has been Completed!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_completeBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton completeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderJTable;
    // End of variables declaration//GEN-END:variables

}
