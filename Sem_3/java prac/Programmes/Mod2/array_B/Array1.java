class Array1{
	//passing array as an argument....
	
	static void min(int nos[])
	{
		int m=nos[0];
		for(int i=1;i<nos.length;i++)
		{
			if(m>nos[i])
			{
				m=nos[i];
			}
		}
		System.out.println("Minimum is : "+m);
		
	}
	
	static void max(int nos[])
	{
		int m=nos[0];
		for(int i=1;i<nos.length;i++)
		{
			if(m<nos[i])
			{
				m=nos[i];
			}
		}
		System.out.println("Maximum is : "+m);
		
		
		
	}

	
	
	public static void main(String[] args)
	{
		int[] ar={10,1,-5,-3,0,55,3,88};
		
		for(int i=0;i<ar.length;i++)
		{
				System.out.println(ar[i]);
		}
		min(ar);
		max(ar);		
	}
	
}
