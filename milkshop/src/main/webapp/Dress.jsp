<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Dress Details</title>
</head>
<body>
<form action="Dress" method="post">
<br><br>
Brand:<input type="text" name="brand">
<br><br>
Size:<select name="size">
<option>select</option>
<option>small</option>
<option>medium</option>
<option>Large</option>
</select>
<br><br>
Price:<input type="text" name="price">
<br><br>
Discount:<select name="discount">
<option>select</option>
<option>10%</option>
<option>20%</option>
<option>30%</option>
</select>
<br><br>
Quantity:<select name="quantity">
<option>select</option>
<c:forEach begin="1" end="1000" var="index">
<option value="${index}">${index}</option> 


</c:forEach>

</select>
<br><br>
Gender:<input type="radio" name="gender" value="male"/>male
<input type="radio" name="gender" value="female"/>female
<input type="radio" name="gender" value="other"/>other
<br><br>
Color:<select name="color">
<option>select</option>
<option>White</option>
<option>Red</option>
<option>Black</option>
<option>Green</option>
<option>Yellow</option>
</select>
<br><br>

<input type="submit" value="save"/>
</form>
</body>
</html>