<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home Page</title>
	</head>
	<body>
		<h1 align="center" style="color: red;">Welcome to Home</h1>
		<form action="empList.do">
			Logged In ${loggedInUser}
			<input type="hidden" name="token" value="${token}"/>
		</form>
	</body>
</html>