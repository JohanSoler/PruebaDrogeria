/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drugstoreinventory.storeModel;

/**
 *
 * @author Johan Soler
 */
public class ProductsModel {
    
    int ID;
    String name, type;
    int stock, reStock, price,sales;

    /***
     * Empty constructor
     */
    public ProductsModel() {
    }
    
    /***
     * constructor with initials data
     * @param name
     * @param type
     * @param stock
     * @param reStock
     * @param price 
     */
    public ProductsModel(String name,
                         String type, 
                         int stock, 
                         int reStock, 
                         int price) {
        this.name = name;
        this.type = type;
        this.stock = stock;
        this.reStock = reStock;
        this.price = price;
        this.sales = 0;
    }

    /***
     * Method for return a string with the SQL sentence for add any object
     * @return 
     */
    public String getAddSentence(){
        return "INSERT INTO Products (ID, Name, Type, Stock, ReStock, Price, "
                + "Sales) VALUES (null,'"+ name +"','"+ type +"','"+ stock +
                "','"+ reStock +"','"+ price +"','"+ sales +"')";
    }
    
    /***
     * Method for create a string with the SQL sentence for update sales in
     * any object
     * @param ID
     * @param sales
     * @param stock
     * @return 
     */
    public String updateSales(int ID, int sales, int stock){
        return "UPDATE products SET sales='"+ sales +"', stock='"+ stock 
                +"' WHERE id='"+ ID +"'";
    }
    
    /***
     * Method for create a string with the SQL sentence for update stock 
     * in any object
     * @param ID
     * @param stock
     * @return 
     */
    public String updateStock(int ID, int stock){
        return "UPDATE products SET stock='"+ stock +"' WHERE id='"+ ID +"'";
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getReStock() {
        return reStock;
    }

    public void setReStock(int reStock) {
        this.reStock = reStock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }   
    
}
