/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-02-17 21:49:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.supermercadounico;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.mercadofacil.modelo.Consumidor;
import br.com.mercadofacil.modelo.Produto;
import br.com.mercadofacil.jdbc.ProdutoDAO;
import java.util.ArrayList;

public final class supermercadounico_005fhome_005flogado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--A Design by W3layouts \n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<head>\n");
      out.write("<title>Supermercado Único - Logado</title>\n");
      out.write("<link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"../js/jquery.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"../css/styleHomeLoginCarrinho.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Food shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Rokkitt:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lobster+Two:400,400italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//fonts-->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/easing.js\"></script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");

Consumidor consumidor = (Consumidor) session.getAttribute("consumidor");

      out.write("\n");
      out.write("\t<!--header-->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"supermercadounico_home.jsp\">Supermercado Único</a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t\t<div class=\"header-top-in\">\n");
      out.write("\t\t\t\t\t<ul class=\"header-grid\">\n");
      out.write("\t\t\t\t\t\t<li  ><a href=\"supermercadounico_paginapessoafisica.jsp\">Minha conta   </a> <label>/</label></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul class=\"grid-header\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" class=\"glyphicon glyphicon-user\"><span >");
 out.print(consumidor.getNomeCompleto()); 
      out.write("</span></a><label>/</label></li>\n");
      out.write("       \t\t\t \t<li><a href=\"carrinhocompras.jsp\" class=\"glyphicon glyphicon-shopping-cart\"><span ></span>Carrinho </a><label>/</label></li>\n");
      out.write("       \t\t\t \t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!---->\n");
      out.write("\t\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t\t\t<div class=\"top-nav\">\n");
      out.write("\t\t\t\t\t<span class=\"menu\"> </span>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"active\" ><a href=\"supermercadounico_home.jsp\" >Home  </a><label>- </label> </li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<!--script-->\n");
      out.write("\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t$(\"span.menu\").click(function(){\n");
      out.write("\t\t\t\t\t\t$(\".top-nav ul\").slideToggle(500, function(){\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"Procurar aqui...\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '';}\" >\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!---->\n");
      out.write("\t<div class=\"banner\">\n");
      out.write("\t\t<div class=\"banner-in\">\n");
      out.write("\t\t<!---->\n");
      out.write("\t\t<div class=\"wmuSlider example1\">\n");
      out.write("\t\t\t   <div class=\"wmuSliderWrapper\">\n");
      out.write("\t\t\t\t<article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t\t   \t<div class=\"banner-wrap\">\n");
      out.write("\t\t\t\t   \t      <h2>Café </h2>\n");
      out.write("\t\t\t\t\t\t  <h5>--</h5>\n");
      out.write("\t\t\t\t\t\t  <p>-- <span>--</span></p>\t\t\t\t   \t\t \n");
      out.write("\t\t\t\t   \t </div>\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t <article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t\t   \t<div class=\"banner-wrap\">\n");
      out.write("\t\t\t\t\t  \t\t<h2>Café </h2>\n");
      out.write("\t\t\t\t\t\t  <h5>--</h5>\n");
      out.write("\t\t\t\t\t\t  <p>-- <span>--</span></p>\n");
      out.write("\t\t\t\t   \t\t \n");
      out.write("\t\t\t\t   \t </div>\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t <article style=\"position: absolute; width: 100%; opacity: 0;\"> \n");
      out.write("\t\t\t\t   \t<div class=\"banner-wrap\">\n");
      out.write("\t\t\t\t   \t       <h2>Café </h2>\n");
      out.write("\t\t\t\t\t\t  <h5>--</h5>\n");
      out.write("\t\t\t\t\t\t  <p>-- <span>--</span></p>\n");
      out.write("\t\t\t\t   \t\t \n");
      out.write("\t\t\t\t   \t </div>\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!---->\n");
      out.write("\t\t  <script src=\"../js/jquery.wmuSlider.js\"></script> \n");
      out.write("\t\t\t  <script>\n");
      out.write("       \t\t\t$('.example1').wmuSlider({\n");
      out.write("\t\t\t\t\t pagination : false,\n");
      out.write("\t\t\t\t});         \n");
      out.write("   \t\t     </script> \t\n");
      out.write("\t\t<!---->\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!---->\n");
      out.write("\t<div class=\"content\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t<div class=\"col-md-4 grid-food\">\n");
      out.write("\t\t\t\t<div class=\"popular\">\n");
      out.write("\t\t\t\t<h3>Produtos populares</h3>\n");
      out.write("\t\t\t\t<p>Produtos mais procurados</p>\n");
      out.write("\t\t\t\t<ul class=\"popular-in\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i> </i>--</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i> </i>--</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i> </i>--</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i> </i>--</a></li>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"popular phone\">\n");
      out.write("\t\t\t\t\t<h3>E-mail/Telefone</h3>\n");
      out.write("\t\t\t\t\t<p>Contate-nos</p>\n");
      out.write("\t\t\t\t\t<ul class=\"number\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"mailto:superunico@servidor.com\"><i class=\"mail\"> </i>superunico@servidor.com </a></li>\t\n");
      out.write("\t\t\t\t\t\t<li><span><i> </i>(00) 0000-0000 </span></li>\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!---->\n");
      out.write("\t\t\t\t");

					//ArrayList<Produto> ListaDeProdutos = new ArrayList();
					ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
					ProdutoDAO produtoDAO = new ProdutoDAO();
					listaDeProdutos = produtoDAO.getLista("Todos");
					//ArrayList<Produto> listaDeProdutos = (ArrayList) request.getAttribute("ListaDeProdutos");
					int tamanhoDaLista = listaDeProdutos.size();
					//System.out.println("tamanho da lista "+ListaDeProdutos.size());
				
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-8 food-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"cup\">\n");
      out.write("\t\t\t\t\t\t");

							if (listaDeProdutos.size() == 0) {
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-10 cup-in\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"../images/opsNenhumProdutoCadastrado.jpg\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"img-responsive\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Desculpe, Mas Não Encontramos Nenhum Produto Cadastrado</p>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"dollar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t");
 
							} else {

								for (int i = 0; i < listaDeProdutos.size(); i++) {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"produto\" class=\"col-md-5 cup-in\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"> <img src=\"../images/p1.jpg\" class=\"img-responsive\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"nomeProduto\"  value=\"");
out.print(listaDeProdutos.get(i).getNome());
      out.write("\"><br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"valorProduto\" value=\"R$ ");
out.print(listaDeProdutos.get(i).getValor());
      out.write("\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default col-md-10\">Comprar</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							}
						
      out.write("\n");
      out.write("\t\t\t\t\t\t");
	
						Produto produtoCarrinho = new Produto();
						ArrayList<Produto> produtosAddCarrinho = new ArrayList<Produto>();
						
						try{
							String nomeProduto = request.getParameter("nomeProduto");
							Double valorProduto = Double.parseDouble(request.getParameter("valorProduto"));
							
							produtoCarrinho.setNome(nomeProduto);
							produtoCarrinho.setValor(valorProduto);
						
							produtosAddCarrinho.add(produtoCarrinho);
							
							session.setAttribute("produtosAddCarrinho", produtosAddCarrinho);
						}
						catch(Exception e){
							e.printStackTrace();
							System.out.println(e.getMessage());
						}

						
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!---->\n");
      out.write("\t\t\t\t\t<div class=\"browse\">\n");
      out.write("\t\t\t\t\t\t<p class=\"vit\">\n");
      out.write("\t\t\t\t\t\t\tProcurar mais <span>...</span>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"more\">Procurar</a>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!---->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!---->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-8 footer-bottom \">\n");
      out.write("\t\t<p class=\"footer-grid\">Copyright &copy; 2015 Food shop Template by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<script src=\"../js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../js/scripts.js\"></script>\n");
      out.write("\t <script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\t\t  \t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\t\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\t\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t\t \t\t};\n");
      out.write("\t\t\t\t\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Adicionar na sessão e incrementar contador -->\t\t\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
