package br.com.mercadofacil.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import br.com.mercadofacil.Dao.ProdutoDao;
import br.com.mercadofacil.modelo.Produto;

@WebServlet(value = "/cadastrarproduto")
public class ServletCadastroProduto extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
			
			
			Produto produto = new Produto();			
			produto.setNome(req.getParameter("NomeProduto"));			
			produto.setValorDeCompra(Double.parseDouble(req.getParameter("PrecoDeCompraProduto")));
			produto.setValorDeVenda(Double.parseDouble((req.getParameter("PrecoDeVendaProduto"))));
			produto.setCategoria(req.getParameter("Categoria"));
			produto.setDescricao(req.getParameter("descricao"));
			produto.setImagem(req.getParameter("imagem"));
			produto.setCnpjAnunciante(req.getParameter("cnpjAnunciante"));
			produto.setCnpjSupermercado(req.getParameter("cnpjSupermercado"));

			ProdutoDao produtoD=new ProdutoDao();
			produtoD.InseriProduto(produto);
	
		
			req.getRequestDispatcher("admin/pages/cadastroProdutos.jsp").forward(req, res);
			
		
	}
}
