/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-02-18 04:45:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.supermercadounico;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.mercadofacil.modelo.Consumidor;

public final class supermercadounico_005fpaginapessoafisica_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--A Design by W3layouts \n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("<title>Supermercado Único</title>\n");
      out.write("<link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"../css/styleHomeLoginCarrinho.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
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
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
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
      out.write("<!--header-->\n");
      out.write("\t<div class=\"header-in\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"supermercadounico_home_logado.jsp\">Supermercado Único</a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t\t<div class=\"header-top-in\">\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul class=\"grid-header\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Meu carrinho</a> <label>/</label></li>\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!---->\n");
      out.write("\t\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t\t\t<div class=\"top-nav\">\n");
      out.write("\t\t\t\t\t<span class=\"menu\"> </span>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li  ><a href=\"supermercadounico_home_logado.jsp\" >Home  </a><label>- </label> </li>\n");
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
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!---->\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("                 <div class=\"col-lg-12\">\n");
      out.write("                    <section class=\"panel\">\n");
      out.write("                          <header class=\"panel-heading tab-bg-info\">\n");
      out.write("                              <ul class=\"nav nav-tabs\">\n");
      out.write("                                  <li>\n");
      out.write("                                      <a data-toggle=\"tab\" href=\"javascript:mudarEstado('profile')\">\n");
      out.write("                                          <i class=\"icon-user\"></i>\n");
      out.write("                                          Perfil\n");
      out.write("                                      </a>\n");
      out.write("                                  </li>\n");
      out.write("                                  <li class=\"\">\n");
      out.write("                                      <a data-toggle=\"tab\" href=\"javascript:mudarEstado('edit-profile')\">\n");
      out.write("                                          <i class=\"icon-envelope\"></i>\n");
      out.write("                                          Editar Perfil\n");
      out.write("                                      </a>\n");
      out.write("                                  </li>\n");
      out.write("                              </ul>\n");
      out.write("                          </header>\n");
      out.write("                          \n");
      out.write("                          <div class=\"panel-body\">\n");
      out.write("                             \n");
      out.write("                              <div class=\"tab-content pagination\">\n");
      out.write("                      \n");
      out.write("                              <!-- profile -->\n");
      out.write("                              <div id=\"profile\" class=\"tab-pane-active\">\n");
      out.write("                                    <section class=\"panel\">\n");
      out.write("                                      <div class=\"bio-graph-heading\">\n");
      out.write("                                                Sobre\n");
      out.write("                                      </div>\n");
      out.write("                                      <div class=\"panel-body bio-graph-info\">\n");
      out.write("                                          <h1>Dados do perfil</h1>\n");
      out.write("                                          <div class=\"row\">\n");
      out.write("                                              <div class=\"bio-row\">\n");
      out.write("                                                  <p><span>Nome completo</span>: ");
 out.print(consumidor.getNomeCompleto()); 
      out.write("</p>\n");
      out.write("                                              </div>\n");
      out.write("                                              <div class=\"bio-row\">\n");
      out.write("                                                  <p><span>Tipo do perfil </span>: ");
 out.print(consumidor.getTipoPerfil()); 
      out.write(" </p>\n");
      out.write("                                              </div>\n");
      out.write("                                              <div class=\"bio-row\">\n");
      out.write("                                                  <p><span>E-mail </span>: ");
 out.print(consumidor.getEmail()); 
      out.write("</p>\n");
      out.write("                                              </div>\n");
      out.write("                                              <div class=\"bio-row\">\n");
      out.write("                                                  <p><span>Celular </span>: ");
 out.print(consumidor.getCelular()); 
      out.write("</p>\n");
      out.write("                                              </div>\n");
      out.write("                                              <div class=\"bio-row\">\n");
      out.write("                                                  <p><span>Telefone </span>:  ");
 out.print(consumidor.getTelefone()); 
      out.write("</p>\n");
      out.write("                                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                                      </div>\n");
      out.write("                                    </section>\n");
      out.write("                                      <section>\n");
      out.write("                                          <div class=\"row\">                                              \n");
      out.write("                                          </div>\n");
      out.write("                                      </section>\n");
      out.write("                               </div>\n");
      out.write("                               \n");
      out.write("                               <!-- edit-profile -->\n");
      out.write("                                  <div id=\"edit-profile\" class=\"tab-pane\">\n");
      out.write("                                    <section class=\"panel\">  \n");
      out.write("                                    \n");
      out.write("                                    \t<div class=\"profile-activity\">                                          \n");
      out.write("                                          <div class=\"act-time\">                                      \n");
      out.write("                                              <div class=\"activity-body act-in\">\n");
      out.write("                                                  <span class=\"arrow\"></span>\n");
      out.write("                                                  <div class=\"text\">\n");
      out.write("                                                  \t<a href=\"#\" class=\"btn btn-default\" role=\"button\">Excluir conta</a>\n");
      out.write("                                                  </div>\n");
      out.write("                                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                                       </div>                                        \n");
      out.write("                                         \n");
      out.write("                                          <div class=\"panel-body bio-graph-info\">\n");
      out.write("                                              <h1>Infomações do perfil</h1>\n");
      out.write("                                              <form class=\"form-horizontal\" role=\"form\">                                                  \n");
      out.write("                                                  <div class=\"form-group\">\n");
      out.write("                                                      <label class=\"col-lg-2 control-label\">Nome completo</label>\n");
      out.write("                                                      <div class=\"col-lg-6\">\n");
      out.write("                                                          <input type=\"text\" class=\"form-control\" id=\"f-name\" placeholder=\" \">\n");
      out.write("                                                      </div>\n");
      out.write("                                                  </div>\n");
      out.write("                                                  <div class=\"form-group\">\n");
      out.write("                                                      <label class=\"col-lg-2 control-label\">Sobre</label>\n");
      out.write("                                                      <div class=\"col-lg-10\">\n");
      out.write("                                                          <textarea name=\"\" id=\"\" class=\"form-control\" cols=\"30\" rows=\"5\"></textarea>\n");
      out.write("                                                      </div>\n");
      out.write("                                                  </div>\n");
      out.write("                                                  <div class=\"form-group\">\n");
      out.write("                                                      <label class=\"col-lg-2 control-label\">E-mail</label>\n");
      out.write("                                                      <div class=\"col-lg-6\">\n");
      out.write("                                                          <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\" \">\n");
      out.write("                                                      </div>\n");
      out.write("                                                  </div>\n");
      out.write("                                                  <div class=\"form-group\">\n");
      out.write("                                                      <label class=\"col-lg-2 control-label\">Celular</label>\n");
      out.write("                                                      <div class=\"col-lg-6\">\n");
      out.write("                                                          <input type=\"text\" class=\"form-control\" id=\"mobile\" placeholder=\" \">\n");
      out.write("                                                      </div>\n");
      out.write("                                                  </div>\n");
      out.write("\n");
      out.write("                                                  <div class=\"form-group\">\n");
      out.write("                                                      <div class=\"col-lg-offset-2 col-lg-10\">\n");
      out.write("                                                          <button type=\"submit\" class=\"btn btn-primary\">Salvar</button>\n");
      out.write("                                                          <button type=\"reset\" class=\"btn btn-danger\">Cancelar</button>\n");
      out.write("                                                      </div>\n");
      out.write("                                                  </div>\n");
      out.write("                                              </form>\n");
      out.write("                                          </div>\n");
      out.write("                                      </section>\n");
      out.write("                                  </div>\n");
      out.write("                               </div>\n");
      out.write("                               \n");
      out.write("                              </div>\n");
      out.write("                          </section>\n");
      out.write("                       </div>\n");
      out.write("               </div>\n");
      out.write("\n");
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
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\tfunction mudarEstado(id){\n");
      out.write("\t\t\t\t\tvar display = document.getElementById(idForm).style.display;\n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t\tif(display == \"none\"){\n");
      out.write("\t\t\t\t        document.getElementById(id).style.display = 'block';\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t    else{\n");
      out.write("\t\t\t\t        document.getElementById(id).style.display = 'none';\n");
      out.write("\t\t\t\t    }\t\t\t\t\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t</script>\n");
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