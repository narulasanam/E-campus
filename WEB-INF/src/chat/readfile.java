package chat;
import java.io.*;


public class readfile 

{

	FileReader f1;
	public BufferedReader b1;
	String b3="";
	
	
public readfile ()
	{
	
	}

public readfile (String p) throws FileNotFoundException
{
	f1=new FileReader(p+"/"+"abcd.txt");
	b1=new BufferedReader(f1);

}




public String rtext() throws IOException
{
	
	while((b3= b1.readLine())!=null)
	{
		b3+= b1.readLine()+"<br>";
	}	
System.out.println(b3);


f1.close();
return b3;
}	

}
