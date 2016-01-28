/**
 * 
 */
package br.com.mercadofacil.jdbc;

/**
 * @author weryquessantos
 *
 */
public class ComercianteDAO {
	public String inserirComerciante(String cnpj, String email, String senha, String nome, String telefone, String celular, String tipoPerfil, 
			int idEndereco, String nfEmpresa, String rsEmpresa){
		String insertComerciante = "INSERT INTO mercadofacil.comerciante ("
				+ "cnpj, email, senha, nome, telefone, celular, tipoPerfil, idEndereco, nfEmpresa, rsEmpresa) "
				+ "VALUES('"+ cnpj +"', '"+ email +"', md5('"+ senha +"'), '"+ nome +"', '"+ telefone +"', '"+ celular +"', '"+ tipoPerfil +"', '"
						+ ""+ idEndereco +"', '"+ nfEmpresa +"', '"+ rsEmpresa +"')";
		
		return insertComerciante;
	}
	
	public String inserirSupermercado(String nomeFantasia, String razaoSocial){
		String insertSupermercado = "INSERT INTO mercadofacil.supermercado ("
				+ "nomeFantasia, razaoSocial) "
				+ "VALUES('"+ nomeFantasia +"', '"+ razaoSocial +"')";
		
		return insertSupermercado;
	}
}
