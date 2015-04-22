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


.initial{display:none;}
.initial1{dispaly:inline;}
</style>
<script>
function f()
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
        <td width="846" height="613" align="right" valign="top" background="images/bg.jpg" bgcolor="#FFB0FF"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
              <%@ include file="middlemenu.jsp" %>
               </tr>
        </table>
              <FORM  name=f21 METHOD=POST ENCTYPE=multipart/form-data  ACTION="add_photo.jsp">
              
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0" background="images/bg.jpg">
                <tr>
                  <td  bgcolor="#FFFFFF" align="center" >
                   
                    <p>
                    
                      <%
                 
                 bean b1=new bean();
                 int i=0;
                 int albumid=Integer.parseInt(request.getParameter("albumid"));
                 String albumid1=request.getParameter("albumid");
                 session.setAttribute("zaid",albumid1);
                 
                 b1.setUsername(username);
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
                    <img name="" src="images/<%=s.getPhotoname()%>" width="158" height="119" alt="">
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
                <td valign="bottom" background="images/bg.jpg">
                <input type="button" name="add" value="Add Photos" class="initial1" onclick=f() id="add">                </td>
                </tr>
                <tr>
                <td background="images/bg.jpg" class="initial" id="s1">
                <input type="file" name="upload1">               
                
                <input type="submit" value="Add"> </td>
                </tr>
                
            </table></FORM></td>
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