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

import br.com.mercadofacil.jdbc.ProdutoDAO;
import br.com.mercadofacil.modelo.Produto;

@WebServlet(value = "/consultarproduto")
public class ServletConsultaProduto extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String opcao = req.getParameter("opcao");
		
		ProdutoDAO pd=new ProdutoDAO();
		ArrayList<Produto> ListaDeProdutos = new ArrayList();
		try {
			ListaDeProdutos=pd.getLista(opcao);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int tam= ListaDeProdutos.size(),i;
			
			//req.getRequestDispatcher("admin/pages/cadastroProdutos.jsp").forward(req, res);
			RequestDispatcher  view  = req.getRequestDispatcher("admin/pages/login.jsp");
			view.forward(req, res);
			view.forward(req, res);
			
	}
}
