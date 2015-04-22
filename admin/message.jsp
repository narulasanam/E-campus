<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
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
.underlap{
	position:absolute;
	top:18px;
	left:190px;
	z-index:10;
	width: 1023px;
	height: 176px;
}
.botgndu{
color:#3E3EFF
}
</style>
<script>
function add()
{
document.f1.submit();
}
</script>
</head>

<body>
<form name="f1" action="addstudent2.jsp">
<table width="100%" height="866" border="1" cellpadding="0" cellspacing="0" align="center">
  <tr>
    <td height="110"><table width="100%" height="179" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="179" height="179" bgcolor="#C1C1FF" class="logobg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="logo_p.jpg" width="137" height="129" /></td>
        <td width="1033" background="slide4.jpg"  bgcolor="#CCCCFF">
		<p align="center" class="admintext">Welcome Administrator<br><marquee class="gnduasr">GNDU,AMRITSAR</marquee></p>
		
		<p align="right"><span class="eportal">E-Portal</span></p>
          
        
          <a href="#"></a></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="36"><table width="100%" height="34" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="177" height="34" bgcolor="#FFE9BB"><span class="style1">GNDU PORTAL </span></td>
        <td width="662" bgcolor="#FFE9BB"><table width="345" height="30" border="1" cellpadding="0" cellspacing="0">
          <tr>
            <td width="59">&nbsp;Search</td>
            <td width="282"><table width="286" height="30" border="1" cellpadding="0" cellspacing="0">
              <tr>
                <td width="253">&nbsp;</td>
                <td width="29">&nbsp;</td>
              </tr>
            </table></td>
          </tr>
        </table></td>
        <td width="177" align="right" bgcolor="#FFE9BB">UserName</td>
      </tr>
    </table></td>
  </tr>
  <tr bgcolor="#2B1521">
    <td height="617" valign="top"><table width="100%" height="615" border="1" cellpadding="0" cellspacing="0">
      <tr bgcolor="#FFB0FF">
        <td width="178" height="613" valign="top" bgcolor="#FFE9BB">
		<table width="100%" height="151" border="1" cellpadding="0" cellspacing="0">
		<tr>
		  <td width="174" height="23" valign="top" bgcolor="#2B1521">&nbsp;</td>
		  </tr>
		
		<tr>
		  <td height="27" align="center" bgcolor="#FFE9BB"><a href="manage_student.jsp" target="_self">Manage Students</a></td>
		  </tr>
		<tr>
		  <td height="27" align="center" bgcolor="#FFE9BB"><a href="#">Manage Teachers</a></td>
		  </tr>
		<tr>
		  <td height="27" align="center" bgcolor="#FFE9BB"><a href="#">Create Group </a></td>
		  </tr>
		<tr>
		  <td height="27" align="center" bgcolor="#FFE9BB">&nbsp;</td>
		  </tr>
		 </table>		  </td>
		  
        <td width="846" height="613" align="right" valign="top" bgcolor="#FFFFFF">
		<table width="100%" height="612" border="0" cellpadding="0" cellspacing="0">
            <tr>
               <td height="612" bgcolor="#FFFFFF" align="center">
			   
			   	<h2>User Already Exist</h2>

			  
			   
			   
			   </td>
            </tr>
          </table></td>
        <td width="178" valign="top" bgcolor="#FFE9BB"><table width="100%" border="1" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <td bgcolor="#2B1521">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" bgcolor="#FFE9BB"><a href="#">Info About Course </a></td>
          </tr>
          <tr>
            <td align="center" bgcolor="#FFE9BB"><a href="#">Events</a></td>
          </tr>
          <tr>
            <td align="center" bgcolor="#FFE9BB"><a href="#">Recent Activity </a></td>
          </tr>
          <tr>
            <td bgcolor="#FFE9BB">&nbsp;</td>
          </tr>
          <tr>
            <td bgcolor="#FFE9BB">&nbsp;</td>
          </tr>

          <tr>
            <td bgcolor="#FFE9BB">&nbsp;</td>
          </tr>
          <tr>
            <td bgcolor="#FFE9BB">&nbsp;</td>
          </tr>
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
