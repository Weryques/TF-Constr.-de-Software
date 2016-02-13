<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Entrar - Pessoa Jurídica</title>
<link href="css/login-pessoa-juridica.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Login On Webapp Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!--web-fonts-->
<link href='//fonts.googleapis.com/css?family=Nunito:400,700,300' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Raleway:400,100,200,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!--web-fonts-->
<script src="js/jquery.min.js"></script>
<script>$(document).ready(function(c) {
	$('.close').on('click', function(c){
		$('.mail-section').fadeOut('slow', function(c){
	  		$('.mail-section').remove();
		});
	});	  
});
</script>
</head>
<body>
	<div class="header">
		<h1>Entrar no Portal Administrativo</h1>
	</div>
	
	<div id="botoesEscolha" class="container text-center" style="display: block">
		<button type="button" class="btn btn-default" onclick="mudarEstado('comerciante'), mudarEstadoBotoes('botoesEscolha')">Entrar como comerciante</button>
		<button type="button" class="btn btn-default" onclick="mudarEstado('anunciante'), mudarEstadoBotoes('botoesEscolha')">Entrar como anunciante</button>	
	</div>
	
	<div id="comerciante" class="main" style="display: none;">
		<div class="mail-section">
				<div class="mail-image">
					<img src="images/message.png" alt="" />
						<h3>Bem vindo</h3>
						<h2>Comerciante</h2>
				</div>
					<div class="mail-form">
					<form action="autenticar" method="post">
						<input type="text" name="email" placeholder="Entre com e-mail" required=""/>
						<input type="password" name="senha" class="pass" placeholder="Senha" required=""/>
						<button type="submit" class="btn btn-default btn-md" name="login" value="comerciante">Entrar</button>
					</form>
						<a href="cadastropessoajuridica.jsp"><p>Não tem cadastro?</p></a>
				</div>
			<div class="clear"> </div>
		</div>
	</div>
	
	<div id="anunciante" class="main" style="display: none;">
		<div class="mail-section">
				<div class="mail-image">
					<img src="images/message.png" alt="" />
						<h3>Bem vindo</h3>
						<h2>Anunciante</h2>
				</div>
					<div class="mail-form">
					<form action="autenticar" method="post">
						<input type="text" name="email" placeholder="Entre com e-mail" required=""/>
						<input type="password"  name="senha" class="pass" placeholder="Senha" required=""/>
						<button type="submit" class="btn btn-default btn-md" name="login" value="comerciante">Entrar</button>
					</form>
						<a href="cadastropessoajuridica.jsp"><p>Não tem cadastro?</p></a>
				</div>
			<div class="clear"> </div>
		</div>
	</div>
		<div class="footer">
			<p>&copy 2015 Flat Login On Webapp form . All rights reserved | Design by <a href="http://w3layouts.com">W3layouts.</a></p>
		</div>

		<!-- script para exibir ou não a div dos formulários -->
	<script type="text/javascript">
		function mudarEstado(idForm){
			var display = document.getElementById(idForm).style.display;
			    
			if(display == "none"){
		        document.getElementById(idForm).style.display = 'block';
			}
			else{
				document.getElementById(idForm).style.display = 'none';
			}					
		}
	</script>
	
	<!-- script para exibir ou não a div dos botões -->		
	<script type="text/javascript">
		function mudarEstadoBotoes(idBotoes){
			var display = document.getElementById(idBotoes).style.display;
					
			if(display == "block"){
				document.getElementById(idBotoes).style.display = 'none';
			}
			else{
				document.getElementById(idBotoes).style.display = 'block';
			}
		}
	</script>
</body>
</html>
