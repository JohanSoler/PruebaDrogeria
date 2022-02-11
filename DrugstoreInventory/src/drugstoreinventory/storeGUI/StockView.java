/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package drugstoreinventory.storeGUI;

import drugstoreinventory.storeDB.Conection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Takeshi
 */
public class StockView extends javax.swing.JPanel {

    DefaultTableModel modelInventory;
    DefaultTableModel modelTop;
    DefaultTableModel modelBellow;
    /**
     * Creates new form StockView
     */
    public StockView() {
        initComponents();
        loadHeaderTable();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTop = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        productBelow = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        productTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(productTable);

        productTop.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(productTop);

        productBelow.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(productBelow);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Inventario");

        jLabel2.setText("Top 5 Ventas");

        jLabel3.setText("Top 5 Peores Ventas");

        jButton1.setText("Recargar DB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadHeaderTable();
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    /***
     * Method for add headers in the tables
     */
    private void loadHeaderTable(){
        String[] titlesInventory = {"ID", "NOMBRE", "TIPO", "STOCK", "RE-STOCK",
                                    "PRECIO"};
        String[] titlesTop = {"ID", "NOMBRE", "VENTAS"};

        modelInventory = new DefaultTableModel(null, titlesInventory);
        modelTop = new DefaultTableModel(null, titlesTop);
        modelBellow = new DefaultTableModel(null, titlesTop);
        productTable.setModel(modelInventory);
        productTop.setModel(modelTop);
        productBelow.setModel(modelBellow);

    }
    
    private void loadData(){
        loadInventory();
        loadTop();
        loadBellow();
    }
    
    private void loadInventory(){
        Conection objConection = new Conection();
        try {
            ResultSet res = objConection.getTable("SELECT * FROM Products "
                                                    + "ORDER BY id ASC");
            
            while(res.next()){                
                Object[] productTemp = {res.getString("id"),
                                        res.getString("name"),
                                        res.getString("type"),
                                        res.getInt("stock"),
                                        res.getInt("reStock"),
                                        res.getInt("price")};
                
                modelInventory.addRow(productTemp);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void loadTop(){
        Conection objConection = new Conection();
        try {
            ResultSet res = objConection.getTable("SELECT * FROM Products "
                                                + "ORDER BY sales DESC LIMIT 0,5");
            
            while(res.next()){
                
                Object[] productTemp = {res.getString("id"),
                                        res.getString("name"),
                                        res.getInt("sales")};
                
                modelTop.addRow(productTemp);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void loadBellow(){
        Conection objConection = new Conection();
        try {
            ResultSet res = objConection.getTable("SELECT * FROM Products "
                                                + "ORDER BY sales ASC LIMIT 0,5");
            
            while(res.next()){
                
                Object[] productTemp = {res.getString("id"),
                                        res.getString("name"),  
                                        res.getInt("sales")};
                
                modelBellow.addRow(productTemp);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable productBelow;
    private javax.swing.JTable productTable;
    private javax.swing.JTable productTop;
    // End of variables declaration//GEN-END:variables
}
