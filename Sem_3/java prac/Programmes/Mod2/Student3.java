//by the method init objects 
import java.util.Scanner;
class Studentdata{
	int rno;
	String name;
	String college;
	
	void assingValues(int a,String b,String c)
	{
		rno=a;
		name=b;
		college=c;
		
	}
	
}
//driver class
class Student3{
	public static void main(String[] args)
	{
		Studentdata s1=new Studentdata();
		
		s1.assingValues(501,"Nirav","GLS");
		
		
		System.out.println("Roll  no is :"+s1.rno);
		System.out.println("Roll  name is :"+s1.name);
		System.out.println("Roll  college is :"+s1.college);
		
	}
	
	}