/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas Ribeiro
 */
public class Compra {
    
    private int codigo_produto;
    private int codigo_da_compra;
    private int quantidade_produto;

    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public int getCodigo_da_compra() {
        return codigo_da_compra;
    }

    public void setCodigo_da_compra(int codigo_da_compra) {
        this.codigo_da_compra = codigo_da_compra;
    }

    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }
}
