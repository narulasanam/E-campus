<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,beans.*,java.util.*,org.apache.commons.fileupload.*,javax.servlet.http.Http.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
	response.setContentType("text/html");

String username=(String)session.getAttribute("ab");
String image="";
  
DiskFileUpload upload = new DiskFileUpload();
Date d=new Date();
//Parse the request

List items = upload.parseRequest(request);
Iterator iter = items.iterator();
while (iter.hasNext()) 
{
FileItem item = (FileItem)iter.next();


if(item.getName().length()!=0)
{
File m=new File(item.getName());
String h=getServletContext().getRealPath("/images");


image=m.getName();
File y=new File(h,m.getName());
item.write(y);

}
}


bean b1=new bean();
b1.setUsername(username);

b1.setImage(image);
b1.changepic();

session.setAttribute("im",image);
response.sendRedirect("student_home.jsp");
}
catch(Exception e)
{

e.printStackTrace();
}
        

%>
</body>
</html>