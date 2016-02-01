/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.mercadofacil.modelo.Consumidor;

/**
 * @author weryquessantos
 *
 */
public class ConsumidorDAO {
	public void inserirConsumidor(Consumidor consumidor, int id) throws SQLException{
		
		String insertConsumidor = "INSERT INTO mercadofacil.consumidor ("
				+ "cpf, email, senha, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ consumidor.getCpfConsumidor() +"', '"+ consumidor.getEmail() +"', md5('"+ consumidor.getSenha() +"'), "
						+ "'"+ consumidor.getNomeCompleto() +"', '"+ consumidor.getTelefone() +"', '"+ consumidor.getCelular() +"',"
								+ " '"+ consumidor.getTipoPerfil() +"', '"+ id +"')";
		
		Statement stmt = null;
		
		stmt.executeQuery(insertConsumidor);
	}
}
