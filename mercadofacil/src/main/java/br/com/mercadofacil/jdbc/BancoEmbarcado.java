package br.com.mercadofacil.jdbc;

import java.sql.*;

public class BancoEmbarcado {
	
	public void criarBanco(){
		String url = "jdbc:derby:directory:bdmercadofacil;create=true";
		
		String schema = "CREATE SCHEMA mercadofacil";
		
		String createTabelaCompra = "CREATE TABLE mercadofacil.compra ("
				+ " id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 0, INCREMENT BY 1),"
				+ " statusEntrega VARCHAR(45) NOT NULL,"
				+ " valorTotal DOUBLE NOT NULL,"
				+ " cpfConsumidor VARCHAR(14) NOT NULL,"
				+ " emailConsumidor VARCHAR(45) NOT NULL,"
				+ " descricaoProdutos VARCHAR(1000) NOT NULL,"
				+ " PRIMARY KEY (id),"
				+ " 	CONSTRAINT fkCompraConsumidor"
				+ " 	FOREIGN KEY (cpfConsumidor, emailConsumidor)"
				+ " 	REFERENCES mercadofacil.consumidor (cpf, email)"
				+ ")";
		
		String createTabelaEndereco = "CREATE TABLE mercadofacil.endereco ("
				+ " id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 0, INCREMENT BY 1),"
				+ " logradouro VARCHAR(45) NOT NULL,"
				+ " numero INT NOT NULL,"
				+ " bairro VARCHAR(45) NOT NULL,"
				+ " complemento VARCHAR(45) NOT NULL,"
				+ " cep VARCHAR(45) NOT NULL,"
				+ " cidade VARCHAR(45) NOT NULL,"
				+ " estado VARCHAR(45) NOT NULL,"
				+ " PRIMARY KEY (id)"
				+ ")";
		
		String createTabelaConsumidor = "CREATE TABLE mercadofacil.consumidor ("
				+ " cpf VARCHAR(14) NOT NULL,"
				+ " email VARCHAR(45) NOT NULL,"
				+ " senha VARCHAR(45) NOT NULL,"
				+ " nome VARCHAR(45) NOT NULL,"
				+ " telefone VARCHAR(45) NOT NULL,"
				+ " celular VARCHAR(45) NOT NULL,"
				+ " tipoPerfil VARCHAR(45) NOT NULL,"
				+ " idEndereco INT NOT NULL,"
				+ " PRIMARY KEY (cpf, email),"
				+ " 	CONSTRAINT fkConsumidorEndereco"
				+ "		FOREIGN KEY (idEndereco)"
				+ " 	REFERENCES mercadofacil.endereco (id)"
				+ ")";
		
		String createTabelaSupermercado = "CREATE TABLE mercadofacil.supermercado ("
				+ " nomeFantasia VARCHAR(45) NOT NULL,"
				+ " razaoSocial VARCHAR(45) NOT NULL,"
				+ " PRIMARY KEY (nomeFantasia, razaoSocial)"
				+ ")";
		
		String createTabelaComerciante = "CREATE TABLE mercadofacil.comerciante ("
				+ " cnpj VARCHAR(18) NOT NULL,"
				+ " email VARCHAR(45) NOT NULL,"
				+ " senha VARCHAR(45) NOT NULL,"
				+ " nome VARCHAR(45) NOT NULL,"
				+ " telefone VARCHAR(45) NOT NULL,"
				+ " celular VARCHAR(45) NOT NULL,"
				+ " tipoPerfil VARCHAR(45) NOT NULL,"
				+ " idEndereco INT NOT NULL,"
				+ " nfEmpresa VARCHAR(45) NOT NULL,"
				+ " rsEmpresa VARCHAR(45) NOT NULL,"
				+ " PRIMARY KEY (cnpj, email),"
				+ "	CONSTRAINT fkComercianteEndereco"
				+ "		FOREIGN KEY (idEndereco)"
				+ "		REFERENCES mercadofacil.endereco (id),"
				+ " CONSTRAINT fkComercianteSupermercado"
				+ " 	FOREIGN KEY (nfEmpresa, rsEmpresa)"
				+ " 	REFERENCES mercadofacil.supermercado (nomeFantasia, razaoSocial)"
				+ ")";
		
		String createTabelaAnunciante = "CREATE TABLE mercadofacil.anunciante ("
				+ " cnpj VARCHAR(18) NOT NULL,"
				+ " email VARCHAR(45) NOT NULL,"
				+ " senha VARCHAR(45) NOT NULL,"
				+ " razaoSocial VARCHAR(45) NOT NULL,"
				+ " causa VARCHAR(45) NOT NULL,"
				+ " nome VARCHAR(45) NOT NULL,"
				+ " telefone VARCHAR(45) NOT NULL,"
				+ " celular VARCHAR(45) NOT NULL,"
				+ " tipoPerfil VARCHAR(45) NOT NULL,"
				+ " idEndereco INT NOT NULL,"
				+ " PRIMARY KEY (cnpj, email, razaoSocial),"
				+ " CONSTRAINT fkAnuncianteEndereco"
				+ " 	FOREIGN KEY (idEndereco)"
				+ " 	REFERENCES mercadofacil.endereco (id)"
				+ ")";
		
		
		String createTabelaServicos = "CREATE TABLE mercadofacil.servicos ("
				+ " id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 0, INCREMENT BY 1),"
				+ " nome VARCHAR(45) NOT NULL,"
				+ " descricao VARCHAR(240) NOT NULL,"
				+ " cnpj VARCHAR(18) NOT NULL,"
				+ " email VARCHAR(45) NOT NULL,"
				+ " anuncianteRazao VARCHAR(45) NOT NULL,"
				+ " PRIMARY KEY (id),"
				+ " CONSTRAINT fkServicosAnunciante"
				+ " 	FOREIGN KEY (cnpj, email, anuncianteRazao)"
				+ " 	REFERENCES mercadofacil.anunciante (cnpj, email, razaoSocial)"
				+ ")";
		
		String createTabelaProduto = "CREATE TABLE mercadofacil.produto ("
				+ " id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 0, INCREMENT BY 1),"
				+ " nome VARCHAR(45) NOT NULL,"
				+ " valor DOUBLE NOT NULL,"
				+ " categoria VARCHAR(45) NOT NULL,"
				+ " descricao VARCHAR(240) NOT NULL,"
				+ " cnpjAnunciante VARCHAR(18) DEFAULT NULL,"
				+ " emailAnunciante VARCHAR(45) DEFAULT NULL,"
				+ " razaoSocialAnunciante VARCHAR(45) DEFAULT NULL,"
				+ " nomeFantasiaSupermercado VARCHAR(45) DEFAULT NULL,"
				+ " razaoSocialSupermercado VARCHAR(45) DEFAULT NULL,"
				+ " PRIMARY KEY (id),"
				+ " CONSTRAINT empresaAnunc"
				+ " 	FOREIGN KEY (cnpjAnunciante, emailAnunciante, razaoSocialAnunciante)"
				+ " 	REFERENCES mercadofacil.anunciante (cnpj, email, razaoSocial),"
				+ " CONSTRAINT empresaSuper"
				+ " 	FOREIGN KEY (nomeFantasiaSupermercado, razaoSocialSupermercado)"
				+ " 	REFERENCES mercadofacil.supermercado (nomeFantasia, razaoSocial)"
				+ ")";
		
		try {
			Connection conexao = DriverManager.getConnection(url);
			Statement stmt = conexao.createStatement();
			
			stmt.execute(schema);
			System.out.println("Schema mercadofacil criado!");
			
			stmt.execute(createTabelaEndereco);
			System.out.println("Tabela endereço criada!");
			
			stmt.execute(createTabelaConsumidor);
			System.out.println("Tabela consumidor criada!");
			
			stmt.execute(createTabelaSupermercado);
			System.out.println("Tabela supermercado criada!");
			
			stmt.execute(createTabelaComerciante);
			System.out.println("Tabela comerciante criada!");
			
			stmt.execute(createTabelaAnunciante);
			System.out.println("Tabela anunciante criada!");
			
			stmt.execute(createTabelaServicos);
			System.out.println("Tabela serviços criada!");
			
			stmt.execute(createTabelaProduto);
			System.out.println("Tabela produto criada!");
			
			
			stmt.close();
			conexao.close();
			
			System.out.println("Banco de dados criado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
		}
	}
}
