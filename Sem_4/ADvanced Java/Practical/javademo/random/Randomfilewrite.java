/* THIS PROGRAMM WRITE DATA RANDOMLY FROM THE FILE USING RANDOMACCESSFILE CLASS*/

import java.io.*;

class Randomfilewrite	
{
	public static void main(String args[])
	{
		File rafile = new File("raf.dat");
		
		int a = 456;
		long b = 568972569;
		String st = "This text is a demo string";
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile(rafile, "rw");
			raf.writeInt(a);
			
			raf.writeLong(b);
			raf.writeUTF(st);
			raf.close();
			
			
			
			System.out.println("File created");
		}
		catch(IOException e)
		{
			System.out.println("\n I/O problem");
		}
	}
}
