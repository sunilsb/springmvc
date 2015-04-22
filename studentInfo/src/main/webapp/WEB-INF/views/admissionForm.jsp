<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Admission Form</title>
</head>
<body>
	<h1>${message}</h1>
	<h2>Student Admission Form</h2>
	<form:errors path="student.*"/>
	<form action="submitAdmissionForm" method="post">
		<table>
			<tr>
				<td>Student Id :</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Student FirstName :</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Student LastName :</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Student Gender :</td>
				<td><input type="radio" name="gender" value="Male">Male<br>
				<input type="radio" name="gender" value="Female">Female</td>
			</tr>			
			<tr>
				<td>Student Email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Student DOB :</td>
				<td><input type="text" name="dob" /></td>
			</tr>
			<tr>
				<td>Student Mobile :</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td>Student Hobby :</td>
				<td><input type="text" name="hobby" /></td>
			</tr>

			<tr>
				<td>Student Skills :</td>
				<td><select name="skills" multiple="multiple">
						<option value="Java Core">Core Java</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
				</select></td>
			</tr>
		</table>

		<table>
			<tr>
				<td>Student Address</td>
			</tr>
			<tr>
				<td>City Name :</td>
				<td><input type="text" name="address.city" /></td>
			</tr>
			<tr>
				<td>State Name :</td>
				<td><input type="text" name="address.state" /></td>
			</tr>
			<tr>
				<td>Country Name :</td>
				<td><input type="text" name="address.country" /></td>
			</tr>
			<tr>
				<td>Pincode :</td>
				<td><input type="text" name="address.pincode" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="SubmitForm"></td>
			</tr>
		</table>

	</form>
</body>
</html>