//inheritance.... single level
class Employee{
	int eid=101;
	int age;
	void get()
	{
		age=35;
	}
}
class Salary extends Employee {
	float esal=18000.50f;
	void get()
	{
		super.get();
		System.out.println("Get from Salary class");
	}
}
class Shift extends Salary{
	String sft="Morning";
}
//driver code
class Company {
		
	
	public static void main(String[] args)
	{
		Shift s=new Shift();
		System.out.println(s.eid);
		System.out.println(s.esal);
		System.out.println(s.sft);
		s.get();
		System.out.println(s.age);
		
	}
}