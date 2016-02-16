<!DOCTYPE html>
<html lang="pt-br">
<%@page import="br.com.mercadofacil.modelo.Produto"%>
<%@page import="br.com.mercadofacil.jdbc.ProdutoDAO"%>
<%@page import="java.util.ArrayList"%>

<head>

<meta charset="utf-8">
<meta http-equiv="Comment-Type" content="text/html" charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Lista de Produtos</title>

<!-- Bootstrap Core CSS -->
<link
	href="pessoajuridica/bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link
	href="pessoajuridica/bower_components/metisMenu/dist/metisMenu.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link
	href="pessoajuridica/css/sb-admin-2.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="pessoajuridica/bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<script type="text/javascript">
	function validaDados() {
		var tagSelect = document.Categoria.opcao;		
		var itemSelecionado = tagSelect.options[tagSelect.selectedIndex].value;
		if(itemSelecionado!==""){
			window.location.href="consultarproduto?categoria="+itemSelecionado;
		}		
	}
	function ConfirmaExclusao(id) {
		var resp = confirm("Deseja confirmar exclusão?");
		if (resp == true) {
			location.href= "deletarproduto?id="+id;	
		}
	}
	function editar() {
		var tagSelect = document.Categoria.opcao;		
		var itemSelecionado = tagSelect.options[tagSelect.selectedIndex].value;
		if(itemSelecionado!==""){
			window.location.href="ServletConsultaProduto?categoria="+itemSelecionado;
		}		
	}

</script>
<body onload="t" id="wrapper">

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
			<a class="navbar-brand active" href="../../comerciante/principal.jsp">Mercado
				Fácil</a>
		</div>
		<!-- /.navbar-header -->

		<ul class="nav navbar-top-links navbar-right">

			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<li><a href="#"><i class="fa fa-user fa-fw"></i> Meu perfil</a></li>
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
					<!-- weliton -->
					<h3 class="text-center text-primary">Produtos Cadastrados</h3>
					<form name="Categoria" action="../../consultarproduto">
						<div class="form-group col-md-12">
							<label for="sel1">Categoria:</label> <select class="form-control"
								name="opcao" onchange="validaDados()">
								<option value="">---Escolha uma categoria---</option>
								<option value="Todos">---Todos---</option>
								<option value="Frios">Frios</option>
								<option value="Hortifruti">Hortifruti</option>
								<option value="Mercearia">Mercearia</option>
								<option value="Utilidades">Utilidades</option>
							</select>
						</div>

					</form>
					<div class="col-md-12" id="ProdutosCadastrados">
						<!-- Inicio da tabela -->
						<%
							//ArrayList<Produto> ListaDeProdutos = new ArrayList();
							//ArrayList<Produto> ListaDeProdutos = new ArrayList<Produto>();
							ProdutoDAO produtoDAO = new ProdutoDAO();

							ArrayList<Produto> listaDeProdutos = (ArrayList) request.getAttribute("ListaDeProdutos");
							int tamanhoDaLista = listaDeProdutos.size();
							//System.out.println("tamanho da lista "+ListaDeProdutos.size());

							//tam=0;
						%>

						<table class="table table-hover table-bordered">
							<thead>
								<tr>
									<th>Imagem</th>
									<th>#</th>
									<th>Nome</th>
									<th>Categoria</th>
									<th>Preço</th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<%
									for (int i = 0; i < tamanhoDaLista; i++) {
								%>

								<tr class="info">
									<td> 
										<img alt="Bootstrap Image Preview" src="http://lorempixel.com/80/80/" class="img-thumbnail" />
											
									</td>
									<td><%=listaDeProdutos.get(i).getId()%></td>
									<td><%=listaDeProdutos.get(i).getNome()%></td>
									<td><%=listaDeProdutos.get(i).getCategoria()%></td>
									<td><%=listaDeProdutos.get(i).getValor()%>R$</td>
									<td><h4><a class="glyphicon glyphicon-pencil"> Editar</a></h4></td>
									<td><h4><a class="glyphicon glyphicon-trash"
										style="color: red"
										onclick="ConfirmaExclusao(<%=listaDeProdutos.get(i).getId()%>)">
											Excluir</a></h4></td>
								</tr>

								<%
									}
								%>
							</tbody>
						</table>
						<!-- fim da tabela -->
					</div>
					<!-- weliton -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->

			<!-- weliton  -->
			<!-- /.row -->

		</div>
		<!-- /.container-fluid -->
	</div>
	<!-- /#page-wrapper -->

	<!-- /#wrapper -->

	<!-- jQuery -->
	<script
		src="pessoajuridica/bower_components/jquery/dist/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="pessoajuridica/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script
		src="pessoajuridica/bower_components/metisMenu/dist/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script
		src="pessoajuridica/js/sb-admin-2.js"></script>

</body>

</html>
