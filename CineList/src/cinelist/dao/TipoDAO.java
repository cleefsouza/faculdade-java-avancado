package cinelist.dao;

import cinelist.controller.ITipo;
import cinelist.model.Tipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cleefsouza
 */
public class TipoDAO implements ITipo{

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
            while (rs.next()) {
                tipo = new Tipo();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar tipo: " + e.getMessage());
        }
        return tipo;
    }
}
