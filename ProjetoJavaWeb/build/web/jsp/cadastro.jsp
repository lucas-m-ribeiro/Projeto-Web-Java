<%-- 
    Document   : cadastro
    Created on : 06/08/2019, 22:11:28
    Author     : Lucas Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>  
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Cadastro</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous" />
    </head>
    <style>

    body {
        background-color:darkgrey;
    }
</style>

    <body>
	<div class="container">
            <br>
            <br>
            <form class="col-md-6 offset-md-3 jumbotron" action="/cadastro" method="POST">

                <h3>Cadastre-se</h3>

                <div class="form-group">
                    <!-- Endereço de email-->
                    <label>Nome: </label>
                    <input required= "required" name="nome" type="text" class="form-control" placeholder="Nome">
                </div>

                <div class="form-group">
                    <label>Senha: </label>
                    <input required= "required" name="senha" type="password" class="form-control" placeholder="Senha">
                </div>

                <br>
                <button type="submit" class="btn btn-primary" id="cadastro" onclick="a">Cadastrar</button>
               <script>
                    var cadastrou = <%= request.getAttribute("statusCadastro")%>
                    if(cadastrou){
                        alert("Cadastrado com Sucesso!");
                    }
                </script>
            </form>
        </div>
    </body>
</html>