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
function add()
{
document.f1.submit();
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
			   <%
String username,password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",dateofjoining="",teacher_no="",office="",graduation="",postgraduation="";

username=request.getParameter("t1");

bean b1=new bean();
b1.setUsername(username);



password=request.getParameter("t2");
dcode=request.getParameter("s1");
dateofbirth=request.getParameter("t3");
status=request.getParameter("s4");
teacher_no=request.getParameter("t4");
office=request.getParameter("t5");
dateofjoining=request.getParameter("t8");


b1.setPassword(password);
b1.setDcode(dcode);

b1.setDateofbirth(dateofbirth);
b1.setStatus(status);
b1.setTeacher_no(teacher_no);
b1.setOffice(office);
b1.setDateofjoining(dateofjoining);

b1.modifyteacher();



%>
<br><br><br><br><br><br>
<h2 align="center"> Teacher Has Been Modified</h2>
              
  
			   </td>
            </tr>
          </table>
          
          </td>
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
