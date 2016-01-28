/**
 * 
 */
package br.com.mercadofacil.jdbc;

/**
 * @author weryquessantos
 *
 */
public class EnderecoDAO {
	public String inserirEndereco(String logradouro, int numero, String bairro, String complemento, String cep, String cidade, String estado){
		String insertEndereco = "INSERT INTO mercadofacil.endereco ("
				+ "logradouro, numero, bairro, complemento, cep, cidade, estado) "
				+ "VALUES('"+ logradouro +"', '"+ numero +"', '"+ bairro +"', '"+ complemento + "', '"+ cep + "', '"+ cidade +"', '"+ estado +"')";
		
		return insertEndereco;
	}
	
	public String selecionarIdEndereco(int numero, String cep, String cidade){
		String selectIdEndereco = ""
				+ " SELECT id FROM mercadofacil.endereco"
				+ " WHERE numero = '"+ numero +"' AND cep = '"+ cep +"' AND cidade = '"+ cidade+ "'";
		
		return selectIdEndereco;
	}
}
