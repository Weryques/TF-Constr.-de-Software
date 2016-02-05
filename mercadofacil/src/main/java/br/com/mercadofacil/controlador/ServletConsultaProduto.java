package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

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

@WebServlet(value = "/consultarproduto")
public class ServletConsultaProduto extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String categoria = req.getParameter("categoria");
		ProdutoDAO produtoDao=new ProdutoDAO();
		ArrayList<Produto> ListaDeProdutos = new ArrayList<Produto>();
		try {
			ListaDeProdutos=produtoDao.getLista(categoria);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		req.setAttribute("ListaDeProdutos", ListaDeProdutos);	
			req.setAttribute("ListaDeProdutos",ListaDeProdutos);
			RequestDispatcher  view  = req.getRequestDispatcher("admin/pages/listar.jsp");
			view.forward(req, res);
	}
}