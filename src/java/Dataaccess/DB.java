/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sbh
 */
public class DB {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USER = "root";
    private static final String PASSWORD = "nice";
    private static Connection conn = null; 
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
//        public static void main(String[] args) throws SQLException{
//            Statement stmt = getConnection().createStatement();
//            ResultSet rs = stmt.executeQuery("Select * FROM usertable");
//            while (rs.next()){
//                int id = rs.getInt("id");
//                String username = rs.getString("username");
//                String password = rs.getString("password");
//                System.out.println(id+":"+username+":"+password);
//            }
//        }
}
