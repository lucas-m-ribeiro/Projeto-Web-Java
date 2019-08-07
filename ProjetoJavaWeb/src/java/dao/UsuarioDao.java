/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Usuario;

/**
 *
 * @author Lucas Ribeiro
 */
public interface UsuarioDao {
    
    public boolean inserir(Usuario usuario);
    public boolean findByNomeUsuario(Usuario usuario);
    
}
