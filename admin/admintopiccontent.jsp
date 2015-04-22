<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,beans.*" %>
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

a.links{text-decoration: none;font-size: 17px}
a.links:hover{text-decoration: none;color:blue;font-size: 19px;color:olive;}

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

.botgndu{
color:#3E3EFF
}
.drop1
{display:none}
.drop2
{display:inline}
</style>
<script>
function collapse(m)
{
if(m!="a1")
document.getElementById("a1").className="drop1";
if(m!="a2")
document.getElementById("a2").className="drop1";
if(m!="a3")
document.getElementById("a3").className="drop1";
}
function f(n)
{
collapse(n);
var p= document.getElementById(n);
if(p.className=="drop1")
p.className="drop2";
else
p.className="drop1";
}
</script>
</head>

<body>

<table width="100%" height="866" border="1" cellpadding="0" cellspacing="0" align="center">
  <tr>
    <%@ include file="adminheader.jsp"%>
  </tr>
  <tr bgcolor="#2B1521">
    <td height="617" valign="top"><table width="100%" height="615" border="1" cellpadding="0" cellspacing="0">
     
      <tr bgcolor="#FFB0FF">
      <%@include file="adminleftside.jsp" %>
      </tr>
		
		 </table>		  </td>
		  
        <td width="846" height="613" align="right" valign="top" bgcolor="#FFFFF"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="adminmiddlemenu.jsp" %>
          </tr>
        </table>
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td bgcolor="#FFFFF" valign="top" align="center">
                   <table width="100%" border="1" cellspacing="0" cellpadding="0">
          <%
		 String groupname=(String)session.getAttribute("groupname");
		  String topicname=(String)session.getAttribute("topicname");
		  String sgroupid=(String)session.getAttribute("groupid");
		  String stopicid=(String)session.getAttribute("topicid");
		  
		  %>
		  <tr>
            <td width="50%" align="center">Group Name : <a href="admingrouptopics.jsp?groupid=<%=sgroupid %>"><%=groupname%></a></td>
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
					  <a href="adminaddcomment.jsp?topicid=<%=topicid %>">click here to add a comment</a>
				  
				  <%
				  }
				  
				  else
				  {%>		<br><br>
					 
				 <a href="adminaddcomment.jsp?topicid=<%=topicid %>">Add a new comment</a>
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
    <td width="129" height="113" align="center"><img src="../images/<%=cimage%>" width="129" height="113" /></td>
    <td width="479"><table width="100%" height="145" border="1" cellpadding="0" cellspacing="0">
      <tr>
        <td align="center" width="80%">Commented By : <%=b2.getCommentor() %></td>
      <td align="right"><%=b2.getTime() %></td>
      </tr>
      <tr>
        <td align="center"><%=b2.getTcomment() %></td>
       <td align="center"> <a href="adminreplies.jsp?tmsgid=<%=b2.getTmsgid() %>&topicid=<%=topicid %>">Replies(<%=num %>)</a></td>
      </tr>
      <tr>
        
        <td> &nbsp;</td>
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
        <td width="175" valign="top" bgcolor="#E4CAFF"><table width="100%" border="1" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <%@include file="adminrightside.jsp" %>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="30" align="center" bgcolor="#E4CAFF" class="botgndu">Guru Nank Dev University </td>
  </tr>
</table>
</body>
</html>
