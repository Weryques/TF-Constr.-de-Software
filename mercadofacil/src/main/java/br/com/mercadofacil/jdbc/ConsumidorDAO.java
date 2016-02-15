/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.mercadofacil.modelo.Consumidor;

/**
 * @author weryquessantos
 *
 */
public class ConsumidorDAO {
	public void inserirConsumidor(Consumidor consumidor, int id, Connection conexao) throws SQLException{
		
		String insertConsumidor = "INSERT INTO consumidor ("
				+ "cpf, email, senha, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ consumidor.getCpfConsumidor() +"', '"+ consumidor.getEmail() +"', md5('"+ consumidor.getSenha() +"'), "
						+ "'"+ consumidor.getNomeCompleto() +"', '"+ consumidor.getTelefone() +"', '"+ consumidor.getCelular() +"',"
								+ " '"+ consumidor.getTipoPerfil() +"', '"+ id +"')";
		
		Statement stmt = conexao.createStatement();
		
		stmt.executeUpdate(insertConsumidor);
		stmt.close();
	}

	public ResultSet selectTudo(String senha, String email, Connection conexao) throws SQLException {
		ResultSet resultado = null;
		String selectTudo = "SELECT * FROM consumidor WHERE senha = md5('"+ senha +"') AND email = '"+ email +"'";
		
		Statement stmt = conexao.createStatement();
		
		resultado = stmt.executeQuery(selectTudo);
		stmt.close();
		
		
		return resultado;
	}
}
