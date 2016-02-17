package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String tipoRequisicao = req.getParameter("tipoRequisicao");
		
		if(tipoRequisicao == null){
			req.getRequestDispatcher("/404.jsp").forward(req, res);
		}
		else if(tipoRequisicao.equals("cadastroConsumidor")){
			try {
				cadastrarConsumidor(req, res);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(tipoRequisicao.equals("cadastroComerciante")){
			try {
				cadastrarComerciante(req, res);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(tipoRequisicao.equals("cadastroAnunciante")){
			try {
				cadastrarAnunciante(req, res);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else{
			req.getRequestDispatcher("/404.jsp").forward(req, res);
		}
	}
	
	/**
	 * @param req
	 * @throws SQLException 
	 */
	private void cadastrarConsumidor(HttpServletRequest req, HttpServletResponse res) throws SQLException {
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
		consumidor.setTipoPerfil("consumidor");

		ConsumidorDAO consumidorDAO = new ConsumidorDAO();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		ValidaDado valida = new ValidaDado();

		try {
			if(valida.validarCPF(consumidor.getCpfConsumidor()) == true){

				//grava endereco
				enderecoDAO.inserirEndereco(consumidor.getEndereco(), conexao);

				int idEndereco = enderecoDAO.selecionarIdEndereco(consumidor.getEndereco(), conexao);

				//grava consumidor
				consumidorDAO.inserirConsumidor(consumidor, idEndereco, conexao);

				conexao.commit(); //fecha transação, efetiva comandos
				conexao.close(); //fecha conexao com o banco de dados
				
				res.sendRedirect("/mercadofacil/supermercadounico/supermercadounico_home.jsp");
			}
			else{
				throw new Exception("CPF inválido!"); //cria uma exceção
			}
		} catch (Exception e) {
			System.out.println("Erro em cadastrar consumidor: "+ e.getMessage());
			e.printStackTrace();
			conexao.rollback(); //desfaz toda a transação caso haja exceção
		}
	}

	/**
	 * @param req
	 * @throws SQLException 
	 * @throws IOException 
	 */
	private void cadastrarComerciante(HttpServletRequest req, HttpServletResponse res) throws SQLException, IOException {
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
		comerciante.setTipoPerfil("comerciante");

		ComercianteDAO comercianteDAO = new ComercianteDAO();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		ValidaDado valida = new ValidaDado();

		try {
			if(valida.validarCNPJ(comerciante.getCnpjComerciante()) == true){
			//grava endereco
				enderecoDAO.inserirEndereco(comerciante.getEndereco(), conexao);

				int idEndereco = enderecoDAO.selecionarIdEndereco(comerciante.getEndereco(), conexao);

				comercianteDAO.inserirComerciante(comerciante, idEndereco, conexao);

				conexao.commit(); //fecha transação, efetiva comandos
				conexao.close(); //fecha conexão
				
				res.sendRedirect("/mercadofacil/loginpessoajuridica.jsp");
			}
			else{
				throw new Exception("CNPJ inválido!");
			}
		} catch (Exception e) {
			System.out.println("Erro em cadastrar comerciante: "+ e.getMessage());
			conexao.rollback(); //desfaz todos os comandos em caso de exceção
			res.sendRedirect("/mercadofacil/cadastropessoajuridica.jsp");
		}
	}

	/**
	 * @param req
	 * @throws SQLException 
	 * @throws IOException 
	 */
	private void cadastrarAnunciante(HttpServletRequest req, HttpServletResponse res) throws SQLException, IOException{
		FabricaConexao conn = new FabricaConexao();
		Anunciante anunciante = new Anunciante();
		Connection conexao = null;

		conexao = conn.getConexao();

		//Abre transação
		conexao.setAutoCommit(false);

		anunciante.getEndereco().setCep(req.getParameter("cep"));
		anunciante.getEndereco().setCidade(req.getParameter("cidade"));
		anunciante.getEndereco().setEstado(req.getParameter("estado"));
		anunciante.getEndereco().setBairro(req.getParameter("bairro"));
		anunciante.getEndereco().setLogradouro(req.getParameter("logradouro"));
		anunciante.getEndereco().setComplemento(req.getParameter("complemento"));
		anunciante.getEndereco().setNumero(Integer.parseInt(req.getParameter("numero")));

		anunciante.setCnpjAnunciante(req.getParameter("cnpj"));
		anunciante.setRazaoSocial(req.getParameter("razaoSocial"));
		anunciante.setCausa(req.getParameter("causa"));
		anunciante.setNomeCompleto(req.getParameter("nomeCompleto"));
		anunciante.setEmail(req.getParameter("email"));
		anunciante.setSenha(req.getParameter("senha"));
		anunciante.setTelefone(req.getParameter("telefone"));
		anunciante.setCelular(req.getParameter("celular"));
		anunciante.setTipoPerfil("anunciante");

		AnuncianteDAO anuncianteDAO = new AnuncianteDAO();
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		ValidaDado valida = new ValidaDado();
		
		try {
			if(valida.validarCNPJ(anunciante.getCnpjAnunciante()) == true){
			enderecoDAO.inserirEndereco(anunciante.getEndereco(), conexao);

			int idEndereco = enderecoDAO.selecionarIdEndereco(anunciante.getEndereco(), conexao);

			anuncianteDAO.inserirAnunciante(anunciante, idEndereco, conexao);

			conexao.commit();
			conexao.close();
			
			res.sendRedirect("/mercadofacil/loginpessoajuridica.jsp");
			}
			else{
				throw new Exception("CNPJ inválido!");
			}
		} catch (Exception e) {
			System.out.println("Erro em cadastrar anunciante: "+ e.getMessage());
			conexao.rollback();
			res.sendRedirect("/mercadofacil/cadastropessoafisica.jsp");
		}
	}
}
