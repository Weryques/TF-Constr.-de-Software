<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="br.com.mercadofacil.modelo.Consumidor" %>
<%@page import="br.com.mercadofacil.modelo.Produto"%>
<%@page import="br.com.mercadofacil.jdbc.ProdutoDAO"%>
<%@page import="java.util.ArrayList" %>
<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<head>
<title>Supermercado �nico - Logado</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/jquery.min.js"></script>
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

<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/style.css" rel="stylesheet">

<script type="text/javascript" src="../js/move-top.js"></script>
<script type="text/javascript" src="../js/easing.js"></script>
				<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
					</script>

</head>
<script src="../js/minicart.min.js"></script>
<script>
    paypal.minicart.render();
</script>
<script>
    paypal.minicart.reset();
</script>

<body>
<%
Consumidor consumidor = (Consumidor) session.getAttribute("consumidor");
%>
	<!--header-->
	<div class="header">
		<div class="container">
			<div class="logo">
				<h1><a href="supermercadounico_home_logado.jsp">Supermercado �nico</a></h1>
			</div>
			<div class="header-top">
				<div class="header-top-in">
					<ul class="header-grid">
						<li  ><a href="supermercadounico_paginapessoafisica.jsp">Minha conta   </a> <label>/</label></li>
					</ul>
				<div class="clearfix"> </div>
				</div>
				<ul class="grid-header">
					<li><a href="#" class="glyphicon glyphicon-user"><span ></span> <% out.print(consumidor.getNomeCompleto()); %> </a><label>/</label></li>
       			 	<li><a href="carrinhocompras.jsp" class="glyphicon glyphicon-shopping-cart"><span ></span>Carrinho</a><label>/</label></li>
       			 	
				</ul>
				<div class="clearfix"> </div>
			</div>
			<!---->
			<div class="header-bottom">
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li class="active" ><a href="supermercadounico_home_logado.jsp" >Home  </a><label>- </label> </li>
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
		<!---->
	<div class="banner">
		<div class="banner-in">
		<!---->
		<div class="wmuSlider example1">
			   <div class="wmuSliderWrapper">
				<article style="position: absolute; width: 100%; opacity: 0;"> 
				   	<div class="banner-wrap">
				   	      <h2>Caf� </h2>
						  <h5>--</h5>
						  <p>-- <span>--</span></p>				   		 
				   	 </div>
			</article>
			</div>
		</div>
		<!---->
		  <script src="../js/jquery.wmuSlider.js"></script> 
			  <script>
       			$('.example1').wmuSlider({
					 pagination : true,
				});         
   		     </script> 	
		<!---->
	</div>
	</div>
		</div>
	</div>
	<!---->
	<div class="content">
		<div class="container">
		<div class="content-grid">
			<div class="col-md-4 grid-food">
				<div class="popular">
				<h3>Produtos populares</h3>
				<p>Produtos mais procurados</p>
				<ul class="popular-in">
					<li><a href="#"><i> </i>--</a></li>
					<li><a href="#"><i> </i>--</a></li>
					<li><a href="#"><i> </i>--</a></li>
					<li><a href="#"><i> </i>--</a></li>							
				</ul>
				</div>
				<div class="popular phone">
					<h3>E-mail/Telefone</h3>
					<p>Contate-nos</p>
					<ul class="number">
						<li><a href="mailto:superunico@servidor.com"><i class="mail"> </i>superunico@servidor.com </a></li>	
						<li><span><i> </i>(00) 0000-0000 </span></li>				
					</ul>
				</div>
			</div>
			<!---->
				<%
					//ArrayList<Produto> ListaDeProdutos = new ArrayList();
					ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
					ProdutoDAO produtoDAO = new ProdutoDAO();
					listaDeProdutos = produtoDAO.getLista("Todos");
					//ArrayList<Produto> listaDeProdutos = (ArrayList) request.getAttribute("ListaDeProdutos");
					int tamanhoDaLista = listaDeProdutos.size();
					//System.out.println("tamanho da lista "+ListaDeProdutos.size());
				%>
				<div class="col-md-8 food-grid">
					<div class="cup">
						<%
							if (listaDeProdutos.size() <= 0) {
								%>
								<div class="col-md-10 cup-in">
								<a href="#"><img src="../images/opsNenhumProdutoCadastrado.jpg"
									class="img-responsive" alt=""></a>
								<p>Desculpe, Mas N�o Encontramos Nenhum Produto Cadastrado</p>
								<span class="dollar"></span>
								<div class="clearfix"></div>
							</div>
							<% 
							} else {

								for (int i = 0; i < listaDeProdutos.size(); i++) {
						%>		
						<!-- Minicart PayPal -->				
							<!DOCTYPE html>
									<html>
									<head>
										<meta charset="utf-8" />
										<title></title>
										
										<style>	
										.floating-box {
  											  float: left;
  	  											width: 150px;
   												height: 75px;
    											margin: 80px;
										}
										</style>
										
									</head>
									<body>
									<div class="floating-box">
										<form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
							                <fieldset>
							                	<a href="#"> <img src="../images/p1.jpg"> </a>
							                    <input type="hidden" name="cmd" value="_cart" />
							                    <input type="hidden" name="add" value="1" />
							                    <input type="hidden" name="business" value="example@minicartjs.com" />
							                    <input type="hidden" name="item_name" value="<%=listaDeProdutos.get(i).getNome()%>" />
							                    <input type="hidden" name="amount" value="<%=listaDeProdutos.get(i).getValor()%>" />
							                    <input type="hidden" name="discount_amount" value="0" />
							                    <input type="hidden" name="currency_code" value="BRL" />
							                    <input type="hidden" name="return" value="http://www.minicartjs.com/?success" />
							                    <input type="hidden" name="cancel_return" value="http://www.minicartjs.com/?cancel" />
							                    <strong><%=listaDeProdutos.get(i).getNome()%></strong>
							                    <ul>
							                        <li>R$ <%=listaDeProdutos.get(i).getValor()%></li>
							                    </ul>
							                    <input class="btn btn-outline btn-success glyphicon glyphicon-shopping-cart" type="submit" name="submit" value="Comprar" class="button" />
							                </fieldset>
							            </form>
							            </div>
										
										<script src="../js/minicart.js"></script>
										<script>
											paypal.minicart.render();
											paypal.minicart.cart.on('checkout', function (evt) {
												var items = this.items(),
													len = items.length,
													total = 0,
													i;
												// Count the number of each item in the cart
												for (i = 0; i < len; i++) {
													total += items[i].get('quantity');
												}
												if (total < 1) {
													alert('A quantidade minima � 1. Por favor, adicione algo ao carrinho antes de finalizar a compra');
													evt.preventDefault();
												}
											});
										</script>
									</body>
									</html>
						<%
								}
							}
						%>
						
					</div>
				</div>
			<div class="clearfix"> </div>
		</div>
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

	<script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/scripts.js"></script>
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