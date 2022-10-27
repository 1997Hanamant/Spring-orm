<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Criminal Details</title>
</head>
<body>
	<h1>Displaying Criminal Details</h1>
	<h2>${size}</h2>
    <h2>${msg}</h2>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Country</th>
				<th>CriminalType</th>
				<th>NoOfCases</th>
				<th>Alive</th>
				<th>Gender</th>
				<th>International</th>
				<th>Married</th>
				<th>JailTerm</th>
				<th>WifeName</th>
				<th>RightHandName</th>
				<th>LeftHandName</th>
				<th>PrisonName</th>
				<th>NetWorth</th>
			</tr>
			<c:forEach items="${CriminalDetails}" var="dto">
			<tr>
			<th>${dto.id}</th>
			<th>${dto.name}</th>
			<th>${dto.age}</th>
			<th>${dto.country}</th>
			<th>${dto.criminalType}</th>
			<th>${dto.noOfCases}</th>
			<th>${dto.alive}</th>
			<th>${dto.gender}</th>
			<th>${dto.international}</th>
			<th>${dto.married}</th>
			<th>${dto.jailTerm}</th>
			<th>${dto.wifeName}</th>
			<th>${dto.rightHandName}</th>
			<th>${dto.leftHandName}</th>
			<th>${dto.prisonName}</th>
			<th>${dto.netWorth}</th>
			</tr>
			</c:forEach>
		</thead>
	</table>
	<img src="Criminal/image?fileName=IMG_20180130_104352.jpg "width="100" height="100"></img>
</body>
</html>