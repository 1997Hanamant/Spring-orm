<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="True"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Display All Details</h1>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>CompanyName</th>
				<th>Year</th>
				<th>Version</th>
				<th>Size</th>
				<th>Technology</th>
			</tr>
		</thead>
		<tbody>
 
			<c:forEach
				items="${Name} ${Company} ${Year} ${Version} ${Size} ${Technology}"
				var="u">

				<tr>
					<td>${Name}</td>
					<td>${Company}</td>
					<td>${Year}</td>
					<td>${Version}</td>
					<td>${Size}</td>
					<td>${Technology}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>