/* THIS PROGRMME  WRITE A CHARACTER (BETWEEN 65 TO 91) INTO FILE
IT GIVES THE DEMO OF FILEOUTPUTSTREAM CLASS*/
import java.io.*;

class File_read_write2
{
public static void main(String args[])
{
	try
	{
		FileOutputStream fos = new FileOutputStream("xyz.dat");
		//writing a file
		for(int i =60 ;  i < 108 ; i++)
		{
			fos.write(i);
			fos.write('\n');
		}
		int c;
		FileInputStream fis = new FileInputStream("xyz.dat");
			
		while((c = fis.read()) != -1)
		{
			//System.out.print(c);
			System.out.print((char)c);	
		}
	}	
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
