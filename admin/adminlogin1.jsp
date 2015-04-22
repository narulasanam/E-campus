<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" import="beans.*" %>
<%
String username=request.getParameter("n");
String password=request.getParameter("n1");
bean b=new bean();
b.setUsername(username);
if(b.adminlogin())
{
	
 if(b.getPassword().equals(password))	
	{
	 String image=b.getImage();
	 session.setAttribute("admin",username);
	 session.setAttribute("im",image);
	 out.print("admin");
	 }

 else
	 out.println("no");
}
else
	out.println("no");

%>