package caixadereliquias.dao;

import caixadereliquias.controller.IColecao;
import caixadereliquias.controller.IPadrao;
import caixadereliquias.model.Colecao;
import caixadereliquias.model.Usuario;
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
public class ColecaoDAO implements IPadrao, IColecao {

    // recebe conexão
    Connection conn = null;

    // construtor
    ColecaoDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void adicionar(Colecao colecao) {
        String sql = "INSERT INTO colecao(nome_col, descricao_col, data_criacao_col, usuario_col) VALUES(?,?,?,?);";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, colecao.getNome_col());
            pstm.setString(2, colecao.getDescricao_col());
            pstm.setDate(3, (java.sql.Date) colecao.getData_criacao_col());
            pstm.setInt(4, colecao.getUsuario_col().getCod_usu());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar colecao: " + e.getMessage());
        }
    }

    @Override
    public void remover(int cod) {
        String sql = "DELETE FROM colecao WHERE cod_col = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover colecao: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Colecao colecao) {
        String sql = "UPDATE colecao SET nome_col=?, descricao_col=? WHERE cod_col = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, colecao.getNome_col());
            pstm.setString(2, colecao.getDescricao_col());
            pstm.setInt(3, colecao.getCod_col());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar coleção: " + e.getMessage());
        }
    }

    @Override
    public Object buscar(int cod) {
        Object colecao = null;
        String sql = "SELECT * FROM colecao WHERE cod_col;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            Usuario usuario;
            while (rs.next()) {
                usuario = (Usuario) new UsuarioDAO().buscar(rs.getInt("usuario_col"));
                colecao = new Colecao(rs.getInt("cod_col"), rs.getString("nome_col"), rs.getString("descricao_col"), rs.getDate("data_criacao_col"), usuario);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar coleção: " + e.getMessage());
        }
        return colecao;
    }

    @Override
    public List listar() {
        List<Object> lista = null;
        String sql = "SELECT * FROM colecao";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            Object colecao;
            Usuario usuario;
            lista = new ArrayList<>();
            while (rs.next()) {
                usuario = (Usuario) new UsuarioDAO().buscar(rs.getInt("usuario_col"));
                colecao = new Colecao(rs.getInt("cod_col"), rs.getString("nome_col"), rs.getString("descricao_col"), rs.getDate("data_criacao_col"), usuario);
                lista.add((Colecao) colecao);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar coleções: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public int qtdColecionaveis() {
        String sql = "SELECT count(cod_col) FROM colecao";
        int qtd = 0;
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            while (rs.next()) {
                qtd = rs.getInt("count(cod_col)");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar quantidade: " + e.getMessage());
        }
        return qtd;
    }
}
