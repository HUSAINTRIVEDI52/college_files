    //throw example in main
    
    public class Exc7_2
    {  
            
	 public static void main(String args[])
	 {  
		 int a = 30;
		 try
		 {
			if(a > 20)
				throw new ArithmeticException();
			else
				System.out.println("product price is within the range");
		}
		catch(ArithmeticException e)
		{
				System.out.println(e); 
		}
		System.out.println("rest of the code...");  
		
      }  
    }  