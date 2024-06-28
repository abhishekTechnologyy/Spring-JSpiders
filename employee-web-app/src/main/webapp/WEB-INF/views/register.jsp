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

	<form:form modelAttribute="emp" action="save" method="post">

		<form:label path="name"> Name </form:label>
		<form:input path="name" />
		<br>

		<form:label path="phone"> Phone Number </form:label>
		<form:input path="phone" />
		<br>

		<form:label path="desg"> Designation </form:label>
		<form:input path="desg" />
		<br>

		<form:label path="salary"> Salary </form:label>
		<form:input path="salary" />
		<br>

		<form:label path="gender"> Gender </form:label>
	Male <form:radiobutton path="gender" value="Male" />
	Female <form:radiobutton path="gender" value="Female" />
		<br>

		<form:label path="email"> Email Id </form:label>
		<form:input path="email" />
		<br>

		<form:label path="password"> Password </form:label>
		<form:input path="password" />
		<br>

		<form:button> Register </form:button>
		<br>

	</form:form>

</body>
</html>