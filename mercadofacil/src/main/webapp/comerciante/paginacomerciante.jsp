<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Date"%>
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

    <title>Perfil</title>

    <!-- Bootstrap CSS -->    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="css/elegant-icons-style.css" rel="stylesheet" />
    <link href="css/font-awesome.min.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->
  </head>

  <body>  
<%
	Comerciante comerciante = (Comerciante) session.getAttribute("comerciante");
	Date date = new Date();
%>
  <!-- container section start -->
  <section id="container" class="">
      <!--header start-->
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
            </div>

            <!--logo start-->
            <a href="principal.jsp" class="logo">Mercado <span class="lite">Fácil</span></a>
            <!--logo end-->

            <div class="top-nav notification-row">                
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="img/avatar1_small.jpg">
                            </span>
                            <span class="username"><% out.print(comerciante.getNomeCompleto()); %></span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"> </div>
                            <li class="eborder-top">
                                <a href="#"><i class="icon_profile"></i> Meu Perfil</a>
                            </li>
                            <li>
                                <a href="#"><i class="icon_mail_alt"></i> Minhas Mensagens</a>
                            </li>
                            <li>
                                <a href="login.html"><i class="icon_key_alt"></i>Sair</a>
                            </li>
                            <li>
                                <a href="documentation.html"><i class="icon_key_alt"></i> Documentação </a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
            </div>
      </header>      
      <!--header end-->

      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  <li class="active">
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
      <section id="main-content">
          <section class="wrapper">
              <div class="row">
                <!-- profile-widget -->
                <div class="col-lg-12">
                    <div class="profile-widget profile-widget-info">
                          <div class="panel-body">
                            <div class="col-lg-2 col-sm-2">
                              <h4>Pegar nome do comerciante da sessão</h4>               
                              <div class="follow-ava">
                                  <img src="img/profile-widget-avatar.jpg" alt="">
                              </div>
                              <h6>Comerciante</h6>
                            </div>
                            <div class="col-lg-4 col-sm-4 follow-info">
                                <h6>
                                    <span><i class="icon_clock_alt"></i><% out.print(date.getHours()); %></span>
                                    <span><i class="icon_calendar"></i><% out.print(date.getDate()+"/"+date.getMonth()+"/"+date.getYear()); %></span>
                                    <span><i class="icon_pin_alt"></i><% out.print(comerciante.getEndereco().getCidade()); %></span>
                                </h6>
                            </div>
                          </div>
                    </div>
                </div>
              </div>
              <!-- page start-->
              <div class="row">
                 <div class="col-lg-12">
                    <section class="panel">
                          <header class="panel-heading tab-bg-info">
                              <ul class="nav nav-tabs">
                                  <li class="active">
                                      <a data-toggle="tab" href="#recent-activity">
                                          <i class="icon-home"></i>
                                          Registro de atividades
                                      </a>
                                  </li>
                                  <li>
                                      <a data-toggle="tab" href="#profile">
                                          <i class="icon-user"></i>
                                          Perfil
                                      </a>
                                  </li>
                                  <li class="">
                                      <a data-toggle="tab" href="#edit-profile">
                                          <i class="icon-envelope"></i>
                                          Editar Perfil
                                      </a>
                                  </li>
                              </ul>
                          </header>
                          
                          <div class="panel-body">
                             
                              <div class="tab-content">
                                  <div id="recent-activity" class="tab-pane active">
                                      <div class="profile-activity">                                          
                                          <div class="act-time">                                      
                                              <div class="activity-body act-in">
                                                  <span class="arrow"></span>
                                                  <div class="text">
                                                      <a href="#" class="activity-img"><img class="avatar" src="img/chat-avatar.jpg" alt=""></a>
                                                      <p class="attribution"><a href="#">Victor Vidal</a> às 6:00pm, 18 fev. 2016</p>
                                                      <p>Nenhuma atividade</p>
                                                  </div>
                                              </div>
                                          </div>
                                      </div>
                                  </div>
                              
                              <!-- profile -->
                              <div id="profile" class="tab-pane">
                                    <section class="panel">
                                      <div class="bio-graph-heading">
                                                Sobre
                                      </div>
                                      <div class="panel-body bio-graph-info">
                                          <h1>Dados do perfil</h1>
                                          <div class="row">
                                              <div class="bio-row">
                                                  <p><span>Nome completo</span>: <% out.print(comerciante.getNomeCompleto()); %></p>
                                              </div>
                                              <div class="bio-row">
                                                  <p><span>Tipo do perfil </span>: <% out.print(comerciante.getTipoPerfil()); %> </p>
                                              </div>
                                              <div class="bio-row">
                                                  <p><span>E-mail </span>: <% out.print(comerciante.getEmail()); %></p>
                                              </div>
                                              <div class="bio-row">
                                                  <p><span>Celular </span>: <% out.print(comerciante.getCelular()); %></p>
                                              </div>
                                              <div class="bio-row">
                                                  <p><span>Telefone </span>:  <% out.print(comerciante.getTelefone()); %></p>
                                              </div>
                                          </div>
                                      </div>
                                    </section>
                                      <section>
                                          <div class="row">                                              
                                          </div>
                                      </section>
                               </div>
                               
                               <!-- edit-profile -->
                                  <div id="edit-profile" class="tab-pane">
                                    <section class="panel">  
                                    
                                    	<div class="profile-activity">                                          
                                          <div class="act-time">                                      
                                              <div class="activity-body act-in">
                                                  <span class="arrow"></span>
                                                  <div class="text">
                                                  	<a href="#" class="btn btn-default" role="button">Excluir conta</a>
                                                  </div>
                                              </div>
                                          </div>
                                       </div>                                        
                                         
                                          <div class="panel-body bio-graph-info">
                                              <h1>Infomações do perfil</h1>
                                              <form class="form-horizontal" role="form">                                                  
                                                  <div class="form-group">
                                                      <label class="col-lg-2 control-label">Nome completo</label>
                                                      <div class="col-lg-6">
                                                          <input type="text" class="form-control" id="f-name" placeholder=" ">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label class="col-lg-2 control-label">Sobre</label>
                                                      <div class="col-lg-10">
                                                          <textarea name="" id="" class="form-control" cols="30" rows="5"></textarea>
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label class="col-lg-2 control-label">E-mail</label>
                                                      <div class="col-lg-6">
                                                          <input type="text" class="form-control" id="email" placeholder=" ">
                                                      </div>
                                                  </div>
                                                  <div class="form-group">
                                                      <label class="col-lg-2 control-label">Celular</label>
                                                      <div class="col-lg-6">
                                                          <input type="text" class="form-control" id="mobile" placeholder=" ">
                                                      </div>
                                                  </div>

                                                  <div class="form-group">
                                                      <div class="col-lg-offset-2 col-lg-10">
                                                          <button type="submit" class="btn btn-primary">Salvar</button>
                                                          <button type="reset" class="btn btn-danger">Cancelar</button>
                                                      </div>
                                                  </div>
                                              </form>
                                          </div>
                                      </section>
                                  </div>
                               </div>
                               
                              </div>
                          </section>
                       </div>
                   </div>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
   </section>
  <!-- container section end -->
    <!-- javascripts -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="js/jquery.scrollTo.min.js"></script>
    <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- jquery knob -->
    <script src="assets/jquery-knob/js/jquery.knob.js"></script>
    <!--custome script for all page-->
    <script src="js/scripts.js"></script>

  <script>

      //knob
      $(".knob").knob();

  </script>


  </body>
</html>
