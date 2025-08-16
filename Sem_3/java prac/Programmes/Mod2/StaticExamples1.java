class StaticExamples1{
	
		static int cnt=0;
	StaticExamples1()
	{
		cnt++;
	}
	void display()
	{
		
		System.out.println("current count: "+cnt);
		cnt++;
	}	
	
	public static void main(String[] args)
	{
		StaticExamples1 se=new StaticExamples1();
		
		se.display();
		se.display();
	}
	
}