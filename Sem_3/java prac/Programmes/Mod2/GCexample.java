class GCexample{

	public void finalize(){
	
		System.out.println("Free");	
	}
	public static void main(String[] args)
	{
		GCexample g1=new GCexample();
		
		g1=null;
		
		//System.out.println(g1);
		System.gc();
			
		
	}		

	
}