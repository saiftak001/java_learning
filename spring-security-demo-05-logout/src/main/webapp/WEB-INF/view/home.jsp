<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Welcome to my Company

	<form:form action="${pageContext.request.contextPath}/logout" 
			method="POST">
		<input type="submit" value="Logout"/>

	</form:form>

</body>
</html>