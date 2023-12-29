<%@page import="com.cdac.jdbc.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <% 
		List<Products> list=(List<Products>) session.getAttribute("currentP"); 
	%> --%>
	
<div><h2>Product List</h2></div>
    <table border="1" cellspacing=0 >
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Purchase Date</th>
            <th>Options </th>
            <th>Options </th>
        </tr>
        
       <%--  <%
       for( Products p : list ) {
       	%>
            <tr>
                <td>${p.product_id }</td>
                <!-- <td>p.getProduct_name()</td>
                <td>p.getQuantity()</td>
                <td>p.getPrice()</td>
                <td>p.getPurchase_date()</td> -->
               <td><a href='UpdateProductServlet?product_id="+p.getProduct_id()+"'>Edit</a></td>
               <td><a href='DeleteProductServlet?product_id="+p.getProduct_id()+"'>Delete</a></td>
            </tr> --%>
       
       </table>
</body>
</html>