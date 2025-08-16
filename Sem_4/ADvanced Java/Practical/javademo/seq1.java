import java.io.*;

class  seq1
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis1=new FileInputStream("test1.dat");
		FileInputStream fis2=new FileInputStream("test2.dat");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int c;
		while((c=sis.read())!=-1)
		{
		System.out.print((char)c);
		
		}



	}




}
