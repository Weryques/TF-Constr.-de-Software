/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.mercadofacil.modelo.Endereco;

/**
 * @author weryquessantos
 *
 */
public class EnderecoDAO {
	public void inserirEndereco(Endereco endereco, Connection conexao) throws SQLException{
		String insertEndereco = "INSERT INTO endereco ("
				+ "logradouro, numero, bairro, complemento, cep, cidade, estado) "
				+ "VALUES('"+ endereco.getLogradouro() +"', '"+ endereco.getNumero() +"', '"+ endereco.getBairro()
				+"', '"+ endereco.getComplemento() + "', '"+ endereco.getCep() + "', '"+ endereco.getCidade() +"', '"+ endereco.getEstado() +"')";
		
		
		Statement stmt = conexao.createStatement();
		
		stmt.executeUpdate(insertEndereco);
		stmt.close();
		
	}
	
	public int selecionarIdEndereco(Endereco endereco, Connection conexao) throws SQLException{ //O throws retorna a excessão para o servlet que chamou e lá é tratada
		int idEndereco = 0;
		
		String selectIdEndereco = ""
				+ " SELECT id FROM endereco"
				+ " WHERE numero = '"+ endereco.getNumero() +"' AND cep = '"+ endereco.getCep() +"' AND cidade = '"+ endereco.getCidade() + "'";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = null;
		
		resultado = stmt.executeQuery(selectIdEndereco);
			
		if(resultado.next()){
			idEndereco = resultado.getInt("id");
		}
		
		resultado.close();
		stmt.close();
			
		return idEndereco;
	}
}
