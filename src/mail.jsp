<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

<script>

function f()

{

if(document.m1.to.value.length==0)

{

alert("please enter an address");

}

else

{

document.m1.submit();

}



}

</script>

</head>

<body background="images/mmm.jpg">

<form action="Mail" name="m1">

 

  &nbsp;&nbsp;&nbsp;

  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

  &nbsp;&nbsp;

  <table width="120" align="center">

  <tr>

  <td><img src="images/email.png" alt="mail" width="182" height="145"></td>

  <td><font size="+4" color="#CC0000" face="Ravie">Sending Mail</font></td>

  </tr>

<tr>

<td><br>

  <b>FROM</b></td>

<td><br>

  <br>

    <input type=text value="" name="from" size=100>

    <br>

    <br>

</td></tr>

<tr><td><b>TO</b>

</td>

  <td><br>

  <input type=text value="" name="to" size=100>

  <br>

<br>

</td></tr>

<tr>

<td>

<b>Cc</b>

</td>

<td><br>

<input type=text value="" name="cc" size=100>

<br>

<br>

</td></tr>

<tr><td>

<b>SUBJECT</b> </td>

<td><br>

<input type=text value="" name="subject" size=100>

<br>

<br>

</td></tr>

<tr><td>

<b>MESSAGE</b> 

</td><td>

<textarea name="body" rows="8" cols="70"></textarea>

</td></tr>

<tr>

<td></td><td>

<input type=button value="Send Mail" onClick="javasacript:f()">

</td></tr>

</table>

</form>

</body>

</html>