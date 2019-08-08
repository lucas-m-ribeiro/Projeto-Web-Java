/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.ProdutoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Lucas Ribeiro
 */
public class ProdutoDaoImpl implements ProdutoDao{
    
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Produto> lista = new ArrayList<>();
    
    public ProdutoDaoImpl(){
        con = new ConexaoBD().conectandoBanco();   
    }
   
    //create
    @Override
    public void create (Produto produto){
        String sql = "INSERT INTO produto(descricao_produto, quantidade_produto, preco_produto) VALUES(?,?,?) ";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, produto.getDescricao_produto());
            pst.setDouble(2, produto.getQuantidade_produto());
            pst.setDouble(3, produto.getPreco_produto());
            pst.execute();
            pst.close();    
        }
        catch(Exception ex){
            throw new RuntimeException("Erro ao inserir no banco: ", ex);
        }
    }
    
    //update
    @Override
    public void update (Produto produto){
        String sql = "UPDATE produto SET descricao_produto = ?, preco_produto = ? WHERE codigo_produto = ? ";

        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, produto.getDescricao_produto());
            pst.setDouble(2, produto.getPreco_produto());
            pst.setInt(3, produto.getCodigo_produto());
            pst.execute();
            pst.close();
        }
        catch(Exception ex){
            throw new RuntimeException("Erro ao atualizar no banco: ", ex);
        }
    }
    
    //delete
    @Override
    public void delete (int valor){
        String sql = "DELETE FROM produto WHERE codigo_produto = " + valor;

        try{
            st = con.createStatement();
            st.execute(sql);
            st.close();
        }
        catch(Exception ex){
            throw new RuntimeException("Erro ao deletar do banco: ", ex);
        }
    }
    
    //read
    @Override
    public ArrayList <Produto> listarTodos(){
        String sql = "SELECT * FROM produto";
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo_produto(rs.getInt("codigo_produto"));
                produto.setDescricao_produto(rs.getString("descricao_produto"));
                produto.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(produto);
            }   
        }
        catch(Exception ex){
            throw new RuntimeException("Erro ao listar produtos do banco: ", ex);
        }
        return lista;
    }
    
    //read (descricao)
    @Override
    public ArrayList <Produto> listarTodosDescricao(String valor){
        String sql = "SELECT * FROM produto WHERE descricao_produto LIKE '%"+valor+"%' ";
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCodigo_produto(rs.getInt("codigo_produto"));
                produto.setDescricao_produto(rs.getString("descricao_produto"));
                produto.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(produto);
            }   
        }
        catch(Exception ex){
            throw new RuntimeException("Erro ao listar produtos por descricao: ", ex);
        }
        return lista;
    }

    @Override
    public ArrayList<Produto> checarProduto(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
