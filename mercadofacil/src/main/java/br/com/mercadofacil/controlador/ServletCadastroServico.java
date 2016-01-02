package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.mercadofacil.jdbc.ConexaoBD;
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
			
			
		}
		else{
			req.getRequestDispatcher("visao/alguma página").forward(req, res);
		}
	}
}
