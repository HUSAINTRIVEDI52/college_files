interface A{
	int a=10;
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
		int a=10;
		int ans=a*a;
		System.out.println("Square is:"+ans);
	}
}
class Cube implements B{
public void getNo()
	{
		int a=10;
		int ans=a*a*a;
		System.out.println("Cube is:"+ans);
	}
}

class myClass1 {
	
	
	public static void main(String[] args)
	{
		Square s=new Square();
		s.getNo();
		Cube c=new Cube();
		c.getNo();
		
	}
	
}