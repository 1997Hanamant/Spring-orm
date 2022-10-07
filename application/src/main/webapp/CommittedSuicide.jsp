<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Committed Suicide Details</title>
</head>
<body>
<h3>${name}</h3>
<h3>${DTO}</h3>
<h3>${type}</h3>
	<form action="Create.do">
		<br>
		<br> Name:<input type="text" name="name" /> <br>
		<br> Age:<input type="text" name="age" /> <br>
		<br> Reason:
		<textarea rows="4" cols="10" name="reason"></textarea>
		<br>
		<br> Gender:<input type="radio" name="gender" value="Female">Female
		<input type="radio" name="gender" value="male">Male <input
			type="radio" name="gender" value="TransGender">TransGender <br>
		<br> NoOfAttempts:<input type="text" name="noOfAttempts">
		<br>
		<br> Spot:<input type="text" name="spot" /> <br>
	
	<br> DateAndTime:<input type="text" name="dateAndTime" /> <br>
	
		<br> Type:<select name="type">
			<option>select</option>
			<option>Hanging</option>
			<option>Railway Track</option>
			<option>Jumping From Building</option>
			<option>Jumping into Bavi,Kere</option>
		</select> <br>
		<br> <input type="Submit" value="Send"
			style="color: White; background: blue;">

	</form>
</body>
</html>