import java.util.Scanner;

class Example16{

	public static void main(String[] args)
	{
			System.out.println("Select your choice");	
		
		System.out.println("M- Mumbai");
		System.out.println("A- Ahmedabad");
		System.out.println("H- Himmatnagar");
		System.out.println("K- Kerala");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Choice - ");
	
		char ch=s.next().charAt(0);
		
		switch(ch)
		{
			case 'm':
			case 'M': System.out.println("Welcome to Mumbai");
					break;
			case 'k': 
			case 'K': System.out.println("Welcome to Kerala");
					break;
			case 'A': System.out.println("Welcome to Ahmedabad");
					break;
			default:System.out.println("Enter Valid Choice");
					break;
		}
		
		
		
		
	
	}
	
}