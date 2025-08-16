import java.io.*;

class BufInput
{
	public static void main(String args[])
	{
		try
		{
			/*FileInputStream fis=new FileInputStream("a1.dat");
	BufferedInputStream bis=new BufferedInputStream(fis);*/

	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("SYB1.dat"));

	int c;
	while((c=bis.read())!=-1)
	{
	System.out.println(c);


	}
		
	bis.close();	
		}
		
	catch(IOException e)
		{	
			System.out.println("error");
		}
	}
}
