<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.util.*" %>
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
     </tr>
		<tr>
		 
		  </tr>
		 </table>		  </td>
		  
        <td width="846" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="adminmiddlemenu.jsp" %>
          </tr>
        </table><table width="100%" height="612" border="0" cellpadding="0" cellspacing="0">
            <tr>
               <td height="612" bgcolor="#FFFFFF" align="center">

<%
String username="", password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",yearofjoining="";

username=request.getParameter("t1");

bean b1=new bean();
b1.setUsername(username);
if(b1.search())
	response.sendRedirect("message.jsp");

else
{
password=request.getParameter("t2");
dcode=request.getParameter("s1");
name=" ";
type="student";
email=" ";
gender=" ";
address=" ";
phone=" ";
dateofbirth=request.getParameter("t3");
hobbies=" ";
status="1";
registration_no=request.getParameter("t4");
ccode=request.getParameter("s2");
school=" ";
yearofjoining=request.getParameter("s3");


b1.setPassword(password);
b1.setDcode(dcode);
b1.setName(name);
b1.setType(type);
b1.setEmail(email);
b1.setGender(gender);
b1.setAddress(address);
b1.setPhone(phone);
b1.setDateofbirth(dateofbirth);
b1.setHobbies(hobbies);
b1.setStatus(status);
b1.setRegistration_no(registration_no);
b1.setCcode(ccode);
b1.setSchool(school);
b1.setYearofjoining(yearofjoining);

b1.addstudent();

}


%>
<h2>Student added</h2>

</td>
            </tr>
          </table></td>
        <td width="175" valign="top" bgcolor="#E4CAFF"><table width="100%" border="1" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <%@include file="adminrightside.jsp" %></tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="30" align="center" bgcolor="#2B1521" class="botgndu">Guru Nank Dev University </td>
  </tr>
</table>
</form>
</body>
</html>

</body>
</html>