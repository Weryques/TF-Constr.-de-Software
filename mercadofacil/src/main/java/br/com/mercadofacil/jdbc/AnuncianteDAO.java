/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.mercadofacil.modelo.Anunciante;

/**
 * @author weryquessantos
 *
 */
public class AnuncianteDAO {
	public void inserirAnunciante(Anunciante anunciante, int idEndereco, Connection conexao) throws SQLException{
		String insertAnunciante = "INSERT INTO anunciante ("
				+ "cnpj, email, senha, razaoSocial, causa, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ anunciante.getCnpjAnunciante() +"', '"+ anunciante.getEmail() +"', md5('"+ anunciante.getSenha() +"'), "
						+ "'"+ anunciante.getRazaoSocial() +"', '"+ anunciante.getCausa() +"', "
						+ "'"+ anunciante.getNomeCompleto() +"', '"+ anunciante.getTelefone() +"', '"+ anunciante.getCelular() +"', '"+ anunciante.getTipoPerfil() +"'"
						+ "'"+ idEndereco +"')";
		
		 Statement stmt = conexao.createStatement();
		 
		 stmt.executeUpdate(insertAnunciante);
		 stmt.close();
	}
}
