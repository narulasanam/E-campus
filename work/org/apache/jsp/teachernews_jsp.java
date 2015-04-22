package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import beans.*;
import java.sql.Connection;
import special.*;

public final class teachernews_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/teacherhead.jsp");
    _jspx_dependants.add("/teacherleftside.jsp");
    _jspx_dependants.add("/teachermiddlemenu.jsp");
    _jspx_dependants.add("/teacherrightside.jsp");
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
      out.write(".elink{color:#FF0000;font-size:15px;margin-right:80px;text-decoration:none}\r\n");
      out.write("a.elink:hover{color:#33FF00;font-size:17px;text-decoration:none}\r\n");
      out.write(".centerlinks{text-decoration:none;color:#000000}\r\n");
      out.write(".logout{text-decoration:none;margin-right:20px;color:#FFFFFF}\r\n");
      out.write(".sidelinks{text-decoration:none;color:#FFFFFF}\r\n");
      out.write(".search{color:#FFFFFF}\r\n");
      out.write(".gnduportal{font-family: Verdana, Arial, Helvetica, sans-serif;color:#FFFFFF}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function f()\r\n");
      out.write("{\r\n");
      out.write("if(document.f1.title.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter Title\");\r\n");
      out.write("}\r\n");
      out.write("else if(document.f1.t1.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter Information\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else\r\n");
      out.write("{\r\n");
      out.write("document.f1.submit();\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" height=\"866\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    ");
      out.write("<td height=\"110\"><table width=\"100%\" height=\"179\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
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
      out.write("            <td width=\"282\"><table width=\"286\" height=\"30\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("               <form name=\"fteacher\" action=\"search.jsp\">\r\n");
      out.write("                <td width=\"253\"><input type=\"text\" name=\"search\" size=\"42\" /></td>\r\n");
      out.write("               <td width=\"29\"><input type=\"submit\" value=\"search\" /></td>\r\n");
      out.write("              </form>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("       <td width=\"177\" align=\"right\" bgcolor=\"#B02111\"><a href=\"logout.jsp\" class=\"logout\">LogOut</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

		String username=(String)session.getAttribute("ab");
		String image=(String)session.getAttribute("im");
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#2B1521\">\r\n");
      out.write("    <td height=\"491\" valign=\"top\"><table width=\"100%\" height=\"615\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr bgcolor=\"#FFB0FF\">\r\n");
      out.write("        <td width=\"178\" height=\"613\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" height=\"227\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("<td width=\"174\" height=\"23\" valign=\"top\" bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t  <td width=\"174\" height=\"96\" valign=\"top\" bgcolor=\"#2B1521\">\r\n");
      out.write("\t\t<table width=\"100%\" height=\"113\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("          ");

          if(username==null)
          	response.sendRedirect("userlogin.jsp");
         
          
          
      out.write("\r\n");
      out.write("            <td width=\"88\" height=\"113\"><a href=\"teacher_home.jsp\"><img src=\"images/");
      out.print(image);
      out.write("\" width=\"88\" height=\"96\" /></a></td>\r\n");
      out.write("          \t<td width=\"89\" align=\"center\"><span class=\"sidelinks\">");
      out.print(username);
      out.write("</span></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t </table>         </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"teachershow_students.jsp\" target=\"_self\" class=\"sidelinks\">Students</a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"teachershow_teachers.jsp\" class=\"sidelinks\"> Teachers</a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t   <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"teachermessages.jsp\" class=\"sidelinks\"> Messages</a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"create_group.jsp\" class=\"sidelinks\">Create Group </a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"teachercreate_album.jsp\" class=\"sidelinks\">Create Album </a></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#2B1521\" class=\"sidelinks\"><a href=\"online.jsp\">Online persons</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("          \r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"846\" height=\"613\" align=\"right\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            ");
      out.write("<td height=\"22\" align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"teachernews.jsp\" class=\"centerlinks\">News</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"teacher_profile.jsp\" class=\"centerlinks\">Profile</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"teachervideo.jsp\" class=\"centerlinks\">Add Video</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"showgroups.jsp\" class=\"centerlinks\">Groups</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"teacheralbums.jsp\" class=\"centerlinks\">Albums</a></td>\r\n");
      out.write("           ");
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("              <div style=\"overflow: scroll; width:800px;height:500px;display:block;\">\r\n");
      out.write("              <table width=\"100%\" height=\"591\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                  <td bgcolor=\"#FFE9BB\" valign=\"top\" align=\"center\">\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <table width=\"560\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FFFFFF\">\r\n");
      out.write("                    <form name=\"f1\" action=\"teachernews1.jsp\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td align=\"center\">Title : </td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"title\" size=\"50\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td width=\"130\" align=\"center\"> Start Writing.......... </td>\r\n");
      out.write("                      <td width=\"424\"><textarea cols=\"50\" name=\"t1\"></textarea></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <td>&nbsp;</td>\r\n");
      out.write("                      <td align=\"right\"><input type=\"button\" value=\"Publish\" onclick=\"f()\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                 </form>\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t  <br><br>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t ");
 	
				
				bean b3=new bean();
				String cimage="";
				 ArrayList a=b3.shownews();
				
				Iterator t=a.iterator();
				  	Connection con=Dataconnection.conestablished();			  
				while(t.hasNext())
				{
					 bean b2=(bean)t.next();
					String newsowner=b2.getNewsowner();
					bean b4=new bean();
					
					b4.setImgusername(newsowner);
					if(newsowner.equals("admin"))
						 cimage=b4.adminimage();
						else
						cimage=b4.cimage1(con);
						
				
      out.write(" \r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<table width='600' height='75' border='1' cellpadding='0' cellspacing='0'>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("<td width=\"80\" height=\"40\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("<td><img src=\"images/");
      out.print(cimage);
      out.write("\" width=\"60\" height=45\" /></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\">");
      out.print(newsowner );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<td width=\"479\">\r\n");
      out.write("\t<table width=\"514\" height=\"15\" border='0' cellpadding='0' cellspacing='0'>\r\n");
      out.write("\t<tr><td>Title : <b> ");
      out.print(b2.getNewstitle() );
      out.write("</td></tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<td width=\"85%\" align=\"center\">");
      out.print(b2.getNewsinfo() );
      out.write("</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<table border=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td>");
      out.print(b2.getTime() );
      out.write("</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write(" <td>");
      out.print(b2.getDat() );
      out.write("</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" </table>\r\n");
      out.write("\r\n");
      out.write("\t\t </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("         </table>\t\t  \r\n");
      out.write("\t\t");
}con.close();
				
      out.write("\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("         \r\n");
      out.write("         </td></tr>\r\n");
      out.write("         </table>\r\n");
      out.write("         </div>\r\n");
      out.write("        <td width=\"178\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"23\" bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("            <td align=\"center\" bgcolor=\"#2B1521\"><a href=\"references.jsp\" class=\"sidelinks\">Add Reference Material</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">\r\n");
      out.write("          \r\n");
      out.write("            <iframe src=\"statusshow.jsp\" width=\"100%\" scrolling=\"auto\" frameborder='0'></iframe>\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">&nbsp;</td>\r\n");
      out.write("          ");
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("          \r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" align=\"center\" bgcolor=\"#B02111\" class=\"botgndu\">Guru Nanak Dev University </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
