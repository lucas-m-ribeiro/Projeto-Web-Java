/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Compra;
import model.ItemComprado;
import model.Produto;

/**
 *
 * @author Lucas Ribeiro
 */
public interface ProdutoDao {
    
    public void create(Produto produto);
    public void update (Produto produto);
    public void delete(int valor);
    public void comprar(Compra compra);
    public ArrayList <ItemComprado> listarCompras();
    public ArrayList <Produto> listarTodos();
    public ArrayList<Produto> listarTodosDescricao(String valor);  
}
