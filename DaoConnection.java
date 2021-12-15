/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author india
 */
public class DaoConnection {

    private static final String username = "root";
    private static final String password = "root";
    private static final String datacon = "jdbc:mysql://localhost:3306/studreg";

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void dbconnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(datacon, username, password);
           
/*            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
//            
            int q = stData.getColumnCount();
            System.out.println("q :" + q);
            //            DefaultTableModel RecordTable=(            DefaultTableModel RecordTable=()
  */
        
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        DaoConnection dao = new DaoConnection();
        dao.dbconnection();
    }
}
