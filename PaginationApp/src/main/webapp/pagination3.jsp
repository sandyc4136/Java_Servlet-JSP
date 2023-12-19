<%@page import="com.cdac.jdbc.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.cdac.jdbc.ProductDataLoader"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<html>
<head>
	<link rel="stylesheet"  href="pagination.css">
</head>
<body>
	<%!
	int offset=0;
	%>
	
	<!-- 
	Display the page details for ex:
	Showing 1-5 of 17 products
	-->
	
	<%
	String move = request.getParameter("move"); //Get the value of the "move" parameter from the request.
	if(move!=null){
		// TODO - write the boundary code
		if(move.equals("next"))
			offset+=5;  
		else if(move.equals("prev"))
			offset-=5;
	}

	
	ProductDataLoader loader=new ProductDataLoader(); //Create an instance of the ProductDataLoader class to load product data.
	List<Product> list=loader.loadProducts(offset);  // Loop through the list of products obtained from the ProductDataLoader.
	for(Product product : list){
	 %>		
	 		<div class="card">
	 			<div class="container">
	 				<h4><b><%= product.getName() %></b></h4>
	 				<p><%= product.getPrice() %></p>
	 				<p><%= product.getQuantity() %></p>
	 			</div>
	 		</div>
	 		
	 <%
			}
	 %>
	 <div class="card links">
	 	<a href="pagination3.jsp?move=prev">Previous</a>
	 	<a href="pagination3.jsp?move=next">Next</a>
	 </div>
</body>
</html>

		