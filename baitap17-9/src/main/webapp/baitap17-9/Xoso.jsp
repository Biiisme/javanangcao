<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hôm nay ,Ngày ... tháng ... năm ...
	<hr>
	Chọn ngày :
	<select>
	<% for(int i =0 ;i<30;i++) {%>
	<option> <%=i %> </option>
	
	<%} %>
	</select>
	Chọn tháng :
	<select>
	<% for(int i =0 ;i<30;i++) {%>
	<option> <%=i %> </option>
	
	<%} %>
	</select>
	Chọn năm :
	<select>
	<% for(int i =0 ;i<30;i++) {%>
	<option> <%=i %> </option>
	
	<%} %>
	</select>
	Kết quả : 
</body>
</html>