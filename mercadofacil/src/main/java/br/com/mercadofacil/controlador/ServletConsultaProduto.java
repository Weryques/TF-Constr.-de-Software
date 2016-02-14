package br.com.mercadofacil.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercadofacil.jdbc.ProdutoDAO;
import br.com.mercadofacil.modelo.Produto;

@WebServlet(value = "/consultarproduto")
public class ServletConsultaProduto extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String categoria = req.getParameter("categoria");
		
		
		if(categoria == null){
			
		}
		else{
			recuperarListaDeProdutos(req, res, categoria);
		}
	}

	/**
	 * @param req
	 * @param res
	 * @param categoria
	 * @param produtoDAO
	 * @param listaDeProdutos
	 * @throws ServletException
	 * @throws IOException
	 */
	private void recuperarListaDeProdutos(HttpServletRequest req, HttpServletResponse res, String categoria) throws ServletException, IOException {
		
		ProdutoDAO produtoDAO=new ProdutoDAO();
		ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		try {
			listaDeProdutos = produtoDAO.getLista(categoria);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		req.setAttribute("ListaDeProdutos", listaDeProdutos);	
			req.setAttribute("ListaDeProdutos",listaDeProdutos);
			RequestDispatcher  view  = req.getRequestDispatcher("pessoajuridica/pages/listaproduto.jsp");
			view.forward(req, res);
			
	}	
}