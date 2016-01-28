package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public Connection getConexao() {
	     try {
	         return DriverManager.getConnection("jdbc:mysql://localhost/mercadofacil", "root", "91645709");
	    
	     } catch (SQLException e) {
	    	 System.out.println(e.getSQLState());
	    	 System.out.println(e.getMessage());
	    	 
	    	 throw new RuntimeException(e);
	     }
	 }
}
