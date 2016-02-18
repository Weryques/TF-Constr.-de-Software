<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.com.mercadofacil.modelo.Comerciante" %>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>Cadastro de Supermercado</title>

    <!-- Bootstrap CSS -->    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
	<link href="assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link rel="stylesheet" href="css/owl.carousel.css" type="text/css">
	<link href="css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link rel="stylesheet" href="css/fullcalendar.css">
	<link href="css/widgets.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />
	<link href="css/xcharts.min.css" rel=" stylesheet">	
	<link href="css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->
    <style type="text/css">
  
    </style>
  </head>

  <body >
 <%
	//Comerciante comerciante = (Comerciante) session.getAttribute("comerciante");
%>
  <!-- container section start -->
  <section id="container" class="" >      
      <header class="header dark-bg" >
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
            </div>

            <!--logo start-->
            <a href="principal.jsp" class="logo">Mercado <span class="lite">Fácil</span></a>
            <!--logo end-->

            <div class="top-nav notification-row">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">                                                            
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="img/avatar1_small.jpg">
                            </span>
                            <span class="username"> <%// out.print(comerciante.getNomeCompleto()); %></span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="paginacomerciante.jsp"><i class="icon_profile"></i> Meu perfil</a>
                            </li>
                            <li>
                                <a href="../404"><i class="icon_mail_alt"></i> Minhas mensagens</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_key_alt"></i> Sair</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> Documentação</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->

      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li class="">
                      <a class="" href="principal.jsp">
                          <i class="icon_house_alt"></i>
                          <span>Principal</span>
                      </a>
                  </li>          
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      
      <!--main content start-->
      <section id="main-content" >
          <section class="wrapper">            
              <!--overview start-->
               <div class="col-lg-12">
							<h3 class="page-header"><i class="fa fa-cubes" style="color: #53777A;" ></i> Cadastrar Supermercado</h3>
						</div>
            <div class="row" >
				<div class="col-lg-12 col-md-3 col-sm-12 col-xs-12 fundo" >
					
				</div>	
			</div><!--/.row-->
          </section>
          
          <div class="row">                                          
               <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">                                      
                  
                </div>
                
                  <div class="row" >
				<div class="col-lg-5 col-md-3 col-sm-12 col-xs-12" >
					<div class="info-box" style="background-color: #53777A;">
					
					  <div class="row">
                
					<div class="col-md-12">
						<form  role="form" name="Cadastrosupermercado" action="">
							<div class="form-group col-md-12">
								<label for="NomeFantasia"> Nome Fantasia: </label> <input
									type="text" class="form-control" name="NomeFantasia" required>
							</div>
							<div class="form-group col-md-12">

								<label for="RazaoSocial"> Razão Social: </label> <input
									type="text" class="form-control" name="RazaoSocial" required>
							</div>
	
							<div class="col-md-12">
								<button type="submit" name="opcao" value="Salvar"class="btn btn-outline btn-primary btn-sm ">Salvar</button>
								<button type="reset"class="btn btn-outline btn-warning  btn-sm">Limpar</button>
							</div>
					
						</form>
					</div>
				</div>
					
											
					</div><!--/.col-->
				</div>	
			</div><!--/.row-->
              
                
                
          </div> 
          
            
      </section>
      <!--main content end-->
  </section>
  
  <!-- container section start -->

    <!-- javascripts -->
    <script src="js/jquery.js"></script>
	<script src="js/jquery-ui-1.10.4.min.js"></script>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="js/jquery.scrollTo.min.js"></script>
    <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- custom select -->
    <script src="js/jquery.customSelect.min.js" ></script>
	<script src="assets/chart-master/Chart.js"></script>
   
    <!--custome script for all page-->
    <script src="js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="js/sparkline-chart.js"></script>
    <script src="js/easy-pie-chart.js"></script>
	<script src="js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="js/xcharts.min.js"></script>
	<script src="js/jquery.autosize.min.js"></script>
	<script src="js/jquery.placeholder.min.js"></script>
	<script src="js/gdp-data.js"></script>	
	<script src="js/morris.min.js"></script>
	<script src="js/sparklines.js"></script>	
	<script src="js/charts.js"></script>
	<script src="js/jquery.slimscroll.min.js"></script>
  <script>

      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
  </script>

  </body>
</html>