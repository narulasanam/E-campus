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
				  int topicid=Integer.parseInt(request.getParameter("topicid"));
 				  String groupid=request.getParameter("groupid");
 
                  bean b1=new bean();
                  b1.setTopicid(topicid);
                	
                  b1.deletetopic();
 				 response.sendRedirect("admingrouptopics.jsp?groupid="+groupid);
%>
                  
</body>
</html>