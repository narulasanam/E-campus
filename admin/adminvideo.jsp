<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,beans.*,java.sql.Connection,special.*"%>
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

function fo()
{
if(document.f1.title.value=="")
{
alert("Enter Title");
}
else if(document.f1.attachment.value=="")
{
alert("Attach file");
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
                  <br>
                  <br>
                   <table width="560" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF">
                    <FORM  name=f1 METHOD=POST ENCTYPE=multipart/form-data  ACTION="adminvideo1.jsp">
                    <tr>
                    <td align="center">Title : </td>
                    <td><input type="text" name="title" size="50"></td>
                    </tr>
                    
                    <tr>
                      <td width="130" align="center"> Attach video.......... </td>
                      <td width="424"><input type="file" name="attachment"></td>
                    </tr>
                    <tr>
                      <td>&nbsp;</td>
                      <td align="right"><input type="button" value="Publish" onclick="fo()"></td>
                    </tr>
                 </FORM>	
			</table>
			  <br><br>
				  
				 <% 	
				
				bean b3=new bean();
				String cimage="";
				ArrayList a=b3.showvideos();
				
				Iterator t=a.iterator();
				  	Connection con=Dataconnection.conestablished();			  
				while(t.hasNext())
				{
					 bean b2=(bean)t.next();
					String videoowner=b2.getVideoowner();
					bean b4=new bean();
					
					b4.setImgusername(videoowner);
					if(videoowner.equals("admin"))
						 cimage=b4.adminimage();
						else
						cimage=b4.cimage1(con);
						
				%> 
				<br>
				<table width='600' height='75' border='1' cellpadding='0' cellspacing='0'>
			<tr>

<td width="80" height="40" align="center">

<table>
<tr>
<td><img src="../images/<%=cimage%>" width="60" height=45" /></td>
</tr>
<tr>
<td align="center"><%=videoowner %></td>
</tr>
</table>

</td>


	<td width="479">
	<table width="514" height="15" border='0' cellpadding='0' cellspacing='0'>
	<tr><td>Title : <b> <%=b2.getTitle() %></td><td><a href="admindelvideo.jsp?vid=<%=b2.getVideo() %>">Delete</a></td></tr>
	<tr>
	
	<td width="85%" align="center"><a href="../videos/<%=b2.getVideo() %>">Download video</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="adminplayvideo.jsp?vid=<%=b2.getVideo()%>">Play video</a></td>
	<td>
	<table border="0">
	<tr>
	<td><%=b2.getTime() %></td>
 </tr>
 <tr>
 <td><%=b2.getDat() %></td>
 </tr>
 </table>

		 </td>
                </tr>
          </table>
         </table>		  
		<%}con.close();
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
