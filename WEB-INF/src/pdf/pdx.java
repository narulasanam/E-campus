package pdf;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfWriter;

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
public class pdx extends HttpServlet {

	public pdx() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException,
		IOException {
		try
		{
			Document document = new Document();
		
			PdfWriter.getInstance( document, new FileOutputStream(getServletContext().getRealPath("/")+"/test111.pdf"));
					document.open();
					document.add(new Paragraph("hello"));
					document.close();
		}
		catch(Exception e)
		{
			throw new ServletException(e);
		}
	}
	}


