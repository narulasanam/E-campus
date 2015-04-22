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
String topicname=request.getParameter("topicname");
String topicid=request.getParameter("topicid");

session.setAttribute("topicname",topicname);
session.setAttribute("topicid",topicid);
response.sendRedirect("admintopiccontent.jsp?topicid="+topicid);

%>
</body>
</html>