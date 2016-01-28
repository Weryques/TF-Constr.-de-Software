/**
 * 
 */
package br.com.mercadofacil.jdbc;

/**
 * @author weryquessantos
 *
 */
public class ServicoDAO {
	public String inserirServico(String nome, String descricao, String cnpj, String email, String anuncianteRazao){
		String insertServico = "INSERT INTO mercadofacil.servico ("
				+ "nome, descricao, cnpj, email, anuncianteRazao) "
				+ "VALUES('"+ nome +"', '"+ descricao +"', '"+ cnpj +"', '"+ email +"', '"+ anuncianteRazao +"')";
		
		return insertServico;
	}
}
