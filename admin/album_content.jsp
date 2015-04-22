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
.initial{display:none;}
.initial1{dispaly:inline;}
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

function foo()
{
var p=document.getElementById("s1");
var m=document.getElementById("add");

if(m.className=="initial")
m.className="initial1";
else
m.className="initial";



if(p.className=="initial")
p.className="initial1";
else
p.className="initial";
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
        <FORM  name=f21 METHOD=POST ENCTYPE=multipart/form-data  ACTION="add_photo.jsp">
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <td bgcolor="#FFFFF" align="center">
                  
                    <p>
                    
                      <%
                 
                 bean b1=new bean();
                 int i=0;
                 int albumid=Integer.parseInt(request.getParameter("albumid"));
                 String albumid1=request.getParameter("albumid");
                 session.setAttribute("zaid",albumid1);
                 
                 b1.setUsername(adminname);
                 b1.setAlbumid(albumid);
                 
                 
                 
                 ArrayList a = b1.show_photos();
                 Iterator t=a.iterator();
                 %>
				 <table border=0 align="center">
				 <tr>
				 <%
				 while(t.hasNext())
                 {
					 i++;
                	bean s=(bean)t.next();
                		
                 
                 %>
                      <td>
                    <img name="" src="../images/<%=s.getPhotoname()%>" width="158" height="119" alt="">
                       <%=s.getPhototitle()%>
                      </td>
                      <%
                      if(i%3==0)
                		{	out.print("</tr>");
                			out.print("<tr>");
                		}
                 }
				 %> 
                  </tr>
                 </table>
                  
                  </td>
                </tr>
                <tr>
                <td valign="bottom">
                <input type="button" name="add" value="Add Photos" class="initial1" onclick=foo() id="add">                </td>
                </tr>
                <tr>
                <td class="initial" id="s1">
                <input type="file" name="upload1">               
                
                <input type="submit" value="Add">
                  
                  
                  
                  
                  
                  </td>
                </tr>
          </table></FORM></td>
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
