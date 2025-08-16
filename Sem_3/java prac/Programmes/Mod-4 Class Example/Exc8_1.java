//throws

public class Exc8_1
{
	static void check(int a) throws ArithmeticException 
	{
		int b = 10/a;
		
	}

  public static void main(String[] args) 
	{
		check(0); 
		System.out.println("rest of the code...");  
	}
}
