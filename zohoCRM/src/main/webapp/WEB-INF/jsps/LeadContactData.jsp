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
	<h2>Data Save in Contacts table </h2>
	<table>
		<tr> 
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Billing</th>
		</tr>
		<c:forEach var="lead" items="${contactsData}">
		<tr>
			<td>${lead.firstName}</td>
			<td>${lead.lastName}</td>
			<td>${lead.email}</td>
			<td>${lead.mobile}</td>
			<td> <a href="billing?id=${lead.id}">Billing</a></td>
	    </tr>
		</c:forEach>
	</table>
</body>
</html>