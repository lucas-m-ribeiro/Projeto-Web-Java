/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daoImpl.ProdutoDaoImpl;
import java.io.IOException;
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
@WebServlet(name = "cadastroProdutos", urlPatterns = {"/cadastroProdutos"})
public class cadastroProdutos extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    ServletContext sc = request.getServletContext();
         
    //cadastrando produto
    try{
          Produto produto = new Produto();
          ProdutoDaoImpl prd = new ProdutoDaoImpl();
          
          if(request.getParameter("codigo").equals("") || request.getParameter("quantidade").equals("")){
              response.sendRedirect("/jsp/tabelaProdutos.jsp");   
          }
          else{
            produto.setCodigo_produto(Integer.parseInt(request.getParameter("codigo")));
            produto.setQuantidade_produto(Integer.parseInt(request.getParameter("quantidade")));

            prd.create(produto);

            response.sendRedirect("/jsp/tabelaProdutos.jsp");   
        }
      }
      catch(Exception erro){
          throw new RuntimeException("", erro);
        }
    }
}
