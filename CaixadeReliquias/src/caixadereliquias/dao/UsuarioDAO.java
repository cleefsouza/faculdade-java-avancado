package caixadereliquias.dao;

import caixadereliquias.controller.IPadrao;
import caixadereliquias.controller.IUsuario;
import caixadereliquias.model.Login;
import caixadereliquias.model.Usuario;
import java.sql.Connection;
import java.sql.Date;
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
public class UsuarioDAO implements IPadrao, IUsuario {

    // recebe conexão
    Connection conn = null;

    // construtor
    UsuarioDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void remover(int cod) {
        // o usuário não pode ser removido
    }

    @Override
    public void alterar(Usuario usuario) {
        String sql = "update usuario set nome_usu =?, data_nascimento_usu=? where cod_usu=?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, usuario.getNome_usu());
            pstm.setDate(2, (Date) usuario.getData_nascimento_usu());
            pstm.setInt(3, usuario.getCod_usu());
            pstm.execute();
            System.out.println("Login alterado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao alterar usuario: " + e.getMessage());
        }
    }

    @Override
    public Object buscar(int cod) {
        String sql = "select * from usuario where cod_usu=?";
        Object usuario = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Login login = (Login) new LoginDAO().buscar(rs.getInt("login_usu"));
                usuario = new Usuario(rs.getInt("cod_usu"), rs.getString("nome_usu"), rs.getDate("data_nascimento_usu"), login);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar usuário: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List listar() {
        List<Usuario> lista = null;
        String sql = "SELECT * FROM usuario;";
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {

            Object usuario;
            Login login;
            lista = new ArrayList<>();
            while (rs.next()) {
                login = (Login) new LoginDAO().buscar(rs.getInt("login_usu"));
                usuario = new Usuario(rs.getInt("cod_usu"), rs.getString("nome_usu"), rs.getDate("data_nascimento_usu"), login);

                lista.add((Usuario) usuario);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar usuarios: " + e.getMessage());
        }
        return lista;
    }
}
