import java.io.*;

class demo6
{
	public static void main(String args[])
	{
	try
	{
	File f1=new File("abc.dat");
	int len=(int)(f1.length());
	FileInputStream fis=new FileInputStream(f1);
	FileOutputStream fos=new FileOutputStream("my1.dat");
	byte[] c=new byte[len];
	fis.read(c);
	fos.write(c,2,5);
	}
	catch(Exception e)
	{
	System.out.println("Error");
	}	
	
	
	}
	


}
