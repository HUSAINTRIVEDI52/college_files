import java.io.*;

class demo8
{
	public static void main(String args[])
	{
	try
	{
	File f1=new File("abc.dat");
	FileInputStream fis=new FileInputStream(f1);
	int a,b,c;
	System.out.println((char)fis.read());
	System.out.println((char)fis.read());
	System.out.println((char)fis.read());
	//fis.skip(2);
	System.out.println((char)fis.read());
	System.out.println((char)fis.read());
	fis.mark(0);

	if(fis.markSupported())
	{
	System.out.println("true");
	fis.reset();
	
	
	}
	}
	catch(Exception e)
	{
	System.out.println("Error");
	}	
	
	
	}
	


}
