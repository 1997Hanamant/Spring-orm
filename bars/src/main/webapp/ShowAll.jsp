<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Showing Bars Details</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Location</th>
				<th>Price</th>
				<th>OwnerName</th>
				<th>NoOfWorkers</th>
				<th>FileName</th>
			</tr>

			<c:forEach items="${BarsDTO}" var="dto">
				<tr>
					<td>${dto.id}</td>
					<td>${dto.name}</td>
					<td>${dto.location}</td>
					<td>${dto.price}</td>
					<td>${dto.ownerName}</td>
					<td>${dto.noOfWorkers}</td>
					<td><img src="drinks/send?fileName=${dto.fileName}"
						width="200px" height="200px"></img></td>
				</tr>
			</c:forEach>

		</thead>

	</table>

</body>
</html>