package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import chat.*;
import java.io.*;
import beans.*;

public final class chatinit1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<script>\r\n");
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
      out.write("\tvar a=document.f1.id.value;\r\n");
      out.write("\t\r\n");
      out.write("\tvar url=\"chatleft.jsp?id=\" +a ;\r\n");
      out.write("\txmlHttp.open(\"GET\",url, true);\r\n");
      out.write("\txmlHttp.send(null)\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function stateChangedTest1() \r\n");
      out.write("{ \r\n");
      out.write("if (xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("}  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\n");
      out.write("<body onunload=\"test1()\">\r\n");
      out.write("\n");


String text=request.getParameter("t2");
String name1=(String)session.getAttribute("ab");
if(text==null)
	text=" entered room";

String id=(request.getParameter("id"));
bean b1=new bean();
b1.revolve(name1,id);
String t="";
try{

String p=getServletContext().getRealPath("/");	

FileWriter f=new FileWriter(p+"/chat/" +"chat"+id+".txt" ,true);;
t=name1+": "+text;

f.write(t+"\r\n");

f.close();


      out.write("\r\n");
      out.write("\r\n");
 


}
catch(Exception e){e.printStackTrace();}


      out.write("\r\n");
      out.write("<form name=\"f1\" action=\"chatinit1.jsp\" >\r\n");
      out.write("\r\n");
      out.write("<table border=1 width=\"30%\">\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("<iframe src=\"fileread.jsp?id=");
      out.print(id );
      out.write("\" width=\"100%\" scrolling=\"auto\"></iframe>\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" size=45 name=\"t2\">\r\n");
      out.write("<input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\">\r\n");
      out.write("<input type=\"submit\" value=\"send\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\n");
      out.write("</body>\n");
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
