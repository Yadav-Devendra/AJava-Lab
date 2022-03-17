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
int b_tri = Integer.parseInt(request.getParameter("b_tri"));
int h_tri = Integer.parseInt(request.getParameter("h_tri"));
%>
<h3>
The Area of Triangle is
<%= 0.5 * b_tri * h_tri %></h3>
</body>
</html>