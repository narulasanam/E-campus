<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.util.*"%>
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
function fo()
{

if(document.f1.message.value=="")
{
alert("Enter Message");
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
    <%@ include file="header.jsp" %>
  </tr>
  <tr bgcolor="#2B1521">
    <td height="491" valign="top"><table width="100%" height="615" border="0" cellpadding="0" cellspacing="0">
      <tr bgcolor="#FFB0FF">
        <td width="178" height="613" valign="top" bgcolor="#FFE9BB"><table width="100%" height="227" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <%@ include file="leftside.jsp" %>
		    </tr>
          
        </table></td>
        <td width="846" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="middlemenu.jsp" %>
          </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
				<form name="f1" action="send_msg.jsp">
                  <td bgcolor="#FFE9BB" align="center">
				    <%
				  String sentto=request.getParameter("hid");
				  Date d=new Date();
				  String t="";
				  int  h=d.getHours();
				  int min=d.getMinutes();
				  int dt=d.getDate();
				  int mon=d.getMonth()+1;
				  int y=d.getYear()+1900;
				  String dat=(dt +"/" +mon +"/" +y);
				 
				  //if(min/10==0)
					  
					  
					  
				  if(h/12==0)
				  {
					 t="a.m" ;
				  }
				  else
				  {
					h-=12;
				   t="p.m";
				  }
				  bean b=new bean();
				  String time=(h+":"+min+t);
				  
				  
				  %>
				  
				  
				  <table width="641" height="85" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                      <td align="center">&nbsp;</td>
                      <td align="right"><input type="text" name="time" value=<%=time %> readonly=""></td>
                    </tr>
                    <tr>
                      <td width="146" align="center">To</td>
                      <td width="495" align="center"><input type="text" name="sentto" value=<%=sentto %> readonly=""></td>
                    </tr>
                    <tr>
                      <td align="center">Message</td>
                      <td><textarea cols="80" rows="4" name="message"></textarea></td>
                    </tr>
                    <tr>
                      <td><input type="text" name="dat" value=<%=dat%> readonly=""></td>
                      <td align="center"><input type="button" value="Send" onclick="fo()"></td>
					  
                    </tr>
                  </table>
                  </td>
				</form>	  
                </tr>
          </table></td>
            
        <td width="178" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <td height="23" bgcolor="#FFE9BB">
            
            
            
            
            
            
            
            </td>
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
</body>
</html>