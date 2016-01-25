package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD{ 
	
	public Connection conectar(){		
		String url = "jdbc:mysql://localhost:3306/mercadofacil?user=root";
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(url);
			System.out.println("Conectado ao banco com sucesso!");
		}catch (SQLException e) {
			System.out.println(e.getSQLState());
			System.out.println(e.getMessage());
		}
		return conexao;
	}
}
