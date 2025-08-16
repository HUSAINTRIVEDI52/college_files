
import java.io.*;

class Biodata implements Serializable
{
	String name;
	int age;
	String adr1;
	String adr2;
	
	Biodata(String nm, int ag, String ad1, String ad2)
	{
		name = nm;
		age = ag;
		adr1 = ad1;
		adr2 = ad2;
	}
	void Printbio()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address 1: " + adr1);
		System.out.println("Address 2: " + adr2);
	}
}// end of class Biodata

class Objectinput1
{
	public static void main(String args[])
	{
		Biodata obj;
		try
		{
			//File f = new File("obj.dat");
			FileInputStream fis = new FileInputStream("obj.dat");
			ObjectInputStream objis = new ObjectInputStream(fis);

			System.out.println("******************************************");
			for(int i=0; i<3;i++)
			{
				obj = (Biodata) objis.readObject();
				obj.Printbio();

				System.out.println("******************************************");
			}
			objis.close();

		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found error");
		}
		catch(IOException e)
		{
			System.out.println("IO Error");
		}
	}
}//end of class Objectoutput
