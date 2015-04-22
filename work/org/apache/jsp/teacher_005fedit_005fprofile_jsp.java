package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.*;

public final class teacher_005fedit_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(".botgndu {color:#000000\r\n");
      out.write("}\r\n");
      out.write(".centerlinks {text-decoration:none;color:#000000}\r\n");
      out.write(".eportal {position:absolute;\r\n");
      out.write("\ttop:30px;\r\n");
      out.write("\tleft:1148px;\r\n");
      out.write("\tcolor: 3E3EFF;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tz-index:19;\r\n");
      out.write("\twidth: 66px;color:#FFFFFF\r\n");
      out.write("}\r\n");
      out.write(".gnduportal {font-family: Verdana, Arial, Helvetica, sans-serif;color:#FFFFFF}\r\n");
      out.write(".logobg {background-color:#090909\r\n");
      out.write("}\r\n");
      out.write(".logout {text-decoration:none;margin-right:20px;color:#FFFFFF}\r\n");
      out.write(".search {color:#FFFFFF}\r\n");
      out.write(".sidelinks {text-decoration:none;color:#FFFFFF}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function isNumeric(elem, helperMsg){\r\n");
      out.write("\tvar numericExpression = /^[0-9]+$/;\r\n");
      out.write("\tif(elem.value.match(numericExpression)){\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert(helperMsg);\r\n");
      out.write("\t\telem.focus();\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function isName(elem, helperMsg){\r\n");
      out.write("\tvar alphaExp = /^[a-zA-Z]+$/;\r\n");
      out.write("\tif(elem.value.match(alphaExp)){\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert(helperMsg);\r\n");
      out.write("\t\telem.focus();\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function isEmail(elem, helperMsg){\r\n");
      out.write("\tvar emailExp = /^[\\w\\-\\.\\+]+\\@[a-zA-Z0-9\\.\\-]+\\.[a-zA-z0-9]{2,4}$/;\r\n");
      out.write("\tif(elem.value.match(emailExp)){\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert(helperMsg);\r\n");
      out.write("\t\telem.focus();\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function f()\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("if(document.t1.name.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter Name\");\r\n");
      out.write("}\r\n");
      out.write("else if(document.t1.email.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter Email\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else if(document.t1.gender.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter gender\");\r\n");
      out.write("}\r\n");
      out.write("else if(document.t1.graduation.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Graduation\");\r\n");
      out.write("}\r\n");
      out.write("else if(document.t1.postgraduation.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter postgraduation\");\r\n");
      out.write("}\r\n");
      out.write("else if(document.t1.office.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("alert(\"Enter Office\");\r\n");
      out.write("}\r\n");
      out.write("else if(document.t1.address.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter address\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else if(document.t1.phone.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter Phone no.\");\r\n");
      out.write("}\r\n");
      out.write("else if(document.t1.hobbies.value==\"\")\r\n");
      out.write("{\r\n");
      out.write("alert(\"Enter Hobbies\");\r\n");
      out.write("}\r\n");
      out.write("else if(isName(document.t1.name,\"Please Enter Valid FirstName\"))\r\n");
      out.write("{\r\n");
      out.write("}\r\n");
      out.write("else if(isEmail(document.t1.email,\"Please Enter Valid Email Address\"))\r\n");
      out.write("{\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else if(isNumeric(document.t1.phone,\"Please Enter Valid phone no\"))\r\n");
      out.write("{\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("else \r\n");
      out.write("{\r\n");
      out.write("document.t1.submit();\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <table width=\"100%\" height=\"866\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      ");
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
      out.write("    </tr>\r\n");
      out.write("    <tr bgcolor=\"#2B1521\">\r\n");
      out.write("      <td height=\"491\" valign=\"top\">\r\n");
      out.write("     \r\n");
      out.write("      <table width=\"100%\" height=\"615\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr bgcolor=\"#FFB0FF\">\r\n");
      out.write("         ");

String password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
String registration_no="",ccode="",school="",yearofjoining="",n3="",n4="",n5="",n6="",n7="",teacher_no="",graduation="",postgraduation="",dateofjoining="",office="";


bean b1=new bean();
b1.setUsername(username);
b1.demodteach();

password=b1.getPassword();
dcode=b1.getDcode();
name=b1.getName();
email=b1.getEmail();
gender=b1.getGender();
address=b1.getAddress();
phone=b1.getPhone();
dateofbirth=b1.getDateofbirth();
hobbies=b1.getHobbies();
status=b1.getStatus();
teacher_no=b1.getTeacher_no();

graduation=b1.getGraduation();
postgraduation=b1.getPostgraduation();
office=b1.getOffice();
dateofjoining=b1.getDateofjoining();

if(!(gender==null))
{
if(gender.equalsIgnoreCase("Male"))
n5="checked";
else
n6="checked";
}

      out.write("\r\n");
      out.write("          <td width=\"178\" height=\"613\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" height=\"151\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              ");
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
      out.write("              </tr>\r\n");
      out.write("          </table></td>\r\n");
      out.write("          <td align=\"right\" valign=\"top\" width=\"846\" height=\"613\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              ");
      out.write("<td height=\"22\" align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"teachernews.jsp\" class=\"centerlinks\">News</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"teacher_profile.jsp\" class=\"centerlinks\">Profile</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"teachervideo.jsp\" class=\"centerlinks\">Add Video</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"showgroups.jsp\" class=\"centerlinks\">Groups</a></td>\r\n");
      out.write("            <td align=\"center\" bgcolor=\"#FFFFFF\"><a href=\"teacheralbums.jsp\" class=\"centerlinks\">Albums</a></td>\r\n");
      out.write("           ");
      out.write("\r\n");
      out.write("              </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("                <table width=\"100%\" height=\"595\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td  bgcolor=\"#FFE9BB\">\r\n");
      out.write("                     <form name=\"t1\" action=\"teacher_edit_profile1.jsp\" >\r\n");
      out.write("                    <table width=\"50%\" height=\"335\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td width=\"49%\" align=\"center\">Name</td>\r\n");
      out.write("                          <td width=\"51%\" align=\"center\"><input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td align=\"center\">Email</td>\r\n");
      out.write("                          <td align=\"center\"><input type=\"text\" name=\"email\" value=\"");
      out.print(email);
      out.write("\">                          </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td align=\"center\">Gender</td>\r\n");
      out.write("                          <td align=\"center\"><input type=\"radio\" name=\"gender\" value=\"Male\" ");
      out.print(n5 );
      out.write(">\r\n");
      out.write("                            Male\r\n");
      out.write("                            <input type=\"radio\" name=\"gender\" value=\"Female\" ");
      out.print(n6 );
      out.write(" >\r\n");
      out.write("                            Female </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td align=\"center\">Graduation</td>\r\n");
      out.write("                          <td align=\"center\"><input type=\"text\" name=\"graduation\" value=\"");
      out.print(graduation);
      out.write("\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td align=\"center\">Postgraduation</td>\r\n");
      out.write("                          <td align=\"center\"><input type=\"text\" name=\"postgraduation\" value=\"");
      out.print(postgraduation);
      out.write("\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td align=\"center\">Office</td>\r\n");
      out.write("                          <td align=\"center\"><input type=\"text\" name=\"office\" value=\"");
      out.print(office);
      out.write("\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td align=\"center\">Address</td>\r\n");
      out.write("                          <td align=\"center\"><textarea name=\"address\">");
      out.print(address);
      out.write("</textarea>                          </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td align=\"center\">Phone</td>\r\n");
      out.write("                          <td align=\"center\"><input type=\"text\" name=\"phone\" value=\"");
      out.print(phone);
      out.write("\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td align=\"center\">Hobbies</td>\r\n");
      out.write("                          <td align=\"center\"><textarea name=\"hobbies\" >");
      out.print(hobbies);
      out.write("</textarea>                          </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                      </table>\r\n");
      out.write("                        <table width=\"200\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td align=\"center\"><input  type=\"button\" value=\"Save\" onclick=\"f()\"></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                      </table>\r\n");
      out.write("                      </form>\r\n");
      out.write("                      </td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("              \r\n");
      out.write("              </td>\r\n");
      out.write("          <td width=\"178\" valign=\"top\" bgcolor=\"#FFE9BB\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"23\" bgcolor=\"#FFE9BB\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              ");
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
      out.write("              </tr>\r\n");
      out.write("          </table></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"30\" align=\"center\" bgcolor=\"#B02111\" class=\"botgndu\">Guru Nanak Dev University </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("\r\n");
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
