package br.com.mercadofacil.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author weryquessantos
 *
 */
public class ConexaoBD{
	
	private Connection conexao;
	
	private Connection conectar() throws SQLException{
		String url = "jdbc:mysql://localhost/mercadofacil";
		return conexao = DriverManager.getConnection(url);
	}
}
