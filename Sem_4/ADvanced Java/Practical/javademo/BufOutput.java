import java.io.*;

class BufOutput
{
	public static void main(String args[])
	{
		try
		{
BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("SYB1.dat"));

	for(int i=11;i<=20;i++)
	{
	bos.write(i);
	
	}
	
	String str="Hello"; 
	int len=str.length();
	byte[] b=new byte[len];
	b=str.getBytes();
	bos.write(b);
	bos.close();	
		}
		
	catch(IOException e)
		{	
			System.out.println("error");
		}
	}
}
