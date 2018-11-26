package caixadereliquias.dao;

import caixadereliquias.controller.IPadrao;
import caixadereliquias.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public class LoginDAO implements IPadrao {

    // recebe conexão
    Connection conn = null;

    // construtor
    LoginDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void remover(int cod) {
        // o login não pode ser removido
    }

    @Override
    public void alterar(int cod) {
        String sql = "update login set user_log =?, password_log=? where cod_log=?";
        Login login = (Login) buscar(cod); // busca login no banco de dados
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, login.getUser_log());
            pstm.setString(2, login.getPassword_log());
            pstm.setInt(3, cod);
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

    @Override
    public List<Object> listar() {
        // o login não pode ser listado
        return null;
    }
}
