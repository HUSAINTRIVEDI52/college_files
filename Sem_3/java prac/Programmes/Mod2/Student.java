import java.util.Scanner;
class Studentdata{
	int rno;
	String name;
	String college;
	
	void getData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter roll no");
		rno=s.nextInt();
		
		System.out.println("Enter Name");
		name=s.next();
		
		System.out.println("Enter College name");
		college=s.next();
		
		
	}
	
	void putData()
	{
		System.out.println(rno+"\t"+name+"\t"+college);
		
		
	}
	
}

//driver class
class Student{
	public static void main(String[] args)
	{
		Studentdata s1=new Studentdata();
		Studentdata s2=new Studentdata();
		s1.getData();
		s2.getData();
		System.out.println("Rollno\t"+"Name\t"+"College");
		System.out.println("**************************");

		s1.putData();
		s2.putData();
		
	}
	
	}