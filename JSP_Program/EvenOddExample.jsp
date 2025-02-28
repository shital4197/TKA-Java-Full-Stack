<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Even Odd Example</h1>

	<%!int a = 10; %>

	<%
	if (a % 2 == 0) {
		out.print("<B style = 'color:red '>" + a +"  "+"Number is Even!" +"<B>");
	} else {
		out.print("<B style = 'color:blue'>"+ a +" "+"Number is odd"+"<B>");
	}
	%>

</body>
</html>