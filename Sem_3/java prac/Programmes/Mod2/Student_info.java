class Student_info{
		int rno;
		String name,college;
		
	
	Student_info()
	{
		//rno=101;
		name="GLS";
		
	}
	Student_info(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
		
	}
	Student_info(int rno,String name,String div)
	{
		this.rno=rno;
		this.name=name;
		this.div=div;
		
		
	}
	
	void showData()
	{
		System.out.println(rno+"\t"+name+"\t"+div);
	}
	

	public static void main(String[] args)
	{
			//Student_info s1=new Student_info();
		Student_info s2=new Student_info(101,"GLS","D");
		//Student_info s3=new Student_info(101,"GLS","Uni");
		
			s2.showData();
		
		
		
		
	}		

	
}