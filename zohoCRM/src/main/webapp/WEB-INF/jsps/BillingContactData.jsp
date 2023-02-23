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
	<h2 align="center">Data Save in Billing table </h2>
	<table>
		<tr> 
			<th>FirstName</th>
			<th>LastName</th>
			<th>Product</th>
			<th>Amount</th>
			<th>GST</th>
			<th>Amount+GST</th>
		</tr>
		<c:forEach var="lead" items="${contactsData}">
		<tr>
			<td>${lead.firstName}</td>
			<td>${lead.lastName}</td>
			<td>${lead.product}</td>
			<td>${lead.amount}</td>
			<td>${lead.gstTax}</td>
			<td>${lead.amountGst}</td>
	    </tr>
		</c:forEach>
	</table>
</body>
</html>