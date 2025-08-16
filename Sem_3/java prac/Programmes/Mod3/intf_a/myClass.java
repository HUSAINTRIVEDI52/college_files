interface A{
	int a=15;
	void getNo();
}
interface B{
	void getNo();
}
interface C extends B{
	void getNo();
	
}
class Square implements A{
	public void getNo()
	{
		int a=5;
		int ans=a*a;
		System.out.println("Square  is : "+ans);
	}
}
class Cube implements C{
	public void getNo()
	{
		int a=5;
		int ans=a*a*a;
		System.out.println("Cube  is : "+ans);
	}
}

class myClass {
	public static void main(String[] args)
	{
		Square s=new Square();
		s.getNo();
		System.out.println("value of int A is :"+(s.a));
		Cube c=new Cube();
		c.getNo();
	}
	
}