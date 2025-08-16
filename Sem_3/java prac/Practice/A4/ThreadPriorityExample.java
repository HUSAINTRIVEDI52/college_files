 class PriorityThread implements Runnable {
    private String threadName;

    public PriorityThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: iteration " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " has finished execution.");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create threads with different priorities
        Thread lowPriorityThread = new Thread(new PriorityThread("Low Priority Thread"));
        Thread normalPriorityThread = new Thread(new PriorityThread("Normal Priority Thread"));
        Thread highPriorityThread = new Thread(new PriorityThread("High Priority Thread"));

        // Set priorities
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);    // Priority 1
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);    // Priority 10

        // Display thread priorities
        System.out.println("Low Priority Thread Priority: " + lowPriorityThread.getPriority());
        System.out.println("Normal Priority Thread Priority: " + normalPriorityThread.getPriority());
        System.out.println("High Priority Thread Priority: " + highPriorityThread.getPriority());

        // Start threads
        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();

        // Wait for threads to finish
        try {
            lowPriorityThread.join();
            normalPriorityThread.join();
            highPriorityThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("All threads have finished execution.");
    }
}
 
    

