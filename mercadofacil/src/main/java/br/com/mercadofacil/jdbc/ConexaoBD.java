package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD{ 
	
	private void conectar(){		
		String url = "jdbc:derby:bdmercadofacil";
		Connection conexao;
		
		try {
			conexao = DriverManager.getConnection(url);
			conexao.close();
		}catch (SQLException e) {
			System.out.println(e.getSQLState());
			System.out.println(e.getMessage());
			
			//SQLState XJ004 significa que o banco de dado não foi encontrato.
			if(e.getSQLState().equals("XJ004")){
				tratarErroBancoNaoEncontrado();
			}
		}
	}
	
	private void tratarErroBancoNaoEncontrado(){
		BancoEmbarcado derby = new BancoEmbarcado();
		derby.criarBanco();
		conectar();
	}
}
