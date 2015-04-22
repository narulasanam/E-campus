package special;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.text.*;
public class dateconvert {
public static String convertd(String tx1)
{
	int y1,y2,y3;
	String yr1,mn1,dy1;
	
	yr1=tx1.substring(0,4);
	mn1=tx1.substring(5,7);
	dy1=tx1.substring(8,10);
	 y1=Integer.parseInt(yr1);
	y2=Integer.parseInt(mn1)-1;
	y3=Integer.parseInt(dy1);
	
	Date dx1 = new GregorianCalendar(y1, y2, y3, 00, 00).getTime();

	SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MMM-yyyy");
	        return formatter1.format(dx1);

	
}
}
