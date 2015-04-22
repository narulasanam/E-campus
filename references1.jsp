<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.io.*,java.util.*,org.apache.commons.fileupload.*,javax.servlet.http.Http.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

response.setContentType("text/html");


String atowner=(String)session.getAttribute("ab");


Date d=new Date();
 String t="";
 int  h=d.getHours();
 int min=d.getMinutes();
 int dt=d.getDate();
 int mon=d.getMonth()+1;
 int y=d.getYear()+1900;
String time1="";
 String dat=(dt +"/" +mon +"/" +y);

  
	  
	  
 if(h/12==0)
 {
	 t="a.m" ;
 }
 else
 {
	h-=12;
  t="p.m";
 }
 
 String time=(h+":"+min+t);
 
 if(min%10==0)
		time1=0+(String.valueOf(time)); 
 else
	 time1=(String.valueOf(time));






//Parse the request

 DiskFileUpload upload = new DiskFileUpload();

//Parse the request

List items = upload.parseRequest(request);
Iterator iter = items.iterator();
String dte="";
String ps="";
int j=0;
while (iter.hasNext()) 
{
	FileItem item = (FileItem)iter.next();
		
		 if(item.isFormField())
		  {
			   dte=item.getString();
			   
		  }
		  
		  else
		  {
				if(item.getName().length()!=0)
				{
					File m=new File(item.getName());
					String he=getServletContext().getRealPath("/references");
					ps=m.getName();
					File ye=new File(he,ps);
					item.write(ye);	
				}
		  }
	
}


String title=dte;
String attachment=ps;
out.print(title);

out.print(attachment);






bean b1=new bean();
b1.setAtowner(atowner);


b1.setAttachment(attachment);
b1.setTitle(title);
b1.setDat(dat);
b1.setTime(time1);
b1.saveattachment();

response.sendRedirect("references.jsp");
%>
</body>
</html>