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
	
	public String inserirConsumidor(String cpf, String email, String senha, String nome, String telefone, String celular, String tipoPerfil, int idEndereco){
		String insertConsumidor = "INSERT INTO mercadofacil.consumidor ("
				+ "cpf, email, senha, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ cpf +"', '"+ email +"', md5('"+ senha +"'), '"+ nome +"', '"+ telefone +"', '"+ celular +"', '"+ tipoPerfil +"', '"+ idEndereco +"')";
		
		return insertConsumidor;
	}
	
	public String inserirSupermercado(String nomeFantasia, String razaoSocial){
		String insertSupermercado = "INSERT INTO mercadofacil.supermercado ("
				+ "nomeFantasia, razaoSocial) "
				+ "VALUES('"+ nomeFantasia +"', '"+ razaoSocial +"')";
		
		return insertSupermercado;
	}
	
	public String inserirComerciante(String cnpj, String email, String senha, String nome, String telefone, String celular, String tipoPerfil, 
			int idEndereco, String nfEmpresa, String rsEmpresa){
		String insertComerciante = "INSERT INTO mercadofacil.comerciante ("
				+ "cnpj, email, senha, nome, telefone, celular, tipoPerfil, idEndereco, nfEmpresa, rsEmpresa) "
				+ "VALUES('"+ cnpj +"', '"+ email +"', md5('"+ senha +"'), '"+ nome +"', '"+ telefone +"', '"+ celular +"', '"+ tipoPerfil +"', '"
						+ ""+ idEndereco +"', '"+ nfEmpresa +"', '"+ rsEmpresa +"')";
		
		return insertComerciante;
	}
	
	public String inserirAnunciante(String cnpj, String email, String senha, String razaoSocial, String nome, 
			String telefone, String celular, String tipoPerfil, int idEndereco){
		String insertAnunciante = "INSERT INTO mercadofacil.anunciante ("
				+ "cnpj, email, senha, razaoSocial, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ cnpj +"', '"+ email +"', md5('"+ senha +"'), '"+ nome +"', '"+ telefone +"', '"+ celular +"', '"+ tipoPerfil +"'"
						+ "'"+ idEndereco +"')";
		
		return insertAnunciante;
	}
}
