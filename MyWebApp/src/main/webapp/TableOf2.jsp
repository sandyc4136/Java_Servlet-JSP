<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table of 2</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<%
	LocalDate date= LocalDate.now();
	%>
	<h2>Today's date is <%= date %></h2>
	<%
	String str="Hello Everyone";
	%>
	<h3><%= str %></h3>
	<center>
		<%
			for(int i=1;i<=10; i++){
		%>
		
		<h4>2 * <%= i %> = <%= i*2 %></h4>
		
		<% 
			}
		%>
	</center>
	
</body>
</html>