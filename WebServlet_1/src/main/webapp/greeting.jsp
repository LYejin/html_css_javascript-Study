<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>VIEW PAGE</h3>
	UI코드 담당
	<hr>
	<%= request.getAttribute("result") %>
	<hr>
	<%= request.getAttribute("result2") %>
	<hr>
	EL: ${requestScope.msg}<br>
</body>
</html>