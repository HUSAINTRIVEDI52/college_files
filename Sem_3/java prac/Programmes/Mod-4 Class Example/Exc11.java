    //custom exception 1 using extends Exception
    
    class InvalidAgeException extends Exception
    {  
     InvalidAgeException(String s)
	    {  
		super(s);  //calling Exception class constructor
	   }  
    }  	
    
        class Exc11
    {  
      
       static void validate(int age)throws InvalidAgeException
	    {  
		if(age<18)  
			throw new InvalidAgeException("not valid to vote");  
		else  
          System.out.println("welcome to vote");  
       }  
         
       public static void main(String args[])
	       {  
			try
		       {  
				validate(20);  
			}
			catch(Exception m)
			{
				System.out.println("Exception occured: "+m);
			}  
      
		System.out.println("rest of the code...");  
		}  
    }  