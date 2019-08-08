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
import model.Compra;
import model.Produto;

/**
 *
 * @author Lucas Ribeiro
 */
@WebServlet(name = "compra", urlPatterns = {"/compra"})
public class compra extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //compra de produtos
        ServletContext sc = request.getServletContext();
        
        Compra compra = new Compra();
        ProdutoDaoImpl prd = new ProdutoDaoImpl();

        if(request.getParameter("codigo").equals("") || request.getParameter("quantidade").equals("") ){
              response.sendRedirect("/jsp/cadastroProdutos.jsp");   
          }
          else{
            compra.setCodigo_produto(Integer.parseInt(request.getParameter("codigo")));
            compra.setQuantidade_produto(Integer.parseInt(request.getParameter("quantidade")));

            prd.comprar(compra);

            response.sendRedirect("/jsp/produtosComprados.jsp");   
        }
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
