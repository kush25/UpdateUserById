<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>
	<h1 style="color: blue" >
		 List of Users
	</h1>
	<ul>
	
	<table border="1">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Update By Id</th>
	
				</tr>
				
		<c:forEach items="${usrlist}" var="users">

				<tr>
					<td>${users.id}</td>

					<td>${users.name}</td>
					
					<td><a href="/edituser/${users.id}">Update User</a> </td>
						
				</tr>
				
			
			
		</c:forEach>
	
	</table>	
		
	</ul>
		
		<br/>

</body>
</html>