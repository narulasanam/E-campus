<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username=(String)session.getAttribute("ab");
bean b9=new bean();
b9.setUsername(username);
b9.deleteonline();
session.invalidate();
response.sendRedirect("userlogin.jsp");


%>
</body>
</html>