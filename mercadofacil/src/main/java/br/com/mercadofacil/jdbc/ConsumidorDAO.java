/**
 * 
 */
package br.com.mercadofacil.jdbc;

/**
 * @author weryquessantos
 *
 */
public class ConsumidorDAO {
	public String inserirConsumidor(String cpf, String email, String senha, String nome, String telefone, String celular, String tipoPerfil, int idEndereco){
		String insertConsumidor = "INSERT INTO mercadofacil.consumidor ("
				+ "cpf, email, senha, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ cpf +"', '"+ email +"', md5('"+ senha +"'), '"+ nome +"', '"+ telefone +"', '"+ celular +"', '"+ tipoPerfil +"', '"+ idEndereco +"')";
		
		return insertConsumidor;
	}
}
