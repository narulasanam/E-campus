package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import beans.*;

public final class adminaddcomment1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/admin/adminheader.jsp");
    _jspx_dependants.add("/admin/adminleftside.jsp");
    _jspx_dependants.add("/admin/adminmiddlemenu.jsp");
    _jspx_dependants.add("/admin/adminrightside.jsp");
  }

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
      out.write(".style1 {font-family: Verdana, Arial, Helvetica, sans-serif}\r\n");
      out.write("\r\n");
      out.write(".admintext\r\n");
      out.write("{\r\n");
      out.write("font-size:44px;\r\n");
      out.write("color:#3E3EFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gnduasr\r\n");
      out.write("{\r\n");
      out.write("font-size:24px;\r\n");
      out.write("color:#3E3EFF;\r\n");
      out.write("}\r\n");
      out.write(".logobg\r\n");
      out.write("{\r\n");
      out.write("background-color:#090909\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a.links{text-decoration: none;font-size: 17px}\r\n");
      out.write("a.links:hover{text-decoration: none;color:blue;font-size: 19px;color:olive;}\r\n");
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
      out.write("\r\n");
      out.write(".botgndu{\r\n");
      out.write("color:#3E3EFF\r\n");
      out.write("}\r\n");
      out.write(".drop1\r\n");
      out.write("{display:none}\r\n");
      out.write(".drop2\r\n");
      out.write("{display:inline}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function collapse(m)\r\n");
      out.write("{\r\n");
      out.write("if(m!=\"a1\")\r\n");
      out.write("document.getElementById(\"a1\").className=\"drop1\";\r\n");
      out.write("if(m!=\"a2\")\r\n");
      out.write("document.getElementById(\"a2\").className=\"drop1\";\r\n");
      out.write("if(m!=\"a3\")\r\n");
      out.write("document.getElementById(\"a3\").className=\"drop1\";\r\n");
      out.write("}\r\n");
      out.write("function f(n)\r\n");
      out.write("{\r\n");
      out.write("collapse(n);\r\n");
      out.write("var p= document.getElementById(n);\r\n");
      out.write("if(p.className==\"drop1\")\r\n");
      out.write("p.className=\"drop2\";\r\n");
      out.write("else\r\n");
      out.write("p.className=\"drop1\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" height=\"866\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    ");
      out.write("<td height=\"110\"><table width=\"100%\" height=\"179\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
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
      out.write("        <td width=\"181\" height=\"34\" bgcolor=\"#E4CAFF\"><span class=\"style1\">GNDU PORTAL </span></td>\r\n");
      out.write("        <td width=\"817\" bgcolor=\"#E4CAFF\"><table width=\"345\" height=\"30\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("           \r\n");
      out.write("         <td width=\"59\" class=\"search\">&nbsp;Search</td>\r\n");
      out.write("          \r\n");
      out.write("            <td width=\"282\"><table width=\"286\" height=\"30\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("\t\t\t  <form name=\"f1\" action=\"adminsearch.jsp\">\r\n");
      out.write("                <td width=\"253\"><input type=\"text\" name=\"search\" size=\"42\" /></td>\r\n");
      out.write("               <td width=\"29\"><input type=\"submit\" value=\"search\" /></td>\r\n");
      out.write("              </form>\r\n");
      out.write("\t\t\t </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"212\" align=\"right\" bgcolor=\"#E4CAFF\"><a href=\"adminlogout.jsp\" class=\"logout\">LogOut</a></td>\r\n");
      out.write("        ");

		String username=(String)session.getAttribute("ab");
		String image=(String)session.getAttribute("im");
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#2B1521\">\r\n");
      out.write("    <td height=\"617\" valign=\"top\"><table width=\"100%\" height=\"615\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("     \r\n");
      out.write("      <tr bgcolor=\"#FFB0FF\">\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("        <td width=\"178\" height=\"613\" valign=\"top\" bgcolor=\"#E4CAFF\">\r\n");
      out.write("\t\t<table width=\"100%\" height=\"151\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td width=\"174\" height=\"23\" valign=\"top\" bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td height=\"27\" align=\"center\" bgcolor=\"#E4CAFF\"><a href=\"javascript:f('a1')\">Manage Students</a>\r\n");
      out.write("\t\t  <br>\r\n");
      out.write("\t\t    <table width=\"200\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"drop1\" id=\"a1\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"addstudent.jsp\" target=\"_self\">Add Student</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"modifystudent1.jsp\" target=\"_self\">Modify Student</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"deletestudent1.jsp\" target=\"_self\">Delete Student</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td height=\"27\" align=\"center\" bgcolor=\"#E4CAFF\"><a href=\"javascript:f('a2')\">Manage Teachers</a>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t    <table width=\"200\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"drop1\" id=\"a2\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"addteacher.jsp\" target=\"_self\">Add Teacher</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"modifyteacher1.jsp\" target=\"_self\">Modify Teacher</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"deleteteacher1.jsp\" target=\"_self\">Delete Teacher</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td height=\"27\" align=\"center\" bgcolor=\"#E4CAFF\"><a href=\"javascript:f('a3')\">Manage Groups</a>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t    <table width=\"200\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"drop1\" id=\"a3\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"creategroup.jsp\" target=\"_self\">Create Group</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"deletegroup.jsp\" target=\"_self\">Delete Group</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td align=\"center\"><a class=\"links\" href=\"adminshowgroups.jsp\" target=\"_self\">Show Groups</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  ");
      out.write("\r\n");
      out.write("      </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t </table>\t\t  </td>\r\n");
      out.write("\t\t  \r\n");
      out.write("        <td width=\"846\" height=\"613\" align=\"right\" valign=\"top\" bgcolor=\"#FFFFF\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            ");
      out.write("<td height=\"22\" align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"adminnews.jsp\" class=\"centerlinks\">News</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"allprofiles.jsp\" class=\"centerlinks\">Profiles</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"#\" class=\"centerlinks\">E-Mail</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"#\" class=\"centerlinks\">Discussion</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"adminalbums.jsp\" class=\"centerlinks\">Albums</a></td>");
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("              <table width=\"100%\" height=\"591\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td bgcolor=\"#FFFFF\" valign=\"top\" align=\"center\">\r\n");
      out.write("                  <form name=\"f1\" action=\"adminaddcomment1.jsp\">\r\n");
      out.write("                  ");

				  
				int topicid=Integer.parseInt(request.getParameter("topicid"));
                String comment=request.getParameter("comment");
				
				 Date d=new Date();
				  String t="";
				  int  h=d.getHours();
				  int min=d.getMinutes();
				  int dt=d.getDate();
				  int mon=d.getMonth()+1;
				  int y=d.getYear()+1900;
				  String dat=(dt +"/" +mon +"/" +y);
				
				  //if(min/10==0)
					  
					  
					  
				  if(h/12==0)
				  {
					 t="a.m" ;
				  }
				  else
				  {
					h-=12;
				   t="p.m";
				  }
				  
				  String time=(h+":"+min+t);
				  bean b1=new bean();
					b1.setCommentor(username);
				  	b1.setTopicid(topicid);
					b1.setTime(time);
					b1.setDat(dat);
					b1.setTcomment(comment);
					b1.setReplyid(0);
					b1.addcomment();
				 response.sendRedirect("admintopiccontent.jsp?topicid="+topicid);
				 
      out.write("\r\n");
      out.write("                  <table width=\"654\" height=\"135\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td height=\"133\" align=\"center\"><table width=\"324\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td width=\"376\" bordercolor=\"#333333\" align=\"center\"><b>What does your mind say </b></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                      </table>\r\n");
      out.write("                        <table width=\"626\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#333333\" bgcolor=\"#0099FF\">\r\n");
      out.write("                          \r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td width=\"253\" align=\"center\"><b>Comment Here</b> </td>\r\n");
      out.write("                            <td width=\"367\"><textarea name=\"comment\" cols=\"45\"></textarea></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                            <input type=\"hidden\" name=\"topicid\" value=");
      out.print(topicid );
      out.write(">\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td align=\"right\" background=\"#333333\"><input name=\"submit\" type=\"submit\" value=\"Publish\"></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                      </table></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  </table>\r\n");
      out.write("             </form>\t\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("          </table></td>\r\n");
      out.write("        <td width=\"175\" valign=\"top\" bgcolor=\"#E4CAFF\"><table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            ");
      out.write("<td bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#E4CAFF\"><a href=\"#\">Info About Course </a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#E4CAFF\"><a href=\"#\">Events</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#E4CAFF\"><a href=\"#\">Recent Activity </a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#E4CAFF\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#E4CAFF\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#E4CAFF\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#E4CAFF\">&nbsp;</td>");
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" align=\"center\" bgcolor=\"#E4CAFF\" class=\"botgndu\">Guru Nank Dev University </td>\r\n");
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
