

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

class Objectoutput2
{

	public static void main(String args[])
	{
		try
		{
			File f = new File("obj1.dat");
			FileOutputStream fos = new FileOutputStream("obj1.dat");
			ObjectOutputStream objos = new ObjectOutputStream(fos);

			Biodata b1 = new Biodata("ANKIT", 35,"Satellite", "Ahmdedabad");
			Biodata b2 = new Biodata("KULEEN", 30,"Bopal", "Ahmdedabad");
			Biodata b3 = new Biodata("CHIRAG", 40,"Maninagar", "Ahmdedabad");


			
			objos.writeUTF(b1.name);
			objos.writeInt(b1.age);
			objos.writeUTF(b1.adr1);
			objos.writeUTF(b1.adr2);


			objos.writeUTF(b2.name);
			objos.writeInt(b2.age);
			objos.writeUTF(b2.adr1);
			objos.writeUTF(b2.adr2);


			objos.writeUTF(b3.name);
			objos.writeInt(b3.age);
			objos.writeUTF(b3.adr1);
			objos.writeUTF(b3.adr2);

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
