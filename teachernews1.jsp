<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,beans.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String newsowner=(String)session.getAttribute("ab");
String newstitle=request.getParameter("title");
String newsinfo=request.getParameter("t1");


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

bean b1=new bean();
b1.setNewsowner(newsowner);

b1.setNewsinfo(newsinfo);
b1.setNewstitle(newstitle);
b1.setDat(dat);
b1.setTime(time1);
b1.savenews();
response.sendRedirect("teachernews.jsp");

%>
</body>
</html>