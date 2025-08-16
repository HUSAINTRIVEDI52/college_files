import java.util.Scanner;
class Studentdata{
	int rno;
	String name;
	String college;
}
//driver class
class Student2{
	public static void main(String[] args)
	{
		Studentdata s1=new Studentdata();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter roll no");
		s1.rno=s.nextInt();

		
		//s1.rno=no;
		s1.name="NIrav";
		s1.college="GLS";
		
		System.out.println("Roll  no is :"+s1.rno);
		System.out.println("Roll  name is :"+s1.name);
		System.out.println("Roll  college is :"+s1.college);
		
	}
	
	}