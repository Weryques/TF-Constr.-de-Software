<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="br.com.mercadofacil.modelo.Produto"%>
    <%@page import="br.com.mercadofacil.jdbc.ProdutoDAO"%>
    <%@page import="java.util.ArrayList" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% //Produto p=new Produto();
 	ProdutoDAO produtoDAO=new ProdutoDAO();
 	ArrayList<Produto> produtoLista = new ArrayList<Produto>();
 
 	produtoLista = produtoDAO.getLista("categoria");
 
 	int tamanhoLista = produtoLista.size();
 
 	for(int i = 0; i < tamanhoLista; i++){%>
	 	<h1><%= produtoLista.get(i).getNome()%> </h1> <% 	 
 	}
 %>
</body>
</html>