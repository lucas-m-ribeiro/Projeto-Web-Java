<%-- 
    Document   : cadastro
    Created on : 06/08/2019, 22:11:28
    Author     : Lucas Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
  <meta charset="UTF-8" />
  <title>Cadastro</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <link rel="stylesheet" type="text/css" href="style.css" />
</head>

<body>
  <div class="container" >
    <a class="links" id="paracadastro"></a>
    <a class="links" id="paralogin"></a>
     
   <div id="cadastro">
    <form method="post" action="/cadastro"> 
      <h1>Cadastro</h1> 

      <p> 
        <label for="nome_cad">Nome</label>
        <input id="nome_cad" name="nome" required="required" type="text" placeholder="nome" />
      </p>

      <p> 
        <label for="email_cad">Senha</label>
        <input id="email_cad" name="senha" required="required" type="password" placeholder="senha"/> 
      </p>

      <p> 
        <input type="submit" value="Cadastrar"/> 
      </p>
          
        </form>
      </div>
    </div>
</body>

