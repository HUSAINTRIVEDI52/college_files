import java.util.Scanner;

class Example15{

	public static void main(String[] args)
	{
		//check is prime or not
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your No: ");
		int no=s.nextInt();
		
		
		//if()
		
		for(int i=2;i<no;i++)
		{
			if(no%i!=0)
			{
				System.out.println("Prime no"+no);
			}
			else
			{
				System.out.println("Not Prime no"+no);
			}
		}
		
		
		
		
		
		
		
		
		
		
	
	}
	
}