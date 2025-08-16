//thread sleep   


   class Add extends Thread
   {  
     public void run()
	     {  
		for(int i=1;i<5;i++)
		     {  
			
				   //  Thread.sleep(1000);
				
				
			System.out.println(i+3);  
			
		}
	}
}
   class Mul extends Thread
   {  
     public void run()
	     {  
		for(int i=1;i<5;i++)
		     {  
			try
			     {
				     Thread.sleep(1000);
				}
			catch(InterruptedException e)
				{
					System.out.println(e);
				}
				
			System.out.println(i*2);  
			}  
     }
     }
     class Thread5 extends Thread
     {
     public static void main(String args[])
     {  
	     
	Add t1=new Add();  
        Mul t2=new Mul();  
         t1.start();  
      t2.start();  
     }  
    }  