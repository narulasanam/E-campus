<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.* , java.util.*,special.*"%>
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
<table width="100%" height="866" border="0" cellpadding="0" cellspacing="0" align="center">
  <tr>
    <%@ include file="teacherhead.jsp" %>
  </tr>
  <tr bgcolor="#2B1521">
  	
    <td height="491" valign="top"><table width="100%" height="615" border="0" cellpadding="0" cellspacing="0">
      <tr bgcolor="#FFB0FF">
      <%
String password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",dateofjoining1="",dateofbirth1="",n3="",n4="",n5="",n6="",n7="",teacher_no="",graduation="",postgraduation="",dateofjoining="";



bean b1=new bean();
b1.setUsername(username);
b1.demodteach();

password=b1.getPassword();
dcode=b1.getDcode();
name=b1.getName();
email=b1.getEmail();
gender=b1.getGender();
address=b1.getAddress();
phone=b1.getPhone();
dateofbirth1=b1.getDateofbirth();
dateconvert d1=new dateconvert();
dateofbirth=d1.convertd(dateofbirth1);

hobbies=b1.getHobbies();
status=b1.getStatus();
teacher_no=b1.getTeacher_no();

graduation=b1.getGraduation();
postgraduation=b1.getPostgraduation();
dateofjoining1=b1.getDateofjoining();

dateconvert d2=new dateconvert();
dateofjoining=d2.convertd(dateofjoining1);
%>
        <td width="178" height="613" valign="top" bgcolor="#FFE9BB"><table width="100%" height="227" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <%@ include file="teacherleftside.jsp" %>
             </tr>
		  
          
        </table></td>
        <td width="845" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="teachermiddlemenu.jsp" %>
            </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td valign="top" bgcolor="#FFE9BB">
                     
                     <table width="100%" border="0" cellspacing="0" cellpadding="0">
                       <tr>
                          <p>&nbsp;</p>
				  
				  <td height="34" align="left"><a href="teacher_changepic.jsp">Change Picture</a></td>
				  <td height="34" align="right"><a class="elink" href="teacher_edit_profile.jsp">Edit Profile </a></td>
                       </tr>
                    <tr>
                       <td height="34" align="left"><a href="teacher_changepass.jsp">Change Password</a></td>
                       </tr>
                    
                     </table>
                     <p>&nbsp;</p>
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
                   <td align="center">Graduation</td>
                   <td align="center"><%=graduation%></td>
                 </tr>
                 <tr>
                   <td align="center">Postgraduation</td>
                   <td align="center"><%=postgraduation%></td>
                 </tr>
                 <tr>
                   <td align="center">Date of Birth</td>
                   <td align="center"><%=dateofbirth%></td>
                 </tr>
                 <tr>
                   <td align="center">Teacher no.</td>
                   <td align="center"><%=teacher_no%></td>
                 </tr>
                 <tr>
                   <td align="center">Dcode</td>
                   <td align="center"><%=dcode%></td>
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
                   <td align="center">Date of joining</td>
                   <td align="center"><%=dateofjoining%></td>
                 </tr>
                 </table>
                  
                  
                  </td>
                </tr>
            </table></td>
        <td width="183" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
           <td height="23" bgcolor="#FFE9BB">&nbsp;</td>
          </tr>
          <tr>
           
            <%@ include file="teacherrightside.jsp" %>
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