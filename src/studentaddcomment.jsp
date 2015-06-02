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
        <td align="right" valign="top" width="846" height="613"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="middlemenu.jsp" %>
          </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                     <td bgcolor="#FFE9BB" align="center" valign="top">
             
				  <table width="100%" border="1"cellspacing="0" cellpadding="0">
          <%
		 String groupname=(String)session.getAttribute("groupname");
          String topicname=(String)session.getAttribute("topicname");
          %>
		  <tr>
           <td width="50%" align="center">Group Name : <%=groupname%></td>
           <td width="50%" align="center">Topic : <%=topicname %></td>
          </tr>
        </table> 
        <br>
        <br>
        <br>
        <br>
        	<br>
        <br>
        
                
             <form name="f1" action="studentaddcomment1.jsp">
                  <%
				  
				int topicid=Integer.parseInt(request.getParameter("topicid"));
                 
				bean b1=new bean();
				 
				b1.setTopicid(topicid);
				 
				 %>
                  <table width="654" height="135" border="1" bgcolor="#FFE9BB"  cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bgcolor="#FFFFFF">
                    <tr>
                      <td height="133" align="center"><table width="324" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td width="376" bordercolor="#333333" align="center"><b>What does your mind say </b></td>
                        </tr>
                      </table>
                        <table width="626" border="1" cellpadding="0" cellspacing="0" bordercolor="#333333" bgcolor="#0099FF">
                          
                          <tr>
                            <td width="253" align="center"><b>Comment Here</b> </td>
                            <td width="367"><textarea name="comment" cols="45"></textarea></td>
                          </tr>
                          <tr>
                            <td>
                            <input type="hidden" name="topicid" value=<%=topicid %>>
                            </td>
                            <td align="right" background="#333333"><input name="submit" type="submit" value="Publish"></td>
                          </tr>
                      </table></td>
                    </tr>
                  </table>
             </form>					</td>
                </tr>
            </table></td>
        <td width="178" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <td height="23" bgcolor="#FFE9BB">&nbsp;</td>
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