<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beans.*,java.util.*,special.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<style>
.style1 {font-family: Verdana, Arial, Helvetica, sans-serif}

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

function fo()
{
if(document.f3.t1.value=="")
{
alert("Enter UserName");
}
else if(document.f3.t2.value=="")
{
alert("Enter Password");
}

else if(document.f3.t3.value=="")
{
alert("Enter Date Of Birth");
}
else if(document.f3.t4.value=="")
{
alert("Enter Teacher no.");
}
else if(document.f3.t5.value=="")
{
alert("Enter Office no.");
}
else if(document.f3.s1.value=="")
{
alert("Enter Department code");
}

else if(document.f3.t6.value=="")
{
alert("Enter Date of joining");
}
else
{
document.f3.submit();
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
		  
         <td width="846" height="613" align="right" valign="top" bgcolor="#FFE9BB"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%@ include file="adminmiddlemenu.jsp" %>
          </tr>
        </table><table width="100%" height="612" border="0" cellpadding="0" cellspacing="0">
            <tr>
               <td height="612" bgcolor="#FFFFFF" align="center">
               <form name="f3" action="modifyteacher2.jsp">

<%
String username,password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",dateofjoining="",n3="",n4="",n5="",n6="",n7="",teacher_no="",office="",graduation="",postgraduation="";

username=(String)session.getAttribute("ab");

bean b1=new bean();
b1.setUsername(username);
b1.demodteach();

password=b1.getPassword();
dcode=b1.getDcode();

email=b1.getEmail();
gender=b1.getGender();
address=b1.getAddress();
phone=b1.getPhone();
dateofbirth=b1.getDateofbirth();
hobbies=b1.getHobbies();
status=b1.getStatus();
teacher_no=b1.getTeacher_no();
office=b1.getOffice();
graduation=b1.getGraduation();
postgraduation=b1.getPostgraduation();
dateofjoining=b1.getDateofjoining();

dateconvert d1=new dateconvert();
String cdate=d1.convertd(dateofbirth);
String jdate=d1.convertd(dateofjoining);

%>
<table width="312" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="59"><h1 align="center">Modify Teacher</h1></td>
  </tr>
</table>

			   <table width="50%" height="335" border="0" cellpadding="0" cellspacing="0">
                 <tr>
                   <td width="49%" align="center">Username</td>
                   <td width="51%" align="center"><input type="text" name="t1" value=<%=username %> readonly ></td>
                 </tr>
                 <tr>
                   <td align="center">Password</td>
                   <td align="center"><input type="password" name="t2" value=<%=password%>> </td>
                 </tr>
                 <tr>
                   <td align="center">Dcode</td>
                   <td align="center">
				   <select name="s1">
				   <%
				   bean b2=new bean();
				   
				   ArrayList n=b2.showdcode();
				   Iterator t=n.iterator();
				   while(t.hasNext())
				   {
					    bean b3=(bean)t.next();
					    if(b3.getDcode().equals(dcode))
					    n3="selected";
					    else
					   	n3="";
					%>
				   <option value=<%=b3.getDcode() %>  <%=n3 %>><%=b3.getDname() %></option>
				   <% 
				   }
				   
				   %>
				   </select>				   
				   </td>
                 </tr>
                 <tr>
                   <td align="center">Date of Birth</td>
                    <td align="center"><input type="text" name="t3" id="dts2" value=<%=cdate %> readonly="readonly"></td>
             
  
    <td><a href="javascript:NewCal('dts2','ddmmmyyyy')"><img alt="Pick Date Time"  height="16" border="0" 
      src="calendar_icon.gif" width="16"/></td>
    </tr>
                 <tr>
                   <td align="center">Teacher no.</td>
                   <td align="center"><input type="text" name="t4" value=<%=teacher_no%>></td>
                 </tr>
                 <tr>
                   <td align="center">Office</td>
                   <td align="center">
				   <input type="text" name="t5" value=<%=office %> >	
				   		</td>
                 </tr>
                 
                 <tr>
                   <td align="center">Date of joining</td>
                   
                   <td align="center"><input type="text" name="t8" id="dts3" value=<%=jdate %> readonly="readonly" ></td>
             
  
    <td><a href="javascript:NewCal('dts3','ddmmmyyyy')"><img alt="Pick Date Time"  height="16" border="0" 
      src="calendar_icon.gif" width="16"/></td>
    
 				 </td>
 				 </tr>
                 
              <tr>
              <td align="center">
              Status
              </td>
              <td align=center>
              <select name="s4">
              
              <%
              
              if(status.equalsIgnoreCase("1"))
            	  n6="selected";
              else
            	  n7="selected";
            	%>
            	  <option value="1" <%=n6 %> >Activate</option>
              <option value="0" <%=n7 %> >Deactivate</option>
             
              </select>
              </td>
              </tr>
              
               </table>
			   
			   
			   			  <table width="200" height="44" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                              <td align="center"><input type="submit" value="Modify Record"></td>
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
    <td height="30" align="center" bgcolor="#2B1521" class="botgndu">Guru Nank Dev University </td>
  </tr>
</table>

</body>
</html>

</body>
</html>