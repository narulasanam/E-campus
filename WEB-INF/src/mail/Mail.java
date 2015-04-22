package mail;

import javax.servlet.http.HttpServlet;
import javax.mail.*;

import java.util.*;

import javax.mail.internet.*;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Class
 *
 * @web.servlet              name="email"
 *                           display-name="Name for email"
 *                           description="Description for email"
 * @web.servlet-mapping      url-pattern="/email"
 * @web.servlet-init-param   name="A parameter"
 *                           value="A value"
 */
public class Mail extends HttpServlet {

	public Mail()
   {
		
	}
	PrintWriter p;

	public void init(ServletConfig config) throws ServletException 
	{
		
	}
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException,
		IOException
	{
		try{
			String from,tos,subject,body,cco;
			p=resp.getWriter();
			resp.setContentType("text/html");
			
			from=req.getParameter("from");
			tos=req.getParameter("to");
			cco=req.getParameter("cc");
			subject=req.getParameter("subject");
			body=req.getParameter("body");
			
			p.print(from+","+subject+","+body);		
			String[] to={tos};
            String[] cc={cco};
            String[] bcc={""};
            //This is for google
                    if(Mail.sendMail(from,"your password","smtp.gmail.com","465","true",
"true",true,"javax.net.ssl.SSLSocketFactory","false",to,cc,bcc,
subject,body))
		{
			p.print("message is successfully sent");
		   }
		 else
		  {
			p.print("message not sent");
		   }

		}
		catch(Exception e)
			{
			p.print(e);
			}

	}
	 public synchronized static boolean sendMail(String userName,String passWord,String host,String port,String starttls,String auth,boolean debug,String socketFactoryClass,String fallback,String[] to,String[] cc,String[] bcc,String subject,String text){
         Properties props = new Properties();
         //Properties props=System.getProperties();
 props.put("mail.smtp.user", userName);
 props.put("mail.smtp.host", host);
         if(!"".equals(port))
 props.put("mail.smtp.port", port);
         if(!"".equals(starttls))
 props.put("mail.smtp.starttls.enable",starttls);
 props.put("mail.smtp.auth", auth);
         if(debug){
         props.put("mail.smtp.debug", "true");
         }else{
         props.put("mail.smtp.debug", "false");         
         }
         if(!"".equals(port))
 props.put("mail.smtp.socketFactory.port", port);
         if(!"".equals(socketFactoryClass))
 props.put("mail.smtp.socketFactory.class",socketFactoryClass);
         if(!"".equals(fallback))
 props.put("mail.smtp.socketFactory.fallback", fallback);

 try
 {
                 Session session = Session.getDefaultInstance(props, null);
     session.setDebug(debug);
     MimeMessage msg = new MimeMessage(session);
     msg.setText(text);
     msg.setSubject(subject);
     msg.setFrom(new InternetAddress("narulasanam@gmail.com"));
                 for(int i=0;i<to.length;i++){
     msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));
                 }
                 for(int i=0;i<cc.length;i++){
     msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));
                 }
                 for(int i=0;i<bcc.length;i++){
     msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));
                 }
     msg.saveChanges();
                 Transport transport = session.getTransport("smtp");
                 transport.connect(host, userName, passWord);
                 transport.sendMessage(msg, msg.getAllRecipients());
                 transport.close();
                 return true;
 }
 catch (Exception mex)
 {
     mex.printStackTrace();
                 return false;
 }
 }
	}


