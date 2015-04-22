package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manage_005fstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".style1 {font-family: Verdana, Arial, Helvetica, sans-serif}\r\n");
      out.write("\r\n");
      out.write(".admintext\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("font-size:44px;\r\n");
      out.write("color:#3E3EFF;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".gnduasr\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("font-size:24px;\r\n");
      out.write("color:#3E3EFF;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".logobg\r\n");
      out.write("{\r\n");
      out.write("background-color:#090909\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".eportal \r\n");
      out.write("{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\ttop:30px;\r\n");
      out.write("\tleft:1148px;\r\n");
      out.write("\tcolor: 3E3EFF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tz-index:19;\r\n");
      out.write("\twidth: 66px;\r\n");
      out.write("}\r\n");
      out.write(".underlap{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\ttop:18px;\r\n");
      out.write("\tleft:190px;\r\n");
      out.write("\tz-index:10;\r\n");
      out.write("\twidth: 1023px;\r\n");
      out.write("\theight: 176px;\r\n");
      out.write("}\r\n");
      out.write(".botgndu{\r\n");
      out.write("color:#3E3EFF\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" height=\"866\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"110\"><table width=\"100%\" height=\"179\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"179\" height=\"179\" bgcolor=\"#C1C1FF\" class=\"logobg\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"logo_p.jpg\" width=\"137\" height=\"129\" /></td>\r\n");
      out.write("        <td width=\"1033\" background=\"slide4.jpg\"  bgcolor=\"#CCCCFF\">\r\n");
      out.write("\t\t<p align=\"center\" class=\"admintext\">Welcome Administrator<br><marquee class=\"gnduasr\">GNDU,AMRITSAR</marquee></p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p align=\"right\"><span class=\"eportal\">E-Portal</span></p>\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("          <a href=\"#\"></a></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"36\"><table width=\"100%\" height=\"34\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"177\" height=\"34\" bgcolor=\"#FFE9BB\"><span class=\"style1\">GNDU PORTAL </span></td>\r\n");
      out.write("        <td width=\"662\" bgcolor=\"#FFE9BB\"><table width=\"345\" height=\"30\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"59\">&nbsp;Search</td>\r\n");
      out.write("            <td width=\"282\"><table width=\"286\" height=\"30\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"253\">&nbsp;</td>\r\n");
      out.write("                <td width=\"29\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"177\" align=\"right\" bgcolor=\"#FFE9BB\">UserName</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#2B1521\">\r\n");
      out.write("    <td height=\"617\" valign=\"top\"><table width=\"100%\" height=\"615\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr bgcolor=\"#FFB0FF\">\r\n");
      out.write("        <td width=\"178\" height=\"613\" valign=\"top\" bgcolor=\"#FFE9BB\">\r\n");
      out.write("\t\t<table width=\"100%\" height=\"151\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td width=\"174\" height=\"23\" valign=\"top\" bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td height=\"27\" align=\"center\" bgcolor=\"#FFE9BB\"><a href=\"manage_student.jsp\" target=\"_self\" onMouseOver=\"mover()\" onMouseOut=\"mout()\">Manage Students</a></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td height=\"27\" align=\"center\" bgcolor=\"#FFE9BB\"><a href=\"#\">Manage Teachers</a></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td height=\"27\" align=\"center\" bgcolor=\"#FFE9BB\"><a href=\"#\">Create Group </a></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td height=\"27\" align=\"center\" bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t </table>\t\t  </td>\r\n");
      out.write("\t\t  \r\n");
      out.write("        <td width=\"846\" height=\"613\" align=\"right\" valign=\"top\" bgcolor=\"#FFFFFF\"><table width=\"100%\" height=\"612\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"612\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table></td>\r\n");
      out.write("        <td width=\"178\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFE9BB\"><a href=\"#\">Info About Course </a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFE9BB\"><a href=\"#\">Events</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFE9BB\"><a href=\"#\">Recent Activity </a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" align=\"center\" bgcolor=\"#2B1521\" class=\"botgndu\">Guru Nank Dev University </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
