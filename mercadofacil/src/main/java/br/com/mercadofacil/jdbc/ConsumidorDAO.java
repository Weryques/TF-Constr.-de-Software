/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

	public Consumidor selectTudo(Consumidor consumidor, Connection conexao) throws SQLException {
		String selectTudo = "SELECT * FROM (consumidor natural join endereco) WHERE senha = md5('"+ consumidor.getSenha() +"') AND email = '"+ consumidor.getEmail() +"'";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = null;
		
		resultado = stmt.executeQuery(selectTudo);
		
		if(resultado.next()){
			consumidor.setCelular(resultado.getString("celular"));
			consumidor.setEmail(resultado.getString("email"));
			consumidor.setNomeCompleto(resultado.getString("nome"));
			consumidor.setTelefone(resultado.getString("telefone"));
			consumidor.setTipoPerfil(resultado.getString("tipoPerfil"));
			consumidor.getEndereco().setCidade(resultado.getString("cidade"));
			consumidor.getEndereco().setBairro(resultado.getString("bairro"));
			consumidor.getEndereco().setCep(resultado.getString("cep"));
			consumidor.getEndereco().setComplemento(resultado.getString("complemento"));
			consumidor.getEndereco().setEstado(resultado.getString("estado"));
			consumidor.getEndereco().setLogradouro(resultado.getString("logradouro"));
			consumidor.getEndereco().setNumero(resultado.getInt("numero"));
		}
		
		stmt.close();
		resultado.close();
		
		return consumidor;
	}
	
	public int deletarDoBanco(Consumidor consumidor, Connection conexao) throws SQLException{
		int retorno;

		String deletaSQL = "DELETE FROM consumidor where email='"+consumidor.getEmail()+"'"; 
					
		Statement stmt = conexao.createStatement();
				
		retorno = stmt.executeUpdate(deletaSQL);
		
		stmt.close();
		
		return retorno;
	}
}
