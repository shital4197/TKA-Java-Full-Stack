<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Arithmatic Operations </title>
</head>
<body>

	<h1 style='background-color: blue'>Welcome JSP Tags</h1>

	<%! public int addition(int a , int b) {
        	  return a+b;  
          } %>
          
          	<%!
          public int subtraction(int a , int b) {
        	  return a-b;  
          } %>
          
          	<%!
          public int multiplication(int a , int b) {
        	  return a*b;  
          } %>
          
          	<%!
          public int division(int a , int b) {
        	  return a/b;  
          } %>
	<h2>
		Addition is :
		<%= addition(3,3) %>
	</h2>
	
	<h2>
		Subtraction is :
		<%= subtraction(5,3) %>
	</h2>
	
	<h2>
		Multiplication is :
		<%= multiplication(5,3) %>
	</h2>
	
	<h2>
		Division is :
		<%= division(9,3) %>
	</h2>
	


</body>
</html>