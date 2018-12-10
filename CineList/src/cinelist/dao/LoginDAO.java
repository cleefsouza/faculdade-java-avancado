package cinelist.dao;

import cinelist.controller.ILogin;
import cinelist.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cleefsouza
 */
public class LoginDAO implements ILogin {

    // recebe conexão
    Connection conn = null;

    // construtor
    public LoginDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void cadastrar(Login login) {
        String sql = "insert into login(usuario_log, senha_log) values (?,?)";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, login.getUsuario_log());
            pstm.setString(2, login.getSenha_log());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar login: " + e.getMessage());
        }
    }

    @Override
    public Login buscar(int cod) {
        String sql = "select * from login where cod_log=?";
        Login login = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                login = new Login(rs.getInt("cod_log"), rs.getString("usuario_log"), rs.getString("senha_log"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar login: " + e.getMessage());
        }
        return login;
    }

    @Override
    public void alterar(Login login) {
        String sql = "update login set usuario_log =?, senha_log=? where cod_log=?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, login.getUsuario_log());
            pstm.setString(2, login.getSenha_log());
            pstm.setInt(3, login.getCod_log());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar login: " + e.getMessage());
        }
    }

    @Override
    public boolean autenticarLogin(Login login) {
        boolean retorno = false;
        String sql = "SELECT * FROM login WHERE usuario_log = ? AND senha_log=?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, login.getUsuario_log());
            pstm.setString(2, login.getSenha_log());

            ResultSet rs = pstm.executeQuery();
            retorno = rs.next();

        } catch (SQLException e) {
            System.err.println("Erro na autenticação de login: " + e.getMessage());
        }
        return retorno;
    }

    @Override
    public Login buscarPorUsuario(String usuario) {
        String sql = "select * from login where usuario_log=?";
        Login login = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, usuario);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                login = new Login(rs.getInt("cod_log"), rs.getString("usuario_log"), rs.getString("senha_log"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar login: " + e.getMessage());
        }
        return login;
    }

    @Override
    public void remover(int cod) {
         String sql = "delete from login where cod_log = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover login: " + e.getMessage());
        }
    }
}
