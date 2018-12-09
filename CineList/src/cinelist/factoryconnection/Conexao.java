package cinelist.factoryconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cleefsouza
 */
public class Conexao {
    
    // objeto para conexão
    Connection conn = null;

    public Connection getConnection() {
        String url = "jdbc:sqlite:C:\\sqlite\\db_cinelist.db";
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.err.println("Erro ao estabelecer conexão: " + ex.getMessage());
        }
        return conn; // retorna conexão
    }
}