/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import dao.UsuarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author Lucas Ribeiro
 */
public class UsuarioDaoImpl implements UsuarioDao {
    
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;

    public UsuarioDaoImpl(){
        con = new ConexaoBD().conectandoBanco();
    }

    @Override
    public boolean inserir(Usuario usuario) {
        String sql = "INSERT INTO usuario(nome, senha) VALUES(?,?)";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getSenha());
            pst.execute();
            pst.close();
        
            return true;
        
        }catch(Exception ex){
            Logger.getLogger(UsuarioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        return false;
    }

    @Override
    public boolean findByNomeUsuario(Usuario usuario) {
        
        String sql = "SELECT * FROM usuario WHERE nome = ? and senha = ?";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getSenha());
            rs = pst.executeQuery();
            
           while(rs.next()){
                return true;
            }
           
           this.fechaBanco(con, pst, rs);
            
    }catch(Exception e){
        System.out.print("\nerro ao encontrar usuario pelo nome");
        }
        return false;
    }
    
    private void fechaBanco(Connection con, PreparedStatement pst, ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
