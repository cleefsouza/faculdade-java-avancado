package cinelist.dao;

import cinelist.controller.ICriticaDAO;
import cinelist.controller.IPadraoDAO;
import cinelist.model.Critica;
import cinelist.model.Filme;
import cinelist.model.Genero;
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
public class CriticaDAO implements IPadraoDAO, ICriticaDAO {

    // recebe conexão
    Connection conn = null;

    // construtor
    CriticaDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    // cadastrar
    @Override
    public void cadastrar(Critica critica) {
        String sql = "INSERT INTO critica(descricao_cri, nota_cri, filme_cri) VALUES(?,?,?);";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, critica.getDescricao_cri());
            pstm.setInt(2, critica.getNota_cri());
            pstm.setInt(3, critica.getFilme_cri().getCod_fil());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar critica: " + e.getMessage());
        }
    }

    // remover
    @Override
    public void remover(int cod) {
        String sql = "DELETE FROM critica WHERE cod_cri = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover critica: " + e.getMessage());
        }
    }

    // alterar
    @Override
    public void alterar(int cod) {
        Critica critica = (Critica) buscar(cod);
        String sql = "UPDATE SET critica descricao_cri = ?, nota_cri = ? WHERE cod_cri = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, critica.getDescricao_cri());
            pstm.setInt(2, critica.getNota_cri());
            pstm.setInt(3, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar critica: " + e.getMessage());
        }
    }

    // buscar
    @Override
    public Object buscar(int cod) {
        Object critica = null;
        String sql = "SELECT * FROM critica WHERE cod_cri = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Filme filme = (Filme) new FilmeDAO().buscar(rs.getInt("filme.cri"));
                critica = new Critica(rs.getInt("cod_cri"), rs.getString("descricao_cri"), rs.getInt("nota_cri"), filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar critica: " + e.getMessage());
        }
        return critica;
    }

    // listar
    @Override
    public List<Critica> listar() {
        List<Critica> lista = null;
        String sql = "SELECT * FROM critica;";
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {

            Object critica;
            lista = new ArrayList<>();
            while (rs.next()) {
                Filme filme = (Filme) new FilmeDAO().buscar(rs.getInt("filme_cri"));
                critica = new Critica(rs.getInt("cod_cri"), rs.getString("descricao_cri"), rs.getInt("nota_cri"), filme);
                lista.add((Critica) critica);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar criticas: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public List<Filme> listarFilmesPorNota(int nota) {
        List<Filme> lista = null;
        String sql = "SELECT * FROM critica WHERE nota_cri = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, nota);
            ResultSet rs = pstm.executeQuery(sql);

            Object critica;
            lista = new ArrayList<>();
            while (rs.next()) {
                Filme filme = (Filme) new FilmeDAO().buscar(rs.getInt("filme_cri"));
                lista.add((Filme) filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filmes: " + e.getMessage());
        }
        return lista;
    }
}
