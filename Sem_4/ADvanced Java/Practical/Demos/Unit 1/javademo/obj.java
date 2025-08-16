
import java.io.*;

class Student implements Serializable
{
	String name;
	Student(String nm){
		name = nm;
	}
	void Printbio(){
		System.out.println("Name: " + name);
	}
}
class obj
{
	public static void main(String args[])
	{
		Student s1=new Student("Vidhi");;
		Student s2;
		try
		{
FileOutputStream fos = new FileOutputStream("obj.dat");
ObjectOutputStream objos = new ObjectOutputStream(fos);

				objos.writeObject(s1);
				objos.close();
				
FileInputStream fis = new FileInputStream("obj.dat");
ObjectInputStream objis = new ObjectInputStream(fis);
			s2=(Student) objis.readObject();
				s2.Printbio();
			objis.close();
		}
		catch(Exception e)
		{
			System.out.println("File not found");
		}
		
	}
}
