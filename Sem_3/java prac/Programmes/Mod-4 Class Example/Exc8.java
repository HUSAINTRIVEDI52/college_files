//throws keyword

  import java.io.IOException;  
    class Exc8
    {  
	void m() throws IOException 
	    {  
		throw new IOException("device error");//checked exception  
	    }
	    
      void n()throws IOException
	    {  
		m();  
	    }  
      void p()
	    {  
		try
		    {  
			n();  
		    }
		    
		    catch(Exception e)
		    {
			    System.out.println("exception handled");
			}  
      }  
      
      public static void main(String args[])
      {  
	Exc8 obj=new Exc8();  
	obj.p();  
	System.out.println("normal flow...");  
      }  
    }  