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
		<nav class="navbar navbar-inverse">

			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> 
						<span class="icon-bar"></span> <span class="icon-bar"></span> 
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
	
	<div class="container text-center">
		<button type="button" class="btn btn-default" onclick="mudarEstadoForm('consumidor')">Cadastrar-se como cliente</button>	
		<button type="button" class="btn btn-default" onclick="mudarEstadoForm('comerciante')">Cadastrar-se como comerciante</button>
		<button type="button" class="btn btn-default" onclick="mudarEstadoForm('anunciante')">Cadastrar-se como anunciante</button>	
	</div>
	
	<!-- Container consumidor - inicio -->
	<div id="consumidor" class="container col-sm-offset-2" style="display: none;">
		<h3 class="page-header text-center">Cadastro de usuário</h3>

		<!-- Formulário consumidor - inicio-->
		<form action="../cadastrar" class="form-group col-md-10">
			<div class="row">
 				<div class="form-group col-md-4">
  					 <label for="campo1">Nome completo</label>
  					 <input type="text" class="form-control" id="campo1">
				</div>
 
 				<div class="form-group col-md-4">
   					<label for="campo2">E-mail</label>
  					<input type="email" class="form-control" id="campo2">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo3">Repita o e-mail</label>
   					<input type="email" class="form-control" id="campo3">
 				</div>
 
 				<div class="form-group col-md-4">
   					<label for="campo4">Telefone</label>
   					<input type="text" class="form-control" id="campo4">
 				</div>

				<div class="form-group col-md-4">
   					<label for="campo5">Celular</label>
   					<input type="text" class="form-control" id="campo5">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo6">CPF</label>
   					<input type="text" class="form-control" id="campo6">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo7">Senha</label>
   					<input type="password" class="form-control" id="campo7">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo8">Repita a senha</label>
   					<input type="password" class="form-control" id="campo8">
 				</div>
			</div>
			
			<hr />
			
			<div id="actions" class="row">
				<div class="col-md-12 col-sm-offset-5">
					<button type="submit" class="btn btn-primary" name="tipoRequisicao" value="cadastroConsumidor">Salvar</button>
					<a href="#" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
		<!-- Formulário - fim -->
		
	</div>
	<!-- Container principal - fim -->
	
			<!-- script para exibir ou não a div do formulário -->
			<script type="text/javascript">
				function mudarEstadoForm(idElemento){
					var display = document.getElementById(idElemento).style.display;
				    
					if(display == "none")
				        document.getElementById(idElemento).style.display = 'block';
				    else
				        document.getElementById(idElemento).style.display = 'none';
				}
			</script>
</body>