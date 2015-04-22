<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
<script language="JavaScript" src="datetimepicker.js" type="text/javascript"></script>

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
if(document.f1.t1.value=="")
{
alert("Enter UserName");
}
else if(document.f1.t2.value=="")
{
alert("Enter Password");
}

else if(document.f1.t3.value=="")
{
alert("Enter Date Of Birth");
}
else if(document.f1.t4.value=="")
{
alert("Enter Teacher no.");
}
else if(document.f1.t5.value=="")
{
alert("Enter Office no.");
}
else if(document.f1.s1.value=="")
{
alert("Enter Department code");
}

else if(document.f1.t6.value=="")
{
alert("Enter Date of joining");
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
    <tr>
		  <td height="27" align="center" bgcolor="#E4CAFF">&nbsp;</td>
	  </tr>
		 </table>		  </td>
		  
        <td width="846" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="adminmiddlemenu.jsp" %>
          </tr>
        </table> 
		<table width="100%" height="612" border="0" cellpadding="0" cellspacing="0">
            <tr>
               <td height="612" bgcolor="#FFFFFF" align="center" valign="top">
             <form name="f1" action="addteacher2.jsp">
             
              
              
			<br><br>
			  
             
			   <table width="312" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="59"><h1 align="center">Add Teacher </h1></td>
  </tr>
</table>

			   <table width="50%" height="335" border="0" cellpadding="0" cellspacing="0">
                 <tr>
                   <td width="49%" align="center">Username</td>
                   <td width="51%" align="center"><input type="text" name="t1" ></td>
                 </tr>
                 <tr>
                   <td align="center">Password</td>
                   <td align="center"><input type="password" name="t2" ></td>
                 </tr>
                 <tr>
                   <td align="center">Dcode</td>
                   <td align="center">
				   <select name="s1">
				   <%
				   bean b1=new bean();
				   
				   ArrayList n=b1.showdcode();
				   Iterator t=n.iterator();
				   while(t.hasNext())
				   {
					    bean b2=(bean)t.next();
					%>
				   <option value=<%=b2.getDcode() %>><%=b2.getDname() %></option>
				   <% 
				   }
				   
				   %>
				   </select>				   
				   </td>
                 </tr>
                 <tr>
                   <td align="center">Date of Birth</td>
                   <td align="center"><input type="text" name="t3" id="dts2" readonly="readonly" ></td>
             <td><a href="javascript:NewCal('dts2','ddmmmyyyy')"><img alt="Pick Date Time"  height="16" border="0" 
      src="calendar_icon.gif" width="16"/></td>
  
                 </tr>
                 <tr>
                   <td align="center">Teacher no.</td>
                   <td align="center"><input type="text" name="t4"></td>
                 </tr>
                 <tr>
                   <td align="center">Office</td>
                   <td align="center"><input type="text" name="t5"></td>
                 </tr>
                 <tr>
                   <td align="center">Date of joining</td>
                   <td align="center"><input type="text" name="t6"></td>
                 </tr>
               </table>
			   
			   
			   			  <table width="200" height="44" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                              <td align="center"><input type="button" value="Add Record" onclick="fo()"></td>
                            </tr>
                          </table>
                           
                          </form>
                          </td>
            </tr>
          </table>
         
          </td>
        <td width="175" valign="top" bgcolor="#E4CAFF"><table width="100%" border="1" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
          <tr>
            <%@ include file="adminrightside.jsp" %>
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
