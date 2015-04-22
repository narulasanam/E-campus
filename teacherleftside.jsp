
<td width="174" height="23" valign="top" bgcolor="#FFE9BB">&nbsp;</td>
          </tr>
		  <tr>
		  <td width="174" height="96" valign="top" bgcolor="#2B1521">
		<table width="100%" height="113" border="0" cellpadding="0" cellspacing="0">
          <tr>
          <%
          if(username==null)
          	response.sendRedirect("userlogin.jsp");
         
          
          %>
            <td width="88" height="113"><a href="teacher_home.jsp"><img src="images/<%=image%>" width="88" height="96" /></a></td>
          	<td width="89" align="center"><span class="sidelinks"><%=username%></span></td>
		  </tr>
		 </table>         </td>
          </tr>
		  <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="teachershow_students.jsp" target="_self" class="sidelinks">Students</a></td>
		    </tr>
		  <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="teachershow_teachers.jsp" class="sidelinks"> Teachers</a></td>
		    </tr>
		   <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="teachermessages.jsp" class="sidelinks"> Messages</a></td>
		    </tr>
		  <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="create_group.jsp" class="sidelinks">Create Group </a></td>
		    </tr>
		  <tr>
            <td height="27" align="center" bgcolor="#2B1521"><a href="teachercreate_album.jsp" class="sidelinks">Create Album </a></td>
		  </tr>
			<tr>
			<td align="center" bgcolor="#2B1521" class="sidelinks"><a href="online.jsp">Online persons</a></td>
			</tr>
		
			