    //case 2 if we declare the exception
    import java.io.*;  
    class M
    {  
	void method()throws IOException
	    {  
		throw new IOException("device error");  
	    }  
    }  
    
    class Exc10
    {  
       public static void main(String args[])throws IOException
	       {//declare exception  
			M m=new M();  
			m.method();  
      
			System.out.println("normal flow...");  
		}  
    }  