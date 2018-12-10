package cinelist.dao;

import cinelist.controller.IHistorico;
import cinelist.model.Acao;
import cinelist.model.Historico;
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
public class HistoricoDAO implements IHistorico{

    // recebe conexão
    Connection conn = null;

    // construtor
    public HistoricoDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void registrarAcao(Historico historico) {
        String sql = "insert into historico(nome_item_his, acao_his) values (?,?)";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, historico.getNome_item_his());
            pstm.setInt(2, historico.getAcao_his().getCod_aca());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao registrar ação: " + e.getMessage());
        }
    }

    @Override
    public List<Historico> listar() {
       List<Historico> lista = null;
        String sql = "select * from historico order by cod_his desc";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            lista = new ArrayList<>();
            while (rs.next()) {                
                Acao acao = new AcaoDAO().buscar(rs.getInt("acao_his"));
                Historico historico = new Historico(rs.getInt("cod_his"), rs.getString("nome_item_his"), acao);
                lista.add(historico);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar historico: " + e.getMessage());
        }
        return lista;
    }
}
