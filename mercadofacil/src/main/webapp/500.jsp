<%@page isErrorPage="true" import="java.io.*" language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<title>Mercado F�cil - 500 Error</title>
<link href="/mercadofacil/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div class="container">
		<div class="text-center">
			<h2>Eita! - Consertaremos isso!</h2>
			<h3>500 Error!</h3>
			<pre><%				
				out.print("<br />"+ exception.getMessage() +"<br />");
			%></pre>
			<br />
			<a href="/mercadofacil/index.jsp" class="details">Voltar</a>
		</div>
	</div>
</body>
</html>