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
<link href="js/bootstrap.js">
<link href="css/bootstrap.min.css">
<link href="js/booststrap.min.js">
<link href="js/jquery.min.js">
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<style>

	.center{
 		margin: auto;
   	 	width: 30%;
    	padding: 10px;
	}
</style>
</head>
<body class="center">
	<div class="container">
	
	<h1 class="table table-striped">Supermercados encontrados</h1>
	
	<table>
      <% List<String> supermercados = new ArrayList<String>(); 
      	 supermercados = (List) session.getAttribute("supermercados");
       	
      	 for(int i = 0; i < supermercados.size(); i++){
      %>
        <tr>
          <td><%=supermercados.get(i)%> 
          <%if(supermercados.get(i).equals("Supermercado Único")){ %> 
         	 <a role ="button" href="/mercadofacil/supermercadounico/supermercadounico_home.jsp" class="btn btn-info">Ir</a><%
          } %>
          <td>
        </tr>
        
        <%
      	 }
        %>
    </table>
    
    <a role="button" href="/mercadofacil/index.jsp">Voltar</a>
	</div>
</body>
</html>