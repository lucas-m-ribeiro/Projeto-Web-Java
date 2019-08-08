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
public class ItemComprado {

    private String descricao;
    private int quantidade_comprada;
    private int preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade_comprada() {
        return quantidade_comprada;
    }

    public void setQuantidade_comprada(int quantidade_comprada) {
        this.quantidade_comprada = quantidade_comprada;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
