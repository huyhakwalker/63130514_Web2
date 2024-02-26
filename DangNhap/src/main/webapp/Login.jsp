<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra tên đăng nhập và mật khẩu
        if (username.equals("ABC") && password.equals("MNK")) {
            response.sendRedirect("Index.html");
        } else {
            response.sendRedirect("Login.html");
        }
    %>
</body>
</html>