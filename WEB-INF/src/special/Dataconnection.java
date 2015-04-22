package special;
import java.sql.*;

import javax.servlet.ServletException;

public class Dataconnection 
{
	public static Connection conestablished() throws ServletException
	{
		Connection con=null;
		 try
		   {
			 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			 String s="jdbc:oracle:thin:@localhost:1521:";
		     con=DriverManager.getConnection(s,"project","study");
		   }
		  catch(Exception e)
		   {
		    throw new ServletException(e);
		   }
		  return con;
	}
}
