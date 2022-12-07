/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Enterprise.Enterprise;
import Business.Enterprise.SalesEnterprise;
import Business.Network.Network;
import Business.Sales.Sales;
import Business.Accounts.UserAccount;
import Business.WorkQueue.SalesRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keshni
 */
public class OrderItemJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    //private Network network;
    private SalesRequest onlinesalesRequest;
    private HashMap<Sales, Integer> cart;
    private SalesEnterprise salesEnterprise;
   
    /**
     * Creates new form OrderItemJPanel
     */
    public OrderItemJPanel(JPanel container, UserAccount account, HashMap<Sales, Integer> cart, 
            SalesEnterprise salesEnterprise) {
        initComponents();
        this.container = container;
        this.account = account;
        //this.network = network;
        
        this.cart = cart;
        this.salesEnterprise = salesEnterprise;
        

        cbxQty.removeAll();
        
        for (int i = 1; i < 11; i++){
            cbxQty.addItem(i);
        }
        
        populateItem();
        populateCart();
    }
    public void populateItem() {
        DefaultTableModel model = (DefaultTableModel) tblProductsMenu.getModel();
        model.setRowCount(0);
        for(Sales product : salesEnterprise.getSalesDirectory().getSalesList()){
            Object[] row = new Object[2];
            row[0] = product;
            row[1] = product.getPrice();
            model.addRow(row);
        }
        
    }
    
    public void populateCart() {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);
        double amount = 0;
        
        for(Sales product : cart.keySet()){
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getPrice();
            row[2] = cart.get(product);
            row[3] = product.getPrice() * cart.get(product);
            
            amount = amount + product.getPrice() * cart.get(product);
            model.addRow(row);
            
        }
        priceLabel.setText("Grand Total: " + amount);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBtn = new javax.swing.JButton();
        cbxQty = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductsMenu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        checkoutBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 243, 243));

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/cart.png"))); // NOI18N
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cbxQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxQtyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setText("How many selected items needed?");

        tblProductsMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductsMenu.setRowHeight(40);
        tblProductsMenu.setRowMargin(4);
        tblProductsMenu.setSelectionBackground(new java.awt.Color(215, 145, 54));
        jScrollPane1.setViewportView(tblProductsMenu);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel1.setText("Choose any product from the list..");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/goback.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Cost", "Quantity", "Total Cost"
            }
        ));
        tblCart.setRowHeight(40);
        tblCart.setRowMargin(4);
        tblCart.setSelectionBackground(new java.awt.Color(215, 145, 54));
        jScrollPane2.setViewportView(tblCart);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setText("Your cart contents..");

        deleteBtn.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 51, 51));
        deleteBtn.setText("Remove this item");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        priceLabel.setText("Total Cost to Pay:");

        checkoutBtn.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        checkoutBtn.setForeground(new java.awt.Color(51, 153, 255));
        checkoutBtn.setText("Checkout");
        checkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText("Add items to the cart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxQty, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(361, 361, 361)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addComponent(jLabel1)))
                                .addGap(238, 238, 238)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkoutBtn)
                        .addGap(81, 81, 81)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(cbxQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkoutBtn)
                                    .addComponent(priceLabel))
                                .addGap(84, 84, 84))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProductsMenu.getSelectedRow();
        if(selectedRow >= 0){
            Sales product = (Sales)tblProductsMenu.getValueAt(selectedRow, 0);
            int pre = 0;
            if(cart.containsKey(product))
            pre = cart.get(product);
            
            int quantity = pre + (int) cbxQty.getSelectedItem();
            cart.put(product, quantity);
            populateCart();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart.getSelectedRow();
        if(selectedRow >= 0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Sales product = (Sales)tblCart.getValueAt(selectedRow, 0);
                cart.remove(product);
                populateCart();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        if(model.getRowCount() == 0)
        JOptionPane.showMessageDialog(null, "No product selected yet!");
        else{
            onlinesalesRequest = new SalesRequest();
            onlinesalesRequest.setSender(account);
            onlinesalesRequest.setStatus("Paid");
            onlinesalesRequest.setProductOrder(cart);
            
            HashMap<Sales, Integer> purchase = new HashMap();

            for(Map.Entry<Sales,Integer> e : cart.entrySet())
            purchase.put(e.getKey(),e.getValue());

            onlinesalesRequest.setProductOrder(purchase);
            cart.clear();

            salesEnterprise.getSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);
            account.getSalesQueue().getOnlinesalesRequestList().add(onlinesalesRequest);

            JOptionPane.showMessageDialog(null, "Your order has been placed");
            populateCart();
        }
    }//GEN-LAST:event_checkoutBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cbxQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxQtyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cbxQty;
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProductsMenu;
    // End of variables declaration//GEN-END:variables

}

    

