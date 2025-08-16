class Example3{
		int no=20;//instance varibale
		static int h=55;//static variable
	public static void main(String[] args)
	{
		Example3 e=new Example3();
		int a=10,b=20;//local variable
		String s="GLS University";
		char ch='A';
		float f=88.25f;
		boolean bl=false;
		byte bt=15;
		
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Value of s is : "+s);
		System.out.println("Value of f is : "+f);		
		System.out.println("Value of byte is : "+bt);	
		System.out.println("Value of char is : "+ch);
		System.out.println("Value of boolean is : "+bl);
		System.out.println("Value of static is : "+h);
		System.out.println("Value of static is : "+e.no);
		
		
		
		
		
		
		
	}
}