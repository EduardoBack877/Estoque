/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import dao.Md5;

/**
 *
 * @author Eduardo Back
 */
public class UsuarioDAO implements IDAOT<Usuario> {
    ResultSet resultadoQ = null;
    public boolean autenticar(String login, String senha) {

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = ""
                    + "SELECT * "
                    + "FROM usuario "
                    + "WHERE "
                    + "login = '" + login + "' AND "
                    + "senha = '" + senha + "'";

            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            return resultadoQ.next();

        } catch (Exception e) {
            System.out.println("Erro ao autenticar: " + e);
            return false;
        }
    }

    @Override
    public boolean salvar(Usuario u) {
           try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "";
            
             if (u.getId() == 0) {
                  sql = "INSERT INTO usuario VALUES ( "
                    + "default, "
                    + "'" + u.getUsername() + "',"
                    + " md5('" + u.getPassword() + "'),"
                    + "'" + u.getStatus() + "'"  
                    + ")";
                  
             } else {
                 sql = "UPDATE usuario "
                        + "SET login = '" + u.getUsername() + "',"
                        + "senha = md5('" + u.getPassword()  + "'),"
                        + "status" + u.getStatus() + ""
                        + "WHERE id = " + u.getId();
            }
             

            System.out.println("SQL: " + sql);

            int resultado = st.executeUpdate(sql);

            return resultado > 0;

        } catch (Exception e) {
            System.out.println("Erro ao salvar seção: " + e);
            return false;
        }
    
    }

    @Override
    public boolean atualizar(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Usuario> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   

  