package ConnectionFactory;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author cleefsouza
 *
 */
public class CreateDatabase {

	/*
	 * Métodos
	 */

	// Criar nova database
	public static void createNewDatabase(String fileName) {

		String url = "jdbc:sqlite:C:/" + fileName; // URL da database

		try (Connection con = DriverManager.getConnection(url)) {
			if (con != null) {
				DatabaseMetaData meta = con.getMetaData();
				System.out.println("Uma nova database foi criada com sucesso.");
				System.out.println("DRIVER: " + meta.getDriverName());
			}

		} catch (SQLException e) {
			System.err.println("Erro ao tentar criar uma base de dados nova.\n" + e.getMessage());
		}
	}

	// Criar tabela pessoa
	public static void createNewTable(){
		String url = "jdbc:sqlite:C:/introducao_jdbc.db"; // URL da database
		try(Connection con = DriverManager.getConnection(url);
				Statement stm = con.createStatement()){
			String sql = "create table if not exists pessoa(cpf text primary key, nome text not null, rg text not null, idade integer);";

			// Executando query
			stm.execute(sql);
			
			System.out.println("Tabela criada com sucesso.");
		}catch(SQLException e){
			System.err.println("Erro ao tentar criar a tabela pessoa na database.\n"+e.getMessage());
		}
	}

	/*
	 * Criar nova database
	 */
	public static void main(String[] args) {
		createNewDatabase("introducao_jdbc.db");
		createNewTable();
	}
}
