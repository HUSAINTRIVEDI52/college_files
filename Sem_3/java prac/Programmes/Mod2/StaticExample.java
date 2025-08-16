class StaticExample{
		
	static int count=0;
	
	StaticExample()
	{
		count++;
		
	}
	void display()
	{
		
		System.out.println("Count is :  "+count);
		count++;
	}
	public static void main(String[] args)
	{
		StaticExample se1=new StaticExample();
		//StaticExample se2=new StaticExample();
		se1.display();
		se1.display();
		se1.display();
		//se2.display();		
	}		

	
}
