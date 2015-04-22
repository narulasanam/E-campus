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
   <%@ include file="header.jsp" %>
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
String password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",yearofjoining="",n3="",n4="",n5="",n6="",n7="";




bean b1=new bean();
b1.setUsername(username);

name=request.getParameter("name");
email=request.getParameter("email");
gender=request.getParameter("gender");
school=request.getParameter("school");
address=request.getParameter("address");
phone=request.getParameter("phone");
hobbies=request.getParameter("hobbies");

b1.setUsername(username);
b1.setName(name);
b1.setEmail(email);
b1.setGender(gender);
b1.setSchool(school);
b1.setAddress(address);
b1.setPhone(phone);
b1.setHobbies(hobbies);
b1.stuedit_prof();


%>
			
			<td width="89" align="center"><%=username%></td>
		  </tr>
		 </table>         </td>
          </tr>
		  <tr>
            <%@ include file="leftside.jsp" %>
             </tr>
          
        </table></td>
        <td align="right" valign="top" width="1025" height="613"><table width="101%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="middlemenu.jsp" %>
            </tr>
        </table>
              <table width="100%" height="595" border="0" cellpadding="0" cellspacing="0">
                
                  <td bgcolor="#FFFFFF">

                    <%
                    response.sendRedirect("student_profile.jsp");
                    
                    %>
                    
                    </td>
			  </table>
        <td width="178" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <td height="23" bgcolor="#FFE9BB">            </td>
          </tr>
		  
          <tr>
           <%@ include file="rightside.jsp" %>
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