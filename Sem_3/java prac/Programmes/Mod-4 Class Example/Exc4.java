//proper sequence of catch block

   public class Exc4
	   {  
	      public static void main(String args[])
		      {  
			try
			{  
				int a[]=new int[5];  
				a[5]=30/0;  
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception held");
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index out of bound");
			}
			catch(Exception e) //to htandle any type of Exception
				{
					System.out.println("common task completed");
				}  
			
	      
	      
	       System.out.println("rest of the code...");  
	     }  
	    }  