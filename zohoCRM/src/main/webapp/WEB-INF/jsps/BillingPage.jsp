<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="savebill" method="post"> 
		<input type="hidden" name="id" value="${lead.id}">
		First Name<input type="text" name="firstName" value="${lead.firstName}">
		Last Name<input type="text" name="lastName" value="${lead.lastName}">
		Product<input type="text" name="product" >
		Amount<input type="number" name="amount">
		GST<input type="number" name="gstTax"> give in points
		<input type="submit" value="Generate Button">
	</form>

</body>
</html>