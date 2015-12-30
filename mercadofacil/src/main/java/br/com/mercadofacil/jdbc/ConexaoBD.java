package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD{ 
	
	public Connection conectar(){		
		String url = "jdbc:derby:bdmercadofacil";
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(url);
			System.out.println("Conectado ao banco com sucesso!");
		}catch (SQLException e) {
			System.out.println(e.getSQLState());
			System.out.println(e.getMessage());
			
			/**SQLState XJ004 significa que o banco de dado não foi encontrato.*/
			if(e.getSQLState().equals("XJ004")){
				tratarErroBancoNaoEncontrado();
				
				try {
					conexao = DriverManager.getConnection(url);
					System.out.println("Conectado ao banco com sucesso!");
				} catch (SQLException e1) {
					System.out.println(e1.getSQLState());
					System.out.println(e1.getMessage());
				}
			}
		}
		return conexao;
	}
	
	private void tratarErroBancoNaoEncontrado(){
		BancoEmbarcado derby = new BancoEmbarcado();
		derby.criarBanco();
	}
}
