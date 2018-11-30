package cinelist.dao;

import cinelist.controller.IPadraoDAO;
import cinelist.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public class LoginDAO implements IPadraoDAO {

    // recebe conexão
    Connection conn = null;

    // construtor
    LoginDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void remover(int cod) {
        // a classe Login não implementa esse metodo
    }

    // alterar
    @Override
    public void alterar(int cod) {
        Login login = (Login) buscar(cod);
        String sql = "UPDATE SET login usuario_log = ?, senha_log = ? WHERE cod_log = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, login.getUsuario_log());
            pstm.setString(2, login.getSenha_log());
            pstm.setInt(3, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar login: " + e.getMessage());
        }
    }

    // buscar
    @Override
    public Object buscar(int cod) {
        Object login = null;
        String sql = "SELECT * FROM login WHERE cod_log = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                login = (Login) new LoginDAO().buscar(rs.getInt("login_cri"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar login: " + e.getMessage());
        }
        return login;
    }

    @Override
    public List listar() {
        // a classe Login não implementa esse metodo
        return null;
    }
}
