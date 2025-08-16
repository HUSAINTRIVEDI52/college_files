//name and id   
   class Thread1_2 extends Thread
    {  
		public void run()
			{  
				System.out.println("running...");  
			}  
	
		public static void main(String args[])
		{  
			Thread1_2 t1=new Thread1_2();  
			Thread1_2 t2=new Thread1_2();  
		      System.out.println("Name of t1:"+t1.getName());  
		      System.out.println("Name of t2:"+t2.getName());  
		      System.out.println("id of t1:"+t1.getId());  
		      System.out.println("id of t2:"+t2.getId());  
		      t1.start();  
		      t2.start();  
      
		      t1.setName("GLS Thread");  
		      System.out.println("After changing name of t1:"+t1.getName());  
     }  
    }  
    
    
    
    
    
    