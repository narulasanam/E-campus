package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.*;
import java.util.*;
import java.sql.Connection;
import special.*;
import beans.*;
import java.util.*;

public final class studentreplies_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/leftside.jsp");
    _jspx_dependants.add("/middlemenu.jsp");
    _jspx_dependants.add("/rightside.jsp");
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
      out.write("a.elink:hover{color:#33FF00;font-size:15px;text-decoration:none}\r\n");
      out.write(".centerlinks{text-decoration:none;color:#000000}\r\n");
      out.write(".logout{text-decoration:none;margin-right:20px;color:#FFFFFF}\r\n");
      out.write(".sidelinks{text-decoration:none;color:#FFFFFF}\r\n");
      out.write(".search{color:#FFFFFF}\r\n");
      out.write(".gnduportal{font-family: Verdana, Arial, Helvetica, sans-serif;color:#FFFFFF}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
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
      out.write("            <td width=\"59\" class=\"search\" >&nbsp;Search</td>\r\n");
      out.write("            <td width=\"282\"><table width=\"286\" height=\"30\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("\t\t\t  <form name=\"fstu\" action=\"search.jsp\">\r\n");
      out.write("                <td width=\"253\"><input type=\"text\" name=\"search\" size=\"42\" /></td>\r\n");
      out.write("               <td width=\"29\"><input type=\"submit\" value=\"search\" /></td>\r\n");
      out.write("              </form>\r\n");
      out.write("\t\t\t  </tr>\r\n");
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
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("            <td width=\"88\" height=\"113\"><a href=\"student_home.jsp\"><img src=\"images/");
      out.print(image);
      out.write("\" width=\"88\" height=\"96\" /></a></td>\r\n");
      out.write("          \t<td width=\"89\" align=\"center\"><span class=\"sidelinks\">");
      out.print(username);
      out.write("</span></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t </table>         </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"show_students.jsp\" target=\"_self\" class=\"sidelinks\">Students</a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"show_teachers.jsp\" class=\"sidelinks\"> Teachers</a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"messages.jsp\" class=\"sidelinks\"> Messages</a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"studentshowgroups.jsp\" class=\"sidelinks\">Groups </a></td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("            <td height=\"27\" align=\"center\" bgcolor=\"#2B1521\"><a href=\"create_album.jsp\" class=\"sidelinks\">Create Album </a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\t\t\t<tr><td>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#2B1521\" class=\"sidelinks\"><a href=\"studentonline.jsp\">Online persons</a></td>\r\n");
      out.write("\t\t\t</tr>");
      out.write("\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("          \r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"846\" height=\"613\" align=\"right\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            ");
      out.write("<td height=\"22\" align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"studentnews.jsp\" class=\"centerlinks\">News</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"student_profile.jsp\" class=\"centerlinks\">Profile</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"studentvideo.jsp\" class=\"centerlinks\">Videos</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"studentreferences.jsp\" class=\"centerlinks\">References</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"albums.jsp\" class=\"centerlinks\">Albums</a></td>");
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <div style=\"overflow:scroll;width:800px;height:600px;display:block;\">\r\n");
      out.write("              <table width=\"100%\" height=\"591\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td bgcolor=\"#FFE9BB\" align=\"center\" valign=\"top\">\r\n");
      out.write("             \r\n");
      out.write("\t\t\t\t  <table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          ");

		 String groupname=(String)session.getAttribute("groupname");
		  String topicname=(String)session.getAttribute("topicname");
		  String sgroupid=(String)session.getAttribute("groupid");
		  String stopicid=(String)session.getAttribute("topicid");
		  
		  
      out.write("\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("           <td width=\"50%\" align=\"center\">Group Name : <a href=\"studentgrouptopics.jsp?groupid=");
      out.print(sgroupid );
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(groupname);
      out.write("</a></td>\r\n");
      out.write("            <td width=\"50%\" align=\"center\">Topic : <a href=\"studenttopiccontent.jsp?topicid=");
      out.print(stopicid );
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(topicname );
      out.write("</td>\r\n");
      out.write("           </tr>\r\n");
      out.write("        </table> \r\n");
      out.write("       \r\n");
      out.write("                \r\n");
      out.write("                  ");

				  
				 int tmsgid=Integer.parseInt(request.getParameter("tmsgid"));
                  int topicid=Integer.parseInt(request.getParameter("topicid"));
                  bean b1=new bean();
				b1.setTmsgid(tmsgid);
				b1.showreplies();		 
				String comm1=b1.getCommentor();
				bean b5=new bean();
						b5.setImgusername(comm1);
						String c1image=b5.cimage();
				
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<br><br><br>\r\n");
      out.write("\t\t\t\t<br>\t\r\n");
      out.write("\t\t\t<table width='600' height='143' border='1' cellpadding='0' cellspacing='0'>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("<td width=\"129\" height=\"113\" align=\"center\"><img src=\"images/");
      out.print(c1image);
      out.write("\" width=\"129\" height=\"113\" /></td>\r\n");
      out.write("<td width=\"479\"><table width=\"100%\" height=\"145\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\" width=\"80%\">Commented By : ");
      out.print(b1.getCommentor() );
      out.write("</td>\r\n");
      out.write("  <td align=\"right\">");
      out.print(b1.getTime() );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\">");
      out.print(b1.getTcomment() );
      out.write("</td>\r\n");
      out.write("   <td align=\"center\">&nbsp; </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    \r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td height=\"57\" align=\"right\">");
      out.print(b1.getDat() );
      out.write("</td>\r\n");
      out.write("    \r\n");
      out.write("  </tr>\r\n");
      out.write("</table></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\t\t\t\r\n");
      out.write("\t\t\t");
 	
				
				bean b3=new bean();
				b3.setReplyid(tmsgid);	
				ArrayList a=b3.showreplies1();
				
				Iterator t=a.iterator();
				Connection con=Dataconnection.conestablished();	  				  
				while(t.hasNext())
				{
					 bean b2=(bean)t.next();
					String comm=b2.getCommentor();
					int rectmsgid=b2.getTmsgid();	
						bean b4=new bean();
						b4.setImgusername(comm);
						String cimage=b4.cimage1(con);
						b4.setReplyid(rectmsgid);
						int num=b4.numofreplies1(con);
				
      out.write(" \r\n");
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
      out.print(comm );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("\t<td width=\"479\"><table width=\"514\" height=\"15\" border='0' cellpadding='0' cellspacing='0'>\r\n");
      out.write("\t<tr><td width=\"85%\" align=\"center\">");
      out.print(b2.getTcomment() );
      out.write("</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<table>\r\n");
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
      out.write(" <tr><td><a href=\"studentrecreply.jsp?tmsgid=");
      out.print(b2.getTmsgid() );
      out.write("&topicid=");
      out.print(topicid );
      out.write("\">reply(");
      out.print(num );
      out.write(")</a></td></tr>\r\n");
      out.write(" \r\n");
      out.write(" </table>\r\n");
      out.write(" </td>\r\n");
      out.write(" \r\n");
      out.write(" </tr>\r\n");
      out.write(" </table>\r\n");
      out.write(" \r\n");
      out.write(" </table>\r\n");
      out.write("\r\n");
      out.write(" \t\t");

 		}con.close();
      out.write("\r\n");
      out.write(" \t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<table width='600' height='60' border='1' cellpadding='0' cellspacing='0'>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<form name=\"t1\" action=\"replies1.jsp\">\r\n");
      out.write("\t\r\n");
      out.write("\t<td width=\"80\" height=\"40\" align=\"center\"><img src=\"images/");
      out.print(image);
      out.write("\" width=\"60\" height=40\" /></td>\r\n");
      out.write("\t<td width=\"479\"><table width=\"514\" height=\"15\" border='0' cellpadding='0' cellspacing='0'>\r\n");
      out.write("\t<tr><td width=\"85%\"><textarea name=\"comment\" cols=\"50\"></textarea></td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\t<input type=\"hidden\" name=\"tmsgid\" value=");
      out.print(tmsgid );
      out.write(">\r\n");
      out.write("\t<input type=\"hidden\" name=\"topicid\" value=");
      out.print(topicid );
      out.write(">\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"submit\" value=\"Comment\">\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</td>\r\n");
      out.write("\t </tr>\r\n");
      out.write("\t </table>\t\t\r\n");
      out.write(" \t\t\r\n");
      out.write("                \r\n");
      out.write("                   \r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            </div>\r\n");
      out.write("        <td width=\"178\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"23\" bgcolor=\"#FFE9BB\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#2B1521\"><a href=\"#\" class=\"sidelinks\">Events</a></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("         \r\n");
      out.write("          <tr>\r\n");
      out.write("            <td bgcolor=\"#2B1521\">\r\n");
      out.write("<iframe src=\"statusshow.jsp\" width=\"100%\" scrolling=\"auto\" frameborder='0'></iframe>\r\n");
      out.write("</td>\r\n");
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