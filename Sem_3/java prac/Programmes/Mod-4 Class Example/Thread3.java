//thread sleep   


   class Thread3 extends Thread
   {  
     public void run()
	     {  
		for(int i=1;i<5;i++)
		     {  
			try
			     {
				     Thread.sleep(2000);
				}
			catch(InterruptedException e)
				{
					System.out.println(e);
				}
				
			System.out.println(i);  
			}  
     }  
     
     public static void main(String args[])
     {  
	Thread3 t1=new Thread3();  
        Thread3 t2=new Thread3();  
       
      t1.start();  
      t2.start();  
     }  
    }  