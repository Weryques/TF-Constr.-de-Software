<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Supermercado Único</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/styleHomeLoginCarrinho.css" rel="stylesheet" type="text/css" media="all" />	
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
	<!--header-->
	<div class="header-in">
		<div class="container">
			<div class="logo">
				<h1><a href="visao/index.jsp">Supermercado Único</a></h1>
			</div>
			<div class="header-top">
				<div class="header-top-in">
					<ul class="header-grid">
						<li  ><a href="loja/loginpessoafisica.jsp">  Entrar </a> </li>		
					</ul>
				<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<!---->
			<div class="header-bottom">
				<div class="top-nav">
					<span class="menu"> </span>
					<ul>
						<li  ><a href="index.html" >Home  </a><label>- </label> </li>
						<li><a href="location.html" > Locations</a><label>- </label></li>
						<li><a href="specials.html">Specials </a><label>- </label></li>
						<li><a href="404" > Order Online</a><label>- </label></li>
						<li><a href="contact.html">Contacts</a></li>
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
							<input type="text" value="Search store here ..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" >
							<input type="submit" value="">
						</form>
					</div>
			<div class="clearfix"> </div>
		</div>
		
		</div>
	</div>
	<!---->
		
	<!-- Container consumidor - inicio -->
	<div id="consumidor" class="container col-sm-offset-2">
		<h3 class="page-header text-center">Cadastro de usuário</h3>

		<!-- Formulário consumidor - inicio-->
		<form action="cadastrar" method="post" class="form-group col-md-10 col-sm-offset-1">
		
			<hr />
		 	<h4 class="text-center">Informações pessoais</h4>
		 	<hr />
			
			<div class="row">
 				<div class="form-group col-md-4">
  					 <label for="campo1">Nome completo</label>
  					 <input type="text" class="form-control" id="campo1" name="nomeCompleto">
				</div>
 
 				<div class="form-group col-md-4">
   					<label for="campo2">E-mail</label>
  					<input type="email" class="form-control" id="campo2" name="email" placeholder="fulano@servidor.com">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo3">Repita o e-mail</label>
   					<input type="email" class="form-control" id="campo3" placeholder="fulano@servidor.com">
 				</div>
 
 				<div class="form-group col-md-4">
   					<label for="campo4">Telefone</label>
   					<input type="tel" class="form-control" id="campo4" name="telefone" placeholder="(00) 0000-0000">
 				</div>

				<div class="form-group col-md-4">
   					<label for="campo5">Celular</label>
   					<input type="text" class="form-control" id="campo5" name="celular" placeholder="(00) 0000-0000">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo6">CPF</label>
   					<input type="text" class="form-control" id="campo6" name="cpf" placeholder="000.000.000-00">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo7">Senha</label>
   					<input type="password" class="form-control" id="campo7" name="senha">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo8">Repita a senha</label>
   					<input type="password" class="form-control" id="campo8">
 				</div>
			</div>
			
			<hr />
			<h4 class="text-center">Endereço</h4>
			<hr />
			
			<div class="row">
				<div class="form-group col-md-4">
  					 <label for="campo1">CEP</label>
  					 <input type="text" class="form-control" id="campo1" name="cep" placeholder="00000-000">
				</div>
 
 				<div class="form-group col-md-4">
   					<label for="campo2">Cidade</label>
  					<input type="text" class="form-control" id="campo2" name="cidade">
 				</div>
 
 				<div class="form-group col-md-4">
   					<label for="campo4">Estado</label>
   					<input type="text" class="form-control" id="campo4" name="estado">
 				</div>

				<div class="form-group col-md-4">
   					<label for="campo5">Bairro</label>
   					<input type="text" class="form-control" id="campo5" name="bairro">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo6">Logradouro</label>
   					<input type="text" class="form-control" id="campo6" name="logradouro">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo7">Complemento</label>
   					<input type="text" class="form-control" id="campo7" name="complemento">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo8">Número</label>
   					<input type="text" class="form-control" id="campo8" name="numero">
 				</div>
			</div>
			
			<hr />
			
			<div id="actions" class="row">
				<div class="col-md-12 col-sm-offset-5">
					<button type="submit" class="btn btn-primary" name="tipoRequisicao" value="cadastroConsumidor">Salvar</button>
					<a href="index.jsp" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
		<!-- Formulário - fim -->
		
	</div>
	<!-- Container principal - fim -->
	
	<!---->
	<div class="footer">
		<div class="container">
		<div class="col-md-8 footer-bottom ">
		<h4>Aenean condimentum suscipit dolor</h4>
		<p>Proin ullamcorper urna quis velit mollis molestie suscipit nisl consectetur
uspendisse venenatis dolor et nunc iaculis ege</p>
		<p class="footer-grid">Copyright &copy; 2015 Food shop Template by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>

		</div>
			<div class="col-md-4 footer-bottom ">
				<h4>Muscipit dolor</h4>
				<ul class="social-icons">
					<li><a href="#"><span> </span> </a></li>
					<li class="tin"><a href="#"><span> </span></a></li>
					<li class="linked"><a href="#"><span> </span> </a></li>
				</ul>
			</div>
				<div class="clearfix"> </div>
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
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

</body>
</body>