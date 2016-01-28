package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.mercadofacil.jdbc.AnuncianteDAO;
import br.com.mercadofacil.jdbc.ComercianteDAO;
import br.com.mercadofacil.jdbc.ConsumidorDAO;
import br.com.mercadofacil.jdbc.EnderecoDAO;
import br.com.mercadofacil.jdbc.FabricaConexao;
import br.com.mercadofacil.modelo.Anunciante;
import br.com.mercadofacil.modelo.Comerciante;
import br.com.mercadofacil.modelo.Consumidor;
import br.com.mercadofacil.modelo.ValidaDado;

@WebServlet(value = "/cadastrar")
public class ServletCadastroUsuario extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		if(req == null){
			req.getRequestDispatcher("visao/cadastro.jsp").forward(req, res);
		}
		else if(req.equals("cadastroConsumidor")){
			try {
				cadastrarConsumidor(req);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(req.equals("cadastroComerciante")){
			cadastrarComerciante(req);
		}
		else if(req.equals("cadastroAnunciante")){
			cadastrarAnunciante(req);
		}
		else{
			req.getRequestDispatcher("visao/cadastro.jsp").forward(req, res);
		}
	}

	/**
	 * @param req
	 * @throws SQLException 
	 */
	private void cadastrarConsumidor(ServletRequest req) throws SQLException {
		FabricaConexao conn = new FabricaConexao();
		Consumidor consumidor = new Consumidor();
		Connection conexao = null;

		/**Abre conexão*/
		conexao = conn.getConexao();

		//Abrir transação
		conexao.setAutoCommit(false); //A transação não "commita" sozinha

		consumidor.getEndereco().setCep(req.getParameter("cep"));
		consumidor.getEndereco().setCidade(req.getParameter("cidade"));
		consumidor.getEndereco().setEstado(req.getParameter("estado"));
		consumidor.getEndereco().setBairro(req.getParameter("bairro"));
		consumidor.getEndereco().setLogradouro(req.getParameter("logradouro"));
		consumidor.getEndereco().setComplemento(req.getParameter("complemento"));
		consumidor.getEndereco().setNumero(Integer.parseInt(req.getParameter("numero")));

		consumidor.setCpfConsumidor(req.getParameter("cpf"));
		consumidor.setNomeCompleto(req.getParameter("nomeCompleto"));
		consumidor.setEmail(req.getParameter("email"));
		consumidor.setSenha(req.getParameter("senha"));
		consumidor.setTelefone(req.getParameter("telefone"));
		consumidor.setCelular(req.getParameter("celular"));
		consumidor.setTipoPerfil("tipoPerfil");

		ConsumidorDAO consumidorDAO = new ConsumidorDAO();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		ResultSet resultado = null;
		Statement stmt = null;
		ValidaDado valida = new ValidaDado();

		try {
			if(valida.validarCPF(consumidor.getCpfConsumidor()) == true){
				stmt = conexao.createStatement();

				/**Grava endereço no banco de dados*/
				stmt.executeUpdate(enderecoDAO.inserirEndereco(consumidor.getEndereco().getLogradouro(), consumidor.getEndereco().getNumero(), 
						consumidor.getEndereco().getBairro(), consumidor.getEndereco().getComplemento(), consumidor.getEndereco().getCep(), 
						consumidor.getEndereco().getCidade(), consumidor.getEndereco().getEstado()));

				/**Pego o id do endereço gravado antes*/
				resultado = stmt.executeQuery(enderecoDAO.selecionarIdEndereco(consumidor.getEndereco().getNumero(), consumidor.getEndereco().getCep(), 
						consumidor.getEndereco().getCidade()));

				/**Gravo o consumidor no banco de dados com id do endereço pegado na string sql anterior*/
				stmt.executeUpdate(consumidorDAO.inserirConsumidor(consumidor.getCpfConsumidor(), consumidor.getEmail(), consumidor.getSenha(), consumidor.getNomeCompleto(), 
						consumidor.getTelefone(), consumidor.getCelular(), consumidor.getTipoPerfil(), Integer.parseInt(resultado.getString("id"))));

				conexao.commit(); //fecha transação, efetiva comandos
				stmt.close(); //fecha statement
				conexao.close(); //fecha conexao com o banco de dados
			}
			else{
				throw new SQLException("CPF inválido!"); //cria uma exceção
			}
		} catch (SQLException e) {
			System.out.println("Erro em cadastrar consumidor: "+ e.getMessage() +"\nCodigo do erro: "+ e.getErrorCode());
			conexao.rollback(); //desfaz toda a transação caso haja exceção
		}
	}

	/**
	 * @param req
	 * @throws SQLException 
	 */
	private void cadastrarComerciante(ServletRequest req) throws SQLException {
		FabricaConexao conn = new FabricaConexao();
		Comerciante comerciante = new Comerciante();
		Connection conexao = null;

		conexao = conn.getConexao();
		
		//Abrir transação
		conexao.setAutoCommit(false); //a transação não "commita" sozinha

		comerciante.getEndereco().setCep(req.getParameter("cep"));
		comerciante.getEndereco().setCidade(req.getParameter("cidade"));
		comerciante.getEndereco().setEstado(req.getParameter("estado"));
		comerciante.getEndereco().setBairro(req.getParameter("bairro"));
		comerciante.getEndereco().setLogradouro(req.getParameter("logradouro"));
		comerciante.getEndereco().setComplemento(req.getParameter("complemento"));
		comerciante.getEndereco().setNumero(Integer.parseInt(req.getParameter("numero")));

		comerciante.setCnpjComerciante(req.getParameter("cnpj"));
		comerciante.setNomeCompleto(req.getParameter("nomeCompleto"));
		comerciante.setEmail(req.getParameter("email"));
		comerciante.setSenha(req.getParameter("senha"));
		comerciante.setTelefone(req.getParameter("telefone"));
		comerciante.setCelular(req.getParameter("celular"));
		comerciante.setTipoPerfil("tipoPerfil");

		comerciante.getSupermercado().setNomeFantasia(req.getParameter("nomeFantasia"));
		comerciante.getSupermercado().setRazaoSocial(req.getParameter("razaoSocial"));

		ComercianteDAO comercianteDAO = new ComercianteDAO();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		ResultSet resultado = null;
		Statement stmt;

		//aqui pode-se inserir os teste de validação das informações antes de grava-las no banco de dados

		try {
			stmt = conexao.createStatement();

			/**Grava endereço no banco de dados*/
			stmt.executeUpdate(enderecoDAO.inserirEndereco(comerciante.getEndereco().getLogradouro(), comerciante.getEndereco().getNumero(), 
					comerciante.getEndereco().getBairro(), comerciante.getEndereco().getComplemento(), comerciante.getEndereco().getCep(), 
					comerciante.getEndereco().getCidade(), comerciante.getEndereco().getEstado()));

			/**Pego o id do endereço gravado antes*/
			resultado = stmt.executeQuery(enderecoDAO.selecionarIdEndereco(comerciante.getEndereco().getNumero(), 
					comerciante.getEndereco().getCep(), 
					comerciante.getEndereco().getCidade()));

			/**Grava supermercado no banco de dados*/
			stmt.executeQuery(comercianteDAO.inserirSupermercado(comerciante.getSupermercado().getNomeFantasia(), 
					comerciante.getSupermercado().getRazaoSocial()));

			/**Grava comerciante no banco de dados*/
			stmt.executeQuery(comercianteDAO.inserirComerciante(comerciante.getCnpjComerciante(), comerciante.getEmail(), comerciante.getSenha(), 
					comerciante.getNomeCompleto(), comerciante.getTelefone(), comerciante.getCelular(), 
					comerciante.getTipoPerfil(), Integer.parseInt(resultado.getString("id")), 
					comerciante.getSupermercado().getNomeFantasia(), comerciante.getSupermercado().getRazaoSocial()));
			
			conexao.commit(); //fecha transação, efetiva comandos
			stmt.close(); //fecha statement
			conexao.close(); //fecha conexão
		} catch (SQLException e) {
			System.out.println("Erro em cadastrar comerciante: "+ e.getMessage() +"\nCodigo do erro: "+ e.getErrorCode());
			conexao.rollback(); //desfaz todos os comandos em caso de exceção
		}
	}

	/**
	 * @param req
	 * @throws SQLException 
	 */
	private void cadastrarAnunciante(ServletRequest req){
		FabricaConexao conn = new FabricaConexao();
		Anunciante anunciante = new Anunciante();
		Connection conexao = null;

		conexao = conn.getConexao();

		anunciante.getEndereco().setCep(req.getParameter("cep"));
		anunciante.getEndereco().setCidade(req.getParameter("cidade"));
		anunciante.getEndereco().setEstado(req.getParameter("estado"));
		anunciante.getEndereco().setBairro(req.getParameter("bairro"));
		anunciante.getEndereco().setLogradouro(req.getParameter("logradouro"));
		anunciante.getEndereco().setComplemento(req.getParameter("complemento"));
		anunciante.getEndereco().setNumero(Integer.parseInt(req.getParameter("numero")));

		anunciante.setCnpjAnunciante(req.getParameter("cnpj"));
		anunciante.setRazaoSocial(req.getParameter("razaoSocial"));
		anunciante.setNomeCompleto(req.getParameter("nomeCompleto"));
		anunciante.setEmail(req.getParameter("email"));
		anunciante.setSenha(req.getParameter("senha"));
		anunciante.setTelefone(req.getParameter("telefone"));
		anunciante.setCelular(req.getParameter("celular"));
		anunciante.setTipoPerfil("tipoPerfil");

		AnuncianteDAO anuncianteDAO = new AnuncianteDAO();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		ResultSet resultado = null;
		Statement stmt = null;

		//aqui pode-se inserir os teste de validação das informações antes de grava-las no banco de dados

		try {
			stmt = conexao.createStatement();

			/**Grava endereço no banco de dados*/
			stmt.executeUpdate(enderecoDAO.inserirEndereco(anunciante.getEndereco().getLogradouro(), anunciante.getEndereco().getNumero(), 
					anunciante.getEndereco().getBairro(), anunciante.getEndereco().getComplemento(), anunciante.getEndereco().getCep(), 
					anunciante.getEndereco().getCidade(), anunciante.getEndereco().getEstado()));

			/**Pego o id do endereço gravado antes*/
			resultado = stmt.executeQuery(enderecoDAO.selecionarIdEndereco(anunciante.getEndereco().getNumero(), 
					anunciante.getEndereco().getCep(), 
					anunciante.getEndereco().getCidade()));

			/**Gravar anunciante no banco de dados*/
			stmt.executeQuery(anuncianteDAO.inserirAnunciante(anunciante.getCnpjAnunciante(), anunciante.getEmail(), 
					anunciante.getSenha(), anunciante.getRazaoSocial(), anunciante.getNomeCompleto(), anunciante.getTelefone(), 
					anunciante.getCelular(), anunciante.getTipoPerfil(), Integer.parseInt(resultado.getString("id"))));

			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			System.out.println("Erro em cadastrar anunciante: "+ e.getMessage() +"\nCodigo do erro: "+ e.getErrorCode());
		}
	}
}
