class Methods{

	 static void oddeven()
	{
		int a=10;
		if(a%2==0)
		{
				System.out.println("Even no: "+a);
		}
		else
		{
			System.out.println("Odd no: "+a);
		}
		
		
	}
	
	void oddeven(int x)
	{
		int a=x;
		if(a%2==0)
		{
				System.out.println("Even no: "+a);
		}
		else
		{
			System.out.println("Odd no: "+a);
		}
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		Methods m=new Methods();
		
		
		oddeven();
		m.oddeven(10);
		
		
		
		
		
	}	
	
	
	
	
	
	
	
}