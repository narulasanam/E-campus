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
a.elink:hover{color:#33FF00;font-size:15px;text-decoration:none}
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
             
				  <table width="100%" border="1" cellspacing="0" cellpadding="0">
          <%
		 String groupname=(String)session.getAttribute("groupname");
		  String topicname=(String)session.getAttribute("topicname");
		  String sgroupid=(String)session.getAttribute("groupid");
		  out.print(sgroupid);
		  String stopicid=(String)session.getAttribute("topicid");
		 %>
		  <tr>
             <td width="50%" align="center">Group Name : <a href="studentgrouptopics.jsp?groupid=<%=sgroupid %>"><%=groupname%></a></td>
            <td width="50%" align="center">Topic : <%=topicname %></td>
          </tr>
        </table> 
       
                
                  <%
				  
				 int topicid=Integer.parseInt(request.getParameter("topicid"));
                  bean b1=new bean();
				b1.setTopicid(topicid);
				ArrayList a=b1.showcomments();		 
				
				if(a.size()<1)
				  {
					  
				  %>
						 <br><br><br><br><br>
        <br>
        
						No Comment Present
					  <a href="studentaddcomment.jsp?topicid=<%=topicid %>">click here to add a comment</a>
				  
				  <%
				  }
				  
				  else
				  {%>		<br><br>
					 
				 <a href="studentaddcomment.jsp?topicid=<%=topicid %>">Add a new comment</a>
					 <% 
					 out.print("<br><br><br><br><br>");
					  Iterator t=a.iterator();
				  				  
				while(t.hasNext())
				 {
					 bean b2=(bean)t.next();
					 if(b2.getReplyid()==0)
					 {
						 out.print("<br>");
						 out.print("<table width='600' height='143' border='1' cellpadding='0' cellspacing='0'>");
				
						 String comm=b2.getCommentor();
						 int rectmsgid=b2.getTmsgid();	
							bean b4=new bean();
							b4.setImgusername(comm);
							String cimage=b4.cimage();
							
							b4.setReplyid(rectmsgid);
							int num=b4.numofreplies();
				
				%>
				<tr>
    <td width="129" height="113" align="center"><img src="images/<%=cimage%>" width="129" height="113" /></td>
    <td width="479"><table width="100%" height="145" border="1" cellpadding="0" cellspacing="0">
      <tr>
        <td align="center" width="80%">Commented By : <%=b2.getCommentor() %></td>
      <td align="right"><%=b2.getTime() %></td>
      </tr>
      <tr>
        <td align="center"><%=b2.getTcomment() %></td>
       <td align="center"> <a href="studentreplies.jsp?tmsgid=<%=b2.getTmsgid() %>&topicid=<%=topicid %>">Replies(<%=num %>)</a></td>
      </tr>
      <tr>
        
        <td>&nbsp;</td>
        <td height="57" align="right"><%=b2.getDat() %></td>
        
      </tr>
    </table></td>
  </tr>
				
				
				
				<%  
				out.print("</table>"); 
					 }
				  
				}
				
				  }
				   
				 %>
                
                   
                    </td>
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