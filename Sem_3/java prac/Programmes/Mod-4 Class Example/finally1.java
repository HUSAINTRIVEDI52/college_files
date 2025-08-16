class finally1{
	public static void main(String[] args)
	{
		try{
			String name="Java";
			System.out.println(name.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("invalid String");
		}
		finally{
			System.out.println("finally block code");
		}
		System.out.println("REst of code");
	}		
	
}