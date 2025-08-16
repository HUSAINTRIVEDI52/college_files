import java.io.*;

class demo3
{
	public static void main(String args[])
	{
	try
	{
	File f1=new File("abc.dat");
	FileInputStream fis=new FileInputStream(f1);
	int c;
	c=fis.read();
	System.out.println((char)c);
	}
	catch(Exception e)
	{
	System.out.println("Error");
	}	
	
	
	}
	


}
