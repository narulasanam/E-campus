<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="refresh" content="5">
<title>Insert title here</title>
</head>
<body>

                   <% 
String name1=(String)session.getAttribute("ab");
bean b1=new bean();
ArrayList a1=b1.showchat();
Iterator t=a1.iterator();
while(t.hasNext())
{
bean b2=(bean)t.next();
out.print("user1=");
out.print(b2.getUser1());
out.print("\n");
out.print("<script>javascript:window.open('chatinit1.jsp?id="+b2.getChatid()+"','_blank','width=500,height=250')</script>");

//out.print("<a href='chatinit1.jsp?id="+b2.getChatid()+"'>Chat</a>");

}

%>
    

</body>
</html>