package cinelist.dao;

import cinelist.controller.IAcao;
import cinelist.model.Acao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cleefsouza
 */
public class AcaoDAO implements IAcao {

    // recebe conexão
    Connection conn = null;

    // construtor
    public AcaoDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void cadastrar(Acao acao) {
        String sql = "insert into acao(descricao_aca, nome_usuario_aca, horario_aca) values (?,?,?)";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, acao.getDescricao_aca());
            pstm.setString(2, acao.getNome_usuario_aca());

            Date data = new Date(System.currentTimeMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, HH:mm");
            pstm.setString(3, sdf.format(data));

            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar login: " + e.getMessage());
        }
    }

    @Override
    public Acao buscar(int cod) {
        String sql = "select * from acao where cod_aca=?";
        Acao acao = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                acao = new Acao(rs.getInt("cod_aca"), rs.getString("descricao_aca"), rs.getString("nome_usuario_aca"), rs.getString("horario_aca"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar acao: " + e.getMessage());
        }
        return acao;
    }

    @Override
    public int buscarUltimaAcao() {
        String sql = "select cod_aca from acao order by cod_aca desc limit 1";
        int cod = 0;
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {
            cod = rs.getInt("cod_aca");
        } catch (SQLException e) {
            System.err.println("Erro ao buscar última ação: " + e.getMessage());
        }
        return cod;
    }
}
