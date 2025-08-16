import java.util.Scanner;
class Stddata{
		int rno;
		String name;
		String college;
		void getData()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the roll no : ");
			rno=s.nextInt();
			System.out.println("Enter the Name : ");
			name=s.next();
			System.out.println("Enter the College : ");
			college=s.next();
		}
		void putData()
		{
		
		
		System.out.println(rno+"\t"+name+"\t"+college);		
			
		}
}

//driver class
class Studentinfo{
	public static void main(String[] args)
	{
		Stddata s1=new Stddata();
		Stddata s2=new Stddata();
		s1.getData();//behav
		s2.getData();
		System.out.println("Rollno\t"+"Name\t"+"College\t");
		System.out.println("*************************");			
		s1.putData();
		s2.putData();
				
		
		
		
		
		
			
	}
	
	}