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
        <td align="right" valign="top" width="846" height="613"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="teachermiddlemenu.jsp" %>
          </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                   <td bgcolor="#FFE9BB" align="center" valign="top">
				  
				  <table width="100%" border="1" cellspacing="0" cellpadding="0">
          <%
		  
		 String groupname=(String)session.getAttribute("groupname");
		  %>
		  <tr>
            <td width="665">Group Name : <%=groupname%></td>
            
          </tr>
        </table> 
        <br>
        <br>
        <br>
        <br>
        	<br>
        <br>
        
                
                  <form name="f1" action="addtopic1.jsp">
                  <%
				  
				  int groupid=Integer.parseInt(request.getParameter("groupid"));
				 
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
				  
				  String time=(h+":"+min+t);
				 %>
                    <table width="491" height="70" border="0" cellpadding="0" cellspacing="0">
                      <tr>
                        <td align="center"><h2>Add Topic  </h2></td>
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
                              <td width="111" align="center">Topic Title </td>
                              <td width="242" align="center"><textarea name="name"> </textarea></td>
                            </tr>
                            
                        </table></td>
                      </tr>
                      <tr>
                        <td align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      	<input type="hidden" name="dat" value=<%=dat %>>
                      	<input type="hidden" name="time" value=<%=time %>>
                      	<input type="hidden" name="groupid" value=<%=groupid %>>
                        <input type="submit" value="Create"></td></tr>
                    </table>
                    </form>
                    </td>
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