public class Thread2_1 implements Runnable
{
		public void run() 
			{
				System.out.println("From run() : " + Thread.currentThread().getName());
			}
			public static void main(String[] args) 
			{
				System.out.println("From main() : " + Thread.currentThread().getName());
	 
				System.out.println("Creating Runnable Instance...");
				
				System.out.println("Creating a Thread Instance...");
				Thread2_1 m1=new Thread2_1();  
				Thread thread = new Thread(m1);
			 
				System.out.println("Launching a Thread...");
				thread.start();
			}
}
