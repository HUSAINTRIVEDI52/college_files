abstract class student{
	
	abstract void getData();
	void display(){
		System.out.println("Dipslay called");
	}
	
}
class BCA extends student{
		void getData()
		{
			System.out.println("Abstract method called");
		}
	public static void main(String[] args)
	{
		student b=new BCA();
		b.getData();
		b.display();
			
	}
	
}