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
        <td align="center" valign="top" width="846" height="613">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="teachermiddlemenu.jsp" %>
          </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td  bgcolor="#FFE9BB" align="center" valign="top">
				  
				  <table width="100%" border="1" cellspacing="0" cellpadding="0">
          <%
		 String groupname=(String)session.getAttribute("groupname");
		  %>
		  <tr>
            <td width="665">Group Name : <%=groupname%></td>
            
          </tr>
          <tr>
          <td><a href="teacher_topiccreated.jsp">Topic You Created</a></td>
          </tr>
        </table> 
        <br>
        <br>
        <br>
        <br>
        	<br>
        <br>
        
                
				  <%
				  
				  int groupid=Integer.parseInt(request.getParameter("groupid"));
				  bean b1=new bean();
				  b1.setUsername(username);
				  b1.setGroupid(groupid);
				  
				  
				  ArrayList a=b1.showtopics();
				  if(a.size()<1)
				  {
					  
				  %>
						No topics Present
					  <a href="addtopic.jsp?groupid=<%=groupid %>">click here to add topic</a>
				  
				  <%
				  }
				  
				  else
				  {
				  Iterator t=a.iterator();
				  %>
				  <table border=1 align="center">
				  <tr>
				  <td align="center"><b>Topic name</td>
				  <td align="center"><b>Date Of creation</td>
				  <td align="center"><b>Action</td>
				  </tr>
				  <%
				  while(t.hasNext())
				  {
					  bean b2=(bean)t.next();
				%>
				<tr>
				<td align="center"><%=b2.getTopicname() %></td>
				<td align="center"><%=b2.getDat() %></td>
				<td align="center"><a href="topiccon.jsp?topicid=<%=b2.getTopicid() %>&topicname=<%=b2.getTopicname() %>">See Comments</a></td>
				
				</tr>
				
				
				<%} 
				  
				 out.print("</table>");
				  %>
				  <table border=0>
					<tr>
					<td align=center><a href="addtopic.jsp?groupid=<%=groupid %>">Add A New Topic</a></td>
					</tr>
				  </table>
				  
				  <% }%>           
				              
				  
				  
				  
				  
				  
				  
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