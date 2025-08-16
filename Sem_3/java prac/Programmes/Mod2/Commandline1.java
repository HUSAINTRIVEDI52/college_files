class Commandline1{

	Commandline1 s=new
	Commandline1 s2=new 
	Commandline1 s3=new
	
	s=null;
	
	public static void main(String[] args)
	{
			
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a>b)
		{
			System.out.println("Max:"+args[0]);
		}
		else
		{
			System.out.println("Min:"+args[0]);
		}
	}		

	
}