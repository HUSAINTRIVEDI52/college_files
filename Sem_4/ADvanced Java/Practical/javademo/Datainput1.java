import java.io.*;

class Datainput1
{
	public static void main(String args[])
	{
		File fin = new File("a2.dat");
		int size = (int)fin.length();

		byte b[] = new byte[size];
		byte bt[] = new byte[size];

		try
		{
			DataInputStream dins = new DataInputStream(new FileInputStream(fin));
			dins.readFully(b);

			for(int i = 0; i<size; i++)
				System.out.print((char)b[i]);
			
			dins.close();
			
				System.out.println("-------------------------------------------------");
System.out.println("File length" + size);
			dins = new DataInputStream(new FileInputStream(fin));
			dins.readFully(bt, 3, 20);

			for(int i = 0; i<bt.length; i++)
				System.out.println((char)bt[i]);
			
			dins.close();
			
		}







		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch(IOException e)
		{
			System.out.println("IO Error");
		}
			
	}
}
	
