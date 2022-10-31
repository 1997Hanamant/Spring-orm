<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title her</title>
</head>
<body>
<h2>${msg}</h2>
<c:forEach items="${BarsDTO}" var="dto">

<img src="drinks/send?fileName=${dto.fileName}"
						width="200px" height="200px"></img>

</c:forEach>

</body>
</html>