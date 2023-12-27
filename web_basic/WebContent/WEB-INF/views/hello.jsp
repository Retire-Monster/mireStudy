<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Echo message</title>
</head>
<body>
<h1>JSP forwarding</h1>
<h1>Method : ${requestScope.method}</h1>
<!-- '%' 뒤의 '=' 값이 out.write 를 대신 입력한다. -->
<h1>To : <%=request.getParameter("who") %></h1>
<!-- 위 형태를 더 줄이면 다음과 같이 입력 할 수 있다. -->
<h1>Message : ${param.message}</h1>
</body>
</html>