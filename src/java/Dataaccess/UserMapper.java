/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dataaccess;

import Domain.User;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sbh
 */

public class UserMapper {
//    public void createUser(){}
//    public User getUser (int id){}
    public ArrayList<User> getAllUsers(){
    ////////// STINES FORSØG
        ArrayList<User> listOfUser = new ArrayList<User>();
        User selectedUser = null;
        try{
            String sql = "SELECT * FROM usertable";
            Connection con = DB.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                selectedUser.setId(rs.getInt("id"));
                selectedUser.setUsername(rs.getString("username"));
                selectedUser.setPassword(rs.getString("password"));
                
                listOfUser.add(selectedUser);
            }
            
        }catch (SQLException ex) {
                ex.printStackTrace();
            }
        return listOfUser;
    
    }

    
//    public void deleteUser(int id){}
//    public void editUser(User user){}
    public boolean authenticateUser(String username, String password){
        try {
            String sql = "select username,password from usertable where username = ?";
            Connection con = DB.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){  // vi vil gerne tjekke passwordet det gøres her i denne if
                String passwordFromDB = rs.getString("password");
                if (passwordFromDB.equals(password)){
                    return true;
                }
            }else{
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return false;
    }
    
    public static void main(String[] args) {
        UserMapper um = new UserMapper();
        boolean isAuthenticated = um.authenticateUser("testuser", "password123");
        if(isAuthenticated)
            System.out.println("Yeas det virker");
        else
            System.out.println("Oh no access");
    }
}
