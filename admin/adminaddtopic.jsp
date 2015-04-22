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
function fo()
{
if(document.f1.nam.value=="")
{
alert("Enter TopicName");
}


else
{
document.f1.submit();
}
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
                   <form name="f1" action="adminaddtopic1.jsp">
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
                              <td width="242" align="center"><textarea name="nam"> </textarea></td>
                            </tr>
                            
                        </table></td>
                      </tr>
                      <tr>
                        <td align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      	<input type="hidden" name="dat" value=<%=dat %>>
                      	<input type="hidden" name="time" value=<%=time %>>
                      	<input type="hidden" name="groupid" value=<%=groupid %>>
                        <input type="button" value="Create" onclick="fo()"></td></tr>
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
