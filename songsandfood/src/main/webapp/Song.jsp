<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Song Details</title>
</head>
<body>
<fieldset>
<h1>Enter Songs Details</h1>
<h3>${SongsDto.name}</h3>
	<form action="song.do" method="Post">
		<br>
		<br> Name:<input type="text" name="name" /> <br>
		<br> Singer:<input type="text" name="singer" /> <br>
		<br> Duration:<input type="text" name="duration" /> <br>
		<br> Producer:<input type="text" name="producer" /> <br>
		<br> Lyrics:<input type="text" name="lyrics" /> <br>
		<br> Language:<select name="language">
			<option>select</option>
			<option>Kannada</option>
			<option>Hindi</option>
			<option>English</option>
			<option>Telugu</option>
		</select> <br>
		<br> Type:<select name="type">
			<option>select</option>
			<option>ItemSongs</option>
			<option>LoveSongs</option>
			<option>PathoSongs</option>
			<option>DevotionalSongs</option>
		</select> <br>
		<br> <input type="Submit" value="Add"
			style="color: White; background: blue;"> <br>
		<br>
	</form>
	</fieldset>
</body>
</html>