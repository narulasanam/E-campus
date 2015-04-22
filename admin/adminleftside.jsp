
        <td width="178" height="613" valign="top" bgcolor="#E4CAFF">
		<table width="100%" height="151" border="1" cellpadding="0" cellspacing="0">
		<tr>
		  <td width="174" height="96" valign="top" bgcolor="#2B1521">
		<table width="100%" height="113" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <%
            if(adminname==null)
            	response.sendRedirect("adminlogin.jsp");
            %>
            <td width="88" height="113"><a href="admin.jsp"><img src="../images/<%=image%>" width="88" height="96" /></a></td>
          	<td width="89" align="center"><span class="sidelinks"><%=adminname%></span></td>
		  </tr>
		 </table>         </td>
		  </tr>
		
		<tr>
		  <td height="27" align="center" bgcolor="#E4CAFF"><a href="javascript:f('a1')">Manage Students</a>
		  <br>
		    <table width="200" border="0" cellspacing="0" cellpadding="0" class="drop1" id="a1">
              <tr>
                <td align="center"><a class="links" href="addstudent.jsp" target="_self">Add Student</a></td>
                </tr>
                <tr>
                <td align="center"><a class="links" href="modifystudent1.jsp" target="_self">Modify Student</td>
              </tr>
              <tr>
                <td align="center"><a class="links" href="deletestudent1.jsp" target="_self">Delete Student</td>
              </tr>
            </table>
		  
		  
		  </td>
		  
		  
		  </tr>
		<tr>
		  <td height="27" align="center" bgcolor="#E4CAFF"><a href="javascript:f('a2')">Manage Teachers</a>
		 
		<br>
		    <table width="200" border="0" cellspacing="0" cellpadding="0" class="drop1" id="a2">
              <tr>
                <td align="center"><a class="links" href="addteacher.jsp" target="_self">Add Teacher</a></td>
                </tr>
                <tr>
                <td align="center"><a class="links" href="modifyteacher1.jsp" target="_self">Modify Teacher</td>
              </tr>
              <tr>
                <td align="center"><a class="links" href="deleteteacher1.jsp" target="_self">Delete Teacher</td>
              </tr>
            </table>
			
			</td>
		  </tr>
		<tr>
		  <td height="27" align="center" bgcolor="#E4CAFF"><a href="javascript:f('a3')">Manage Groups</a>
		 
		<br>
		    <table width="200" border="0" cellspacing="0" cellpadding="0" class="drop1" id="a3">
              <tr>
                <td align="center"><a class="links" href="creategroup.jsp" target="_self">Create Group</a></td>
                </tr>
                <tr>
                <td align="center"><a class="links" href="adminshowgroups.jsp" target="_self">Delete Group</td>
              </tr>
              <tr>
                <td align="center"><a class="links" href="adminshowgroups.jsp" target="_self">Show Groups</td>
              </tr>
            </table>
		
			</td>
		  
		  