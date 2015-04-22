package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import beans.*;

public final class teachernews1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body>\n");


String newsowner=(String)session.getAttribute("ab");
String newstitle=request.getParameter("title");
String newsinfo=request.getParameter("t1");


Date d=new Date();
 String t="";
 int  h=d.getHours();
 int min=d.getMinutes();
 int dt=d.getDate();
 int mon=d.getMonth()+1;
 int y=d.getYear()+1900;
String time1="";
 String dat=(dt +"/" +mon +"/" +y);

  
	  
	  
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
 
 if(min%10==0)
		time1=0+(String.valueOf(time)); 
 else
	 time1=(String.valueOf(time));

bean b1=new bean();
b1.setNewsowner(newsowner);

b1.setNewsinfo(newsinfo);
b1.setNewstitle(newstitle);
b1.setDat(dat);
b1.setTime(time1);
b1.savenews();
response.sendRedirect("teachernews.jsp");


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
