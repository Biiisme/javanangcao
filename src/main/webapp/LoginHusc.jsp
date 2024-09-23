<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
link <link rel="stylesheet" type="text/css" href="login.css">
<title>Insert title here</title>
</head>
<body>
	
	<div class="container">
        
        <form class="register-form" , action="LoginHusc.jsp" ,method="get">
            <h1>ĐĂNG NHẬP</h1>
            <label for="username">Username</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
			<%
                String username = request.getParameter("username");
                String password = request.getParameter("password");

                if (username != null && password != null) {
                    if (username.equals("21t1020693") && password.equals("123")) {
                        // Redirect to homepage when credentials are correct
                        response.sendRedirect("home.jsp");
                    } else {
                        // Show error message if login credentials are incorrect
            %>
                        <p style="color: red; font-size: 15px;">Thông tin đăng nhập không đúng!</p>
            <%
                    }
                }
            %>
            <button type="submit" >Login</button>
            
        </form>
        
    </div>
    <div class="image-section">
        <img src="https://student.husc.edu.vn/Themes/Login/images/logo-small.png" alt="Cute monster with popcorn and drink">
    </div>
</body>
</html>