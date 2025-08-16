//first example of simple inheritance........extends
class BCA{
	int rno=101;
	String sname="Java";
	void get()
	{
		System.out.println("BCA get method called");
	}
	static void put()
	{
		System.out.println("BCA put method called");
	}
}
class Student extends BCA {

	String uni="GLS University";
	
	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println(s.rno);
		System.out.println(s.sname);
		System.out.println(s.uni);
		s.get();
		put();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}