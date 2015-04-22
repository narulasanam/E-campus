<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"import="sp.*,java.io.*,javax.servlet.http.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="refresh" content="10">
</head>
<body>
<%
String id=request.getParameter("id");
String p=getServletContext().getRealPath("/");
FileReader f1=new FileReader(p+"/chat/"+"chat"+id+".txt");
BufferedReader b1=new BufferedReader(f1);
String b3="";


while((b3= b1.readLine())!=null)
{
	
	out.print(b3+"<br>");
	
}
f1.close();
%>
</body>
</html>