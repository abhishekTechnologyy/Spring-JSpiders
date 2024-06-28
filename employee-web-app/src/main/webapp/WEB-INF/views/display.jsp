<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Employee Details Found</h2>

	<h3>Employee Name:${employee.getName()}</h3>
	<h3>Employee Phone:${employee.getPhone()}</h3>
	<h3>Employee email:${employee.getEmail()}</h3>
	<h3>Employee Id:${employee.getId()}</h3>
	<h3>Gender:${employee.getGender()}</h3>
	<h3>Designation:${employee.getDesg()}</h3>
	<h3>Salary:${employee.getSalary()}</h3>

</body>
</html>