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
import br.com.mercadofacil.modelo.Consumidor;

@WebServlet(value = "/cadastrar")
public class ServletCadastro extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		if(req == null){
			req.getRequestDispatcher("visao/cadastro.jsp").forward(req, res);
		}
		else if(req.equals("cadastroConsumidor")){
			ConexaoBD conn = new ConexaoBD();
			Consumidor consumidor = new Consumidor();
			Connection conexao;
			
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
			consumidor.setTelefone(req.getParameter("telefone"));
			consumidor.setCelular(req.getParameter("celular"));
			consumidor.setTipoPerfil("tipoPerfil");
			consumidor.setSenha(req.getParameter("senha"));
			
			UpdateBD update = new UpdateBD();
			SelectBD select = new SelectBD();
			ResultSet resultado;
			Statement stmt;
			
			try {
				stmt = conexao.createStatement();
				stmt.executeUpdate(update.inserirEndereco(consumidor.getEndereco().getLogradouro(), consumidor.getEndereco().getNumero(), 
						consumidor.getEndereco().getBairro(), consumidor.getEndereco().getComplemento(), consumidor.getEndereco().getCep(), 
						consumidor.getEndereco().getCidade(), consumidor.getEndereco().getEstado()));
				
				resultado = stmt.executeQuery(select.selecionarIdEndereco(consumidor.getEndereco().getNumero(), consumidor.getEndereco().getCep(), 
						consumidor.getEndereco().getCidade()));
				
				stmt.executeUpdate(update.inserirConsumidor(consumidor.getCpfConsumidor(), consumidor.getEmail(), consumidor.getSenha(), consumidor.getNomeCompleto(), 
						consumidor.getTelefone(), consumidor.getCelular(), consumidor.getTipoPerfil(), Integer.parseInt(resultado.getString("id"))));
				
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				System.out.println("Erro em cadastrar consumidor: "+ e.getMessage());
			}
		}
		else if(req.equals("cadastroAnunciante")){
			
		}
		else{
			
		}
	}
}
