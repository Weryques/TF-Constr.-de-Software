package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.mercadofacil.jdbc.ConexaoBD;
import br.com.mercadofacil.jdbc.UpdateBD;
import br.com.mercadofacil.modelo.Servico;

@WebServlet(value = "/cadastrarservico")
public class ServletCadastroServico extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		if(req == null){
			req.getRequestDispatcher("visao/alguma página").forward(req, res);
		}
		else if(req.equals("novoServico")){
			ConexaoBD conn = new ConexaoBD();
			Servico servico = new Servico();
			Connection conexao = null;
			
			conexao = conn.conectar();
			
			servico.setNome(req.getParameter("nome"));
			servico.setDescricao(req.getParameter("descricao"));
			servico.setCpnj(req.getParameter("cnpj"));
			servico.setEmail(req.getParameter("email"));
			servico.setRazaoAnunciante(req.getParameter("razaoSocial"));
			
			UpdateBD update = new UpdateBD();
			Statement stmt = null;
			
			//validar informações antes de gravar.
			
			try {
				stmt = conexao.createStatement();
				
				stmt.executeQuery(update.inserirServico(servico.getNome(), servico.getDescricao(), 
						servico.getCpnj(), servico.getEmail(), servico.getRazaoAnunciante()));
				
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				System.out.println("Erro em cadastrar serviço: "+ e.getMessage() +"\nCodigo do erro: "+ e.getErrorCode());
			}
		}
		else{
			req.getRequestDispatcher("visao/alguma página").forward(req, res);
		}
	}
}
