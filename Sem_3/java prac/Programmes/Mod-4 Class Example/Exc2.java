//Exception 2

  public class Exc2
	  {  
		public static void main(String args[])
			{  
				try
				{  
					int data=50/0;  
					
					int data1=50/0;  
				}
				
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}  
       System.out.println("rest of the code...");  
    }  
    }  