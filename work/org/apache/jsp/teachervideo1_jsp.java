package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.*;
import java.io.*;
import java.util.*;
import org.apache.commons.fileupload.*;
//import javax.servlet.http.Http.*;

public final class teachervideo1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");


response.setContentType("text/html");


String videoowner=(String)session.getAttribute("ab");


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






//Parse the request

 DiskFileUpload upload = new DiskFileUpload();

//Parse the request

List items = upload.parseRequest(request);
Iterator iter = items.iterator();
String dte="";
String ps="";
int j=0;
while (iter.hasNext()) 
{
	FileItem item = (FileItem)iter.next();
		
		 if(item.isFormField())
		  {
			   dte=item.getString();
			   
		  }
		  
		  else
		  {
				if(item.getName().length()!=0)
				{
					File m=new File(item.getName());
					String he=getServletContext().getRealPath("/videos");
					ps=m.getName();
					File ye=new File(he,ps);
					item.write(ye);	
				}
		  }
	
}


String title=dte;
String video=ps;









bean b1=new bean();
b1.setVideoowner(videoowner);


b1.setVideo(video);
b1.setTitle(title);
b1.setDat(dat);
b1.setTime(time1);
b1.savevideos();

response.sendRedirect("teachervideo.jsp");

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
