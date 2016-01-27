<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="br.com.mercadofacil.modelo.Produto"%>
    <%@page import="br.com.mercadofacil.Dao.ProdutoDao"%>
    <%@page import="java.util.ArrayList" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% //Produto p=new Produto();
 ProdutoDao pd=new ProdutoDao();
 ArrayList<Produto> pl = new ArrayList();
 pl=pd.getLista();
 int tam= pl.size(),i;
 for(i=0;i<tam;i++){%>
	 <h1><%=pl.get(i).getNome()%></h1><% 	 
 }
 %>
</body>
</html>