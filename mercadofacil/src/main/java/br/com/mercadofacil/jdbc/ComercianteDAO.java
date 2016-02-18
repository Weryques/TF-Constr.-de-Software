/**
 * 
 */
package br.com.mercadofacil.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.mercadofacil.modelo.Comerciante;
import br.com.mercadofacil.modelo.Supermercado;

/**
 * @author weryquessantos
 *
 */
public class ComercianteDAO {
	public void inserirComerciante(Comerciante comerciante, int idEndereco, Connection conexao) throws SQLException{
		String insertComerciante = "INSERT INTO comerciante ("
				+ "cnpj, email, senha, nome, telefone, celular, tipoPerfil, idEndereco) "
				+ "VALUES('"+ comerciante.getCnpjComerciante() +"', '"+ comerciante.getEmail() +"', md5('"+ comerciante.getSenha() +"'), "
						+ "'"+ comerciante.getNomeCompleto() +"', '"+ comerciante.getTelefone() +"', '"+ comerciante.getCelular() +"', '"+ comerciante.getTipoPerfil() +"', '"
						+ ""+ idEndereco +"')";
		
		Statement stmt = conexao.createStatement();
		
		stmt.executeUpdate(insertComerciante);
		stmt.close();
	}
	
	public void inserirSupermercado(Supermercado supermercado, Connection conexao) throws SQLException{
		String insertSupermercado = "INSERT INTO supermercado ("
				+ "nomeFantasia, razaoSocial) "
				+ "VALUES('"+ supermercado.getNomeFantasia() +"', '"+ supermercado.getRazaoSocial() +"')";
		
		Statement stmt = conexao.createStatement();
		
		stmt.executeUpdate(insertSupermercado);
		stmt.close();
	}
	
	public List<String> selectCEP(String cep, Connection conexao) throws SQLException{
		String selectCEP = "SELECT DISTINCT nfEmpresa FROM (comerciante natural join endereco) where cep = '"+ cep +"'";
		
		List<String> supermercados = new ArrayList<String>();
		Statement stmt = conexao.createStatement();
		ResultSet retornoSelect = null;
		
		retornoSelect = stmt.executeQuery(selectCEP);
		
		while(retornoSelect.next()){
			supermercados.add(retornoSelect.getString("nfEmpresa"));
		}
		
		stmt.close();
		retornoSelect.close();
		
		return supermercados;
	}
	
	public Comerciante selectTudo(Comerciante comerciante, Connection conexao) throws SQLException{
		String selectTudo = "SELECT DISTINCT * FROM (comerciante natural join endereco) WHERE email = '"+ comerciante.getEmail() +"'"
				+ " AND senha = md5('"+ comerciante.getSenha() +"')";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = null;
		
		resultado = stmt.executeQuery(selectTudo);
		
		if(resultado.next()){
			comerciante.setNomeCompleto(resultado.getString("nome"));
			comerciante.setCelular(resultado.getString("celular"));
			comerciante.setCnpjComerciante(resultado.getString("cnpj"));
			comerciante.setEmail(resultado.getString("email"));
			comerciante.setTelefone(resultado.getString("telefone"));
			comerciante.setTipoPerfil(resultado.getString("tipoPerfil"));
			comerciante.getEndereco().setCidade(resultado.getString("cidade"));
		}
			
		stmt.close();
		resultado.close();

		return comerciante;
	}

	public int deletarDoBanco(Comerciante comerciante, Connection conexao) throws SQLException {
		int retorno;

		String deletaSQL = "DELETE FROM comerciante where email='"+comerciante.getEmail()+"'"; 
		
		Statement stmt = conexao.createStatement();
				
		retorno = stmt.executeUpdate(deletaSQL);
		
		stmt.close();
		
		return retorno;
	}
}
