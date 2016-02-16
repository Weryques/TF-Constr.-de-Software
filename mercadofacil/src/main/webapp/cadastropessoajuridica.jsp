<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
 	<meta name="viewport" content="width=device-width, initial-scale=1">
 	<title>Mercado Fácil - Cadastro</title>

 	<link href="css/bootstrap.min.css" rel="stylesheet">
 	<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<script src="js/jquery.min.js"></script>
 	<script src="js/bootstrap.min.js"></script>
 	
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
					</ul>
				</div>
			</div>
		</nav>
	<!-- Barra de navegação - fim -->
	
	<div id="botoesEscolha" class="container text-center" style="display: block">
		<button type="button" class="btn btn-default" onclick="mudarEstadoForm('comerciante'), mudarEstadoBotoes('botoesEscolha')">Cadastrar-se como comerciante</button>
		<button type="button" class="btn btn-default" onclick="mudarEstadoForm('anunciante'), mudarEstadoBotoes('botoesEscolha')">Cadastrar-se como anunciante</button>	
	</div>
	
		<!-- Container comerciante - inicio -->
	<div id="comerciante" class="container col-sm-offset-2" style="display: none;">
		<h3 class="page-header text-center">Cadastro de usuário</h3>

		<!-- Formulário comerciante - inicio-->
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
   					<label for="campo6">CNPJ</label>
   					<input type="text" class="form-control" id="campo6" name="cnpj" placeholder="Digite apenas números">
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
					<button type="submit" class="btn btn-primary" name="tipoRequisicao" value="cadastroComerciante">Salvar</button>
					<a href="cadastropessoajuridica.jsp" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
		<!-- Formulário - fim -->
	</div>
	<!-- Container - fim -->
	
		<!-- Container anunciante - inicio -->
	<div id="anunciante" class="container col-sm-offset-2" style="display: none;">
		<h3 class="page-header text-center">Cadastro de usuário</h3>

		<!-- Formulário anunciante - inicio-->
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
   					<label for="campo6">CNPJ</label>
   					<input type="text" class="form-control" id="campo6" name="cnpj" placeholder="00.000.000/0000-00">
 				</div>
 				
 				<div class="form-group col-md-4">
 					<label for="campo7">Razão Social</label>
 					<input type="text" class="form-control" id="campo7" name="razaoSocial">
 				</div>
 				
 				<div class="form-group col-md-4">
 					<label for="campo8">Industria pertencente</label>
 					<input type="text" class="form-control" id="campo8" name="causa">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo9">Senha</label>
   					<input type="password" class="form-control" id="campo9" name="senha">
 				</div>
 				
 				<div class="form-group col-md-4">
   					<label for="campo10">Repita a senha</label>
   					<input type="password" class="form-control" id="campo10">
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
					<button type="submit" class="btn btn-primary" name="tipoRequisicao" value="cadastroAnunciante">Salvar</button>
					<a href="cadastropessoajuridica.jsp" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
		<!-- Formulário - fim -->
	</div>
	<!-- Container - fim -->
	
	<!-- script para exibir ou não a div dos formulários -->
			<script type="text/javascript">
				function mudarEstadoForm(idForm){
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