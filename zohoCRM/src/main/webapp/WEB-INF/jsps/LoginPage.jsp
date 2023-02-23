<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h2 style="text-align:center;">Enter Leads Details</h2>
	<form action="saveLead" method="post">
	  <h4 align="center">Personal Details</h4>
	  <table>
	    <tr>
	      <td>First Name</td>
	      <td><input type="text" name="firstName"/></td>
	    </tr>
	     <tr>
	      <td>Last Name</td>
	      <td><input type="text" name="lastName"/></td>
	    </tr>
	    <tr>
	      <td>Email</td>
	      <td><input type="text" name="email"/></td>
	    </tr>
	    <tr>
	      <td>Mobile Number</td>
	      <td><input type="number" name="mobile"/></td>
	    </tr>
	  </table>
	  <h4>Where You Get To Know</h4>
	 <label for="source">Chose your Degree:</label>
  <select name="source" >
    <option value="website">WEBSITE</option>
    <option value="tradeshow">TRADE SHOW</option>
    <option value="newspaper">NEWSPAPER</option>
    <option value="magagine">MAGAGINE</option>
  </select>
  <br><br>
	<input type="submit" value="Save">
	</form>
	Message:-${result}
</body>
</html>