<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="minister" method="post">
		Prime Minister Name: <input type="text" id="name"
			name="PrimeMinistername"> <br>
		<br> Prime Minister Country: <select id="Country"
			name="PrimeMinisterCountry">
			<option>Select</option>
			<option value="India">India</option>
			<option value="USA">USA</option>
			<option value="Canada">Canada</option>
		</select> <br><br> Marriage: <input type="radio" id="marriage" name="Marriage"
			value="Married">Married <input type="radio" id="marriage"
			name="Marriage" value="UnMarried"> UnMarried  <br><br>Party: <select
			name="PartyName">
			<option>Select</option>
			<option value="BJP">BJP</option>
			<option value="Congress">Congress</option>
			<option value="JDS">JDS</option>
		</select> <br><br> 
		Age: <input type="Text" id="age" name="PrimeMinisterAge">
		 <br><br> 
		
		Gender: <input type="radio" id="gender" name="PrimeMinisterGender" value="male"> male
		<input type="radio" id="gender" name="PrimeMinisterGender" value="Female"> Female
		<input type="radio" id="gender" name="PrimeMinisterGender" value="other"> other
		<br><br>
		 Period: <input type="text" id="period" name="PrimeMinisterPeriod">
			 <br><br>
			 Times Represented:<select id="Times" name="Times Represented">
			 <option>Select</option>
			<option value="1">1</option>
		    <option value="2">2</option>
		    <option value="3">3</option>
		    <option value="4">4</option>
		    <option value="5">5</option>
		</select> 
		 <br><br>
		<input type="submit" value="Submit">
	</form>

</body>
</html>