<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Bars Details</title>
</head>
<body>
	<h2>${msg}</h2>
	<h2>${BarsDTO}</h2>
	<form action="drinks" method="post" enctype="multipart/form-data">
		<br> <br> Name:<input type="text" name="name"> <br>
		<br> Location:<select name="location">
			<option>Select</option>
			<option>BTM</option>
			<option>RR Nagara</option>
			<option>Mejestic</option>
			<option>Hubli</option>
			<option>Dharwad</option>
			<option>VijayPur</option>
		</select> <br> <br> Price:<input type="text" name="price"> <br>
		<br> OwnerName:<input type="text" name="ownerName"> <br>
		<br> NoOfWorkers:<select name="noOfWorkers">
			<c:forEach begin="5" end="20" var="index">
				<option>Select</option>
				<option value="${index }">${index}</option>
			</c:forEach>
		</select> <br> <br> UploadFile:<input type="file" name="files">
		<br> <br> <input type="submit" value="save"> <br>
		</br>
	</form>
	<a href="drinks">ShowAll Bar Details</a>
	<br></br>
	<a href="FindByName.jsp">FindByName</a>
	<br></br>
	<a href="FindFileName.jsp">FindFileName</a>
</body>
</html>