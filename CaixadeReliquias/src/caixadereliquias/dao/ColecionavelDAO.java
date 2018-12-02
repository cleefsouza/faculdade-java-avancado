package caixadereliquias.dao;

import caixadereliquias.controller.IColecionavel;
import caixadereliquias.model.Colecao;
import caixadereliquias.model.Colecionavel;
import caixadereliquias.model.Estado;
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
public class ColecionavelDAO implements IColecionavel{

    // recebe conexão
    Connection conn = null;

    // construtor
    public ColecionavelDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void adicionar(Colecionavel colecionavel) {
        String sql = "INSERT INTO colecionavel(nome_cole, descricao_cole, colecao_cole, estado_cole) VALUES(?,?,?,?);";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, colecionavel.getNome_cole());
            pstm.setString(2, colecionavel.getDescricao_cole());
            pstm.setInt(3, colecionavel.getColecao_cole().getCod_col());
            pstm.setInt(4, colecionavel.getEstado_cole().getCod_est());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar colecionavel: " + e.getMessage());
        }
    }

    @Override
    public List<Colecionavel> listarRecentes(int lim) {
        List<Colecionavel> lista = null;
        String sql = "SELECT * FROM colecionavel ORDER BY cod_cole DESC LIMIT ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, lim);
            ResultSet rs = pstm.executeQuery();

            Colecionavel colecionavel;
            lista = new ArrayList<>();
            while (rs.next()) {
                Estado estado = new EstadoDAO().buscar(rs.getInt("estado_cole"));
                Colecao colecao = new ColecaoDAO().buscar(rs.getInt("colecao_cole"));
                colecionavel = new Colecionavel(rs.getInt("cod_cole"), rs.getString("nome_cole"), rs.getString("descricao_cole"), colecao, estado);

                lista.add(colecionavel);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar colecionaveis recentes: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public void remover(int cod) {
        String sql = "DELETE FROM colecionavel WHERE cod_cole = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover colecionavel: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Colecionavel colecionavel) {
        String sql = "UPDATE colecionavel SET nome_cole=?, descricao_cole=?, colecao_cole=?, estado_cole=? WHERE cod_cole = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, colecionavel.getNome_cole());
            pstm.setString(2, colecionavel.getDescricao_cole());
            pstm.setInt(3, colecionavel.getColecao_cole().getCod_col());
            pstm.setInt(4, colecionavel.getEstado_cole().getCod_est());
            pstm.setInt(5, colecionavel.getCod_cole());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar colecionavel: " + e.getMessage());
        }
    }

    @Override
    public Colecionavel buscar(int cod) {
        Colecionavel colecionavel = null;
        String sql = "SELECT * FROM colecionavel WHERE cod_cole;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            Estado estado;
            Colecao colecao;
            while (rs.next()) {
                estado = new EstadoDAO().buscar(rs.getInt("estado_cole"));
                colecao = new ColecaoDAO().buscar(rs.getInt("colecao_cole"));
                colecionavel = new Colecionavel(rs.getInt("cod_cole"), rs.getString("nome_cole"), rs.getString("descricao_cole"), colecao, estado);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar colecionavel: " + e.getMessage());
        }
        return colecionavel;
    }

    @Override
    public List<Colecionavel> listar() {
        List<Colecionavel> lista = null;
        String sql = "SELECT * FROM colecionavel";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            Colecionavel colecionavel;
            Estado estado;
            Colecao colecao;
            lista = new ArrayList<>();
            while (rs.next()) {
                estado = new EstadoDAO().buscar(rs.getInt("estado_cole"));
                colecao = new ColecaoDAO().buscar(rs.getInt("colecao_cole"));
                colecionavel = new Colecionavel(rs.getInt("cod_cole"), rs.getString("nome_cole"), rs.getString("descricao_cole"), colecao, estado);

                lista.add(colecionavel);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar colecionaveis: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public int qtdTotal() {
        String sql = "SELECT count(cod_cole) FROM colecionavel";
        int qtd = 0;
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            while (rs.next()) {
                qtd = rs.getInt("count(cod_cole)");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar quantidade: " + e.getMessage());
        }
        return qtd;
    }

    @Override
    public int qtdSeminovo() {
        String sql = "SELECT count(cod_cole) FROM colecionavel WHERE estado_cole = 2";
        int qtd = 0;
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            while (rs.next()) {
                qtd = rs.getInt("count(cod_cole)");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar quantidade: " + e.getMessage());
        }
        return qtd;
    }

    @Override
    public int qtdNovo() {
        String sql = "SELECT count(cod_cole) FROM colecionavel WHERE estado_cole = 1";
        int qtd = 0;
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            while (rs.next()) {
                qtd = rs.getInt("count(cod_cole)");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar quantidade: " + e.getMessage());
        }
        return qtd;
    }
}
