package caixadereliquias.dao;

import caixadereliquias.controller.IColecionavel;
import caixadereliquias.controller.IPadrao;
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
public class ColecionavelDAO implements IColecionavel, IPadrao {

    // recebe conexão
    Connection conn = null;

    // construtor
    ColecionavelDAO() {
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
    public List<Object> listarPorEstado(String descricao) {
        List<Object> lista = null;
        String sql = "SELECT * FROM colecionavel c, estado e WHERE c.descricao_est=? AND c.estado_cole=e.cod_est;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, descricao);
            ResultSet rs = pstm.executeQuery();

            Object colecionavel;
            Estado estado;
            Colecao colecao;
            lista = new ArrayList<>();
            while (rs.next()) {
                estado = (Estado) new EstadoDAO().buscar(rs.getInt("estado_cole"));
                colecao = (Colecao) new ColecaoDAO().buscar(rs.getInt("colecao_cole"));
                colecionavel = new Colecionavel(rs.getInt("cod_cole"), rs.getString("nome_cole"), rs.getString("descricao_cole"), colecao, estado);

                lista.add((Colecionavel) colecionavel);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar colecionaveis por estado: " + e.getMessage());
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
    public Object buscar(int cod) {
        Object colecionavel = null;
        String sql = "SELECT * FROM colecionavel WHERE cod_cole;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            Estado estado;
            Colecao colecao;
            while (rs.next()) {
                estado = (Estado) new EstadoDAO().buscar(rs.getInt("estado_cole"));
                colecao = (Colecao) new ColecaoDAO().buscar(rs.getInt("colecao_cole"));
                colecionavel = new Colecionavel(rs.getInt("cod_cole"), rs.getString("nome_cole"), rs.getString("descricao_cole"), colecao, estado);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar colecionavel: " + e.getMessage());
        }
        return colecionavel;
    }

    @Override
    public List listar() {
        List<Object> lista = null;
        String sql = "SELECT * FROM colecionavel";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            Object colecionavel;
            Estado estado;
            Colecao colecao;
            lista = new ArrayList<>();
            while (rs.next()) {
                estado = (Estado) new EstadoDAO().buscar(rs.getInt("estado_cole"));
                colecao = (Colecao) new ColecaoDAO().buscar(rs.getInt("colecao_cole"));
                colecionavel = new Colecionavel(rs.getInt("cod_cole"), rs.getString("nome_cole"), rs.getString("descricao_cole"), colecao, estado);

                lista.add((Colecionavel) colecionavel);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar colecionaveis: " + e.getMessage());
        }
        return lista;
    }
}
