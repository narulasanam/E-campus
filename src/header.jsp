<td height="110"><table width="100%" height="179" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="179" height="179" bgcolor="#C1C1FF" class="logobg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="logo_p.jpg" width="137" height="129" /></td>
        <td width="1033" background="slide6.jpg"  bgcolor="#CCCCFF">
                 
        </p>
              <p align="right"><span class="eportal">E-Portal</span></p>
          <a href="#"></a></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="36"><table width="100%" height="34" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="177" height="34" bgcolor="#B02111"><span class="gnduportal">GNDU PORTAL </span></td>
        <td width="662" bgcolor="#B02111"><table width="345" height="30" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="59" class="search" >&nbsp;Search</td>
            <td width="282"><table width="286" height="30" border="0" cellpadding="0" cellspacing="0">
              <tr>
			  <form name="fstu" action="search.jsp">
                <td width="253"><input type="text" name="search" size="42" /></td>
               <td width="29"><input type="submit" value="search" /></td>
              </form>
			  </tr>
            </table></td>
          </tr>
        </table></td>
       <td width="177" align="right" bgcolor="#B02111"><a href="logout.jsp" class="logout">LogOut</a>
		
		<%
		String username=(String)session.getAttribute("ab");
		String image=(String)session.getAttribute("im");
		%>
		
		</td>
      </tr>
    </table></td>