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
<form action="TriangleCalc.jsp" method="POST">
<div class="mb-3 row">
<label class="form-label">Base of Triangle</label>
<div class="col-sm-10">
<input type="number" name="b_tri" class="form-control"
required />
</div>
</div>
<div class="mb-3 row">
<label class="form-label">Height of Triangle</label>
<div class="col-sm-10">
<input type="number" name="h_tri" class="form-control"
required />
</div>
</div>
<input type="submit" class="btn btn-primary" value="Find Area">
</form>
</div>
</body>
</html>