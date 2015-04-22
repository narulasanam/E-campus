<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"import="beans.*,java.io.*,java.util.*,org.apache.commons.fileupload.*,javax.servlet.http.Http.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="adminheader.jsp" %>
<% 
try
{
	
response.setContentType("text/html");

String albumid1=(String)session.getAttribute("zaid");
int albumid=Integer.parseInt(albumid1);

String photoname="";
DiskFileUpload upload = new DiskFileUpload();

// Parse the request

List items = upload.parseRequest(request);
Iterator iter = items.iterator();
while (iter.hasNext()) 
{
	FileItem item = (FileItem)iter.next();
	//out.println(" \nFile is    "+item.getName());
	
	if(item.getName().length()!=0)
	{
		File m=new File(item.getName());
		String h=getServletContext().getRealPath("/images");
		//out.println("File will be uploaded at "+h+"<br>");

		photoname=m.getName();
		File y=new File(h,m.getName());
		item.write(y);
		
	}
}
//out.print("File uploaded");
bean b1=new bean();
//Date d=new Date();
b1.setUsername(adminname);

b1.setAlbumid(albumid);
b1.setPhototitle("bb");
b1.setPhotoname(photoname);
b1.add_photo();

response.sendRedirect("album_content.jsp?albumid="+albumid);
}
catch(Exception e)
{
	
	e.printStackTrace();
}
%>
</body>
</html>