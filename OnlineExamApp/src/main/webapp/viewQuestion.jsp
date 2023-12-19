<%@page import="com.cdac.jdbc.Question"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Question q = (Question) session.getAttribute("currentQ");
	
		// This scriptlet declares a variable q of type Question and assigns it the value retrieved from the session attribute 
		// The session is a way to store and retrieve objects across multiple requests.
	%>

		Q. <%= q.getQuestion() %> <br /><br /><br>
		1. <%= q.getOption1() %> <br />
		2. <%= q.getOption2() %> <br />
		3. <%= q.getOption3() %> <br />
		4. <%= q.getOption4() %> <br /><br />
		 <a href="QuestionLoaderServlet">Next Question</a>

</body>
</html>