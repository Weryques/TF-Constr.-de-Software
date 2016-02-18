<%@page import="br.com.mercadofacil.modelo.Consumidor" %>
<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Supermercado Único</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="../css/styleHomeLoginCarrinho.css" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Food shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Rokkitt:400,700' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lobster+Two:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
<!--//fonts-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
					</script>

</head>
<body>
<%

Consumidor consumidor = (Consumidor) session.getAttribute("consumidor");

%>
<!--header-->
	<div class="header-in">
		<div class="container">
			<div class="logo">
				<h1><a href="supermercadounico_home_logado.jsp">Supermercado Único</a></h1>
			</div>
			<div class="header-top">
				<div class="header-top-in">
				<div class="clearfix"> </div>
				</div>
				<ul class="grid-header">
					<li><a href="#">Meu carrinho</a> <label>/</label></li>	
				</ul>
				<div class="clearfix"> </div>
			</div>
			<!---->
			<div class="header-bottom">
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li  ><a href="supermercadounico_home_logado.jsp" >Home  </a><label>- </label> </li>
					</ul>
					<!--script-->
				<script>
					$("span.menu").click(function(){
						$(".top-nav ul").slideToggle(500, function(){
						});
					});
			</script>
				</div>
					<div class="search">
						<form>
							<input type="text" value="Procurar aqui..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" >
							<input type="submit" value="">
						</form>
					</div>
			<div class="clearfix"> </div>
		</div>
		
		</div>
	</div>
	<!---->
		<div class="row">
                 <div class="col-lg-12">
                    <section class="panel">
                          <header class="panel-heading tab-bg-info">
                              <ul class="nav nav-tabs">
                                  <li>
                                      <a data-toggle="tab" href="javascript:mudarEstado('profile')">
                                          <i class="icon-user"></i>
                                          Perfil
                                      </a>
                                  </li>
                                  <li class="">
                                      <a data-toggle="tab" href="javascript:mudarEstado('edit-profile')">
                                          <i class="icon-envelope"></i>
                                          Editar Perfil
                                      </a>
                                  </li>
                              </ul>
                          </header>
                          
                          <div class="panel-body">
                             
                              <div class="tab-content pagination">
                      
                              <!-- profile -->
                              <div id="profile" class="tab-pane-active">
                                    <section class="panel">
                                      <div class="bio-graph-heading">
                                                Sobre
                                      </div>
                                      <div class="panel-body bio-graph-info">
                                          <h1>Dados do perfil</h1>
                                          <div class="row">
                                              <div class="bio-row">
                                                  <p><span>Nome completo</span>: <% out.print(consumidor.getNomeCompleto()); %></p>
                                              </div>
                                              <div class="bio-row">
                                                  <p><span>Tipo do perfil </span>: <% out.print(consumidor.getTipoPerfil()); %> </p>
                                              </div>
                                              <div class="bio-row">
                                                  <p><span>E-mail </span>: <% out.print(consumidor.getEmail()); %></p>
                                              </div>
                                              <div class="bio-row">
                                                  <p><span>Celular </span>: <% out.print(consumidor.getCelular()); %></p>
                                              </div>
                                              <div class="bio-row">
                                                  <p><span>Telefone </span>:  <% out.print(consumidor.getTelefone()); %></p>
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

	<!---->
	<div class="footer">
		<div class="container">
		<div class="col-md-8 footer-bottom ">
		<p class="footer-grid">Copyright &copy; 2015 Food shop Template by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>

		</div>
				<div class="clearfix"> </div>
		</div>	
	</div>
	<script type="text/javascript">
				function mudarEstado(id){
					var display = document.getElementById(idForm).style.display;
				    
					if(display == "none"){
				        document.getElementById(id).style.display = 'block';
					}
				    else{
				        document.getElementById(id).style.display = 'none';
				    }					
				}
			</script>
	 <script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

</body>
</html>