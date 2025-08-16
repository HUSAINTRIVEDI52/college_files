import java.util.Scanner;
class Example9{
		
		Example9()
		{
			System.out.println("From Constructor");
		}
	
	public static void main(String[] args)
	{
		
		Example9 e=new Example9();
		System.out.println("From Main");
	
	}
	static{
		System.out.println("From Static");
	}
	{
		System.out.println("From bracket");
	}
	
}