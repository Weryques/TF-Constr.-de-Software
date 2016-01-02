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

import br.com.mercadofacil.jdbc.ConexaoBD;
import br.com.mercadofacil.jdbc.SelectBD;
import br.com.mercadofacil.jdbc.UpdateBD;
import br.com.mercadofacil.modelo.Anunciante;
import br.com.mercadofacil.modelo.Comerciante;
import br.com.mercadofacil.modelo.Consumidor;

@WebServlet(value = "/cadastrar")
public class ServletCadastroUsuario extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		if(req == null){
			req.getRequestDispatcher("visao/cadastro.jsp").forward(req, res);
		}
		else if(req.equals("cadastroConsumidor")){
			ConexaoBD conn = new ConexaoBD();
			Consumidor consumidor = new Consumidor();
			Connection conexao = null;
			
			/**Abre conexão*/
			conexao = conn.conectar();
			
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
			
			UpdateBD update = new UpdateBD();
			SelectBD select = new SelectBD();
			ResultSet resultado = null;
			Statement stmt = null;
			
			//aqui pode-se inserir os teste de validação das informações antes de grava-las no banco de dados
			
			try {
				stmt = conexao.createStatement();
				
				/**Grava endereço no banco de dados*/
				stmt.executeUpdate(update.inserirEndereco(consumidor.getEndereco().getLogradouro(), consumidor.getEndereco().getNumero(), 
						consumidor.getEndereco().getBairro(), consumidor.getEndereco().getComplemento(), consumidor.getEndereco().getCep(), 
						consumidor.getEndereco().getCidade(), consumidor.getEndereco().getEstado()));
				
				/**Pego o id do endereço gravado antes*/
				resultado = stmt.executeQuery(select.selecionarIdEndereco(consumidor.getEndereco().getNumero(), consumidor.getEndereco().getCep(), 
						consumidor.getEndereco().getCidade()));
				
				/**Gravo o consumidor no banco de dados com id do endereço pegado na string sql anterior*/
				stmt.executeUpdate(update.inserirConsumidor(consumidor.getCpfConsumidor(), consumidor.getEmail(), consumidor.getSenha(), consumidor.getNomeCompleto(), 
						consumidor.getTelefone(), consumidor.getCelular(), consumidor.getTipoPerfil(), Integer.parseInt(resultado.getString("id"))));
				
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				System.out.println("Erro em cadastrar consumidor: "+ e.getMessage() +"\nCodigo do erro: "+ e.getErrorCode());
			}
		}
		else if(req.equals("cadastroComerciante")){
			ConexaoBD conn = new ConexaoBD();
			Comerciante comerciante = new Comerciante();
			Connection conexao = null;
			
			conexao = conn.conectar();
			
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
			
			UpdateBD update = new UpdateBD();
			SelectBD select = new SelectBD();
			ResultSet resultado = null;
			Statement stmt;
			
			//aqui pode-se inserir os teste de validação das informações antes de grava-las no banco de dados
			
			try {
				stmt = conexao.createStatement();
				
				/**Grava endereço no banco de dados*/
				stmt.executeUpdate(update.inserirEndereco(comerciante.getEndereco().getLogradouro(), comerciante.getEndereco().getNumero(), 
						comerciante.getEndereco().getBairro(), comerciante.getEndereco().getComplemento(), comerciante.getEndereco().getCep(), 
						comerciante.getEndereco().getCidade(), comerciante.getEndereco().getEstado()));
				
				/**Pego o id do endereço gravado antes*/
				resultado = stmt.executeQuery(select.selecionarIdEndereco(comerciante.getEndereco().getNumero(), 
						comerciante.getEndereco().getCep(), 
						comerciante.getEndereco().getCidade()));
				
				/**Grava supermercado no banco de dados*/
				stmt.executeQuery(update.inserirSupermercado(comerciante.getSupermercado().getNomeFantasia(), 
						comerciante.getSupermercado().getRazaoSocial()));
				
				/**Grava comerciante no banco de dados*/
				stmt.executeQuery(update.inserirComerciante(comerciante.getCnpjComerciante(), comerciante.getEmail(), comerciante.getSenha(), 
						comerciante.getNomeCompleto(), comerciante.getTelefone(), comerciante.getCelular(), 
						comerciante.getTipoPerfil(), Integer.parseInt(resultado.getString("id")), 
						comerciante.getSupermercado().getNomeFantasia(), comerciante.getSupermercado().getRazaoSocial()));
				
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				System.out.println("Erro em cadastrar comerciante: "+ e.getMessage() +"\nCodigo do erro: "+ e.getErrorCode());
			}
		}
		else if(req.equals("cadastroAnunciante")){
			ConexaoBD conn = new ConexaoBD();
			Anunciante anunciante = new Anunciante();
			Connection conexao = null;
			
			conexao = conn.conectar();
			
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
			
			UpdateBD update = new UpdateBD();
			SelectBD select = new SelectBD();
			ResultSet resultado = null;
			Statement stmt = null;
			
			//aqui pode-se inserir os teste de validação das informações antes de grava-las no banco de dados
			
			try {
				stmt = conexao.createStatement();
				
				/**Grava endereço no banco de dados*/
				stmt.executeUpdate(update.inserirEndereco(anunciante.getEndereco().getLogradouro(), anunciante.getEndereco().getNumero(), 
						anunciante.getEndereco().getBairro(), anunciante.getEndereco().getComplemento(), anunciante.getEndereco().getCep(), 
						anunciante.getEndereco().getCidade(), anunciante.getEndereco().getEstado()));
				
				/**Pego o id do endereço gravado antes*/
				resultado = stmt.executeQuery(select.selecionarIdEndereco(anunciante.getEndereco().getNumero(), 
						anunciante.getEndereco().getCep(), 
						anunciante.getEndereco().getCidade()));
				
				/**Gravar anunciante no banco de dados*/
				stmt.executeQuery(update.inserirAnunciante(anunciante.getCnpjAnunciante(), anunciante.getEmail(), 
						anunciante.getSenha(), anunciante.getRazaoSocial(), anunciante.getNomeCompleto(), anunciante.getTelefone(), 
						anunciante.getCelular(), anunciante.getTipoPerfil(), Integer.parseInt(resultado.getString("id"))));
				
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				System.out.println("Erro em cadastrar anunciante: "+ e.getMessage() +"\nCodigo do erro: "+ e.getErrorCode());
			}
		}
		else{
			req.getRequestDispatcher("visao/cadastro.jsp").forward(req, res);
		}
	}
}
