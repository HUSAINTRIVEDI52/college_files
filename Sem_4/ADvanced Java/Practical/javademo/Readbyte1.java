import java.io.*;

class Readbyte1
{
	public static void main(String args[])
	{
		try
		{
			int c;
			FileInputStream fis = new FileInputStream("abc.dat");
			FileOutputStream fos=new FileOutputStream("a1.dat");
			while((c=fis.read())!=-1)
			{
			fos.write((char)c-32);
			}
			fis.close();
			fos.close();
	
		}
		catch(IOException e)
		{	
			System.out.println(e);
			System.out.println("error generated ..!");
		}
	}
}
