<%@page import="com.sun.xml.internal.ws.api.message.saaj.SAAJFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="daoImpl.ProdutoDaoImpl"%>
<%@page import="model.Produto"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Pagina Inicial</title>
    </head>
    
    <body>
        <div class="container">
            <h2>Produtos Cadastrados</h2>
        
            <form action="index.jsp" method="POST">
                
                <div class="form-group">
                    <label>Pesquisar por produtos:</label>
                    <input type="text" class="form-control col-sm-5" placeholder="Descricao do produto: " name="descricao">
                </div>    
                <button type="submit" class="btn btn-success">Pesquisar</button>
                <a type="button" class="btn btn-success" href="/jsp/cadastroProdutos.jsp">Novo produto</a>
            </form>
            
            <fildset>
                <legend class='mt-5'><strong>Lista de produtos cadastrados</strong></legend>
                <table aling="center" border="2px" width="80%">
                    <tr>
                        <th>Codigo</th>
                        <th>Descrição</th>
                         <th>Quantidade</th>
                        <th>Preço</th>
                        <th>Alterar</th>
                        <th>Deletar</th>
                        <th>Comprar</th>
                    </tr>
                    <%
                        ProdutoDaoImpl prd = new ProdutoDaoImpl();
                        
                        if(request.getParameter("descricao") == " " || request.getParameter("descricao") == null){
                            ArrayList<Produto> lista = prd.listarTodos();
                            
                            for(int i = 0; i < lista.size(); i++){
                                System.out.println("Quantidade : "+ lista.get(i).getQuantidade_produto());
                    %>
                    <tr>
                        <th><%=lista.get(i).getCodigo_produto()%></th>
                        <th><%=lista.get(i).getDescricao_produto()%></th>
                        <th><%=lista.get(i).getQuantidade_produto()%></th>
                        <th><%=lista.get(i).getPreco_produto()%></th>
                        
                        <th><a href='/jsp/alterarProdutos.jsp?codigo=<%=lista.get(i).getCodigo_produto()%>"&descricao=<%=lista.get(i).getDescricao_produto()%>"&quantidade=<%=lista.get(i).getQuantidade_produto()%>"&preco=<%=lista.get(i).getPreco_produto()%>"'>Alterar</a></th>
                        <th><a href='excluir.jsp?codigo=<%=lista.get(i).getCodigo_produto()%>"&descricao=<%=lista.get(i).getDescricao_produto()%>"'>Excluir</a></th>
                        <th><a href='/jsp/compra.jsp?codigo=<%=lista.get(i).getCodigo_produto()%>"&quantidade=<%=lista.get(i).getQuantidade_produto()%>'>Comprar</a></th>
                    </tr>
                    <%
                                }
                            }
                        else{
                            ArrayList<Produto> lista = prd.listarTodosDescricao(request.getParameter("descricao"));
                            for(int i = 0; i < lista.size(); i++){
                    %>
                    <tr>
                        <th><%=lista.get(i).getCodigo_produto()%></th>
                        <th><%=lista.get(i).getDescricao_produto()%></th>
                        <th><%=lista.get(i).getQuantidade_produto()%></th>
                        <th><%=lista.get(i).getPreco_produto()%></th>
                        <th><a href='alterarProdutos.jsp?codigo=<%=lista.get(i).getCodigo_produto()%>"&descricao=<%=lista.get(i).getDescricao_produto()%>"&quantidade<%=lista.get(i).getQuantidade_produto()%>""&preco=<%=lista.get(i).getPreco_produto()%>" '>Alterar</a></th>
                        <th><a href='excluir.jsp?codigo=<%=lista.get(i).getCodigo_produto()%>"&descricao=<%=lista.get(i).getDescricao_produto()%>"'>Excluir</a></th>
                    </tr>
                    
                    <%
                            }
                        }
                    %>
                </table>
            </fildset>
        </div>
    </body>
</html>