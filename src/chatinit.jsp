<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String user1=(String)session.getAttribute("ab");
String user2=request.getParameter("user2");
int id=0,cid;
Date d=new Date();
String t="";
int  h=d.getHours();
int min=d.getMinutes();
int dt=d.getDate();
int mon=d.getMonth()+1;
int y=d.getYear()+1900;
String dat=(dt +"/" +mon +"/" +y);

//if(min/10==0)
	  
	  
	  
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


bean b1=new bean();


b1.setUser1(user1);
b1.setUser2(user2);


b1.takechatid();
cid=b1.getChatid();
if(cid!=0)
{
	if(b1.getChatstatus()==3)
	{
		bean b2=new bean();
		b2.setUser1(user1);
		b2.setUser2(user2);

		b2.setTime(time);
		b2.setChatstatus(1);
		b2.startchat();
		b2.takechatid();
		id=b2.getChatid();
	}
	
}
else
{
	bean b2=new bean();
	b2.setUser1(user1);
	b2.setUser2(user2);

	b2.setTime(time);
	b2.setChatstatus(1);
	b2.startchat();
	b2.takechatid();
	id=b2.getChatid();
}

%>
<form name="f1" action="chatinit1.jsp?chatid="<%=id %>" >

<table border=1 width="30%">
<tr>

<td align="center">
<textarea rows="10" cols="55"></textarea>
</td>

</tr>

<tr>
<td align="center">

<input type="text" size=45 name="t2">
<input type="hidden" value=<%=id %> name="id">

<input type="submit" value="send">
</td>
</tr>
</table>
</form>
</body>
</html>