import java.io.*;

class demo4
{
	public static void main(String args[])
	{
	try
	{
	File f1=new File("a1.dat");
	FileInputStream fis=new FileInputStream(f1);
	int c;
	while((c=fis.read())!=-1)
	System.out.print((char)c);
	}
	catch(Exception e)
	{
	System.out.println("Error");
	}	
	
	
	}
	


}
