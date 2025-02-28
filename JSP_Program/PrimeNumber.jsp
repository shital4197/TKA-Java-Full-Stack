<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prime Number Example</title>
</head>
<body>

	<h1>Prime Number Example!</h1>
	
	<%!int num = 10;%>

	<%
	boolean isPrime = true;

	if (num < 2) {
		isPrime = false;
	} else {
		for (int i = 2; i <=  Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
	}

	if (isPrime) {
		out.print(num + " is a prime number!");
	} else {
		out.print(num + " is not a prime number!");
	}
	%>
	
	
</body>
</html>


