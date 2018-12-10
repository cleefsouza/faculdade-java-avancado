package cinelist.dao;

import cinelist.controller.ITipo;
import cinelist.model.Tipo;
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
public class TipoDAO implements ITipo {

    // recebe conexão
    Connection conn = null;

    // construtor
    public TipoDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public Tipo buscar(int cod) {
        String sql = "select * from tipo where cod_tip=?";
        Tipo tipo = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            tipo = new Tipo(rs.getInt("cod_tip"), rs.getString("descricao_tip"));
        } catch (SQLException e) {
            System.err.println("Erro ao buscar tipo: " + e.getMessage());
        }
        return tipo;
    }

    @Override
    public List<Tipo> listar() {
        List<Tipo> lista = null;
        String sql = "select * from tipo";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            lista = new ArrayList<>();
            while (rs.next()) {
                Tipo tipo = new Tipo(rs.getInt("cod_tip"), rs.getString("descricao_tip"));
                lista.add(tipo);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar tipos: " + e.getMessage());
        }
        return lista;
    }
}
