    //case 1 the user caught the exception using try catch
    
    import java.io.*;  
    class M
    {  
	void method() throws IOException
	    {
		System.out.println("In method..");
		throw new ArithmeticException("Arithmetic..");
		}
    }  
    
    public class Exc9_1
	    {  
		public static void main(String args[])
			{  
				try
				{  
					M m=new M();  
					m.method();  
        
				}
				catch(Exception e)
				{
					System.out.println(e);
					System.out.println("exception handled");
				}
      
				finally
				{
						System.out.println("In finally");
				}
				System.out.println("normal flow...");  
      }  	
      
    }  