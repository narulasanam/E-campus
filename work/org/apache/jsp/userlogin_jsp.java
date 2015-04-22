package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write(".message{color:red}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("<!--\r\n");
      out.write("var xmlHttp;\r\n");
      out.write("var set;\r\n");
      out.write("var top;\r\n");
      out.write("var username\r\n");
      out.write("var topic;\r\n");
      out.write("var tt;\r\n");
      out.write("function GetXmlHttpObject()\r\n");
      out.write("{\r\n");
      out.write("var xmlHttp=null;\r\n");
      out.write("try\r\n");
      out.write(" {\r\n");
      out.write(" // Firefox, Opera 8.0+, Safari\r\n");
      out.write(" xmlHttp=new XMLHttpRequest();\r\n");
      out.write(" }\r\n");
      out.write("catch (e)\r\n");
      out.write(" {\r\n");
      out.write(" //Internet Explorer\r\n");
      out.write(" try\r\n");
      out.write("  {\r\n");
      out.write("  xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("  }\r\n");
      out.write(" catch (e)\r\n");
      out.write("  {\r\n");
      out.write("  xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write("return xmlHttp;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function test1()\r\n");
      out.write("{ \r\n");
      out.write("\r\n");
      out.write("xmlHttp=GetXmlHttpObject()\r\n");
      out.write("if (xmlHttp==null)\r\n");
      out.write("{\r\n");
      out.write(" alert (\"Browser does not support HTTP Request\")\r\n");
      out.write(" return\r\n");
      out.write("}\r\n");
      out.write("   \r\n");
      out.write("\txmlHttp.onreadystatechange=stateChangedTest1\r\n");
      out.write("\t\r\n");
      out.write("\tvar a=document.f1.t1.value;\r\n");
      out.write("\tvar b=document.f1.t2.value;\r\n");
      out.write("\tvar url=\"userlogin1.jsp?n=\" +a +\"&n1=\" +b;\r\n");
      out.write("\txmlHttp.open(\"GET\",url, true);\r\n");
      out.write("\txmlHttp.send(null)\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function stateChangedTest1() \r\n");
      out.write("{ \r\n");
      out.write("if (xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\r\n");
      out.write("{\r\n");
      out.write("\tif(xmlHttp.responseText.indexOf(\"teacher\")>-1)\r\n");
      out.write(" \t{ \t\r\n");
      out.write("\twindow.open(\"teacher_home.jsp\",\"_self\"); \r\n");
      out.write(" \t}\r\n");
      out.write("\telse if(xmlHttp.responseText.indexOf(\"student\")>-1) \r\n");
      out.write("\t{\r\n");
      out.write(" \twindow.open(\"student_home.jsp\",\"_self\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(xmlHttp.responseText.indexOf(\"no\")>-1)\r\n");
      out.write("\t{\r\n");
      out.write("\tdocument.getElementById(\"disp\").innerHTML=\"username or password is not correct\"; \r\n");
      out.write(" \t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function MM_swapImgRestore() { //v3.0\r\n");
      out.write("  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function MM_preloadImages() { //v3.0\r\n");
      out.write("  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\r\n");
      out.write("    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\r\n");
      out.write("    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function MM_findObj(n, d) { //v4.01\r\n");
      out.write("  var p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\r\n");
      out.write("    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\r\n");
      out.write("  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\r\n");
      out.write("  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\r\n");
      out.write("  if(!x && d.getElementById) x=d.getElementById(n); return x;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function MM_swapImage() { //v3.0\r\n");
      out.write("  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)\r\n");
      out.write("   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onLoad=\"MM_preloadImages('login images/lib18.jpg')\">\r\n");
      out.write("<form name=\"f1\">\r\n");
      out.write("<table width=\"100%\" height=\"695\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"126\" bgcolor=\"#005782\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"521\"><table width=\"100%\" height=\"546\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"70%\" height=\"544\" background=\"login images/nescafe.jpg\" bgcolor=\"#005782\"></td>\r\n");
      out.write("        <td width=\"30%\" align=\"center\" valign=\"top\" bgcolor=\"#005782\">\r\n");
      out.write("\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t  <p>&nbsp;</p>\r\n");
      out.write("\t\t  <table width=\"286\" height=\"211\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td align=\"center\">SIGN IN </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td align=\"center\">Username</td>\r\n");
      out.write("\t\t\t  <td align=\"center\">\r\n");
      out.write("\t\t\t  <input type=\"text\" name=\"t1\">\t\t\t  </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td align=\"center\">Password</td>\r\n");
      out.write("\t\t\t  <td align=\"center\"><input type=\"password\" name=\"t2\"></td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t\t\t \r\n");
      out.write("            \r\n");
      out.write("          </table>\t\t\r\n");
      out.write("\t\t  <table width=\"280\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td  align=\"center\"> <div id=\"disp\" class=\"message\"> </div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td  align=\"center\"><input type=\"button\" value=\"Sign In\" onClick=\"test1()\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\" align=\"center\" bgcolor=\"#005782\">Guru Nanak Dev University </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
