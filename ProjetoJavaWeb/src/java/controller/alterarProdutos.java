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
@WebServlet(name = "Alterar", urlPatterns = {"/alterarProdutos"})
public class alterarProdutos extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        
        ServletContext sc = request.getServletContext();
                       
                      //Alterando produto
         try{
            Produto produto = new Produto();
            ProdutoDaoImpl prd = new ProdutoDaoImpl();
            
            if(request.getParameter("descricao").equals("") || request.getParameter("quantidade").equals("") || request.getParameter("preco").equals("")){
                response.sendRedirect("/jsp/index.jsp");   
            }
            else{
                produto.setDescricao_produto(request.getParameter("descricao"));
                produto.setQuantidade_produto(Integer.parseInt(request.getParameter("quantidade")));
                produto.setPreco_produto(Double.parseDouble(request.getParameter("preco")));
                produto.setCodigo_produto(Integer.parseInt(request.getParameter("codigo")));
                
                prd.update(produto);
                
                response.sendRedirect("/jsp/tabelaProdutos.jsp");   
            }
        }catch(Exception erro){
            throw new RuntimeException("", erro);
        }   
    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}