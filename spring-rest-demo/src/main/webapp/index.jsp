<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Spring Rest Demo

<hr>
<a href="${pageContext.request.contextPath}/test/hello" >Hello</a>

<hr> 

<a href="${pageContext.request.contextPath}/api/students" >Get All students</a>


</body>
</html>