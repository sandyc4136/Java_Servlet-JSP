<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calc JSP</title>
</head>
<body>
<%
	int no1=Integer.parseInt(request.getParameter("no1"));
	int no2=Integer.parseInt(request.getParameter("no2"));
	int sum= no1 + no2; 
	String result="Sum of " + no1 +" and " + no2 + " is ";
%>
<h2> <%= result %> <%= sum %></h2>
</body>
</html> 