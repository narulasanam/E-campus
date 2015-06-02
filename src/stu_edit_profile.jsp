<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
<!--
.botgndu {color:#000000
}
.centerlinks {text-decoration:none;color:#000000}
.eportal {position:absolute;
	top:30px;
	left:1148px;
	color: 3E3EFF;
	font-weight: bold;
	z-index:19;
	width: 66px;color:#FFFFFF
}
.gnduportal {font-family: Verdana, Arial, Helvetica, sans-serif;color:#FFFFFF}
.logobg {background-color:#090909
}
.logout {text-decoration:none;margin-right:20px;color:#FFFFFF}
.search {color:#FFFFFF}
.sidelinks {text-decoration:none;color:#FFFFFF}
-->
</style>
<script>

function isNumeric(elem, helperMsg){
	var numericExpression = /^[0-9]+$/;
	if(elem.value.match(numericExpression)){
		return false;
	}else{
		alert(helperMsg);
		elem.focus();
		return true;
	}
}

function isName(elem, helperMsg){
	var alphaExp =/^[a-zA-Z]+$/;
	if(elem.value.match(alphaExp)){
		return false;
	}else{
		alert(helperMsg);
		elem.focus();
		return true;
	}
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

function f()
{

if(document.t1.name.value=="")
{
alert("Enter Name");
}
else if(document.t1.email.value=="")
{
alert("Enter Email");
}

else if(document.t1.gender.value=="")
{
alert("Enter gender");
}
else if(document.t1.school.value=="")
{
alert("School");
}
else if(document.t1.address.value=="")
{
alert("Enter Address");
}



else if(document.t1.phone.value=="")
{
alert("Enter Phone no.");
}
else if(document.t1.hobbies.value=="")
{
alert("Enter Hobbies");
}
else if(isName(document.t1.name,"Please Enter Valid FirstName"))
{
}
else if(isEmail(document.t1.email,"Please Enter Valid Email Address"))
{
}

else if(isNumeric(document.t1.phone,"Please Enter Valid phone no"))
{
}

else 
{
document.t1.submit();
}
}
</script>

</head>
<body>

  <table width="100%" height="866" border="0" cellpadding="0" cellspacing="0" align="center">
    <tr>
      <%@ include file="header.jsp" %>
    </tr>
    <tr bgcolor="#2B1521">
      <td height="491" valign="top"><table width="100%" height="615" border="0" cellpadding="0" cellspacing="0">
        <tr bgcolor="#FFB0FF">
         <%
String password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",yearofjoining="",n3="",n4="",n5="",n6="",n7="",teacher_no="",graduation="",postgraduation="",dateofjoining="",office="";


bean b1=new bean();
b1.setUsername(username);
b1.demodstu();

password=b1.getPassword();
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
          <td width="178" height="613" valign="top" bgcolor="#FFE9BB"><table width="100%" height="151" border="0" cellpadding="0" cellspacing="0">
            <tr>
              <%@ include file="leftside.jsp" %>
              </tr>
          </table></td>
          <td width="846" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <%@ include file="middlemenu.jsp" %>
              </tr>
          </table>
                <table width="100%" height="595" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td bgcolor="#FFE9BB">
                    <form name="t1" action="stu_edit_profile1.jsp" >
                    <table width="50%" height="335" border="0" cellpadding="0" cellspacing="0" align="center">
                        <tr>
                          <td width="49%" align="center">Name</td>
                          <td width="51%" align="center"><input type="text" name="name" value="<%=name%>"></td>
                        </tr>
                        <tr>
                          <td align="center">Email</td>
                          <td align="center"><input type="text" name="email" value="<%=email%>">                          </td>
                        </tr>
                        <tr>
                          <td align="center">Gender</td>
                          <td align="center"><input type="radio" name="gender" value="Male" <%=n5 %>>
                            Male
                            <input type="radio" name="gender" value="Female" <%=n6 %> >
                            Female </td>
                        </tr>
                        <tr>
                          <td align="center">School</td>
                          <td align="center"><input type="text" name="school" value="<%=school %>"></td>
                        </tr>
                        
                        
                        
                                                
                          <td align="center">Address</td>
                          <td align="center"><textarea name="address"><%=address%></textarea>                          </td>
                        </tr>
                        <tr>
                          <td align="center">Phone</td>
                          <td align="center"><input type="text" name="phone" value="<%=phone%>"></td>
                        </tr>
                        <tr>
                          <td align="center">Hobbies</td>
                          <td align="center"><textarea name="hobbies" ><%=hobbies%></textarea>                          </td>
                        </tr>
                        
                      </table>
                        <table width="200" border="0" cellspacing="0" cellpadding="0" align="center">
                          <tr>
                            <td align="center"><input  type="button" value="Save" onclick=f()></td>
                          </tr>
                    </table>
                    </form>
                    </td>
                  </tr>
            </table></td>
          <td width="178" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
            <tr>
              <td height="23" bgcolor="#FFE9BB"></td>
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

</body>
</html>