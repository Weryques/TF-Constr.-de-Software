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

@WebServlet(value = "/cadastrar")
public class ServletCadastro extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		if(req == null){
			req.getRequestDispatcher("visao/cadastro").forward(req, res);
		}
		else if(req.equals("cadastroCliente")){
			ConexaoBD conn = new ConexaoBD();
			Connection conexao;
			
			conexao = conn.conectar();
			
			try {
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
