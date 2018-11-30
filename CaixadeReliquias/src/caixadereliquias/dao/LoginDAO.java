package caixadereliquias.dao;

import caixadereliquias.controller.IPadrao;
import caixadereliquias.controller.ILogin;
import caixadereliquias.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public class LoginDAO implements IPadrao, ILogin {

    // recebe conexão
    Connection conn = null;

    // construtor
    public LoginDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public boolean autenticarLogin(Login login) {
        boolean retorno = false;
        String sql = "SELECT * FROM login WHERE user_log = ? AND password_log=?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, login.getUser_log());
            pstm.setString(2, login.getPassword_log());

            ResultSet rs = pstm.executeQuery();
            retorno = rs.next();

        } catch (SQLException e) {
            System.err.println("Erro na autenticação de login: " + e.getMessage());
        }
        return retorno;
    }

    @Override
    public void remover(int cod) {
        // o login não pode ser removido
    }

    @Override
    public void alterar(Login login) {
        String sql = "update login set user_log =?, password_log=? where cod_log=?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, login.getUser_log());
            pstm.setString(2, login.getPassword_log());
            pstm.setInt(3, login.getCod_log());
            pstm.execute();
            System.out.println("Login alterado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao alterar login: " + e.getMessage());
        }
    }

    @Override
    public Object buscar(int cod) {
        String sql = "select * from login where cod_log=?";
        Object login = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                login = new Login(rs.getInt("cod_log"), rs.getString("user_log"), rs.getString("password_log"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar login: " + e.getMessage());
        }
        return login;
    }
    
    // buscar por usuario
    public Login buscarUsuario(String user) {
        String sql = "select * from login where user_log=?";
        Login login = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, user);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                login = new Login(rs.getInt("cod_log"), rs.getString("user_log"), rs.getString("password_log"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar login: " + e.getMessage());
        }
        return login;
    }

    @Override
    public List<Object> listar() {
        // o login não pode ser listado
        return null;
    }
}