<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<script>
function f()
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
<table width="100%" height="866" border="0" cellpadding="0" cellspacing="0" align="center">
  <tr>
    <%@ include file="teacherhead.jsp" %>
  </tr>
  <tr bgcolor="#2B1521">
    <td height="491" valign="top"><table width="100%" height="615" border="0" cellpadding="0" cellspacing="0">
      <tr bgcolor="#FFB0FF">
        <td width="178" height="613" valign="top" bgcolor="#FFE9BB"><table width="100%" height="227" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <%@ include file="teacherleftside.jsp" %>
		    </tr>
          
        </table></td>
        <td width="846" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="teachermiddlemenu.jsp" %>
          </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td bgcolor="#FFE9BB" align="center">
				  <form name="f1" action="create_group1.jsp">
				    <table width="491" height="70" border="0" cellpadding="0" cellspacing="0">
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
                        <input type="button" value="Create" onclick="f()"></td>
                    </tr>
                  </table>
				  </form>                  </td>
                </tr>
          </table></td>
        <td width="178" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
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
</body>
</html>