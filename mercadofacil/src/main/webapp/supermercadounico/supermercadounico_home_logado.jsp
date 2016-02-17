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
<title>Supermercado Único - Logado</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="../css/bootstrap.min.css" rel="stylesheet">

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
<body>
<%
Consumidor consumidor = (Consumidor) session.getAttribute("consumidor");
%>
	<!--header-->
	<div class="header">
		<div class="container">
			<div class="logo">
				<h1><a href="supermercadounico_home.jsp">Supermercado Único</a></h1>
			</div>
			<div class="header-top">
				<div class="header-top-in">
					<ul class="header-grid">
						<li  ><a href="supermercadounico_paginapessoafisica.jsp">Minha conta   </a> <label>/</label></li>
					</ul>
				<div class="clearfix"> </div>
				</div>
				<ul class="grid-header">
					<li><a href="#" class="glyphicon glyphicon-user"><span ><% out.print(consumidor.getNomeCompleto()); %></span></a><label>/</label></li>
       			 	<li><a href="carrinhocompras.jsp" class="glyphicon glyphicon-shopping-cart"><span ></span>Carrinho </a><label>/</label></li>
       			 	
				</ul>
				<div class="clearfix"> </div>
			</div>
			<!---->
			<div class="header-bottom">
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li class="active" ><a href="supermercadounico_home.jsp" >Home  </a><label>- </label> </li>
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
				   	      <h2>Café </h2>
						  <h5>--</h5>
						  <p>-- <span>--</span></p>				   		 
				   	 </div>
					 
			</article>
			 <article style="position: absolute; width: 100%; opacity: 0;"> 
				   	<div class="banner-wrap">
					  		<h2>Café </h2>
						  <h5>--</h5>
						  <p>-- <span>--</span></p>
				   		 
				   	 </div>
					 
			</article>
			 <article style="position: absolute; width: 100%; opacity: 0;"> 
				   	<div class="banner-wrap">
				   	       <h2>Café </h2>
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
					 pagination : false,
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
							if (listaDeProdutos.size() == 0) {
								%>
								<div class="col-md-10 cup-in">
									<a href="#"><img src="../images/opsNenhumProdutoCadastrado.jpg"
									class="img-responsive" alt=""></a>
									<p>Desculpe, Mas Não Encontramos Nenhum Produto Cadastrado</p>
									<span class="dollar"></span>
								<div class="clearfix"></div>
							</div>
							<% 
							} else {

								for (int i = 0; i < listaDeProdutos.size(); i++) {
							%>
									<div id="produto" class="col-md-5 cup-in">
										<form>
											<a href="#"> <img src="../images/p1.jpg" class="img-responsive" alt=""></a>
											<input type="text" name="nomeProduto"  value="<%out.print(listaDeProdutos.get(i).getNome());%>"><br>
											<input type="text" name="valorProduto" value="R$ <%out.print(listaDeProdutos.get(i).getValor());%>">							
											<button type="submit" class="btn btn-default col-md-10">Comprar</button>
										</form>
									</div>
							<%
								}
							}
						%>
						<%	
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

						%>
					</div>
					<!---->
					<div class="browse">
						<p class="vit">
							Procurar mais <span>...</span>
						</p>
						<a href="#" class="more">Procurar</a>
						<div class="clearfix"></div>
					
					</div>
					<!---->
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
			
			<!-- Adicionar na sessão e incrementar contador -->		
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

</body>
</html>