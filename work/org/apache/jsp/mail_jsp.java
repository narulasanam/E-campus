package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function f()\r\n");
      out.write("\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("if(document.m1.to.value.length==0)\r\n");
      out.write("\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("alert(\"please enter an address\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else\r\n");
      out.write("\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("document.m1.submit();\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"images/mmm.jpg\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"Mail\" name=\"m1\">\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("  &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("  &nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("  <table width=\"120\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("\r\n");
      out.write("  <td><img src=\"images/email.png\" alt=\"mail\" width=\"182\" height=\"145\"></td>\r\n");
      out.write("\r\n");
      out.write("  <td><font size=\"+4\" color=\"#CC0000\" face=\"Ravie\">Sending Mail</font></td>\r\n");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td><br>\r\n");
      out.write("\r\n");
      out.write("  <b>FROM</b></td>\r\n");
      out.write("\r\n");
      out.write("<td><br>\r\n");
      out.write("\r\n");
      out.write("  <br>\r\n");
      out.write("\r\n");
      out.write("    <input type=text value=\"\" name=\"from\" size=100>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td><b>TO</b>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("  <td><br>\r\n");
      out.write("\r\n");
      out.write("  <input type=text value=\"\" name=\"to\" size=100>\r\n");
      out.write("\r\n");
      out.write("  <br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.write("\r\n");
      out.write("<b>Cc</b>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("<td><br>\r\n");
      out.write("\r\n");
      out.write("<input type=text value=\"\" name=\"cc\" size=100>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>\r\n");
      out.write("\r\n");
      out.write("<b>SUBJECT</b> </td>\r\n");
      out.write("\r\n");
      out.write("<td><br>\r\n");
      out.write("\r\n");
      out.write("<input type=text value=\"\" name=\"subject\" size=100>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>\r\n");
      out.write("\r\n");
      out.write("<b>MESSAGE</b> \r\n");
      out.write("\r\n");
      out.write("</td><td>\r\n");
      out.write("\r\n");
      out.write("<textarea name=\"body\" rows=\"8\" cols=\"70\"></textarea>\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td></td><td>\r\n");
      out.write("\r\n");
      out.write("<input type=button value=\"Send Mail\" onClick=\"javasacript:f()\">\r\n");
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
