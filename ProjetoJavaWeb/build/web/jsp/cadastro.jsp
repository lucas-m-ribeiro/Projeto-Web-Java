<%-- 
    Document   : cadastro
    Created on : 06/08/2019, 22:11:28
    Author     : Lucas Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
       <body>
 
        <h2>Cadastre-se</h2>

        <form action="/cadastro" method="POST">
          
          Usuario:<br>
          <input type="text" name="nome" value="" required="required">
          <br>
          
          Senha:<br>
          <input type="password" name="senha" value="" required="required">
          
          <br><br>
          <input type="submit" value="cadastrar">
        </form>
        
        <!--
        <p class="text-center mt-3">
           <a id="cadastro" href="/index">Voltar para login</a>
        </p>
        -->
        <script>
            var cadastrou = <%= request.getAttribute("statusCadastro")%>
            if(cadastrou){
                alert("Cadastrado com Sucesso!");
            }
        </script>
        
    </body>
</html>
