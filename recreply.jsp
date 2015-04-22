<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.util.*,java.sql.Connection,special.*"%>
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
		  String topicname=(String)session.getAttribute("topicname");
		  String sgroupid=(String)session.getAttribute("groupid");
		  String stopicid=(String)session.getAttribute("topicid");
		  
		  
		  %>
		  <tr>
            <td width="50%" align="center">Group Name : <a href="grouptopics.jsp?groupid=<%=sgroupid %>"> <%=groupname%></a></td>
            <td width="50%" align="center">Topic : <a href="topiccontent.jsp?topicid=<%=stopicid %>"> <%=topicname %></td>
          </tr>
        </table> 
       
                
                  <%
				  
				 int tmsgid=Integer.parseInt(request.getParameter("tmsgid"));
                 int topicid=Integer.parseInt(request.getParameter("topicid"));
                  bean b1=new bean();
				b1.setTmsgid(tmsgid);
				
					b1.showreplies();		 
				
				String comm1=b1.getCommentor();
				
				bean b5=new bean();
						b5.setImgusername(comm1);
						String c1image=b5.cimage();
						
				%>
				
				<br>
				<br><br><br><br>	
			<table width='600' height='143' border='1' cellpadding='0' cellspacing='0'>
			<tr>
<td width="129" height="113" align="center"><table width="103" height="141">
  <tr>
    <td height="93"><img src="images/<%=c1image%>" alt="a" width="94" height=77 /></td>
  </tr>
  <tr>
    <td height="40" align="center"><%=comm1 %></td>
  </tr>
</table></td>
<td width="479"><table width="100%" height="145" border="1" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center" width="80%">Commented By : <%=b1.getCommentor() %></td>
  <td align="right"><%=b1.getTime() %></td>
  </tr>
  <tr>
    <td align="center"><%=b1.getTcomment() %></td>
   <td align="center">&nbsp;</td>
  </tr>
  <tr>
    
    <td>&nbsp;</td>
    <td height="57" align="right"><%=b1.getDat() %></td>
    
  </tr>
</table></td>
</tr>
</table>			
			<% 	
				
				bean b3=new bean();
				b3.setReplyid(tmsgid);	
				ArrayList a=b3.showreplies1();
				
				Iterator t=a.iterator();
				Connection con=Dataconnection.conestablished();	 				  
				while(t.hasNext())
				{
					 bean b2=(bean)t.next();
					String comm=b2.getCommentor();
					int rectmsgid=b2.getTmsgid();	
						bean b4=new bean();
						b4.setImgusername(comm);
						String cimage=b4.cimage1(con);
						b4.setReplyid(rectmsgid);
						int num=b4.numofreplies1(con);
				%>
			<table width='600' height='75' border='1' cellpadding='0' cellspacing='0'>
			<tr>

<td width="80" height="40" align="center">

<table>
<tr>
<td><img src="images/<%=cimage%>" width="60" height=45" /></td>
</tr>
<tr>
<td align="center"><%=comm %></td>
</tr>
</table>



</td>
	<td width="479"><table width="514" height="15" border='0' cellpadding='0' cellspacing='0'>
	<tr>
	<td width="85%" align="center"><%=b2.getTcomment() %></td>
	<td>
	<table border="0">
	<tr>
	<td><%=b2.getTime() %></td>
 </tr>
 <tr>
 <td><%=b2.getDat() %></td>
 </tr>
 <tr><td><a href="recreply.jsp?tmsgid=<%=b2.getTmsgid() %>&topicid=<%=topicid %>">reply(<%=num %>)</a></td></tr>
 
 </table>
 </td>
 
 </tr>
 
 </table>
 </table>
			
			
			
			<%
 		}con.close();%>
 		
				<table width='600' height='60' border='1' cellpadding='0' cellspacing='0'>
				<tr>
	
	<form name="t1" action="recreply1.jsp">
	
	<td width="80" height="40" align="center"><img src="images/<%=image%>" width="60" height=40" /></td>
	<td width="479"><table width="514" height="15" border='0' cellpadding='0' cellspacing='0'>
	<tr><td width="85%"><textarea name="comment" cols="50"></textarea></td>
	<td>
	<input type="hidden" name="tmsgid" value=<%=tmsgid %>>
	<input type="hidden" name="topicid" value=<%=topicid %>>
	
	<input type="submit" value="Comment">
	
	</td>
	</form>
	</tr>
	</table>
	
	
	</td>
	 </tr>
	 </table>		
 		
                
                   
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