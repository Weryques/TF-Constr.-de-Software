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

@WebServlet(value = "/cadastrarproduto")
public class ServletCadastroProduto extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		Produto produto = new Produto();
		produto.setNome(req.getParameter("NomeProduto"));
		produto.setValor(Double.parseDouble(req.getParameter("PrecoDeCompraProduto")));
		produto.setCategoria(req.getParameter("Categoria"));
		produto.setDescricao(req.getParameter("descricao"));
		// produto.setImagem(req.getParameter("imagem"));
		produto.setCnpjAnunciante(req.getParameter("cnpjAnunciante"));
		produto.setEmailAnunciante(req.getParameter("emailAnunciante"));
		produto.setRazaoSocialAnunciante(req.getParameter("razaoSocialAnunciante"));
		produto.setNomeFantasiaSupermercado(req.getParameter("nomeFantasiaSupermercado"));

		ProdutoDAO produtoD = new ProdutoDAO();
		produtoD.InseriProduto(produto);

		// req.getRequestDispatcher("admin/pages/cadastroProdutos.jsp").forward(req,
		// res);
		RequestDispatcher view = req.getRequestDispatcher("admin/pages/cadastroProdutos.jsp");
		view.forward(req, res);
		view.forward(req, res);

	}
}
