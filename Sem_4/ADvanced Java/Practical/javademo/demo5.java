import java.io.*;

class demo5
{
	public static void main(String args[])
	{
	try
	{
	File f1=new File("abc.dat");
	FileInputStream fis=new FileInputStream(f1);
	FileOutputStream fos=new FileOutputStream("my1.dat");
	int c;
	while((c=fis.read())!=-1)
	{
	fos.write(c);
	System.out.print((char)c);
	}
	}
	catch(Exception e)
	{
	System.out.println("Error");
	}	
	
	
	}
	


}
