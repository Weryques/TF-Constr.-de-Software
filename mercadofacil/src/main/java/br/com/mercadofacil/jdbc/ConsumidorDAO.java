/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.Connection;
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
}
