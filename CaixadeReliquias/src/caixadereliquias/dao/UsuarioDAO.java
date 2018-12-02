package caixadereliquias.dao;

import caixadereliquias.controller.IUsuario;
import caixadereliquias.model.Login;
import caixadereliquias.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cleefsouza
 */
public class UsuarioDAO implements IUsuario {

    // recebe conexão
    Connection conn = null;

    // construtor
    public UsuarioDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void alterar(Usuario usuario) {
        String sql = "update usuario set nome_usu =?, data_nascimento_usu=? where cod_usu=?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, usuario.getNome_usu());
            pstm.setString(2, usuario.getData_nascimento_usu());
            pstm.setInt(3, usuario.getCod_usu());
            pstm.execute();
            System.out.println("Login alterado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao alterar usuario: " + e.getMessage());
        }
    }

    @Override
    public Usuario buscar(int cod) {
        String sql = "select * from usuario where cod_usu=?";
        Usuario usuario = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Login login = new LoginDAO().buscar(rs.getInt("login_usu"));
                usuario = new Usuario(rs.getInt("cod_usu"), rs.getString("nome_usu"), rs.getString("data_nascimento_usu"), login);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar usuário: " + e.getMessage());
        }
        return usuario;
    }

    @Override
    public Usuario buscarPorLogin(int cod) {
        String sql = "select * from usuario where login_usu=?";
        Usuario usuario = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Login login = new LoginDAO().buscar(rs.getInt("login_usu"));
                usuario = new Usuario(rs.getInt("cod_usu"), rs.getString("nome_usu"), rs.getString("data_nascimento_usu"), login);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar usuário por login: " + e.getMessage());
        }
        return usuario;
    }
}
