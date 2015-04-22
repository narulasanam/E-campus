<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="chat.*,java.io.*,beans.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
var xmlHttp;
var set;
var top;
var username
var topic;
var tt;
function GetXmlHttpObject()
{
var xmlHttp=null;
try
 {
 // Firefox, Opera 8.0+, Safari
 xmlHttp=new XMLHttpRequest();
 }
catch (e)
 {
 //Internet Explorer
 try
  {
  xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
  }
 catch (e)
  {
  xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
 }
return xmlHttp;
}

function test1()
{ 

xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
{
 alert ("Browser does not support HTTP Request")
 return
}
   
	xmlHttp.onreadystatechange=stateChangedTest1
	
	var a=document.f1.id.value;
	
	var url="chatleft.jsp?id=" +a ;
	xmlHttp.open("GET",url, true);
	xmlHttp.send(null)
	
}

function stateChangedTest1() 
{ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
{

}  
}

</script>
</head>
<body onunload="test1()">

<%

String text=request.getParameter("t2");
String name1=(String)session.getAttribute("ab");
if(text==null)
	text=" entered room";

String id=(request.getParameter("id"));
bean b1=new bean();
b1.revolve(name1,id);
String t="";
try{

String p=getServletContext().getRealPath("/");	

FileWriter f=new FileWriter(p+"/chat/" +"chat"+id+".txt" ,true);;
t=name1+": "+text;

f.write(t+"\r\n");

f.close();

%>

<% 


}
catch(Exception e){e.printStackTrace();}

%>
<form name="f1" action="chatinit1.jsp" >

<table border=1 width="30%">
<tr>

<td align="center">
<iframe src="fileread.jsp?id=<%=id %>" width="100%" scrolling="auto"></iframe>
</td>

</tr>

<tr>
<td align="center">

<input type="text" size=45 name="t2">
<input type="hidden" name="id" value="<%=id %>">
<input type="submit" value="send">
</td>
</tr>
</table>
</form>

</body>
</html>