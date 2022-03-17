<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create a JSP page to display current date and time</h2>
<br />
<h3>Current Date and Time is :
<% java.util.Date d = new java.util.Date();%>
<%= d.toString() %></h3>
</body>
</html>