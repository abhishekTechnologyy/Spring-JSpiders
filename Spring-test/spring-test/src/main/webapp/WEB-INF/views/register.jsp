<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="merchant" method="post">
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<br>
		<form:label path="phone">Phone Number</form:label>
		<form:input path="phone" />
		<br>
		<form:label path="email">Email Id</form:label>
		<form:input path="email" />
		<br>
		<form:label path="gstNumber">Gst_number</form:label>
		<form:input path="gstNumber" />
		<br>
		<form:label path="password">Password</form:label>
		<form:password path="password" />
		<br>
		<form:button>Register</form:button>
	</form:form>
</body>
</html>