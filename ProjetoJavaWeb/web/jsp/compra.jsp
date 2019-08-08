<%-- 
    Document   : compra
    Created on : 08/08/2019, 10:17:36
    Author     : Lucas Ribeiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

        <body>
        <div class="container">
            <h2>Alterar produtos</h2>
        
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
