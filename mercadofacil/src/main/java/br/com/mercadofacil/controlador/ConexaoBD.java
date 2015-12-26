package br.com.mercadofacil.controlador;

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
		String url = "jdbc:mysql://localhost:3306/";
		String nomeBD = "mercadofacil";
		String usuario = "root";
		String senha = "";
		
		try {
			conexao = DriverManager.getConnection(url + nomeBD, usuario, senha);
			System.out.println("A conexão com o banco de dados ocorreu com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() +"\n"+ e.getSQLState());
	
		}
	}
}
