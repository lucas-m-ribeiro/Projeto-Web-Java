/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daoImpl.ProdutoDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Produto;

/**
 *
 * @author Lucas Ribeiro
 */
@WebServlet(name = "excluir", urlPatterns = {"/excluir"})
public class excluir extends HttpServlet {

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        
        ServletContext sc = request.getServletContext();
                        
        //Excluindo produto pelo codigo
         try{
             
            if(request.getParameter("codigo").equals("")){
                
                response.sendRedirect("/jsp/tabelaProdutos.jsp");
            }
            else{
                
            ProdutoDaoImpl prd = new ProdutoDaoImpl();

            prd.delete(Integer.parseInt(request.getParameter("codigo")));
            response.sendRedirect("/jsp/tabelaProdutos.jsp");
                
            }
        }
         catch(Exception erro){
            throw new RuntimeException("", erro);
        }
    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}