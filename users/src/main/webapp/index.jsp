<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users Details</title>
</head>
<body>
	<h2>${Msg}</h2>
	<h2>${Msg1}</h2>
	<h2>${UsersDTO}</h2>
	<form action="strat" method="post" enctype="multipart/form-data">
		<br> <br> UserName:<input type="text" name="userName">
		<br> <br> Email:<input type="text" name="email"> <br>
		<br> UploadFile:<input type="file" name="files"> <br>
		<br> <input type="submit" value="Save">

	</form>
	<a href="strat">DisplayAll</a>
	<br></br>
	<a href="FindByUserName.jsp">FindByUserName</a>
	<br>
	<br>

</body>
</html>