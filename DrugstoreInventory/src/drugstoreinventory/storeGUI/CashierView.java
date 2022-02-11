/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package drugstoreinventory.storeGUI;

import drugstoreinventory.storeDB.Conection;
import drugstoreinventory.storeModel.ProductsModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Johan Soler
 */
public class CashierView extends javax.swing.JPanel {

    ArrayList<ProductsModel> productsList;
    DefaultTableModel model;
    /**
     * Creates new form CashierView
     */
    public CashierView() {
        productsList = new ArrayList<ProductsModel>();
        initComponents();
        loadHeaderTable();
        loadProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        saleTable = new javax.swing.JTable();
        productsBox = new javax.swing.JComboBox<>();
        quantityInput = new javax.swing.JSpinner();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setMinimumSize(new java.awt.Dimension(500, 0));
        setPreferredSize(new java.awt.Dimension(500, 340));

        saleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(saleTable);

        productsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto");

        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Drogueria JN-AS");

        send.setText("Enviar");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jButton1.setText("Recargar Base de datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(productsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(add)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(270, 270, 270)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(33, 33, 33)
                .addComponent(send)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send)
                    .addComponent(cancel))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        addProduct();
    }//GEN-LAST:event_addActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        updateDB();
    }//GEN-LAST:event_sendActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        clear();
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadProducts();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clear(){
        quantityInput.setValue(0);
        for (int i = model.getRowCount(); i > 0; i--) {
            model.removeRow(i-1);
        }
        loadProducts();
    }
    
    /***
     * Method for send a update sentence to database
     */
    private void updateDB(){
        Conection ObjConection = new Conection();
        for (int i = 0; i < model.getRowCount(); i++) {
            ProductsModel temp = productsList.get((int)model.getValueAt(i, 0));
            int addQuantity = (int)model.getValueAt(i, 5);
            String sentence = temp.updateSales(temp.getID(),
                                                temp.getSales() + addQuantity, 
                                                temp.getStock() - addQuantity);
            temp.setSales(temp.getSales() + addQuantity);
            boolean data = ObjConection.runSQLSentence(sentence);
            if(data){
                System.out.println("Actualizado "+ sentence);
            }
        }
        clear();
    }
    
    /***
     * Method for add a headers of Table
     */
    private void loadHeaderTable(){
        String[] titles = {"#","ID", "NOMBRE", "TIPO", "PRECIO", "QUANTITY"};
        model = new DefaultTableModel(null, titles);
        saleTable.setModel(model);
    }
        
    /***
     * Method for add products in the model
     */
    private void addProduct(){
        ProductsModel productTemp = productsList.get(productsBox.getSelectedIndex());       
        Object[] tempSale = {productsBox.getSelectedIndex(), 
                             productTemp.getID(), 
                             productTemp.getName(), 
                             productTemp.getType(), 
                             productTemp.getPrice(), 
                             quantityInput.getValue() };
        
        model.addRow(tempSale);
        quantityInput.setValue(0);
    }
    
    /***
     * Method for load products in the box and list
     */
    private void loadProducts(){
        Conection objConection = new Conection();
        productsBox.removeAllItems();
        try {
            ResultSet res = objConection.getTable("SELECT * FROM Products ORDER BY id ASC");
            while(res.next()){                
                ProductsModel productTemp = new ProductsModel();
                
                productTemp.setID(res.getInt("id"));
                productTemp.setName(res.getString("name"));
                productTemp.setType(res.getString("type"));
                productTemp.setPrice(res.getInt("price"));
                productTemp.setSales(res.getInt("sales"));
                productTemp.setStock(res.getInt("stock"));

                productsBox.addItem(productTemp.getName());
                productsList.add(productTemp);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> productsBox;
    private javax.swing.JSpinner quantityInput;
    private javax.swing.JTable saleTable;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}