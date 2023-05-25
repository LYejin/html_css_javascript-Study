<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%-- <%
	String name = request.getParameter("name");
	if (name.equals("kglim")) {
		out.print("<b>" + name + "</b>");
	} else if (name.equals("hong")){
		out.print("<i>" + name + "</i>");
	} else {
		out.print("<h3>" + name + "</h3>");		
	}
	out.print("<hr>");
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 위 코드 결과와 동일하게 EL & JSTL 변환하세요 -->
<ul>
	<c:choose>
		<c:when test="${param.name =='kglim'}">
			<b>${param.name}</b>
		</c:when>
		<c:when test="${param.name =='hong'}">
			<i>${param.name}</i>
		</c:when>
		<c:otherwise>
			<h3>${param.name}</h3>
		</c:otherwise>
	</c:choose>
	<hr>
</ul>
</body>
</html>