//Single inheritance
//solve the method overridding : super
class Employee{
	int eid=101;
	int age;
	void get()
	{
		age=35;
	}
}
class Salary extends Employee{
	float sal=15000.75f;
	void get()
	{
		System.out.println("I am working in hr company");
	}
}

class Shift extends Salary{
	String sft="Morning";
	void get()
	{
		super.get();
		System.out.println("I am from shift class");
	}
}

//driver code
class Company{
	
	public static void main(String[] args)
	{
		Shift s=new Shift();	
		System.out.println(s.eid);
		System.out.println(s.sal);
		System.out.println(s.sft);
		s.get();
		System.out.println(s.age);
	}
	
	
	
	
	
}