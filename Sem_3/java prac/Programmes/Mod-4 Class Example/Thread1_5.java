//basic thread class
public class Thread1_5 extends Thread 
{
  public static void main(String[] args) 
	{
		Thread1_5 thread = new Thread1_5();
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	
	public void run() 
	{
		System.out.println("This code is running in a thread");
	}
}