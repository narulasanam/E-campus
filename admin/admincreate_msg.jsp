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
function fo()
{
if(document.f1.message.value=="")
{
alert("Enter Message");
}


else
{
document.f1.submit();
}
}

</script>
</head>

<body>

<table width="100%" height="866" border="1" cellpadding="0" cellspacing="0" align="center">
  <tr>
    <%@ include file="adminheader.jsp"%>
  </tr>
  <tr bgcolor="#2B1521">
    <td height="617" valign="top"><table width="100%" height="615" border="1" cellpadding="0" cellspacing="0">
     
      <tr bgcolor="#FFB0FF">
      <%@include file="adminleftside.jsp" %>
      </tr>
		
		 </table>		  </td>
		  
        <td width="846" height="613" align="right" valign="top" bgcolor="#FFFFF"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="adminmiddlemenu.jsp" %>
          </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td bgcolor="#FFFFF">
                  <form name="f1" action="adminsend_msg.jsp">
                   <%
				  String sentto=request.getParameter("hid");
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
				  bean b=new bean();
				  String time=(h+":"+min+t);
				  
				  
				  %>
				  
				  
				  <table width="641" height="85" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                      <td align="center">&nbsp;</td>
                      <td align="right"><input type="text" name="time" value=<%=time %> readonly=""></td>
                    </tr>
                    <tr>
                      <td width="146" align="center">To</td>
                      <td width="495" align="center"><input type="text" name="sentto" value=<%=sentto %> readonly=""></td>
                    </tr>
                    <tr>
                      <td align="center">Message</td>
                      <td><textarea cols="80" rows="4" name="message"></textarea></td>
                    </tr>
                    <tr>
                      <td><input type="text" name="dat" value=<%=dat%> readonly=""></td>
                      <td align="center"><input type="button" value="Send" onclick="fo()"></td>
					  
                    </tr>
                  </table>
                  </form>
                  
                  
                  
                  </td>
                </tr>
          </table></td>
        <td width="175" valign="top" bgcolor="#E4CAFF"><table width="100%" border="1" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <%@include file="adminrightside.jsp" %>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="30" align="center" bgcolor="#E4CAFF" class="botgndu">Guru Nank Dev University </td>
  </tr>
</table>
</body>
</html>
