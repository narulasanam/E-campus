<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,beans.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
.style1 {font-family: Verdana, Arial, Helvetica, sans-serif}
.sidelinks{text-decoration:none;color:#FFFFFF}
.admintext
{
font-size:44px;
color:#3E3EFF;
}

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
        
                
             <form name="f1" action="adminaddcomment1.jsp">
                  <%
				  
				int topicid=Integer.parseInt(request.getParameter("topicid"));
                 
				bean b1=new bean();
				 
				b1.setTopicid(topicid);
				 
				 %>
                  <table width="654" height="135" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" bgcolor="#FFFFFF">
                    <tr>
                      <td height="133" align="center" bgcolor="#FFE9BB"><table width="324" border="0" cellspacing="0" cellpadding="0">
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
             </form>	
                  
                  
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
