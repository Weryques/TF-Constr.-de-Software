/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-01-26 05:14:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroProdutos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"Comment-Type\" content=\"text/html; charset=\"utf-8\"\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<title>MF Admin - Cadastro</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"http://localhost:8080/mercadofacil/admin/bower_components/bootstrap/dist/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- MetisMenu CSS -->\n");
      out.write("<link href=\"http://localhost:8080/mercadofacil/admin/bower_components/metisMenu/dist/metisMenu.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom CSS -->\n");
      out.write("<link href=\"http://localhost:8080/mercadofacil/admin/dist/css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"http://localhost:8080/mercadofacil/admin/bower_components/font-awesome/css/font-awesome.min.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("<style type=\"text/css\">\n");
      out.write("</style>\n");
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
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"painelAdmin.jsp\">Mercado Fácil /\n");
      out.write("\t\t\t\t\tAdmin v1.0</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /.navbar-header -->\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-envelope fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-messages\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>John Smith</strong> <span class=\"pull-right text-muted\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>Yesterday</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div>Lorem ipsum dolor sit amet, consectetur adipiscing\n");
      out.write("\t\t\t\t\t\t\t\t\telit. Pellentesque eleifend...</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>John Smith</strong> <span class=\"pull-right text-muted\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>Yesterday</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div>Lorem ipsum dolor sit amet, consectetur adipiscing\n");
      out.write("\t\t\t\t\t\t\t\t\telit. Pellentesque eleifend...</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>John Smith</strong> <span class=\"pull-right text-muted\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>Yesterday</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div>Lorem ipsum dolor sit amet, consectetur adipiscing\n");
      out.write("\t\t\t\t\t\t\t\t\telit. Pellentesque eleifend...</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"text-center\" href=\"#\"> <strong>Read\n");
      out.write("\t\t\t\t\t\t\t\t\tAll Messages</strong> <i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-messages --></li>\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-tasks fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-tasks\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>Task 1</strong> <span class=\"pull-right text-muted\">40%\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tComplete</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-success\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trole=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuemax=\"100\" style=\"width: 40%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">40% Complete (success)</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>Task 2</strong> <span class=\"pull-right text-muted\">20%\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tComplete</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-info\" role=\"progressbar\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 20%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">20% Complete</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>Task 3</strong> <span class=\"pull-right text-muted\">60%\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tComplete</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-warning\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trole=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuemax=\"100\" style=\"width: 60%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">60% Complete (warning)</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>Task 4</strong> <span class=\"pull-right text-muted\">80%\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tComplete</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-danger\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trole=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">80% Complete (danger)</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"text-center\" href=\"#\"> <strong>See\n");
      out.write("\t\t\t\t\t\t\t\t\tAll Tasks</strong> <i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-tasks --></li>\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-bell fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-comment fa-fw\"></i> New Comment <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">12 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope fa-fw\"></i> Message Sent <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-tasks fa-fw\"></i> New Task <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-upload fa-fw\"></i> Server Rebooted <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">4 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"text-center\" href=\"#\"> <strong>See\n");
      out.write("\t\t\t\t\t\t\t\t\tAll Alerts</strong> <i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-alerts --></li>\n");
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
      out.write("\t\t\t\t\t\t<li><a href=\"painelAdmin.jsp\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-dashboard fa-fw\"></i> Dashboard</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tControle Financeiro<span class=\"fa arrow\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> Graficos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> Tabelas</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listar.jsp\"><i class=\"fa fa-table fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tListar</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"cadastroProdutos.jsp\" class=\"active\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-edit fa-fw\"></i> Cadastro de Produtos</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-wrench fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tConfigurações<span class=\"fa arrow\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> Promoções</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> Anúncios</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> Conta</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-sitemap fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tCategorias<span class=\"fa arrow\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Secos e Molhados</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Hortifruti</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Mercearia</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Utilidades</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Frios</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-files-o fa-fw\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tPaginas<span class=\"fa arrow\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"../../visao/home.jsp\"> Ir para loja</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.jsp\"> Logout</a></li>\n");
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
      out.write("\t\t\t\t\t\t<h2 class=\"page-header text-primary\">Cadastro de Produtos</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- /.col-lg-12 -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- /.row -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- weliton  -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<form role=\"form\" name=\"CadastroProdutos\"\n");
      out.write("\t\t\t\t\t\t\taction=\"../../cadastrarproduto\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"NomeProduto\"> Nome do Produto </label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"NomeProduto\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-2\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"PrecoDeCompraProduto\"> Preço de Compra </label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"Number\" class=\"form-control\" name=\"PrecoDeCompraProduto\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-2\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"PrecoDeVendaProduto\"> Preço de Venda </label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"Number\" class=\"form-control\" name=\"PrecoDeVendaProduto\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"quantidade\"> Quantidade </label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"Number\" class=\"form-control\" name=\"PrecoDeCompraProduto\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"sel1\">Categoria:</label> <select\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control\" name=\"Categoria\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>---Nenhum---</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Secos e Molhados</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Frios</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Hortifruti</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Mercearia</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Utilidades</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"NomeProduto\"> CNPJ/CPF Comerciante </label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"cnpjAnunciante\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"NomeProduto\"> CNPJ/CPF Anunciante </label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\" name=\"cnpjSupermercado\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"exampleInputFile\"> Imagem </label> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"file\" name=\"imagem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"help-block\">Escolha uma imagem para o Produto.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"descricao\"> Descrição </label>\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control \" rows=\"3\" name=\"descricao\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-outline btn-primary btn-lg \">Salvar</button>\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-outline btn-warning  btn-lg\">Limpar</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- weliton -->\n");
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
      out.write("\t<script src=\"http://localhost:8080/mercadofacil/admin/bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap Core JavaScript -->\n");
      out.write("\t<script src=\"http://localhost:8080/mercadofacil/admin/bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Metis Menu Plugin JavaScript -->\n");
      out.write("\t<script src=\"http://localhost:8080/mercadofacil/admin/bower_components/metisMenu/dist/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Custom Theme JavaScript -->\n");
      out.write("\t<script src=\"http://localhost:8080/mercadofacil/admin/dist/js/sb-admin-2.js\"></script>\n");
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
