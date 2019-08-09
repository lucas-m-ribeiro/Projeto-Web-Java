package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import daoImpl.ProdutoDaoImpl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
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

@WebServlet(name = "index", urlPatterns = {"/index"})
public class index extends HttpServlet {
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        RequestDispatcher rd;

        rd = request.getRequestDispatcher("/jsp/index.jsp");

        try{
            rd.forward(request, response);
        } catch (IOException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //compra de produtos
        ServletContext sc = request.getServletContext();
        
        Produto Produto = new Produto();
        
        ProdutoDaoImpl prd;
        prd = new ProdutoDaoImpl();

        prd.listarTodos();
        
    }
}