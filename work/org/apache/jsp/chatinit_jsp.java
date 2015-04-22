package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.*;
import java.util.*;

public final class chatinit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\n");
      out.write("<body>\r\n");
      out.write("\r\n");

String user1=(String)session.getAttribute("ab");
String user2=request.getParameter("user2");
int id=0,cid;
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


b1.setUser1(user1);
b1.setUser2(user2);


b1.takechatid();
cid=b1.getChatid();
if(cid!=0)
{
	if(b1.getChatstatus()==3)
	{
		bean b2=new bean();
		b2.setUser1(user1);
		b2.setUser2(user2);

		b2.setTime(time);
		b2.setChatstatus(1);
		b2.startchat();
		b2.takechatid();
		id=b2.getChatid();
	}
	
}
else
{
	bean b2=new bean();
	b2.setUser1(user1);
	b2.setUser2(user2);

	b2.setTime(time);
	b2.setChatstatus(1);
	b2.startchat();
	b2.takechatid();
	id=b2.getChatid();
}


      out.write("\r\n");
      out.write("<form name=\"f1\" action=\"chatinit1.jsp?chatid=\"");
      out.print(id );
      out.write("\" >\r\n");
      out.write("\r\n");
      out.write("<table border=1 width=\"30%\">\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("<textarea rows=\"10\" cols=\"55\"></textarea>\r\n");
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" size=45 name=\"t2\">\r\n");
      out.write("<input type=\"hidden\" value=");
      out.print(id );
      out.write(" name=\"id\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" value=\"send\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\n");
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
