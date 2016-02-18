<%@page import="org.apache.taglibs.standard.tag.common.xml.ForEachTag"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Mercado Fácil - Digite seu CEP</title>
<!-- Custom Theme files -->
<link href="css/bootstrap.css">
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="keywords" content="Flat Search Box Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<!--Google Fonts-->

<style>

	.center{
 		margin: auto;
   	 	width: 30%;
    	padding: 10px
	}
</style>
</head>
<body>

	<div class="container">
		
	<h1 class="center table table-striped">Supermercados encontrados</h1>
	
	<table class="center">
      <% List<String> supermercados = new ArrayList<String>(); 
      	 supermercados = (List) session.getAttribute("supermercados");
       	
      	 for(int i = 0; i < supermercados.size(); i++){
      %>
        <tr>
          <td><%=supermercados.get(i)%><td>
        </tr>
        
        <%
      	 }
        %>
    </table>
	</div>
</body>
</html>