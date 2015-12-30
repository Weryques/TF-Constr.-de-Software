package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.mercadofacil.jdbc.ConexaoBD;
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
			
			consumidor.setCpfConsumidor(req.getParameter("cpf"));
			consumidor.setNomeCompleto(req.getParameter("nomeCompleto"));
			consumidor.setEmail(req.getParameter("email"));
			consumidor.setTelefone(req.getParameter("telefone"));
			consumidor.setCelular(req.getParameter("celular"));
			consumidor.setTipoPerfil("tipoPerfil");
			consumidor.setSenha(req.getParameter("senha"));
			
			UpdateBD update = new UpdateBD();
			
			
			
			try {
				conexao.close();
			} catch (SQLException e) {
				System.out.println("Erro em cadastrar consumidor: "+ e.getMessage());
			}
		}
		else if(req.equals("cadastroComerciante")){
			
		}
		else if(req.equals("cadastroAnunciante")){
			
		}
		else{
			
		}
	}
}
