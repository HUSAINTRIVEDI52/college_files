import java.util.Scanner;

class Example18{

	Example18()
	{
		System.out.println("Constructor");
			
	}

	public static void main(String[] args)
	{
		System.out.println("From main");
		Example18 e=new Example18();
		
		
	}
	static{
		System.out.println("From static");
	}
	{
		System.out.println("From bracket");
	}
	
}