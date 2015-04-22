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
String video=request.getParameter("vid");
bean b1=new bean();
b1.setVideo(video);
b1.deletevideo();
response.sendRedirect("adminvideo.jsp");
%>
</body>
</html>