//join


public class Thread1_4 extends Thread 
{

   public void run() 
	{

      Thread t = Thread.currentThread();
      System.out.print(t.getName());
      
      //checks if this thread is alive
      System.out.println(", status = " + t.isAlive());
   }

   public static void main(String args[]) throws Exception 
   {

      Thread t = new Thread1_4();
      
      // this will call run() function
      t.start();
      
      // waits at most 2000 milliseconds for this thread to die.
      t.join(2000);
      System.out.println("after waiting for 2000 milliseconds...");
      System.out.print(t.getName());
      
      //checks if this thread is alive
      System.out.println(", status = " + t.isAlive());
   }
}