<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page import="br.com.mercadofacil.modelo.Consumidor"%>
<%@page import="br.com.mercadofacil.modelo.Produto"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Supermercado Único - Meu Carrinho</title>
<link href="../css/carrinho.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="../css/styleHomeLoginCarrinho.css" rel="stylesheet"
	type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Food shop Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Rokkitt:400,700'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Lobster+Two:400,400italic,700,700italic'
	rel='stylesheet' type='text/css'>
<!--//fonts-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script src="../js/jquery-1.11.0.min.js"></script>
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
				<h1>
					<a href="visao/index.jsp">Supermercado Único</a>
				</h1>
			</div>
			<div class="header-top">
				<div class="header-top-in">
					<ul class="header-grid">
						<li><a href="account.html">Minha conta </a> <label>/</label></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<ul class="grid-header">
					<li><a href="#" class="glyphicon glyphicon-user"><span></span><% out.print(consumidor.getNomeCompleto()); %> </a><label>/</label></li>
					<li><a href="loja/carrinhocompras.jsp"
						class="glyphicon glyphicon-shopping-cart"><span></span>Carrinho
					</a><label>/</label></li>
				</ul>
				<div class="clearfix"></div>
			</div>
			<!---->
			<div class="header-bottom">
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li><a href="home.jsp">Home </a><label>- </label></li>
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
						<input type="text" value="Search store here ..."
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = '';}"> <input
							type="submit" value="">
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
			<!---->

		</div>
	</div>
	<!-- Espaço para o carrinho  -->

	<% 
		ArrayList<Produto> produtosAddCarrinho = new ArrayList<Produto>();
		produtosAddCarrinho = (ArrayList) session.getAttribute("produtosAddCarrinho");
		
		%>
		
		<% if(produtosAddCarrinho.isEmpty()) { %>
			<div class="container">
				<div class="register-account">
					<h4 class="title">Seu carrinho está vazio</h4>
					<p class="cart">Não há nenhum produto no seu carrinho.<br>Clique<a href="supermercadounico_home_logado.jsp"> aqui</a> para continuar comprando</p>
				</div>
			</div>
		<%
		}
		else{ %>

		<table>
		  <thead>
		    <tr>
		      <th>Comprar</th>
		    </tr>
		  </thead>
		  <tbody>
		    <c:forEach items="${produtoList}" var="produto">
		      <tr>
		        <td>
		          <!-- Adicionando o produto no carrinho de compras -->
		          <form action="<c:url value="/carrinho"/>" method="POST">
		            <input type="hidden" name="item.produto.id" 
		                          value="${produto.id }"/>
		            <input class="qtde" name="item.quantidade" value="1"/>
		            <button type="submit">Comprar</button>
		          </form>
		        </td>
		      </tr>          
		    </c:forEach>
		  </tbody>
		</table>
				

	<%	
	} /* fim do else */
	%>
	<!---->
	<div class="footer">
		<div class="container">
			<div class="col-md-8 footer-bottom ">
				<h4>Aenean condimentum suscipit dolor</h4>
				<p>Proin ullamcorper urna quis velit mollis molestie suscipit
					nisl consectetur uspendisse venenatis dolor et nunc iaculis ege</p>
				<p class="footer-grid">
					Copyright &copy; 2015 Food shop Template by <a
						href="http://w3layouts.com/" target="_blank">W3layouts</a>
				</p>

			</div>
			<div class="col-md-4 footer-bottom ">
				<h4>Muscipit dolor</h4>
				<ul class="social-icons">
					<li><a href="#"><span> </span> </a></li>
					<li class="tin"><a href="#"><span> </span></a></li>
					<li class="linked"><a href="#"><span> </span> </a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
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
	<a href="#" id="toTop" style="display: block;"> <span
		id="toTopHover" style="opacity: 1;"> </span></a>

</body>
</html>