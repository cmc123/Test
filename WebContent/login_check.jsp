<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.mysql.jdbc.Driver" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login_check</title>
</head>
<body>
<%!
public static final String DBdriver="com.mysql.jdbc.Driver";
public static final String DBurl="jdbc:mysql://localhost:3306/myuser";
public static final String DBuser="root";
public static final String DBpass="wasd123";
%>
<%
Connection conn=null;
Statement pstmt=null;
ResultSet rs=null;
boolean flag=false;
String name=null;
%>
<%
try{
	String a=request.getParameter("id");
	String b=request.getParameter("password");
	Class.forName(DBdriver);
	conn=DriverManager.getConnection(DBurl,DBuser,DBpass);
	pstmt=conn.createStatement();
	rs=pstmt.executeQuery("SELECT name FROM user WHERE name='"+a+"' AND password=+'"+b+"'");
	if(rs.next()){
		flag=true;
	}
}catch(Exception e)
{
System.out.print(e);	
}
finally{
	try{
		rs.close();
		pstmt.close();
		conn.close();
	}catch(Exception e){}
}
%>

<%
if(flag)
{
%>
<jsp:forward page="login_success.jsp">
<jsp:param value="<%=name%>" name="uname"/>
</jsp:forward>
<%
}
else
{
%>

<%
}
%>
</body>
</html>