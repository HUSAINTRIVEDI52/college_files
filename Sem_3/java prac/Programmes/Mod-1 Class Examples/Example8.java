import java.util.Scanner;

class Example8
{
	public static void main(String[] args) 
	{
		//switch case
				Scanner s=new Scanner(System.in);

		System.out.println("Select your team");
		System.out.println("R- RCB");
		System.out.println("C- CSK");
		System.out.println("M- MI");
		System.out.println("D- DC");
		
		System.out.println("Enter your team: ");
		
				char ch=s.next().charAt(0);
			
		switch(ch)
		{
			case 'r':
			case 'R':System.out.println("R u From RCB");
				     break;
			case 'd':
			case 'D':System.out.println("R u From DC");
				     break;
			case 'm':
			case 'M':System.out.println("R u From MI");
				     break;
			default:System.out.println("enter valid choice");
					break;
			
		}
		
		
		
		
		
		
		
		
		
	}
}