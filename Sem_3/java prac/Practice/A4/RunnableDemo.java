class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Running in thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread object, passing the MyRunnable instance
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();
        
        // Main thread continues to execute
        for (int i =    1; i <= 10; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}
