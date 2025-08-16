class MyThread extends Thread {
    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        try {
            // Simulate some work by sleeping
            System.out.println("Thread " + threadNumber + " is running with priority " + getPriority());
            Thread.sleep(1000); // Sleep for 1 second
            System.out.println("Thread " + threadNumber + " has finished execution.");
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadNumber + " was interrupted.");
        }
    }
}

public class ThreadPriorityTest {
    public static void main(String[] args) {
        // Create three threads
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);

        // Assign priorities
        t1.setPriority(Thread.MIN_PRIORITY);    // Lowest priority (1)
        t2.setPriority(Thread.NORM_PRIORITY);   // Normal priority (5)
        t3.setPriority(Thread.MAX_PRIORITY);    // Highest priority (10)

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Optionally join threads to ensure main thread waits for them to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All threads have finished execution.");
    }
}
