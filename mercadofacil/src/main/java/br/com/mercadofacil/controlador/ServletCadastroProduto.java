package br.com.mercadofacil.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.portable.ValueOutputStream;

import com.mysql.fabric.xmlrpc.base.Value;

import br.com.mercadofacil.jdbc.ProdutoDAO;
import br.com.mercadofacil.modelo.Produto;

@WebServlet(value = "/cadastrarproduto")
public class ServletCadastroProduto extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Produto produto = new Produto();
		produto.setNome(req.getParameter("NomeProduto"));
		produto.setValor(Double.parseDouble(req.getParameter("PrecoDeVendaProduto")));
		produto.setCategoria(req.getParameter("Categoria"));
		produto.setDescricao(req.getParameter("descricao"));
		produto.setQuantidade(Integer.parseInt(req.getParameter("quantidade")));
		// produto.setImagem(req.getParameter("imagem"));
		//produto.setCnpjAnunciante(req.getParameter("cnpjAnunciante"));
		//produto.setEmailAnunciante(req.getParameter("emailAnunciante"));
		//produto.setRazaoSocialAnunciante(req.getParameter("razaoSocialAnunciante"));
		//produto.setNomeFantasiaSupermercado(req.getParameter("nomeFantasiaSupermercado"));
	
		ProdutoDAO produtoD = new ProdutoDAO();
		produtoD.inseriProduto(produto);
		res.sendRedirect("pessoajuridica/pages/cadastroproduto.jsp");

	}
}
