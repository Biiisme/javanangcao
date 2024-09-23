<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Bảng cửu chương</h1>
	<form method ="get" action ="BangCuuChuong.jsp">


<!-- Hiển thị kết quả -->

	<% for(int i=1;i<=9;i++){ %>

	<input type = "submit" name= "Tich" value = "<%=i%>">

	<%} %>

</form>
	   <%
        // Lấy giá trị bảng cửu chương được chọn
        String tichValue = request.getParameter("Tich");
        if (tichValue != null) {
            int i = Integer.parseInt(tichValue);
   	 %>

    <!-- Hiển thị bảng cửu chương được chọn -->
    <h2>Bảng cửu chương <%=i%></h2>
	<table class = "table table-bordered table-hover" ,style="display: flex;">
	
		
		<%
		for (int j = 1;j<=10;j++){%>
			<td>
				
					<%=i%> * <%=j%> = <%=i*j%> 
					
			</td>
			<%} }%>
		
		
		
	</table>
</body>
</html>