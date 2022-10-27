<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display User Details</title>
</head>
<body>
	<h2>${msg}</h2>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>UserName</th>
				<th>Email</th>
				<th>FileName</th>
			<tr>
				<c:forEach items="${UsersDTO}" var="dto">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.userName}</td>
						<td>${dto.email}</td>
						<td><img src="strat/image?fileName=${dto.fileName}"
							width="200px" height="200px"></img></td>

					</tr>
				</c:forEach>
		</thead>
	</table>
</body>
</html>