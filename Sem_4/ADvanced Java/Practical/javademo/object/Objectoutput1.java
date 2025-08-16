

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

class Objectoutput1
{

	public static void main(String args[])
	{
		try
		{
			//File f = new File("obj.dat");
			FileOutputStream fos = new FileOutputStream("obj.dat");
			ObjectOutputStream objos = new ObjectOutputStream(fos);

			Biodata b1 = new Biodata("aayush", 35,"Satellite", "Ahmdedabad");
			Biodata b2 = new Biodata("riddhi", 30,"Bopal", "Ahmdedabad");
			Biodata b3 = new Biodata("riya", 40,"Maninagar", "Ahmdedabad");



			objos.writeObject(b1);
			objos.writeObject(b2);
			objos.writeObject(b3);

			objos.flush();
			objos.close();

		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println("IO Error");
		}
	}
}//end of class Objectoutput
