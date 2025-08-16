import java.util.Scanner;
class Studentdata{
	int rno;
	String name;
	String college;

		
}
//driver class
class Student1{
	public static void main(String[] args)
	{
		Studentdata s1=new Studentdata();
		Scanner s=new Scanner(System.in);
		

		
		s1.rno=101;
		s1.name="NIrav";
		s1.college="GLS";
		
		System.out.println(s1.rno);
		
	}
	
	}