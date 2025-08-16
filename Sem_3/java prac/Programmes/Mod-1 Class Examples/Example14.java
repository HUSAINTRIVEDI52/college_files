import java.util.Scanner;

class Example14{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=s.next();
		
		System.out.println("Enter your Roll No: ");
		int rno=s.nextInt();
		
		System.out.println("Enter S1 Marks: ");
		int s1=s.nextInt();
		System.out.println("Enter S2 Marks: ");
		int s2=s.nextInt();
		System.out.println("Enter S3 Marks: ");
		int s3=s.nextInt();
		
		int total=s1+s2+s3;
		
		double per=total/3;
		
		
		System.out.println("Your Name is: "+name);
		System.out.println("Your Roll No is: "+rno);
		System.out.println("Your S1 Marks: "+s1);
		System.out.println("Your S2 Marks: "+s2);
		System.out.println("Your S3 Marks: "+s3);
		System.out.println("Your total of 300: "+total);
		System.out.println("Per: "+per);
		
		
		
		
		
		
		
		
		
		
	
	}
	
}