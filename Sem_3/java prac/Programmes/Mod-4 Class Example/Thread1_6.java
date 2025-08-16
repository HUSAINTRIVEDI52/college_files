public class Thread1_6 extends Thread 
	{
		public static int amount = 0;

		public static void main(String[] args) 
		{
			Thread1_6 thread = new Thread1_6();
			thread.start();
			System.out.println(amount);
			amount++;
			System.out.println(amount);
		}

		public void run() 
		{
			amount++;
		}
}