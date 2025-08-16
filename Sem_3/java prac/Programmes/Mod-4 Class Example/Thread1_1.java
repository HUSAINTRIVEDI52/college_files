	//Thread join

 class Thread1_1 extends Thread
 {  
     public void run()
	{	     
		for(int i=1;i<=5;i++)
		{  
			try
			{  
				Thread.sleep(500);  
			}
			catch(Exception e)
			{
				System.out.println(e);
			}  
		System.out.println(Thread.currentThread().getName() + ": " + i);  
      }  
     }  
     
    public static void main(String args[])
	{  
		Thread1_1 t1=new Thread1_1();  
		Thread1_1 t2=new Thread1_1();  
		Thread1_1 t3=new Thread1_1();  
		
		t1.start();  
		try
		{  
			t1.join();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
      
		t2.start();  
		t3.start();  
     }  
    }  