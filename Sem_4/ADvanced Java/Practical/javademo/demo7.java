import java.io.*;

class demo7
{
	public static void main(String args[])
	{
	try
	{
	File f1=new File("abc.dat");
	FileInputStream fis=new FileInputStream(f1);
	int a,b,c;
	a=fis.read();
	b=fis.read();
	c=fis.read();
	
	System.out.println((char)a + " " +(char)b + " " + (char)c + " ");
	a=fis.read();
	b=fis.read();
	c=fis.read();
	
	System.out.println((char)a + " " +(char)b + " " + (char)c + " ");
	fis.mark(1);
	int d=fis.read();
	System.out.println((char)d);
	
	if(fis.markSupported())//FileInputStream doesnt support mark and marksupported
	{
	fis.reset();
	a=fis.read();
	}
	System.out.println((char)a);
	}
	catch(Exception e)
	{
	System.out.println("Error");
	}	
	
	
	}
	


}
