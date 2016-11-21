/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import Dataaccess.DB;
import Dataaccess.UserMapper;
import Domain.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sbh
 */
@WebServlet(name = "showusertable", urlPatterns = {"/showusertable"})
public class showusertable extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();       

//                response.getWriter().print("Du på showusertable servlet");

                ArrayList al=null;
                ArrayList userList = new ArrayList();
                
                try{
                    String query = "SELECT * FROM usertable";
                    Connection con = DB.getConnection();
                    PreparedStatement pstmt = con.prepareStatement(query);

                    ResultSet rs = pstmt.executeQuery();

                    while (rs.next()) {
                        
//                        al.add(rs.getInt("id"));
                        al.add(rs.getString("username"));
                        al.add(rs.getString("password"));

                        userList.add(al);
                    }
                    request.setAttribute("userList",userList);
                    

                    RequestDispatcher dispatcher = getServletContext()
                        .getRequestDispatcher("/home1.jsp");
                    dispatcher.forward(request,response);
                    
                }catch (SQLException ex) {
                        ex.printStackTrace();
                    }
//                return listOfUser;
            }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
