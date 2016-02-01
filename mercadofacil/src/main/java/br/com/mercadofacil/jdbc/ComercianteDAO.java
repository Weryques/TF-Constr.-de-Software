/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

import br.com.mercadofacil.modelo.Comerciante;
import br.com.mercadofacil.modelo.Supermercado;

/**
 * @author weryquessantos
 *
 */
public class ComercianteDAO {
	public void inserirComerciante(Comerciante comerciante, int idEndereco) throws SQLException{
		String insertComerciante = "INSERT INTO comerciante ("
				+ "cnpj, email, senha, nome, telefone, celular, tipoPerfil, idEndereco, nfEmpresa, rsEmpresa) "
				+ "VALUES('"+ comerciante.getCnpjComerciante() +"', '"+ comerciante.getEmail() +"', md5('"+ comerciante.getSenha() +"'), "
						+ "'"+ comerciante.getNomeCompleto() +"', '"+ comerciante.getTelefone() +"', '"+ comerciante.getCelular() +"', '"+ comerciante.getTipoPerfil() +"', '"
						+ ""+ idEndereco +"', '"+ comerciante.getSupermercado().getNomeFantasia() +"', '"+ comerciante.getSupermercado().getRazaoSocial() +"')";
		
		Statement stmt = null;
		
		stmt.executeQuery(insertComerciante);
	}
	
	public void inserirSupermercado(Supermercado supermercado) throws SQLException{
		String insertSupermercado = "INSERT INTO supermercado ("
				+ "nomeFantasia, razaoSocial) "
				+ "VALUES('"+ supermercado.getNomeFantasia() +"', '"+ supermercado.getRazaoSocial() +"')";
		
		Statement stmt = null;
		
		stmt.executeQuery(insertSupermercado);
	}
}
