<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String groupname=request.getParameter("groupname");
String groupid=request.getParameter("groupid");
session.setAttribute("groupname",groupname);
session.setAttribute("groupid",groupid);
response.sendRedirect("admingrouptopics.jsp?groupid="+groupid);

%>
</body>
</html>