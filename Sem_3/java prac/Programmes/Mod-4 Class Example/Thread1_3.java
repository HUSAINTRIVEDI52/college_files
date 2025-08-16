//get name
class Thread1_3 extends Thread
    {  
     
		public void run()
			{  
				System.out.println(Thread.currentThread().getName());  
			}  
     
     
     public static void main(String args[])
	{  
		Thread1_3 t1=new Thread1_3();  
		Thread1_3 t2=new Thread1_3();  
      
		t1.start();  
		t2.start();  
     }  
    }  