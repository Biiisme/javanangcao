/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2024-09-16 17:12:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import java.time.LocalDate;

public final class XosoKT_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.time.LocalDate");
    _jspx_imports_classes.add("java.util.Random");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Xổ số kiến thiết</title>\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"xoso.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
 LocalDate today= LocalDate.now();
	Random random=new Random();
	
      out.write("\r\n");
      out.write("\t<div class=\"bg-danger header\">\r\n");
      out.write("          <span>Chào mừng quý vị và các bạn đã đến với chương trình xổ số của chúng tôi</span>\r\n");
      out.write("     </div>\r\n");
      out.write("\t<table class=\"table table-bordered\" style=\"margin-bottom: 0px\">\r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t \t<th style=\"text-align: center;font-size: 25px; color: white; background-color: red;\">\r\n");
      out.write("   \t\t Xổ số kiến thiết ngày: ");
      out.print( request.getParameter("ngay") );
      out.write('/');
      out.print( request.getParameter("thang") );
      out.write('/');
      out.print( request.getParameter("nam") );
      out.write("\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table class=\"table table-bordered select\" style=\"margin-bottom: 0px\">\r\n");
      out.write("\t\t<tr style=\"text-align: center;\">\r\n");
      out.write("\t\t\t<td>Chọn Ngày</td>\r\n");
      out.write("\t\t\t<td>Chọn Tháng</td>\r\n");
      out.write("\t\t\t<td>Chọn Năm</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("  \t\t\t<td > \r\n");
      out.write("\t \t\t\t<form action=\"XosoKT.jsp\" method=\"get\"> \r\n");
      out.write("\t\t\t\t<select id=\"selectNgay\" style=\"width: 100px;position: relative; left: 200px\" name=\"ngay\">\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print( request.getParameter("ngay") );
      out.write('"');
      out.write('>');
      out.print( request.getParameter("ngay") );
      out.write("\t\r\n");
      out.write("\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t");
for(int i = 1 ; i <= 31 ; i ++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t");

					} 
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td> \r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<select id=\"selectThang\" style=\"width: 100px ;position: relative; left: 200px\" name=\"thang\">\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print( request.getParameter("thang") );
      out.write('"');
      out.write('>');
      out.print( request.getParameter("thang") );
      out.write("\t\r\n");
      out.write("\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t");
for(int i = 1 ; i <= 12 ; i ++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t");
 
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t</select> \r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t\t<select  id=\"selectNam\" style=\"width: 100px ; position: relative; left: 200px\" name=\"nam\">\r\n");
      out.write("\t\t\t\t\t<option value= \"");
      out.print( request.getParameter("nam") );
      out.write('"');
      out.write('>');
      out.print( request.getParameter("nam") );
      out.write("\t\r\n");
      out.write("\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t");
for(int i = 2023 ; i >= 2014 ; i--){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td style=\"width: 150px; text-align: center;\">\r\n");
      out.write("       \t\t <button type=\"submit\" class=\"btn btn-danger\">Xem Kết Quả</button>\r\n");
      out.write("    </td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\" style=\"margin-bottom: 0px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 150px ; text-align: center;\">Đặc biệt</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(1000000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 150px ; text-align: center;\">Giải Nhất</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000));
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table> \r\n");
      out.write("\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\" style=\"margin-bottom: 0px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"width: 150px ; text-align: center;\">Giải Nhì</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\" style=\"margin-bottom: 0px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 150px ; text-align: center;\">Giải Ba</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\" style=\"margin-bottom: 0px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 150px ; text-align: center;\">Giải Tư</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\t\t\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100000) );
      out.write("</td>\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\" style=\"margin-bottom: 0px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 150px ; text-align: center;\">Giải Năm</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(10000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(10000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(10000) );
      out.write("</td>\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 150px ; text-align: center;\">Giải Sáu</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(1000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(1000) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(1000) );
      out.write("</td>\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\" style=\"margin-bottom: 0px\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"width: 150px ; text-align: center;\">Giải Bảy</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100) );
      out.write("</td>\t\t\r\n");
      out.write("\t\t\t\t\t<td style=\"text-align: center;\">");
      out.print(random.nextInt(100) );
      out.write("</td>\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}