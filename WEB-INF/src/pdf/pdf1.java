package pdf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfWriter;
import beans.*;
import special.*;
/**
 * Servlet Class
 *
 * @web.servlet              name="pdx"
 *                           display-name="Name for pdx"
 *                           description="Description for pdx"
 * @web.servlet-mapping      url-pattern="/pdx"
 * @web.servlet-init-param   name="A parameter"
 *                           value="A value"
 */
public class pdf1 extends HttpServlet 
{
	PrintWriter p;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException 
	{
		
		p=resp.getWriter();
		HttpSession hs = req.getSession(true);
		String other =(String)hs.getAttribute("other");
		
		String password="",dcode="",name="",type="",email="",gender="",address="",phone="",dateofbirth="",hobbies="",status="";
        String registration_no="",ccode="",school="",dateofbirth1="",yearofjoining="",n3="",n4="",n5="",n6="",n7="";

        
		bean b1=new bean();
		b1.setUsername(other);
		b1.profile_others2();
        
        dcode=b1.getDcode();
        name=b1.getName();
        email=b1.getEmail();
        gender=b1.getGender();
        address=b1.getAddress();
       phone=b1.getPhone();
        
       dateofbirth1=b1.getDateofbirth();

       dateconvert d1=new dateconvert();
       dateofbirth=d1.convertd(dateofbirth1);
      
        hobbies=b1.getHobbies();
        status=b1.getStatus();
        registration_no=b1.getRegistration_no();
        ccode=b1.getCcode();
        school=b1.getSchool();
        yearofjoining=b1.getYearofjoining();

        if(!(gender==null))
        {
        if(gender.equalsIgnoreCase("Male"))
        n5="checked";
        else
        n6="checked";
        }

        
		
		
		try
		{
			Document document = new Document();
		
PdfWriter.getInstance( document, new FileOutputStream(getServletContext().getRealPath("/pdf") + "/getEmail_id().pdf")); 
		
					document.open();
					
					
					
					document.add(new Paragraph("Personal Information"));
					document.add(new Paragraph("name :" +name));
			        document.add(new Paragraph("Email Address :" +email));
			        document.add(new Paragraph("gender :"+ gender));
			        document.add(new Paragraph("School :" + school));
			        document.add(new Paragraph("Date Of Birth :" + dateofbirth));
			        document.add(new Paragraph("Registration number :" + registration_no));
			        document.add(new Paragraph("Department code :" + dcode));
			        document.add(new Paragraph("Course code :" + ccode));
			        document.add(new Paragraph("Address :" + address));
					
			        document.add(new Paragraph("Mobile number :" + phone));
					document.add(new Paragraph("Hobbies :" + hobbies));
					document.add(new Paragraph("Year Of Joining :" +yearofjoining));
					
					
					document.close();
		}
		catch(Exception e)
		{
			throw new ServletException(e);
		}
	}
	}


