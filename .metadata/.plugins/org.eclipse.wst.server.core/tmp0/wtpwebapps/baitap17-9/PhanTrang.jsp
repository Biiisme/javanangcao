<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
Ban vua chon trang : <%=request.getParameter("t") %>
<hr>
	<% for (int i= 0;i<=20;i++){ %>
	<a href="PhanTrang.jsp?t=<%=i%>">
		<%=i %>
	</a>
	<% }%>
</body>
</html>