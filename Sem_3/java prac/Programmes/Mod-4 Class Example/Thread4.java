//Thread priorities

   class Thread4 extends Thread
   {  
     public void run()
	     {  
			System.out.println("running thread name is:"+Thread.currentThread().getName());  
			System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
            }
	    
     public static void main(String args[])
	{  
      Thread4 m1=new Thread4();  
      Thread4 m2=new Thread4();  
      
      m1.start();  
      m2.start();  
		
	m1.setPriority(Thread.MIN_PRIORITY);  
	m2.setPriority(Thread.MAX_PRIORITY);  
       //System.out.println("m1 running thread priority is:"+ m1.getPriority());  
	//System.out.println("m2 running thread priority is:"+ m2.getPriority());  
     }  
    }     