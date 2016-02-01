/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.mercadofacil.modelo.Endereco;

/**
 * @author weryquessantos
 *
 */
public class EnderecoDAO {
	public void inserirEndereco(Endereco endereco) throws SQLException{
		String insertEndereco = "INSERT INTO mercadofacil.endereco ("
				+ "logradouro, numero, bairro, complemento, cep, cidade, estado) "
				+ "VALUES('"+ endereco.getLogradouro() +"', '"+ endereco.getNumero() +"', '"+ endereco.getBairro()
				+"', '"+ endereco.getComplemento() + "', '"+ endereco.getCep() + "', '"+ endereco.getCidade() +"', '"+ endereco.getEstado() +"')";
		
		
		Statement stmt = null;
		
		stmt.executeQuery(insertEndereco);
		
	}
	
	public int selecionarIdEndereco(Endereco endereco) throws SQLException{ //O throws retorna a excessão para o servlet que chamou e lá é tratada
		int idEndereco = 0;
		
		String selectIdEndereco = ""
				+ " SELECT id FROM mercadofacil.endereco"
				+ " WHERE numero = '"+ endereco.getNumero() +"' AND cep = '"+ endereco.getCep() +"' AND cidade = '"+ endereco.getCidade() + "'";
		
		Statement stmt = null;
		ResultSet resultado = null;
		
		resultado = stmt.executeQuery(selectIdEndereco);
			
		idEndereco = resultado.getInt("id");
			
		return idEndereco;
	}
}
