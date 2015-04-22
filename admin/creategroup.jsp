<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style>
.style1 {font-family: Verdana, Arial, Helvetica, sans-serif}

.admintext
{
font-size:44px;
color:#3E3EFF;
}
.sidelinks{text-decoration:none;color:#FFFFFF}
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
<script language="JavaScript" src="datetimepicker.js" type="text/javascript"></script>
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
if(document.f1.t1.value=="")
{
alert("Enter GroupName");
}
else if(document.f1.about.value=="")
{
alert("Enter About");
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
    <tr>
		  <td height="27" align="center" bgcolor="#E4CAFF">&nbsp;</td>
		  </tr>
		 </table>		  </td>
		  
      
		 <td width="846" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="adminmiddlemenu.jsp" %>
          </tr>
        </table>
		<table width="100%" height="612" border="0" cellpadding="0" cellspacing="0">
            <tr>
               <td height="612" bgcolor="#FFFFFF" align="center" valign="top">
			   
			   <form name="f1" action="creategroup1.jsp">
				
				    <table width="491" height="70" border="0" cellpadding="0" cellspacing="0">
                    <br>
                    <br>
                    <tr>
                      <td align="center"><h2>Create Group </h2></td>
                    </tr>
                    <tr>
                      <td align="center">&nbsp;</td>
                    </tr>
                    <tr>
                      <td align="center">&nbsp;</td>
                    </tr>
                    <tr>
                      <td align="center">&nbsp;</td>
                    </tr>
                    <tr>
                      <td align="center">&nbsp;</td>
                    </tr>
                    <tr>
                      <td align="center">&nbsp;</td>
                    </tr>
                    <tr>
                      <td align="center">&nbsp;</td>
                    </tr>
                    <tr>
                      <td align="center"><table width="353" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td width="111" align="center">Group Name </td>
                          <td width="242" align="center"><input type="text" name="t1" size="35"></td>
                        </tr>
                        <tr>
                          <td align="center">About Group </td>
                          <td align="center"><textarea name="about"></textarea></td>
                        </tr>
                      </table></td>
                    </tr>
                    <tr>
                      <td align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="button" value="Create" onclick="fo()"></td>
                    </tr>
                  </table>
				  </form> 
			   
			      </td>
			      
			      </tr>
			      
			      </table>
        <td width="175" valign="top" bgcolor="#E4CAFF"><table width="100%" border="1" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
           <%@include file="adminrightside.jsp" %>
           </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="30" align="center" bgcolor="#2B1521" class="botgndu">Guru Nank Dev University </td>
  </tr>
</table>

</body>
</html>
