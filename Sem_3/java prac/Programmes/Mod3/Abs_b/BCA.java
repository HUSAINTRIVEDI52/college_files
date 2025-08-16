abstract class student{
	abstract void getData();
	void display()
	{
		System.out.println("From display");
	}
}

class BCA extends student{
	void getData()
	{
		System.out.println("Abs method called");
		
	}
	public static void main(String[] args)
	{
		student b=new BCA();
		b.getData();
		b.display();
		
	}
}
