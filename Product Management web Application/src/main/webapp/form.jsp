<%@page import="com.cdac.jdbc.ProductLoader"%>
<%@page import="java.util.List"%> 
<%@page import="com.cdac.jdbc.Products"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product details form</title>
<link rel="stylesheet" href="form.css">
</head>
<body>

<%--  <%
	 List<Products> list=(List<Products>) session.getAttribute("currentP"); 
%>   --%>
	<div  class="container">
	
	<h3>
	Product Management Web Application
	</h3>
	
	<form action="AddProductServlet" method="post" >
	Product ID : <input type="text" name="product_id" required><br><br>
	Product Name : <input type="text" name="product_name" required><br><br>
	Quantity : <input type="text" name="quantity" required><br><br>
	Price : <input type="text" name="price" required><br><br>
	Purchase Date : <input type="date" name="purchase_date" required><br><br>
	<input type="submit" value="Add"/>
	</form>
	<br>
	
		<a href="ProductsList">view Product List</a>  
	</div>
	
</body>
</html>
