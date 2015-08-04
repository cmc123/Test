/*package orz;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 int day = 3; 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/temp.jsp", Long.valueOf(1438310419151L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"temp.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("   \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=GB2312\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE1 {font-family: \"ËÎÌו\"}\r\n");
      out.write(".STYLE2 {color: #000000}\r\n");
      out.write(".STYLE3 {color: #CC0000}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>Hello World!<br/>\r\n");
      out.print(("Your IP address is " + request.getRemoteAddr())
 );
      out.write("\r\n");
      out.write(" <p>\r\n");
      out.write(" ");
      out.print(("Your server port is " + request.getServerPort()+"\n your server name is "+request.getServerName())
 );
      out.write("\r\n");
      out.write(" </p>\r\n");
      out.write(" <p>Today's date: ");
      out.print( (new java.util.Date()).toLocaleString());
      out.write("</p>\r\n");
      out.write(" ");
      out.write(" \r\n");
      out.write(" ");

 for (int i=0;i<day;i++)
 { 
      out.write("\r\n");
      out.write("\t <p>");
      out.print(i );
      out.write("</p>\r\n");

 }
 
      out.write('\r');
      out.write('\n');
      out.write(' ');
for(int j=0;j<day;j++){
      out.write("\r\n");
      out.write("\t <font color=\"red\">\r\n");
      out.write("\t ");

	 out.print(j);
	 }
	 
      out.write("\r\n");
      out.write("\t </font>\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("I am the temp page\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
      out.write(' ');
      action.testbean test = null;
      test = (action.testbean) _jspx_page_context.getAttribute("test", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (test == null){
        test = new action.testbean();
        _jspx_page_context.setAttribute("test", test, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      out.write(' ');
test.setMessage("hello!!!!"); 
      out.write("\r\n");
      out.write(" <p>\r\n");
      out.write(" ");

      out.write("\r\n");
      out.write(" </p> \r\n");
      out.write(" <p>");
Cookie c=new Cookie("user","balabala");
 c.setMaxAge(24*3600);
 response.addCookie(c); 
      out.write("</p>\r\n");
      out.write(" \r\n");
      out.write(" ");
 Cookie[] cookies=request.getCookies();

 for(int i=0;i<cookies.length;i++)
 {
      out.write("\r\n");
      out.write("   <p>\r\n");
      out.write("\t ");
out.println(cookies[i].getValue());
      out.write("  </p>\r\n");
 } 
      out.write("\r\n");
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
*/