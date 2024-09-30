<%@page import="Tam.CGioHang"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method='post' action ='DatHang.jsp'>
	 Ten hang <input type='text' name='txtth'><br>
	 Gia <input type='text' name='txtgia'><br>
	 So luong <input type='text' name='txtsl'><br>
	<input type='submit' name='un1' value='Dat Hang'>
	</form>
Gio hang

<%
 
	String th = request.getParameter("txtth");
	String gia = request.getParameter("txtgia");
	String sl = request.getParameter("txtsl");
	CGioHang g = (CGioHang) session.getAttribute("gh");
	
	// Nếu giỏ hàng trống thì tạo mới
	if (g == null) {
	    g = new CGioHang();
	    session.setAttribute("gh", g);
	}
	
	// Thêm hàng vào giỏ
	if (th != null && gia != null && sl != null) {
	    g.Them(th, Integer.parseInt(gia), Integer.parseInt(sl));
	    session.setAttribute("gh", g);
	}
 
 	
 	//Xóa các mặt hàng đã chọn

 	 String[] itemsToDelete = request.getParameterValues("items");
 	 if (itemsToDelete != null) {
 	     for (String tenHang : itemsToDelete) {
 	         for (int i = 0; i < g.ds.size(); i++) {
 	             if (g.ds.get(i).getTenhang().equals(tenHang)) {
 	                 g.ds.remove(i);
 	                 break;
 	             }
 	         }
 	     }
 	 }

 	 // Xóa toàn bộ giỏ hàng
 	 String action = request.getParameter("action");
 	 if ("deleteAll".equals(action)) {
 	     g.ds.clear();
 	 }

 	 session.setAttribute("gh", g);
 	 
%>
<% 
//Hien thi do trong session: gh

  if (g.ds.size() > 0) { %>
 <form method="post" action="DatHang.jsp">
     <table border="1" width="100%">
         <tr>
             <th>Chon</th>
             <th>Ten Hang</th>
             <th>Gia</th>
             <th>So Luong</th>
             <th>Thanh Tien</th>
             
         </tr>
         <% for (int i = 0; i < g.ds.size(); i++) { %>
             <tr>
                 <td><input type="checkbox" name="items" value="<%= g.ds.get(i).getTenhang() %>"></td>
                 <td><%= g.ds.get(i).getTenhang() %></td>
                 <td><%= g.ds.get(i).getGia() %></td>
                 <td><%= g.ds.get(i).getSoluong() %></td>
                 <td><%= g.ds.get(i).getThanhtien() %></td>
                 
             </tr>
         <% } %>
     </table>
     
     <div align="right">
         Tong tien: <%= g.Tongtien() %>
     </div>

     <!-- Nút xóa các mặt hàng đã chọn -->
     <input type="submit" value="Xoa cac mat hang da chon">
     
     <!-- Nút xóa tất cả mặt hàng -->
     <input type="submit" name="action" value="deleteAll" onclick="return confirm('Ban co chac muon xoa mat hang?');">
 </form>
<% } else { %>
 <p>Gio hang cua ban dang trong.</p>
<% } %>

 
 
</body>
</html>