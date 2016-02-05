package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercadofacil.jdbc.ProdutoDAO;
import br.com.mercadofacil.modelo.Produto;

@WebServlet(value = "/deletarproduto")
public class ServletDeletaProduto extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//String url=req.getRequestURL();
		Produto produto = new Produto();
		produto.setId(Integer.parseInt( req.getParameter("id")));

		ProdutoDAO produtoD=new ProdutoDAO();
		try {
			produtoD.remove(produto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("consultarproduto");
	
	}	
	
}
