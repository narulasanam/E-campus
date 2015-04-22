package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.*;
import java.util.*;

public final class teacher_005fedit_005fprofile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".admintext {\r\n");
      out.write("font-size:44px;\r\n");
      out.write("color:#3E3EFF;\r\n");
      out.write("}\r\n");
      out.write(".botgndu {color:#000000\r\n");
      out.write("}\r\n");
      out.write(".eportal {\tposition:absolute;\r\n");
      out.write("\ttop:30px;\r\n");
      out.write("\tleft:1148px;\r\n");
      out.write("\tcolor: 3E3EFF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tz-index:19;\r\n");
      out.write("\twidth: 66px;color:#FFFFFF\r\n");
      out.write("}\r\n");
      out.write(".gnduasr {\r\n");
      out.write("font-size:24px;\r\n");
      out.write("color:#3E3EFF;\r\n");
      out.write("}\r\n");
      out.write(".logobg {background-color:#090909\r\n");
      out.write("}\r\n");
      out.write(".style1 {font-family: Verdana, Arial, Helvetica, sans-serif}\r\n");
      out.write("\r\n");
      out.write(".elink{color:#FF0000;font-size:15px;margin-right:80px;text-decoration:none}\r\n");
      out.write("a.elink:hover{color:#33FF00;font-size:17px;text-decoration:none}\r\n");
      out.write(".centerlinks{text-decoration:none;color:#000000}\r\n");
      out.write(".logout{text-decoration:none;margin-right:20px;color:#FFFFFF}\r\n");
      out.write(".sidelinks{text-decoration:none;color:#FFFFFF}\r\n");
      out.write(".search{color:#FFFFFF}\r\n");
      out.write(".gnduportal{font-family: Verdana, Arial, Helvetica, sans-serif;color:#FFFFFF}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"f1\" >\r\n");
      out.write("<table width=\"100%\" height=\"866\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"110\"><table width=\"100%\" height=\"179\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"179\" height=\"179\" bgcolor=\"#C1C1FF\" class=\"logobg\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=\"logo_p.jpg\" width=\"137\" height=\"129\" /></td>\r\n");
      out.write("        <td width=\"1033\" background=\"slide6.jpg\"  bgcolor=\"#CCCCFF\">\r\n");
      out.write("                 \r\n");
      out.write("        </p>\r\n");
      out.write("              <p align=\"right\"><span class=\"eportal\">E-Portal</span></p>\r\n");
      out.write("          <a href=\"#\"></a></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"36\"><table width=\"100%\" height=\"34\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"177\" height=\"34\" bgcolor=\"#B02111\"><span class=\"gnduportal\">GNDU PORTAL </span></td>\r\n");
      out.write("        <td width=\"662\" bgcolor=\"#B02111\"><table width=\"345\" height=\"30\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"59\" class=\"search\">&nbsp;Search</td>\r\n");
      out.write("            <td width=\"282\"><table width=\"286\" height=\"30\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"253\">&nbsp;</td>\r\n");
      out.write("                <td width=\"29\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("       <td width=\"177\" align=\"right\" bgcolor=\"#B02111\"><a href=\"logout.jsp\" class=\"logout\">LogOut</a></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#2B1521\">\r\n");
      out.write("    <td height=\"491\" valign=\"top\"><table width=\"100%\" height=\"615\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr bgcolor=\"#FFB0FF\">\r\n");
      out.write("        <td width=\"189\" height=\"613\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" height=\"227\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"177\" height=\"23\" valign=\"top\" bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t  <td width=\"174\" height=\"96\" valign=\"top\" bgcolor=\"#2B1521\">\r\n");
      out.write("\t\t<table width=\"100%\" height=\"113\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"88\" height=\"113\"><img src=\"DSCN1363.JPG\" width=\"88\" height=\"96\" /></td>\r\n");
      out.write("          \t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t                     ");

String username,password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",yearofjoining="",n3="",n4="",n5="",n6="",n7="",teacher_no="",graduation="",postgraduation="",dateofjoining="",office="";


username=(String)session.getAttribute("ab");

bean b1=new bean();
b1.setUsername(username);

name=request.getParameter("name");
email=request.getParameter("email");
gender=request.getParameter("gender");
graduation=request.getParameter("graduation");
postgraduation=request.getParameter("postgraduation");
office=request.getParameter("office");
address=request.getParameter("address");
phone=request.getParameter("phone");
hobbies=request.getParameter("hobbies");

b1.setUsername(username);
b1.setName(name);
b1.setEmail(email);
b1.setGender(gender);
b1.setGraduation(graduation);
b1.setPostgraduation(postgraduation);
b1.setOffice(office);
b1.setAddress(address);
b1.setPhone(phone);
b1.setHobbies(hobbies);
b1.teacheredit_prof();

      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td width=\"89\" align=\"center\">");
      out.print(username);
      out.write("</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t </table>         </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"#\" target=\"_self\" class=\"sidelinks\">Students</a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"#\" class=\"sidelinks\"> Teachers</a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"create_group.jsp\" class=\"sidelinks\">Create Group </a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"createalbum.jsp\" class=\"sidelinks\">Create Album </a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("          \r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td align=\"right\" valign=\"top\" width=\"1025\" height=\"613\"><table width=\"101%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"22\" align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"#\" class=\"centerlinks\">News</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"student_profile.jsp\" class=\"centerlinks\">Profile</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"#\" class=\"centerlinks\">E-Mail</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"#\" class=\"centerlinks\">Discussion</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"albums.jsp\" class=\"centerlinks\">Albums</a></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("              <table width=\"100%\" height=\"595\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                \r\n");
      out.write("                  <td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\r\n");
      out.write("                    ");

                    response.sendRedirect("teacher_profile.jsp");
                    
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    </td>\r\n");
      out.write("\t\t\t  </table>\r\n");
      out.write("        <td width=\"178\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"23\" bgcolor=\"#FFE9BB\">            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t  \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#2B1521\"><a href=\"#\" class=\"sidelinks\">Info About Course </a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#2B1521\"><a href=\"#\" class=\"sidelinks\">Events</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#2B1521\"><a href=\"#\" class=\"sidelinks\">Recent Activity </a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" align=\"center\" bgcolor=\"#B02111\" class=\"botgndu\">Guru Nanak Dev University </td>\r\n");
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
