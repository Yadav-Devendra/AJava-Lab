<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h2>Create JSP page to demonstrate the use of
scriplet, expression and declaration tag</h2>
<h5>SOURCE CODE:</h5>
<pre>
Declaration Tag:
< %! int a=10; % >
< %! int b=10; % >
Scriplet Tag:
< % int t=a+b; % >
Expression:
< % = t % > 
</pre>
<h5>OUTPUT:
<%! int a = 10; %>
<%! int b = 10; %>
<% int t = a+b; %>
<%= t %>
</h5>
</div>
</body>
</html>