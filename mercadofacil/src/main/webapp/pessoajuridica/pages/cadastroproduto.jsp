<%@page import="org.xml.sax.Parser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>

<meta charset="utf-8">
<meta http-equiv="Comment-Type" content="text/html" charset="utf-8">
<meta http-equiv="Content-Type" content="text/html" charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Cadastro de produtos</title>

<!-- Bootstrap Core CSS -->
<link href="../bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="../bower_components/metisMenu/dist/metisMenu.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="../css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<style type="text/css">
</style>
<script type="text/javascript">
	function validaDados(){
		var tagSelect = document.getElementById("Categoria");
		var itemSelecionado = tagSelect.options[tagSelect.selectedIndex].value;
		if(itemSelecionado==1){
			alert("Escolhar uma categoria");
		return;
		}
	}
</script>
</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="paineladmin.jsp">Mercado Fácil</a>
			</div>
			<!-- /.navbar-header -->

			<ul class="nav navbar-top-links navbar-right">	
				<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
				
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i> Meu
								Perfil</a>
						<li class="divider"></li>
						<li><a href="login.jsp"><i class="fa fa-sign-out fa-fw"></i>
								Sair</a></li>
					</ul> <!-- /.dropdown-user --></li>
					
				<!-- /.dropdown -->
			</ul>
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li><a href="../../comerciante/principal.jsp"><i
								class="fa fa-dashboard fa-fw"></i> Principal</a></li>
						<li><a href="../../consultarproduto?categoria=Todos"><i class="fa fa-table fa-fw"></i>
								Listar</a></li>
						<li><a href="cadastroproduto.jsp" class="active"><i
								class="fa fa-edit fa-fw"></i> Cadastro de Produtos</a></li>
						<li><a href="#"><i class="fa fa-sitemap fa-fw"></i>
								Categorias<span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li ><a href="#">Secos e Molhados</a></li>
								<li ><a href="#">Hortifruti</a></li>
								<li ><a href="#">Mercearia</a></li>
								<li ><a href="#">Utilidades</a></li>
								<li ><a href="#">Frios</a></li>
							</ul> <!-- /.nav-second-level --></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		<!-- Page Content -->
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<h2 class="page-header text-primary">Cadastro de Produtos</h2>
					</div>

					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->

				<!-- weliton  -->

				<div class="row">
					<div class="col-md-12">


						<form role="form" name="CadastroProdutos"
							action="../../cadastrarproduto">
							<div class="form-group col-md-5">

								<label for="NomeProduto"> Nome do Produto </label> <input
									type="text" class="form-control" name="NomeProduto" required>
							</div>

							<div class="form-group col-md-2">

								<label for="PrecoDeVendaProduto"> Preço de Venda </label> <input
									type="Number" class="form-control" name="PrecoDeVendaProduto"
									required>
							</div>
							<div class="form-group col-md-2">
								<label for="quantidade"> Quantidade </label> <input
									type="Number" class="form-control" name="PrecoDeCompraProduto"
									required>
							</div>
							<div class="form-group col-md-3">
								<label for="sel1">Categoria:</label> <select name="Categoria"
									class="form-control">
									<option value="Nenhum">---Nenhum---</option>
									<option value="Secos e Molhados">Secos e Molhados</option>
									<option value="Frios">Frios</option>
									<option value="Hortifruti">Hortifruti</option>
									<option value="Mercearia">Mercearia</option>
									<option value="Utilidades">Utilidades</option>
								</select>
							</div>
							<div class="form-group col-md-4">
								<label for="cnpjSupermercado"> CNPJ/CPF Anunciante </label> <input
									type="text" class="form-control" name="cnpjSupermercado">
							</div>
							<div class="form-group col-md-4">
								<label for="emailAnunciante"> Email do Anunciante </label> <input
									type="email" class="form-control" name="emailAnunciante">
							</div>
							<div class="form-group col-md-4">
								<label for="razaoSocialAnunciante"> Razão Social
									Anunciante </label> <input type="text" class="form-control"
									name="razaoSocialAnunciante">
							</div>
							<div class="form-group col-md-6">
								<label for="nomeFantasiaSupermercado"> Nome Fantasia do
									Supermercado </label> <input type="text" class="form-control"
									name="nomeFantasiaSupermercado">
							</div>
							<div class="form-group col-md-6">
								<label for="razaoSocialSupermercado"> Razao Social do
									Supermercado </label> <input type="text" class="form-control"
									name="razaoSocialSupermercado">
							</div>
							<!-- inicio imagem
							tag imagem removida 
							<div class="form-group col-md-6">
								<label for="exampleInputFile"> Imagem </label> <input
									type="file" name="imagem">
								<p class="help-block">Escolha uma imagem para o Produto.</p>
							</div>
							fim imagem
							-->
							<div class="form-group col-md-6">
								<label for="descricao"> Descrição </label>
								<textarea class="form-control " rows="3" name="descricao"></textarea>
							</div>
							<div class="form-group col-md-6">
								<label for="exampleInputFile">
									Imagen
								</label>
								<input type="file" id="exampleInputFile">
								<p class="help-block">
									Escolha uma imagem para o produto.
								</p>
							</div>
							<div class="form-group col-md-12">
								<button type="submit" name="opcao" value="Salvar"
									class="btn btn-outline btn-primary btn-lg "
									onclick="validaDados()">Salvar</button>
								<button type="button"
									class="btn btn-outline btn-warning  btn-lg">Limpar</button>
							</div>
							<script type="text/javascript">
									
							</script>
						</form>
					</div>

					<!-- weliton -->
				</div>
			</div>
			<!-- /.container-fluid -->
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="../bower_components/jquery/dist/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="../js/sb-admin-2.js"></script>

</body>

</html>
