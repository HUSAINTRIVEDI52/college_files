//thread sleep   


   class Add extends Thread
   {  
	   int s=0;
     public void run()
	     {  
		for(int i=6;i<=10;i++)
		     {  
			try
			     {
				     Thread.sleep(1000);
				}
			catch(InterruptedException e)
				{
					System.out.println(e);
				}
				s = s + i;
			  	System.out.println("6 to 10: " + s);			
			}
	System.out.println("Total sum 6 to 10:"+s);			
     }
}
   class Mul extends Thread
   {  
	   int s=0;
     public void run()
	     {  
		for(int i=1;i<=5;i++)
		     {  
			try
			     {
				     Thread.sleep(1000);
				}
			catch(InterruptedException e)
				{
					System.out.println(e);
				}
				
			s = s+ i;
					System.out.println("1 to 5: " +s);			
			}
		System.out.println("Total sum 1 to 5:" +s);			
     }
     }
     class Thread6 extends Thread
     {
     public static void main(String args[])
     {  
	     
	Add t1=new Add();  
        Mul t2=new Mul();  
         t1.start();  
      t2.start();  
     }  
    }  