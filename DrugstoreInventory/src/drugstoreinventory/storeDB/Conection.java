/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drugstoreinventory.storeDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Johan Soler
 */
public class Conection {
    
    String strConection = "jdbc:sqlite:C:/PruebaDrogueria/storeDb.s3db";
    Connection conn = null;

    /***
     * Method for connect the database and catch error 
     */
    public Conection() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConection);
        } catch (Exception e) {
            
            System.out.println("Conecxion errada" + e);

        }
    }
    
    /**
     * Method for run a SQL sentence without return
     * @param sentence
     * @return 
     */
    public boolean runSQLSentence(String sentence){
        try {
            PreparedStatement pstm = conn.prepareStatement(sentence);
            pstm.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
    
    /***
     * Method for run a SQL sentence with return
     * @param sentence
     * @return 
     */
    public ResultSet getTable(String sentence){
        try {
            PreparedStatement pstm = conn.prepareStatement(sentence);
            ResultSet res = pstm.executeQuery();
            return res;
            
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
}
