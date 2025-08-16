

import java.io.*;

class Randomfileread
{
	public static void main(String args[])
	{
		//File rafile = new File("raf.dat");
		
		int a;
		long c;
		String st;
		long ap,cp,stp;
		
		try
		{
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");

			System.out.println("\nFile size is " + raf.length());

			System.out.println("-------------------------------------------------");
			ap= raf.getFilePointer();
			a = raf.readInt();
			System.out.println("int a = " + a);
	
			cp= raf.getFilePointer();
			c = raf.readLong();
			System.out.println("Long c = " + c);

			stp= raf.getFilePointer();
			st = raf.readUTF();
			System.out.println("String st = " + st);

			System.out.println("-------------------------------------------------");

			raf.seek(cp);
			c = raf.readLong();
			System.out.println("Long c = " + c);
			raf.close();
			
		}
		catch(IOException e)
		{
			System.out.println("\n I/O problem");
		}
	}
}
