
<%@page import="java.time.Clock.system(ZoneId)"%>
<%@page import="model.ItemComprado" %>
<%@page import="com.sun.xml.internal.ws.api.message.saaj.SAAJFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="daoImpl.ProdutoDaoImpl"%>
<%@page import="model.Produto"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/css/bootstrap.min.css">
        <title>Produtos Comprados</title>
    </head>
    
    <body>
        <fildset>
         <legend class='mt-5'><strong>Lista de Produtos Comprados</strong></legend>
            <table aling="center" border="2px" width="80%">
                <tr>
                    <th>descricao</th>
                    <th>Quantidade</th>
                    <th>Preço</th>
                </tr>
                <%
                    ProdutoDaoImpl prd = new ProdutoDaoImpl();

                    ArrayList<ItemComprado> lista = prd.listarCompras();

                    for(int i = 0; i < lista.size(); i++){
                %>
                <tr>
                    <th><%=lista.get(i).getDescricao()%></th>
                    <th><%=lista.get(i).getQuantidade_comprada()%></th>
                    <th><%=lista.get(i).getPreco()%></th>
                </tr>
                <%
                    }                
                
                %>
                
                
            </table>
        </fildset>
    </body>
</html>