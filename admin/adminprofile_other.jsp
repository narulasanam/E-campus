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
                  <%
                  String password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
                  String registration_no="",ccode="",school="",yearofjoining="",n3="",n4="",n5="",n6="",n7="";

                  String nam=request.getParameter("nam");
                  
                  
                  bean b1=new bean();
                  b1.setUsername(nam);
                  b1.profile_others2();
                 
                  dcode=b1.getDcode();
                  name=b1.getName();
                  email=b1.getEmail();
                  gender=b1.getGender();
                  address=b1.getAddress();
                 phone=b1.getPhone();
                  
                  dateofbirth=b1.getDateofbirth();
                  hobbies=b1.getHobbies();
                  status=b1.getStatus();
                  registration_no=b1.getRegistration_no();
                  ccode=b1.getCcode();
                  school=b1.getSchool();
                  yearofjoining=b1.getYearofjoining();

                  if(!(gender==null))
                  {
                  if(gender.equalsIgnoreCase("Male"))
                  n5="checked";
                  else
                  n6="checked";
                  }

                  
                  
                  %>
                  
                  
                  <table width="50%" height="335" border="0" cellpadding="0" cellspacing="0" align="center">
                 <tr>
                   <td width="49%" align="center">Name</td>
                   <td width="51%" align="center"><%=name %></td>
                 </tr>
                 <tr>
                   <td align="center">Email</td>
                   <td align="center"><%=email %> </td>
                 </tr>
                 <tr>
                   <td align="center">Gender</td>
                   <td align="center"><%=gender%></td>
                 </tr>
                 <tr>
                   <td align="center">School</td>
                   <td align="center"><%=school%></td>
                 </tr>
                 <tr>
                   <td align="center">Date of Birth</td>
                   <td align="center"><%=dateofbirth%></td>
                 </tr>
                 <tr>
                   <td align="center">Registration no.</td>
                   <td align="center"><%=registration_no%></td>
                 </tr>
                 <tr>
                   <td align="center">Dcode</td>
                   <td align="center"><%=dcode%></td>
                 </tr>
                 <tr>
                   <td align="center">Coursecode</td>
                   <td align="center"><%=ccode%></td>
                 </tr>
                 <tr>
                   <td align="center">Address</td>
                   <td align="center"><%=address%></td>
                 </tr>
                 <tr>
                   <td align="center">Phone</td>
                   <td align="center"><%=phone%></td>
                 </tr>
                 <tr>
                   <td align="center">Hobbies</td>
                   <td align="center"><%=hobbies%>   </td>
                 </tr>
                 <tr>
                   <td align="center">Year of joining</td>
                   <td align="center"><%=yearofjoining%></td>
                 </tr>
                 </table>
                 
                  
                  
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
