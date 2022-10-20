<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Criminal Details</title>
</head>
<body>
<h2>${records}</h2>
<br><br>
<h1>Enter Criminal Details</h1>
<br><br>
<a href="FindByName.jsp">FindByName</a>
<br><br>
<a href="FindByAgeCountryAndCriminalType.jsp">FindByAgeCountryAndCriminalType</a>
<br><br>
<a href="findMarriedByAge.jsp">FindMarriedByAge</a>
<form action="Criminal" method="post">
<br><br>
Name:<input type="text" name="name">
<br><br>
Age:<select name="age">
<option>Select</option>
<c:forEach begin="12" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select>
<br><br>
Country:<select name=country>
<option>select</option>
<option>India</option>
<option>USA</option>
<option>PAK</option>
<option>AUS</option>
<option>NZ</option>
<option>WI</option>
</select>
<br><br>
Criminal Type:<select name=criminalType>
<option>select</option>
<option>Full Murder</option>
<option>Half Murder</option>
<option>Rape</option>
<option>Terirest</option>
</select>

<br><br>
NoOfCases:<select name="noOfCases">
<option>select</option>
<c:forEach begin="1" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select>
<br><br>
Alive:<input type="radio" name="alive" value="Alive">Alive
<input type="radio" name="alive" value="NotAlive">NotAlive
<br><br>
Gender:<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="other">other
<br><br>
International:<input type="radio" name="international" value="International">International
<input type="radio" name="international" value="Local">Local
<input type="radio" name="international" value="other">other
<br><br>
Married:<input type="radio" name="married" value="Married">Married
<input type="radio" name=married value="Local">UnMarried
<input type="radio" name="married" value="other">other
<br><br>
JailTerm:<select name="jailTerm">
<option>select</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select>
<br><br>
WifeName:<input type="text" name="wifeName"/>
<br><br>
Right Hand Name:<input type="text" name="rightHandName"/>
<br><br>
Left Hand Name:<input type="text" name="leftHandName"/>
<br><br>
Prison Name:<input type="text" name="prisonName"/>
<br><br>
Net Worth:<input type="text" name="netWorth"/>
<br><br>
<input type="submit" value="Save Record">

</form>
<br><br>
<a href="Criminal">Click to Show All Details of Criminals</a>
<a href="FindByName.jsp">FindByName</a>

</body>
</html>