<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.message{color:red}
</style>
<script>
<!--
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
	
	var a=document.f1.t1.value;
	var b=document.f1.t2.value;
	var url="userlogin1.jsp?n=" +a +"&n1=" +b;
	xmlHttp.open("GET",url, true);
	xmlHttp.send(null)
	
}

function stateChangedTest1() 
{ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
{
	if(xmlHttp.responseText.indexOf("teacher")>-1)
 	{ 	
	window.open("teacher_home.jsp","_self"); 
 	}
	else if(xmlHttp.responseText.indexOf("student")>-1) 
	{
 	window.open("student_home.jsp","_self");
	}
	else if(xmlHttp.responseText.indexOf("no")>-1)
	{
	document.getElementById("disp").innerHTML="username or password is not correct"; 
 	}


}  
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</head>
<body onLoad="MM_preloadImages('login images/lib18.jpg')">
<form name="f1">
<table width="100%" height="695" border="1" cellpadding="0" cellspacing="0" align="center">
  <tr>
    <td height="126" bgcolor="#005782">&nbsp;</td>
  </tr>
  <tr>
    <td height="521"><table width="100%" height="546" border="1" cellpadding="0" cellspacing="0">
      <tr>
        <td width="70%" height="544" background="login images/nescafe.jpg" bgcolor="#005782"></td>
        <td width="30%" align="center" valign="top" bgcolor="#005782">
		  <p>&nbsp;</p>
		  <p>&nbsp;</p>
		  <p>&nbsp;</p>
		  <table width="286" height="211" border="0" cellpadding="0" cellspacing="0">
            <tr>
              <td align="center">SIGN IN </td>
            </tr>
            <tr>
              <td align="center">Username</td>
			  <td align="center">
			  <input type="text" name="t1">			  </td>
            </tr>
            <tr>
              <td align="center">Password</td>
			  <td align="center"><input type="password" name="t2"></td>
			  </tr>
			 
            
          </table>		
		  <table width="280" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td  align="center"> <div id="disp" class="message"> </div></td>
            </tr>
            <tr>
              <td  align="center"><input type="button" value="Sign In" onClick="test1()"></td>
            </tr>
          </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="35" align="center" bgcolor="#005782">Guru Nanak Dev University </td>
  </tr>
</table>
</form>
</body>
</html>