<%-- 
    Document   : compra
    Created on : 08/08/2019, 10:17:36
    Author     : Lucas Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html>
    
        <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Alterar</title>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>
        
        <style>
            body {
                background-color:ghostwhite;
            }
        </style>
        
        <body>
        <div class="container">
            <h2>Comprar o produto</h2>
        
            <form action="/compra" method="POST">
            
            <div class="form-group">
                <label>Codigo</label>
                <input type="text" class="form-control col-sm-5" placeholder="Digite codigo" name="codigo" value="<%=request.getParameter("codigo")%>">
            </div>
            
            <div class="form-group">
                <label>Quantidade</label>
                <input type="text" class="form-control col-sm-5" placeholder="Digite a descricao:" name="quantidade" value="<%=request.getParameter("quantidade")%>">
            </div>
           
            <button type="submit" class="btn btn-success">Finalizar compra</button>
            
            </form>
        </div>
    </body>
</html>
