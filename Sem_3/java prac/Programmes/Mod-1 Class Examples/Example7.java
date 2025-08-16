import java.util.Scanner;

class Example7{

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
		char grade;
		if(per>=80)
		{
			grade='A';
		}
		else if(per>=70 && per<80)
		{
			grade='B';
		}
		else
		{
			grade='C';
		}
		
		
		
		System.out.println("Your Name is :"+name);
		System.out.println("Your Roll no is :"+rno);
		System.out.println("Your S1 Marks :"+s1);
		System.out.println("Your S2 Marks :"+s2);
		System.out.println("Your S3 Marks :"+s3);
		System.out.println("Your Total Marks out of 300 :"+total);
		System.out.println("Your obtained per  :"+per);
		System.out.println("Your obtained grade  :"+grade);
		
		
		
		
		
		
		
		
		
	
	}
	
}