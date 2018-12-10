package cinelist.dao;

import cinelist.controller.IUsuario;
import cinelist.model.Login;
import cinelist.model.Tipo;
import cinelist.model.Usuario;
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
public class UsuarioDAO implements IUsuario {

    // recebe conexão
    Connection conn = null;

    // construtor
    public UsuarioDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void cadastrar(Usuario usuario) {
        String sql = "insert into usuario(nome_usu, tipo_usu, login_usu) values (?,?,?)";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, usuario.getNome_usu());
            pstm.setInt(2, usuario.getTipo_usu().getCod_tip());
            pstm.setInt(3, usuario.getLogin_usu().getCod_log());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuario: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        String sql = "update usuario set nome_usu =? where cod_usu=?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, usuario.getNome_usu());
            pstm.setInt(2, usuario.getCod_usu());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar usuario: " + e.getMessage());
        }
    }

    @Override
    public void remover(int cod) {
        String sql = "delete from usuario where cod_usu = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            
            // removendo login do usuário
            LoginDAO ld = new LoginDAO();
            ld.remover(cod);
            
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover usuário: " + e.getMessage());
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
                Tipo tipo = new TipoDAO().buscar(rs.getInt("tipo_usu"));
                usuario = new Usuario(rs.getInt("cod_usu"), rs.getString("nome_usu"), login, tipo);
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
                Tipo tipo = new TipoDAO().buscar(rs.getInt("tipo_usu"));
                usuario = new Usuario(rs.getInt("cod_usu"), rs.getString("nome_usu"), login, tipo);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar usuário por login: " + e.getMessage());
        }
        return usuario;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> lista = null;
        String sql = "select * from usuario";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            lista = new ArrayList<>();
            while (rs.next()) {
                Login login = new LoginDAO().buscar(rs.getInt("login_usu"));
                Tipo tipo = new TipoDAO().buscar(rs.getInt("tipo_usu"));
                Usuario usuario = new Usuario(rs.getInt("cod_usu"), rs.getString("nome_usu"), login, tipo);
                lista.add(usuario);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar usuarios: " + e.getMessage());
        }
        return lista;
    }

    //@Override
    public List<Usuario> listarNaoLogado(int cod) {
        List<Usuario> lista = null;
        String sql = "select * from usuario where cod_usu not like '%" + cod + "%'";
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {

            lista = new ArrayList<>();
            while (rs.next()) {
                Login login = new LoginDAO().buscar(rs.getInt("login_usu"));
                Tipo tipo = new TipoDAO().buscar(rs.getInt("tipo_usu"));
                Usuario usuario = new Usuario(rs.getInt("cod_usu"), rs.getString("nome_usu"), login, tipo);
                lista.add(usuario);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar usuarios não logados: " + e.getMessage());
        }
        return lista;
    }
}
