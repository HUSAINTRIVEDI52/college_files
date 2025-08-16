interface A{
	int a=10;
	void getNo();
}

class myClass implements A{
	public void getNo()
	{
		System.out.println("No is: 10");
	}
	
	public static void main(String[] args)
	{
		myClass m=new myClass();
		m.getNo();
		System.out.println(m.a);
	}
	
}