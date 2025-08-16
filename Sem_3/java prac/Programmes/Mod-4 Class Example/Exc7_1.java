    //throw example
    
    public class Exc7_1
    {  
            
	 public static void main(String args[])
	 {  
		 int a = 30;
		 if(a > 20)
			 throw new ArithmeticException("product price is greater");
		 else
			 System.out.println("product price is within the range");
		System.out.println("rest of the code...");  
      }  
    }  