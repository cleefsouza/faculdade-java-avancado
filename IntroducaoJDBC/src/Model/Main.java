package Model;

import java.sql.Connection;
import java.sql.SQLException;

import ConnectionFactory.Conexao;

public class Main {
	public static void main(String[] args) throws SQLException {
		/*
		 * Testando conexão
		 */
		Connection con = new Conexao().getConnection();
		System.out.println("Connectado!");
		con.close();
	}
}
