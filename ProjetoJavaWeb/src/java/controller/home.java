/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lucas Ribeiro
 */
@WebServlet(name = "home", urlPatterns = {"/home"})
public class home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        RequestDispatcher rd = null;
             
        HttpSession session=request.getSession(false);
        
         if(session.getAttribute("usuario")== null){
             rd = request.getRequestDispatcher("/jsp/index");
             response.sendRedirect("/");
         }
         else{
         rd = request.getRequestDispatcher("/jsp/testeLogado.jsp");
        
         try{
            rd.forward(request, response);
        } catch (IOException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}