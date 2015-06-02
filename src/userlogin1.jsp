<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" import="beans.*" %>
<%
String username=request.getParameter("n");
String password=request.getParameter("n1");
bean b=new bean();
b.setUsername(username);
b.setPassword(password);
if(b.login())
{
	
 if(b.getPassword().equals(password))	
	{
	
	 b.img();
	 String image=b.getImage();
	 session.setAttribute("ab",username);
	 session.setAttribute("im",image);
	
	 bean b9=new bean();
	 b9.setUsername(username);
	 b9.addonline();
	 
	 
	 if(b.getType().equalsIgnoreCase("Teacher"))
		out.print("teacher");
	 else
		 out.print("student");
	}

 else
	 out.println("no");
}
else
	out.println("no");
%>