<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<table>
		<tr>
			<td>Student ID</td>
			<td>${student.id}
		</tr>
		<tr>
			<td>Student FirstName</td>
			<td>${student.firstName}
		</tr>
		<tr>
			<td>Student LastName</td>
			<td>${student.lastName}
		</tr>
		<tr>
			<td>Student Email</td>
			<td>${student.email}
		</tr>
		<tr>
			<td>Student DOB</td>
			<td>${student.dob}
		</tr>
		<tr>
			<td>Student Mobile</td>
			<td>${student.mobile}
		</tr>
		<tr>
			<td>Student Skill Set</td>
			<td>${student.skills}
		</tr>
		<tr>
			<td>Student Address</td>
			<td>City : ${student.address.city}</td>
			<td>State : ${student.address.state}</td> 
			<td>Country : ${student.address.country}</td>
			<td>Pincode : ${student.address.pincode}</td>
		</tr>

	</table>
</body>
</html>