<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Users</title>
</head>
<body>

	<div align="center">
		<h2>Edit/Update User</h2>
		<form:form method="post" modelAttribute="updateemp">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID:</td>
					<td>${updateemp.id}
					 <form:hidden path="id"/>
					</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
