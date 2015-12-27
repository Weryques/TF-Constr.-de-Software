package br.com.mercadofacil.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author weryquessantos
 *
 */
@WebServlet(value = "/conexao")
public class ConexaoBD extends HttpServlet{ 
	
	private Connection conexao;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		conectar();
	}
	
	private void conectar(){
		BancoEmbarcado derby = new BancoEmbarcado();
		
		//derby.criarBanco();
		
		String url = "jdbc:derby:bdmercadofacil";
		Connection conexao;
		
		try {
			conexao = DriverManager.getConnection(url);
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			System.out.println(e.getSQLState());
		}
	}
}
