/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-02-14 01:58:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pessoajuridica.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paineladmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Comment-Type\" content=\"text/html; charset=\"utf-8\"\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<title>MF Admin - Admin</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link\n");
      out.write("\thref=\"../bower_components/bootstrap/dist/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- MetisMenu CSS -->\n");
      out.write("<link\n");
      out.write("\thref=\"../bower_components/metisMenu/dist/metisMenu.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link\n");
      out.write("\thref=\"../css/sb-admin-2.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link\n");
      out.write("\thref=\"../bower_components/font-awesome/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\t\t<!-- Navigation -->\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\"\n");
      out.write("\t\t\tstyle=\"margin-bottom: 0\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\".navbar-collapse\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand active\" href=\"admin/pages/painelAdmin.jsp\">Mercado\n");
      out.write("\t\t\t\t\tFácil</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-envelope fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-user fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User\n");
      out.write("\t\t\t\t\t\t\t\tProfile</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.jsp\"><i class=\"fa fa-sign-out fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tLogout</a></li>\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-user --></li>\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<!-- /.navbar-top-links -->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("\t\t\t\t<div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav\" id=\"side-menu\">\n");
      out.write("\t\t\t\t\t\t<li class=\"sidebar-search\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group custom-search-form\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</div> <!-- /input-group -->\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"paineladmin.jsp\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-dashboard fa-fw\"></i> Principal</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../../consultarproduto?categoria=Todos\"><i class=\"fa fa-table fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tListar</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"cadastroproduto.jsp\" class=\"active\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-edit fa-fw\"></i> Cadastro de Produtos</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-sitemap fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tCategorias<span class=\"fa arrow\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\n");
      out.write("\t\t\t\t\t\t\t\t<li ><a href=\"#\">Secos e Molhados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li ><a href=\"#\">Hortifruti</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li ><a href=\"#\">Mercearia</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li ><a href=\"#\">Utilidades</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li ><a href=\"#\">Frios</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.sidebar-collapse -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.navbar-static-side -->\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t<!-- Page Content -->\n");
      out.write("\t\t<div id=\"page-wrapper\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t\t\t<h1 class=\"page-header\">Painel Administrativo</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /.col-lg-12 -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.row -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- weliton  -->\n");
      out.write("\t\t\t\t<!-- /.row -->\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-primary\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-comments fa-5x\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"huge\">26</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Novos Comentários!</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">View Details</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-green\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-tasks fa-5x\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"huge\">12</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Novas Tarefas!</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">View Details</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-yellow\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-shopping-cart fa-5x\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"huge\">124</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Novas Vendas!</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">View Details</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-red\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-support fa-5x\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-9 text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"huge\">13</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Vale Brinde!</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"pull-left\">View Details</span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.container-fluid -->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /#wrapper -->\n");
      out.write("\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"../bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"../bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Metis Menu Plugin JavaScript -->\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"../bower_components/metisMenu/dist/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Custom Theme JavaScript -->\n");
      out.write("\t<script src=\"../js/sb-admin-2.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
