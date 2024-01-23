<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bài 2.2</title>
</head>
<body>
	<%!int x=10; int y=0; int z; %>
	<% y=200;
		z = x+y;
		out.append("kết quả là");
		out.append(String.valueOf(z));
		%>
	<h2>HOẶC TA CÓ THỂ XUẤT KIỂU EXPRESSION</h2>
	<hr>
	<%="Kết quả là" %>
	<%=z %>
</body>
</html>