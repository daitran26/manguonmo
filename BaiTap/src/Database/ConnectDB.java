/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class ConnectDB {
    public Connection con = null;
    Statement sta = null;
    ResultSet res = null;
    
    public ConnectDB(){
        try {
            String url = "jdbc:derby://localhost:1527/baitap";
            String user = "bai1";
            String pass = "123";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection(url,user, pass);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void excuteSQL(String sql){
        try {
            sta = con.createStatement();
            sta.execute(sql);
            System.out.println("Thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
