/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daoImpl.UsuarioDaoImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author Lucas Ribeiro
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, ServletException, ServletException, ServletException, IOException{
      
         ServletContext sc = request.getServletContext();
         
        //pega o valor inserido no formulario
         String nome = request.getParameter("nome");
         String senha = request.getParameter("senha");
         
         UsuarioDaoImpl UdaoImpl = new UsuarioDaoImpl();
         Usuario u = new Usuario();
         
         //seta o valor do formulario na variavel
         u.setNome(nome);
         u.setSenha(senha);
         
         RequestDispatcher rd = null;
         
         if(UdaoImpl.findByNomeUsuario(u) == true){
             HttpSession sessao = request.getSession();
             sessao.setAttribute("usuario", u);
             response.sendRedirect("/home");
         }
         else{
             request.setAttribute("mensagem", "usuario ou senha invalidos");
             response.sendRedirect("/");
         }
    }
}
