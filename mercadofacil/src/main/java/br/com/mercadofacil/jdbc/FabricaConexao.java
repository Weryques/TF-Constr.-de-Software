package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public Connection getConnection() {
	     try {
	         return DriverManager.getConnection(
	 "jdbc:mysql://localhost/mercadofacil", "root", "91645709");
	    
	     } catch (SQLException e) {
	    	 System.out.println("N�o conectado!");
	         throw new RuntimeException(e);
	     }
	 }
}
