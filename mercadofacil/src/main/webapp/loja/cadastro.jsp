<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
 	<meta name="viewport" content="width=device-width, initial-scale=1">
 	<title>Mercado Fácil - Cadastro</title>

 	<link href="../css/bootstrap.min.css" rel="stylesheet">
 	<link href="../css/style.css" rel="stylesheet">
</head>
<body>
	<script src="../js/jquery.min.js"></script>
 	<script src="../js/bootstrap.min.js"></script>
 	
 	<!-- Barra de navegação - inicio-->
 	<nav class="navbar navbar-inverse navbar-fixed-top">
 	
 		<div class="container-fluid">
  			<div class="navbar-header">
   				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
    <span class="sr-only">Toggle navigation</span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
  				</button>
  				 
    <a class="navbar-brand" href="#">Mercado Fácil</a>
 			</div>
  	<div id="navbar" class="navbar-collapse collapse">
  		<ul class="nav navbar-nav navbar-right">
    		<li><a href="#">Início</a></li>
    		<li><a href="#">Opções</a></li>
    		<li><a href="#">Perfil</a></li>
    		<li><a href="#">Ajuda</a></li>
   		</ul>
  	</div>
  	
 		</div>
	</nav>
	<!-- Barra de navegação - fim -->
	
	<!-- Container principal - inicio -->
	<div id="main" class="container-fluid">
		<h3 class="page-header">Cadastro de usuário</h3>
		
		<!-- Formulário - inicio-->
		<form action="#">
			<div class="row">
 				<div class="form-group col-md-4">
  					 <label for="campo1">Nome completo</label>
  					 <input type="text" class="form-control" id="campo1">
				</div>
 
 				<div class="form-group col-md-4">
   					<label for="campo2">E-mail</label>
  					<input type="text" class="form-control" id="campo3">
 				</div>
 
 				<div class="form-group col-md-4">
   					<label for="campo3">Campo Três</label>
   					<input type="text" class="form-control" id="campo3">
 				</div>

			</div>
			
			<hr />
			
			<div id="actions" class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary">Salvar</button>
					<a href="#" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
		<!-- Formulário - fim -->
		
	</div>
	<!-- Container principal - fim -->
</body>