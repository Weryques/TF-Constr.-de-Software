/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-02-14 01:14:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.comerciante;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"Creative - Bootstrap 3 Responsive Admin Template\">\r\n");
      out.write("    <meta name=\"author\" content=\"GeeksLabs\">\r\n");
      out.write("    <meta name=\"keyword\" content=\"Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.png\">\r\n");
      out.write("\r\n");
      out.write("    <title>Principal</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->    \r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- bootstrap theme -->\r\n");
      out.write("    <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--external css-->\r\n");
      out.write("    <!-- font icon -->\r\n");
      out.write("    <link href=\"css/elegant-icons-style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" />    \r\n");
      out.write("    <!-- full calendar css-->\r\n");
      out.write("    <link href=\"assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"assets/fullcalendar/fullcalendar/fullcalendar.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- easy pie chart-->\r\n");
      out.write("    <link href=\"assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("    <!-- owl carousel -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\" type=\"text/css\">\r\n");
      out.write("\t<link href=\"css/jquery-jvectormap-1.2.2.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom styles -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/fullcalendar.css\">\r\n");
      out.write("\t<link href=\"css/widgets.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style-responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"css/xcharts.min.css\" rel=\" stylesheet\">\t\r\n");
      out.write("\t<link href=\"css/jquery-ui-1.10.4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("      <script src=\"js/lte-ie7.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("  <!-- container section start -->\r\n");
      out.write("  <section id=\"container\" class=\"\">\r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("      <header class=\"header dark-bg\">\r\n");
      out.write("            <div class=\"toggle-nav\">\r\n");
      out.write("                <div class=\"icon-reorder tooltips\" data-original-title=\"Toggle Navigation\" data-placement=\"bottom\"><i class=\"icon_menu\"></i></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--logo start-->\r\n");
      out.write("            <a href=\"principal.jsp\" class=\"logo\">Mercado <span class=\"lite\">Fácil</span></a>\r\n");
      out.write("            <!--logo end-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"top-nav notification-row\">                \r\n");
      out.write("                <!-- notificatoin dropdown start-->\r\n");
      out.write("                <ul class=\"nav pull-right top-menu\">                                                            \r\n");
      out.write("                    <!-- user login dropdown start-->\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">\r\n");
      out.write("                            <span class=\"profile-ava\">\r\n");
      out.write("                                <img alt=\"\" src=\"img/avatar1_small.jpg\">\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <span class=\"username\">Pegar nome da sessão</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu extended logout\">\r\n");
      out.write("                            <div class=\"log-arrow-up\"></div>\r\n");
      out.write("                            <li class=\"eborder-top\">\r\n");
      out.write("                                <a href=\"paginacomerciante.jsp\"><i class=\"icon_profile\"></i> Meu perfil</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"../404\"><i class=\"icon_mail_alt\"></i> Minhas mensagens</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\"><i class=\"icon_key_alt\"></i> Sair</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"documentation.html\"><i class=\"icon_key_alt\"></i> Documentação</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- user login dropdown end -->\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- notificatoin dropdown end-->\r\n");
      out.write("            </div>\r\n");
      out.write("      </header>      \r\n");
      out.write("      <!--header end-->\r\n");
      out.write("\r\n");
      out.write("      <!--sidebar start-->\r\n");
      out.write("      <aside>\r\n");
      out.write("          <div id=\"sidebar\"  class=\"nav-collapse \">\r\n");
      out.write("              <!-- sidebar menu start-->\r\n");
      out.write("              <ul class=\"sidebar-menu\">                \r\n");
      out.write("                  <li class=\"active\">\r\n");
      out.write("                      <a class=\"\" href=\"principal.jsp\">\r\n");
      out.write("                          <i class=\"icon_house_alt\"></i>\r\n");
      out.write("                          <span>Principal</span>\r\n");
      out.write("                      </a>\r\n");
      out.write("                  </li>  \r\n");
      out.write("              </ul>\r\n");
      out.write("              <!-- sidebar menu end-->\r\n");
      out.write("          </div>\r\n");
      out.write("      </aside>\r\n");
      out.write("      <!--sidebar end-->\r\n");
      out.write("      \r\n");
      out.write("      <!--main content start-->\r\n");
      out.write("      <section id=\"main-content\">\r\n");
      out.write("          <section class=\"wrapper\">            \r\n");
      out.write("              <!--overview start-->\r\n");
      out.write("\t\t\t  <div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<h3 class=\"page-header\"><i class=\"fa fa-laptop\"></i> Principal</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("              \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box brown-bg\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"count\">7.538</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"title\">Vendidos</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div><!--/.info-box-->\t\t\t\r\n");
      out.write("\t\t\t\t</div><!--/.col-->\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info-box green-bg\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-cubes\"></i>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"count\">1.426</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"title\">Estoque</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div><!--/.info-box-->\t\t\t\r\n");
      out.write("\t\t\t\t</div><!--/.col-->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div><!--/.row-->\r\n");
      out.write("          </section>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"row\">                                          \r\n");
      out.write("               <div class=\"col-lg-3 col-md-3 col-sm-12 col-xs-12\">                                      \r\n");
      out.write("                   <div class=\"info-box\">\r\n");
      out.write("                        <span class=\"arrow\"></span>\r\n");
      out.write("                            <div class=\"\">\r\n");
      out.write("                            \t<a href=\"../pessoajuridica/pages/listarproduto.jsp\" class=\"btn btn-info\" role=\"button\">Ver supermercados cadastrados</a>\r\n");
      out.write("                            \t<a href=\"#\" class=\"btn btn-info\" role=\"button\">Cadastrar novo supermercado</a>\r\n");
      out.write("                            \t<a href=\"#\" class=\"btn btn-info\" role=\"button\">Ver produtos cadastrados</a>\r\n");
      out.write("                            \t<a href=\"#\" class=\"btn btn-default\" role=\"button\">Excluir supermercados</a>\r\n");
      out.write("                               \t<a href=\"../pessoajuridica/pages/cadastroproduto.jsp\" class=\"btn btn-info\" role=\"button\">Cadastrar produtos</a><br>\r\n");
      out.write("                               \t<a href=\"#\" class=\"btn btn-default\" role=\"button\">Excluir produtos</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                </div>\r\n");
      out.write("          </div>   \r\n");
      out.write("      </section>\r\n");
      out.write("      <!--main content end-->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- container section start -->\r\n");
      out.write("\r\n");
      out.write("    <!-- javascripts -->\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery-ui-1.10.4.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-ui-1.9.2.custom.min.js\"></script>\r\n");
      out.write("    <!-- bootstrap -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- nice scroll -->\r\n");
      out.write("    <script src=\"js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- charts scripts -->\r\n");
      out.write("    <script src=\"assets/jquery-knob/js/jquery.knob.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.sparkline.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.js\" ></script>\r\n");
      out.write("    <!-- jQuery full calendar -->\r\n");
      out.write("    <<script src=\"js/fullcalendar.min.js\"></script> <!-- Full Google Calendar - Calendar -->\r\n");
      out.write("\t<script src=\"assets/fullcalendar/fullcalendar/fullcalendar.js\"></script>\r\n");
      out.write("    <!--script for this page only-->\r\n");
      out.write("    <script src=\"js/calendar-custom.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.rateit.min.js\"></script>\r\n");
      out.write("    <!-- custom select -->\r\n");
      out.write("    <script src=\"js/jquery.customSelect.min.js\" ></script>\r\n");
      out.write("\t<script src=\"assets/chart-master/Chart.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("    <!--custome script for all page-->\r\n");
      out.write("    <script src=\"js/scripts.js\"></script>\r\n");
      out.write("    <!-- custom script for this page-->\r\n");
      out.write("    <script src=\"js/sparkline-chart.js\"></script>\r\n");
      out.write("    <script src=\"js/easy-pie-chart.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("\t<script src=\"js/xcharts.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.autosize.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.placeholder.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/gdp-data.js\"></script>\t\r\n");
      out.write("\t<script src=\"js/morris.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/sparklines.js\"></script>\t\r\n");
      out.write("\t<script src=\"js/charts.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("\r\n");
      out.write("      //knob\r\n");
      out.write("      $(function() {\r\n");
      out.write("        $(\".knob\").knob({\r\n");
      out.write("          'draw' : function () { \r\n");
      out.write("            $(this.i).val(this.cv + '%')\r\n");
      out.write("          }\r\n");
      out.write("        })\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      //carousel\r\n");
      out.write("      $(document).ready(function() {\r\n");
      out.write("          $(\"#owl-slider\").owlCarousel({\r\n");
      out.write("              navigation : true,\r\n");
      out.write("              slideSpeed : 300,\r\n");
      out.write("              paginationSpeed : 400,\r\n");
      out.write("              singleItem : true\r\n");
      out.write("\r\n");
      out.write("          });\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      //custom select box\r\n");
      out.write("\r\n");
      out.write("      $(function(){\r\n");
      out.write("          $('select.styled').customSelect();\r\n");
      out.write("      });\r\n");
      out.write("\t  \r\n");
      out.write("\t  /* ---------- Map ---------- */\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t  $('#map').vectorMap({\r\n");
      out.write("\t    map: 'world_mill_en',\r\n");
      out.write("\t    series: {\r\n");
      out.write("\t      regions: [{\r\n");
      out.write("\t        values: gdpData,\r\n");
      out.write("\t        scale: ['#000', '#000'],\r\n");
      out.write("\t        normalizeFunction: 'polynomial'\r\n");
      out.write("\t      }]\r\n");
      out.write("\t    },\r\n");
      out.write("\t\tbackgroundColor: '#eef3f7',\r\n");
      out.write("\t    onLabelShow: function(e, el, code){\r\n");
      out.write("\t      el.html(el.html()+' (GDP - '+gdpData[code]+')');\r\n");
      out.write("\t    }\r\n");
      out.write("\t  });\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
