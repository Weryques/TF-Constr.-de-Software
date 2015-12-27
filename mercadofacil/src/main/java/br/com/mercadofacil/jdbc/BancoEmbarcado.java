package br.com.mercadofacil.jdbc;

import java.sql.*;

public class BancoEmbarcado {
	public void criarBanco(){
		String url = "jdbc:derby:directory:bdmercadofacil;create=true";
		
		String schema = "CREATE SCHEMA mercadofacil";
		
		String sqlTabelaEndereco = "CREATE TABLE mercadofacil.endereco ("
				+ "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 0, INCREMENT BY 1),"
				+ "logradouro VARCHAR(45) NOT NULL,"
				+ "numero INT NOT NULL,"
				+ "bairro VARCHAR(45) NOT NULL,"
				+ "complemento VARCHAR(45) NOT NULL,"
				+ "cep VARCHAR(45) NOT NULL,"
				+ "cidade VARCHAR(45) NOT NULL,"
				+ "estado VARCHAR(45) NOT NULL,"
				+ "PRIMARY KEY (id)"
				+ ")";
		
		String sqlTabelaConsumidor = "CREATE TABLE mercadofacil.consumidor ("
				+ "cpf VARCHAR(14) NOT NULL,"
				+ "email VARCHAR(45) NOT NULL,"
				+ "nome VARCHAR(45) NOT NULL,"
				+ "telefone VARCHAR(45) NOT NULL,"
				+ "celular VARCHAR(45) NOT NULL,"
				+ "tipoPerfil VARCHAR(45) NOT NULL,"
				+ "idEndereco INT NOT NULL,"
				+ "PRIMARY KEY (cpf, email),"
				+ "CONSTRAINT fkConsumidorEndereco"
				+ "	FOREIGN KEY (idEndereco)"
				+ " REFERENCES mercadofacil.endereco (id)"
				+ ")";
		
		String sqlTabelaSupermercado;
		
		try {
			Connection conexao = DriverManager.getConnection(url);
			Statement stmt = conexao.createStatement();
			
			stmt.execute(schema);
			System.out.println("schema criado!");
			
			stmt.execute(sqlTabelaEndereco);
			System.out.println("tabela endereço criada!");
			
			stmt.execute(sqlTabelaConsumidor);
			System.out.println("tabela consumidor criada!");
			
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
		}
	}
}
