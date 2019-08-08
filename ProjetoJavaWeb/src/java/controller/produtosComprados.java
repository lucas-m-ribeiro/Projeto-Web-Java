/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "produtosComprados", urlPatterns = {"/produtosComprados"})
public class produtosComprados extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        RequestDispatcher rd;

        rd = request.getRequestDispatcher("/jsp/index.jsp");

        try{
            rd.forward(request, response);
        } catch (IOException ex) {
            Logger.getLogger(produtosComprados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}