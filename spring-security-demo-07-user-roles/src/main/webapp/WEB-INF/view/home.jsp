<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>Welcome to my Company</p>

	<hr>

	<p>
		User :
		<security:authentication property="principal.username" />
		<br><br>
		Role(s) : <security:authentication property="principal.username" />
	</p>

	</hr>

	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		<input type="submit" value="Logout" />

	</form:form>

</body>
</html>