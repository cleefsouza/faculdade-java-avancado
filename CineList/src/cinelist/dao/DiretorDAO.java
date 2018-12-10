package cinelist.dao;

import cinelist.controller.IDiretor;
import cinelist.model.Diretor;
import cinelist.model.Filme;
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
public class DiretorDAO implements IDiretor {

    // recebe conexão
    Connection conn = null;

    // construtor
    public DiretorDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void cadastrar(Diretor diretor) {
        String sql = "insert into diretor(nome_dir) values (?)";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, diretor.getNome_ite());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar diretor: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Diretor diretor) {
        String sql = "update diretor set nome_dir = ? where cod_dir=?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, diretor.getNome_ite());
            pstm.setInt(2, diretor.getCod_ite());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar diretor: " + e.getMessage());
        }
    }

    @Override
    public List<Diretor> listar() {
        List<Diretor> lista = null;
        String sql = "select * from diretor";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            lista = new ArrayList<>();
            while (rs.next()) {
                Diretor diretor = new Diretor(rs.getInt("cod_dir"), rs.getString("nome_dir"));
                lista.add(diretor);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar diretor: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public Diretor buscar(int cod) {
        String sql = "select * from diretor where cod_dir=?";
        Diretor diretor = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                diretor = new Diretor(rs.getInt("cod_dir"), rs.getString("nome_dir"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar diretor: " + e.getMessage());
        }
        return diretor;
    }

    @Override
    public void remover(int cod) {
        String sql = "delete from diretor where cod_dir = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            removerPorDiretor(cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover diretor: " + e.getMessage());
        }
    }

    @Override
    public int qtdFilmePorDiretor(int cod) {
        int qtd = 0;
        String sql = "select count(cod_fil) from filme where diretor_fil = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            qtd = rs.getInt("count(cod_fil)");

        } catch (SQLException e) {
            System.err.println("Erro ao buscar quantidade de filmes por diretor: " + e.getMessage());
        }
        return qtd;
    }

    @Override
    public void removerPorDiretor(int cod) {
        String sql = "delete from filme where diretor_fil = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover filmes do diretor: " + e.getMessage());
        }
    }
}
