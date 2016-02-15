<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Mercado Fácil - Digite seu CEP</title>
<!-- Custom Theme files -->
<link href="css/styleIndex.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css/bootstrap.css">
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="keywords" content="Flat Search Box Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<!--Google Fonts-->
</head>
<body>

	<div class="container">
	
	<hr />
	
	<h3 class="text-center page-header">Supermercados encontrados</h3>
	
	<hr />
	
	<table class="col-sm-offset-2">
      <c:forEach items="${supermercados}" var="supermercado">
        <tr>
          <td><c:out value="${supermercado}" /><td>
        </tr>
      </c:forEach>
    </table>
	</div>
</body>
</html>