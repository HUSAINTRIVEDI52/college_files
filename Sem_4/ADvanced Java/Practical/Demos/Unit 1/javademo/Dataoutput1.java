

import java.io.*;

class Dataoutput1
{
	public static void main(String args[])
	{
		File fin = new File("Data1.dat");
		try
		{
			DataOutputStream dons = new DataOutputStream(new FileOutputStream(fin));
			dons.writeInt(3200);
			dons.writeLong((long)1232132);
			dons.writeFloat(25.3F);
			dons.writeBoolean(true);
			System.out.println("File created");
			dons.close();
			
			System.out.println("-------------------------------------------------");
			DataInputStream dins = new DataInputStream(new FileInputStream(fin));
			System.out.println(dins.readInt());
			System.out.println(dins.readLong());
			System.out.println(dins.readFloat());
			System.out.println(dins.readBoolean());
			System.out.println("-------------------------------------------------");
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
	
