<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int radius = Integer.parseInt(request.getParameter("c_radius"));
%>
<h3>The Area of Circle is is <%= 3.14 * radius * radius %></h3>
</body>
</html>