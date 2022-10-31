<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FindByName</title>
</head>
<body>
	<h2>FindByName</h2>
	<form action="drinks/findByName">
		<br></br> Name:<input type="text" name="name"> <br></br> <input
			type="submit" value="Search"> <br></br>
	</form>
</body>
</html>