<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.* , java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
<!--
.admintext {
font-size:44px;
color:#3E3EFF;
}
.botgndu {color:#000000
}
.eportal {	position:absolute;
	top:30px;
	left:1148px;
	color: 3E3EFF;
	font-weight: bold;
	z-index:19;
	width: 66px;color:#FFFFFF
}
.gnduasr {
font-size:24px;
color:#3E3EFF;
}
.logobg {background-color:#090909
}
.style1 {font-family: Verdana, Arial, Helvetica, sans-serif}

.elink{color:#FF0000;font-size:15px;margin-right:80px;text-decoration:none}
a.elink:hover{color:#33FF00;font-size:17px;text-decoration:none}
.centerlinks{text-decoration:none;color:#000000}
.logout{text-decoration:none;margin-right:20px;color:#FFFFFF}
.sidelinks{text-decoration:none;color:#FFFFFF}
.search{color:#FFFFFF}
.gnduportal{font-family: Verdana, Arial, Helvetica, sans-serif;color:#FFFFFF}
</style>
</head>
<body>
<form name="f1" >
<table width="100%" height="866" border="1" cellpadding="0" cellspacing="0" align="center">
  <tr>
    <td height="110"><table width="100%" height="179" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="179" height="179" bgcolor="#C1C1FF" class="logobg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="logo_p.jpg" width="137" height="129" /></td>
        <td width="1033" background="slide6.jpg"  bgcolor="#CCCCFF">
                 
        </p>
              <p align="right"><span class="eportal">E-Portal</span></p>
          <a href="#"></a></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="36"><table width="100%" height="34" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="177" height="34" bgcolor="#B02111"><span class="gnduportal">GNDU PORTAL </span></td>
        <td width="662" bgcolor="#B02111"><table width="345" height="30" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="59" class="search">&nbsp;Search</td>
            <td width="282"><table width="286" height="30" border="1" cellpadding="0" cellspacing="0">
              <tr>
                <td width="253">&nbsp;</td>
                <td width="29">&nbsp;</td>
              </tr>
            </table></td>
          </tr>
        </table></td>
       <td width="177" align="right" bgcolor="#B02111"><a href="logout.jsp" class="logout">LogOut</a></td>
      </tr>
    </table></td>
  </tr>
  <tr bgcolor="#2B1521">
    <td height="491" valign="top"><table width="100%" height="615" border="0" cellpadding="0" cellspacing="0">
      <tr bgcolor="#FFB0FF">
        <td width="189" height="613" valign="top" bgcolor="#FFE9BB"><table width="100%" height="227" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="177" height="23" valign="top" bgcolor="#FFE9BB">&nbsp;</td>
          </tr>
		  <tr>
		  <td width="174" height="96" valign="top" bgcolor="#2B1521">
		<table width="100%" height="113" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="88" height="113"><img src="DSCN1363.JPG" width="88" height="96" /></td>
          	
			
			                     <%
String username,password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",yearofjoining="",n3="",n4="",n5="",n6="",n7="",teacher_no="",graduation="",postgraduation="",dateofjoining="",office="";


username=(String)session.getAttribute("ab");

bean b1=new bean();
b1.setUsername(username);

name=request.getParameter("name");
email=request.getParameter("email");
gender=request.getParameter("gender");
graduation=request.getParameter("graduation");
postgraduation=request.getParameter("postgraduation");
office=request.getParameter("office");
address=request.getParameter("address");
phone=request.getParameter("phone");
hobbies=request.getParameter("hobbies");

b1.setUsername(username);
b1.setName(name);
b1.setEmail(email);
b1.setGender(gender);
b1.setGraduation(graduation);
b1.setPostgraduation(postgraduation);
b1.setOffice(office);
b1.setAddress(address);
b1.setPhone(phone);
b1.setHobbies(hobbies);
b1.teacheredit_prof();
%>
			
			<td width="89" align="center"><%=username%></td>
		  </tr>
		 </table>         </td>
          </tr>
		  <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="#" target="_self" class="sidelinks">Students</a></td>
		    </tr>
		  <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="#" class="sidelinks"> Teachers</a></td>
		    </tr>
		  <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="create_group.jsp" class="sidelinks">Create Group </a></td>
		    </tr>
		  <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="createalbum.jsp" class="sidelinks">Create Album </a></td>
		    </tr>
          
        </table></td>
        <td align="right" valign="top" width="1025" height="613"><table width="101%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" align="center" bgcolor="#FFFFFF"><a href="#" class="centerlinks">News</a></td>
            <td align="center" bgcolor="#FFFFFF"><a href="student_profile.jsp" class="centerlinks">Profile</a></td>
            <td align="center" bgcolor="#FFFFFF"><a href="#" class="centerlinks">E-Mail</a></td>
            <td align="center" bgcolor="#FFFFFF"><a href="#" class="centerlinks">Discussion</a></td>
            <td align="center" bgcolor="#FFFFFF"><a href="albums.jsp" class="centerlinks">Albums</a></td>
               </tr>
        </table>
              <table width="100%" height="595" border="0" cellpadding="0" cellspacing="0">
                
                  <td bgcolor="#FFFFFF">

                    <%
                    response.sendRedirect("teacher_profile.jsp");
                    
                    %>
                    
                    </td>
			  </table>
        <td width="178" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <td height="23" bgcolor="#FFE9BB">            </td>
          </tr>
		  
          <tr>
            <td align="center" bgcolor="#2B1521"><a href="#" class="sidelinks">Info About Course </a></td>
          </tr>
          <tr>
            <td align="center" bgcolor="#2B1521"><a href="#" class="sidelinks">Events</a></td>
          </tr>
          <tr>
            <td align="center" bgcolor="#2B1521"><a href="#" class="sidelinks">Recent Activity </a></td>
          </tr>
          <tr>
            <td bgcolor="#2B1521">&nbsp;</td>
          </tr>
          <tr>
            <td bgcolor="#2B1521">&nbsp;</td>
          </tr>
          <tr>
            <td bgcolor="#2B1521">&nbsp;</td>
          </tr>
          <tr>
            <td bgcolor="#2B1521">&nbsp;</td>
          </tr>
          
        </table></td>
      </tr>
    </table></td>
  </tr>
  
  <tr>
    <td height="30" align="center" bgcolor="#B02111" class="botgndu">Guru Nanak Dev University </td>
  </tr>
</table>
</form>
</body>
</html>