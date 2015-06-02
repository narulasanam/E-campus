<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,beans.*,java.sql.Connection,special.*"%>
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
<script>
function f()
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
        <td width="846" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="teachermiddlemenu.jsp" %>
          </tr>
        </table>
              <div style="overflow: scroll; width:800px;height:500px;display:block;">
              <table width="100%" height="591" border="0" cellpadding="0" cellspacing="0">
                <tr>
				<br>
				<br>
				
                  <td bgcolor="#FFE9BB" valign="top" align="center">
				  
				  
				  
				  <table width="560" border="1" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF">
                    <FORM  name=f1 METHOD=POST ENCTYPE=multipart/form-data  ACTION="teachervideo1.jsp">
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
                      <td align="right"><input type="button" value="Publish" onclick="f()"></td>
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
<td><img src="images/<%=cimage%>" width="60" height=45" /></td>
</tr>
<tr>
<td align="center"><%=videoowner %></td>
</tr>
</table>

</td>


	<td width="479">
	<table width="514" height="15" border='0' cellpadding='0' cellspacing='0'>
	<tr><td>Title : <b> <%=b2.getTitle() %></td></tr>
	<tr>
	
	<td width="85%" align="center"><a href="videos/<%=b2.getVideo() %>">Download video</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="playvideo.jsp?vid=<%=b2.getVideo()%>">Play video</a></td>
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
				  
				  
				 
				
         
         </td></tr>
         </table>
         </div>
         </td>
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