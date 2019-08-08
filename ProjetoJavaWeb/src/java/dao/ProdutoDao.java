/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Lucas Ribeiro
 */
public interface ProdutoDao {
    
    public void create(Produto produto);
    public ArrayList <Produto> checarProduto(String valor);
    public void update (Produto produto);
    public void delete(int valor);
    public ArrayList <Produto> listarTodos();
    public ArrayList<Produto> listarTodosDescricao(String valor);  
}
