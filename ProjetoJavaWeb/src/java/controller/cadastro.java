/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDao;
import daoImpl.UsuarioDaoImpl;
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
import model.Usuario;

/**
 *
 * @author Lucas Ribeiro
 */
@WebServlet(name = "cadastro", urlPatterns = {"/cadastro"})
public class cadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         ServletContext sc = request.getServletContext();
        
        //pega o valor inserido no formulario
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        
        UsuarioDao novoUsuario;
        novoUsuario = new UsuarioDaoImpl();
        
        //seta o valor inserido pelo usuario no formulario 
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSenha(senha);
        
        boolean status = false;
        status = novoUsuario.inserir(usuario);
        
       if(status){
           request.setAttribute("statusCadastro", "'ok'");
            sc.getRequestDispatcher("/jsp/index.jsp").forward(request, response);       
       }
        else {
            request.setAttribute("erroNoCadastro", 1);
            response.sendRedirect("/cadastro");
       }
    }
    
     protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, IOException, IOException{
        
        RequestDispatcher rd;
            
        rd = request.getRequestDispatcher("/jsp/cadastro.jsp");
        try{
            rd.forward(request, response);
        } catch (IOException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
