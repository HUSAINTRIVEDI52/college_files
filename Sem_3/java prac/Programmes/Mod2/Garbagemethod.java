class Garbagemethod{

	public void finalize()
	{
			System.out.println("Memory Free");
	}
	public static void main(String[] args)
	{
		Garbagemethod g=new Garbagemethod();
		Garbagemethod g2=new Garbagemethod();

		
		g=null;
		g2=null;
		
		System.gc();
		
	}
	
}


			
			
			


