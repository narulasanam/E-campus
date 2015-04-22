<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,beans.*"%>
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
                  <td bgcolor="#FFFFF" align="center">
                   <%
                  bean b1=new bean();
                  b1.setCreator(adminname);
                  ArrayList a=b1.stushowtopics();
                  if(a.size()<1)
				  {
					  
				  %>
					<h3>No topics Cretaed By You For This Group</h3>					 
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
				  <td align="center"><b>Delete</td>
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
				<td align="center"><a href="deletetopic.jsp?topicid=<%=b2.getTopicid() %>">Delete Topic</a></td>
				</tr>
				
				
				<%} 
				  
				 out.print("</table>");
				  %>
				  
				  
				  <% }%>           
                  
                  
                  
                 
                  
                  
                  
                  
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
