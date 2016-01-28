/**
 * 
 */
package br.com.mercadofacil.jdbc;

/**
 * @author weryquessantos
 *
 */
public class AnuncianteDAO {
	public String inserirAnunciante(String cnpj, String email, String senha, String razaoSocial, String nome, 
			String telefone, String celular, String tipoPerfil, int idEndereco){
		String insertAnunciante = "INSERT INTO mercadofacil.anunciante ("
				+ "cnpj, email, senha, razaoSocial, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ cnpj +"', '"+ email +"', md5('"+ senha +"'), '"+ nome +"', '"+ telefone +"', '"+ celular +"', '"+ tipoPerfil +"'"
						+ "'"+ idEndereco +"')";
		
		return insertAnunciante;
	}
}
