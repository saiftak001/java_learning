<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration form</title>
<style>
.error {color :red
	
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name : <form:input path="firstName" />

		<br>
		<br>
		
		Last name(*) : <form:input path="lastName" />

		<form:errors path="lastName" cssClass="error" />

		<br>
		<br>
		Free Space : <form:input path="freeSpace"/>
		<form:errors path="freeSpace" cssClass="error"/>
		<br>
		<br>

		<%-- Test
		
			<form:select path="country">
			<form:option value="Test1" label="Test 1" />
			<form:option value="Test2" label="Test 2" />
			<form:option value="Test3" label="Test 3" />

		</form:select> --%>
			
		Country
		<form:select path="countryCode">
			<form:options items="${student.countryCode}" />
		</form:select>

		<br>
		<br>
		<input type="submit" value="Submit">

	</form:form>

</body>
</html>