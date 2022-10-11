<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Country Details</title>
</head>
<body>
	<form action="display.do" method="Post">
		<br>
		<br> Name:<input type="text" name="name" /> <br>
		<br> Email:<input type="text" name="email" /> <br> City:
		<br><br>
		<c:forEach items="${cities}" var="dto">
			<ul name="city">
			<li>${dto.city}</li>
			
			</ul>
				


		</c:forEach>

		<br>
		<br> <input type="submit" value="Save">


	</form>

</body>
</html>