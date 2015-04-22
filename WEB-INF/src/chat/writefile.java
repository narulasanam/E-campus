package chat;
import java.io.*;


public class writefile 

{
	FileWriter f;

public writefile()
	{
	
	}
public writefile(String p,int d)throws IOException
{
	f=new FileWriter(p+"/chat/" +"chat"+d+".txt" ,true);
	
}





public void text1(String p) throws IOException
{
	System.out.print(p);
f.write(p+"\r\n");

f.close();

}	
	

}
