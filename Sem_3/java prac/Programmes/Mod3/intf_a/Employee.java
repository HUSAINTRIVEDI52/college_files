interface Demo{
	int age=35;
	public void getName();
}
class Employee implements Demo {
	public void getName()
	{
		String name="Java";
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		Demo e=new Employee();
		e.getName();
		
	}	
}