//methods
class Example101{
	
	Example101()
	{
		
		
	}
	void oddeven(int a,int b)
	{
		int z=a;
		int x=b;
		if(z%2==0 || z%2==0)
		{
			System.out.println("Both Even Number");
		}
		else
		{
			System.out.println("Both Odd Number");
		}
	}
	void oddeven(int a)
	{
		int z=a;
		if(z%2==0)
		{
			
			System.out.println("Even Number");
				
		}
		else
		{
			System.out.println("Odd Number");
		}
	 
	}
	
	static int Show()
	{
		return 5;
	}
	
	public static void main(String[] args)
	{
		Example101 e=new Example101();
		int no=10;
		e.oddeven(no);
		e.oddeven(10,20);
		int k=Show();
		System.out.println(k);
		
		
		
		
		
		
		
		
	}

	
}