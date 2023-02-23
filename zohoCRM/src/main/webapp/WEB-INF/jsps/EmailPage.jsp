<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Page</title>
</head>
<body>
	<h2 align="center">Email Send Page</h2>
 <form action="sendMail" method="post">
	<table>
	    <tr>
	      <td>Email</td>
	      <td><input type="text" name="email" value="${email}"></td>
	    </tr>
	      <tr>
	      <td>Subject</td>
	      <td><input type="text" name="subject"></td>
	    </tr>
	      <tr>
	      <td>Field</td>
	      <td><textarea  name="field" rows="4" cols="50"></textarea></td>
	    </tr>
	 </table>
	 <br>
	 <input type="submit" value="Send Email">
 </form>  
 <br>
 <div>${msg } </div>  
</body>
</html>