//more than one class->inheritance:extends(IS-A)
class BCA {
	int rno=101;
	String name="Java";
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
		String uni="GLS";
	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println(s.rno);
		System.out.println(s.name);
		System.out.println(s.uni);
		s.get();
		put();
		
		
		
		
		
	}
}