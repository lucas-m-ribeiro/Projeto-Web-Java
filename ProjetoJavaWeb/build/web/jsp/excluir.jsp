<%-- 
    Document   : excluir
    Created on : 08/08/2019, 19:12:17
    Author     : Lucas Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Excluir</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous" />
    </head>
    
    <style>
        body {
            background-color:ghostwhite;
        }
    </style>
    
    <body>
        <div class="container">
            <h2>Deletar produtos</h2>
        
            <form action="/excluir" method="POST">
            
            <div class="form-group">
                <label>Codigo</label>
                <input type="text" class="form-control col-sm-5" placeholder="Digite codigo" name="codigo" value="<%=request.getParameter("codigo")%>">
            </div>
            
            <div class="form-group">
                <label>Descricao:</label>
                <input type="text" class="form-control col-sm-5" placeholder="Digite a descricao:" name="descricao" value="<%=request.getParameter("descricao")%>">
            </div>
           
            <button type="submit" class="btn btn-danger">Deletar produto</button>
            
            </form>
        </div>
    </body>
</html>