<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,beans.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
.style1 {font-family: Verdana, Arial, Helvetica, sans-serif}
.sidelinks{text-decoration:none;color:#FFFFFF}
.admintext
{
font-size:44px;
color:#3E3EFF;
}

.gnduasr
{
font-size:24px;
color:#3E3EFF;
}
.logobg
{
background-color:#090909
}

a.links{text-decoration: none;font-size: 17px}
a.links:hover{text-decoration: none;color:blue;font-size: 19px;color:olive;}

.eportal 
{
	position:absolute;
	top:30px;
	left:1148px;
	color: 3E3EFF;
	font-weight: bold;
	z-index:19;
	width: 66px;
}

.botgndu{
color:#3E3EFF
}
.drop1
{display:none}
.drop2
{display:inline}
</style>
<script>
function collapse(m)
{
if(m!="a1")
document.getElementById("a1").className="drop1";
if(m!="a2")
document.getElementById("a2").className="drop1";
if(m!="a3")
document.getElementById("a3").className="drop1";
}
function f(n)
{
collapse(n);
var p= document.getElementById(n);
if(p.className=="drop1")
p.className="drop2";
else
p.className="drop1";
}
function isEmail(elem, helperMsg){
	var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	if(elem.value.match(emailExp)){
		return false;
	}else{
		alert(helperMsg);
		elem.focus();
		return true;
	}
}

function fo()
{
if(document.m1.to.value.length==0)
{
alert("please enter an address");
}
else if(isEmail(document.m1.to,"Please Enter Valid Email Address"))
{
}
else
{
document.m1.submit();
}
}

</script>

</head>
<body>
<table width="100%" height="866" border="0" cellpadding="0" cellspacing="0" align="center">
  <tr>
    <%@ include file="adminheader.jsp" %>
  </tr>
  <tr bgcolor="#2B1521">
    <td height="491" valign="top"><table width="100%" height="615" border="0" cellpadding="0" cellspacing="0">
      <tr bgcolor="#FFB0FF">
        <td width="178" height="613" valign="top" bgcolor="#2B1521"><table width="100%" height="227" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <%@ include file="adminleftside.jsp" %>
		    </tr>
          
        </table></td>
        <td width="846" height="613" align="right" valign="top" bgcolor="FFFFFF	"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="adminmiddlemenu.jsp" %>
          </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td bgcolor="#FFFFF">
                  <form action="Mail" name="m1">
                  
  &nbsp;&nbsp;&nbsp;

  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

  &nbsp;&nbsp;

  <table width="120" align="center">

  <tr>

  <td><img src="../images/email.png" alt="mail" width="182" height="145"></td>

  <td><font size="+4" color="#CC0000" face="Ravie">Sending Mail</font></td>

  </tr>

<tr>

<td><br>

  <b>FROM</b></td>

<td><br>

  <br>

    <input type=text  name="from" value="narulasanam@gmail.com"  size=100 readonly="readonly">

    <br>

    <br>

</td></tr>

<tr><td><b>TO</b>

</td>

  <td><br>

  <input type=text value="" name="to" size=100>

  <br>

<br>

</td></tr>

<tr>

<td>

<b>Cc</b>

</td>

<td><br>

<input type=text value="" name="cc" size=100>

<br>

<br>

</td></tr>

<tr><td>

<b>SUBJECT</b> </td>

<td><br>

<input type=text value="" name="subject" size=100>

<br>

<br>

</td></tr>

<tr><td>

<b>MESSAGE</b> 

</td><td>

<textarea name="body" rows="8" cols="70"></textarea>

</td></tr>

<tr>

<td></td><td>

<input type=button value="Send Mail" onClick="javasacript:fo()">

</td></tr>

</table>
                  
                  
                  
                  </form>
                  </td>
                </tr>
          </table></td>
        <td width="178" valign="top" bgcolor="#E4CAFF"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          
          <tr>
            <%@ include file="adminrightside.jsp" %>
          </tr>
          
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="30" align="center" bgcolor="#B02111" class="botgndu">Guru Nanak Dev University </td>
  </tr>
</table>
</body>
</html>