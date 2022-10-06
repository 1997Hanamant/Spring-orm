<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<h1>Application Details</h1>
	<form action="operation.do" method="Post">
	<a href="even.do" >Display</a>
	<a href="CommittedSuicide.jsp">Committed Suicide Details</a>
	
	<br><br>
		Name <input type="text" id="name" name="ApplicantName"> 
		<br><br>
		Company <input type="text" id="company" name="ApplicantCompany"> 
		<br><br>
		Year <input type="text" id="year" name="ApplicantYear"> 
		<br><br>
		Version <input type="text" id="Version" name="ApplicantVersion"> 
		<br><br>
		Size <input type="text" id="size" name="ApplicantSize"> 
		<br><br>
			Technology <input type="text" id="technology" name="ApplicantTechnology">
			<br><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>