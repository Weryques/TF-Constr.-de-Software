/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.mercadofacil.modelo.Comerciante;
import br.com.mercadofacil.modelo.Supermercado;

/**
 * @author weryquessantos
 *
 */
public class ComercianteDAO {
	public void inserirComerciante(Comerciante comerciante, int idEndereco, Connection conexao) throws SQLException{
		String insertComerciante = "INSERT INTO comerciante ("
				+ "cnpj, email, senha, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ comerciante.getCnpjComerciante() +"', '"+ comerciante.getEmail() +"', md5('"+ comerciante.getSenha() +"'), "
						+ "'"+ comerciante.getNomeCompleto() +"', '"+ comerciante.getTelefone() +"', '"+ comerciante.getCelular() +"', '"+ comerciante.getTipoPerfil() +"', '"
						+ ""+ idEndereco +"')";
		
		Statement stmt = conexao.createStatement();
		
		stmt.executeUpdate(insertComerciante);
		stmt.close();
	}
	
	public void inserirSupermercado(Supermercado supermercado, Connection conexao) throws SQLException{
		String insertSupermercado = "INSERT INTO supermercado ("
				+ "nomeFantasia, razaoSocial) "
				+ "VALUES('"+ supermercado.getNomeFantasia() +"', '"+ supermercado.getRazaoSocial() +"')";
		
		Statement stmt = conexao.createStatement();
		
		stmt.executeUpdate(insertSupermercado);
		stmt.close();
	}
	
	public ResultSet selectCEP(String cep, Connection conexao) throws SQLException{
		String selectCEP = "SELECT nfEmpresa FROM (A (comerciante natural join endereco) where A.cep = '"+ cep +"')";
		
		Statement stmt = conexao.createStatement();
		ResultSet retornoSelect = null;
		
		retornoSelect = stmt.executeQuery(selectCEP);
		stmt.close();
		
		
		return retornoSelect;
	}
	
	public ResultSet selectTudo(String senha, String email, Connection conexao) throws SQLException{
		String selectTudo = "SELECT * FROM comerciante WHERE email = '"+ email +"'"
				+ " AND senha = md5('"+ senha +"')";
		
		Statement stmt = conexao.createStatement();
		ResultSet retornoSelect = null;
		
		retornoSelect = stmt.executeQuery(selectTudo);
		stmt.close();
		
		return retornoSelect;
	}
}
