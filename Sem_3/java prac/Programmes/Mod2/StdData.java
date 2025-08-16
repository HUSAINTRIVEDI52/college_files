class StdData{
		int rno;
		String name,college;
	
	StdData()
	{
		//Scanner s
		rno=101;
		name="Java";
	}
	StdData(int rno,String name)
	{
		//Scanner s
		this.rno=rno;
		this.name=name;
	}
	void display()
	{
	System.out.println("Roll no: "+rno+" Name is"+name);
	}
	/*StdData(int a,String n,String clg)
	{
		//Scanner s
		rno=a;
		name=n;
		college=clg;
	}*/
	
	public static void main(String[] args)
	{
		StdData s=new StdData();
		StdData s1=new StdData(101,"Java");
		s1.display();
		//StdData s2=new StdData(101,"Java","GLS");
		
		
		
		
	}
	
}