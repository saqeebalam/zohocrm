<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
    <!-- put jstl tag in pom.xml aur taglib other wise it show error or warming -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Data Save in Leads table </h2>
	<table>
		<tr> 
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		<c:forEach var="lead" items="${leads}">
		<tr>
			<td> <a href="ledInfo?id=${lead.id}">${lead.firstName}</a></td>
			<td>${lead.firstName}</td>
			<td>${lead.lastName}</td>
			<td>${lead.email}</td>
			<td>${lead.mobile}</td>
	    </tr>
		</c:forEach>
	</table>
</body>
</html>