<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Pagina inserir</title>
    </head>
    
    <body>
        <div class="container">
            <h2>Cadastrar produtos</h2>
        
            <form action="/cadastroProdutos" method="POST">
                
            <div class="form-group">
                <label>Descricao:</label>
                <input type="text" class="form-control col-sm-5" placeholder="Digite a descricao:" name="descricao">
            </div>
                
            <div class="form-group">
                <label>Quantidade:</label>
                <input type="number" class="form-control col-sm-5" placeholder="Digite a quantidade:" name="quantidade">
            </div>
                
            <div class="form-group">
                <label>Preco:</label>
                <input type="number" class="form-control col-sm-5" placeholder="Digite preco:" name="preco">
            </div>
           
            <button type="submit" class="btn btn-success">Cadastrar produto</button>
            
            </form>
        </div>
    </body>
</html>
