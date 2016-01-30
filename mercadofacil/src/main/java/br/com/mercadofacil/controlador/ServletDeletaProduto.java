package br.com.mercadofacil.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.com.mercadofacil.jdbc.ProdutoDAO;
import br.com.mercadofacil.modelo.Produto;

@WebServlet(value = "/deletarproduto")
public class ServletDeletaProduto extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
			//Produto produto = new Produto();			
			//produto.setNome(req.getParameter("NomeProduto"));			
		
			
			// ProdutoDAO produtoD=new ProdutoDAO();
			// produtoD.InseriProduto(produto);
			 
			
			
			//req.getRequestDispatcher("admin/pages/cadastroProdutos.jsp").forward(req, res);
			RequestDispatcher  view  = req.getRequestDispatcher("admin/pages/listar.jsp");
			view.forward(req, res);
			
	}
}
