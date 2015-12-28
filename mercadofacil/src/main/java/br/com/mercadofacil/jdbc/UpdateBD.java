package br.com.mercadofacil.jdbc;

/**
 * @author weryquessantos
 * Classe com metodos de atualizacoes no bando de dados - insert, update, delete.
 */
public class UpdateBD{
		
	public String inserirEndereco(String logradouro, int numero, String bairro, String complemento, String cep, String cidade, String estado){
		String insertEndereco = "INSERT INTO mercadofacil.endereco ("
				+ "logradouro, numero, bairro, complemento, cep, cidade, estado) "
				+ "VALUES('"+ logradouro +"', '"+ numero +"', '"+ bairro +"', '"+ complemento + "', '"+ cep + "', '"+ cidade +"', '"+ estado +"')";
		
		return insertEndereco;
	}
	
	public String inserirConsumidor(String cpf, String email, String nome, String telefone, String celular, String tipoPerfil, int idEndereco){
		String insertConsumidor = "INSERT INTO mercadofacil.consumidor ("
				+ "cpf, email, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ cpf +"', '"+ email +"', '"+ nome +"', '"+ telefone +"', '"+ celular +"', '"+ tipoPerfil +"', '"+ idEndereco +"')";
		
		return insertConsumidor;
	}
	
}
