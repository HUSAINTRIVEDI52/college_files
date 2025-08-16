//by the constructor
import java.util.Scanner;
class Studentdata{
	int rno,co;//javac
	String name;
	String college;
	
	Studentdata()
	{
		Scanner s=new Scanner(System.in);//java 
		System.out.println("Enter roll no");
		rno=s.nextInt();
		
		name="NIrav";
		college="GLS";
	}
	
}
//driver class
class Student4{
	public static void main(String[] args)
	{
		Studentdata s1=new Studentdata();
		
		
		
		
		System.out.println("Roll  no is :"+s1.rno);
		System.out.println("Roll  name is :"+s1.name);
		System.out.println("Roll  college is :"+s1.college);
		
	}
	
	}