<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Login Page</title>

<style>
	.failed{
		color:red;
	}
</style>

</head>
<body>

	<h3>MY Custom Login Page</h3>

	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
	
		<c:if test="${param.error!=null}">
		
		<i class="failed">Sorry you added wrong user name/password</i>
		
		</c:if>
		<p>
			User Name : <input type="text" name="username">
		</p>
		
		<p>
			Password : <input type="password" name="password">
		</p>
		
		<input type="submit" value="Login"/>

	</form:form>

</body>
</html>