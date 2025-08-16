class priority extends Thread{
    private int threadnumber;
    priority(int threadnumber)
    {
        this.threadnumber=threadnumber;
    }

    public void run()
    {
        try{
                System.out.println("The thread number "+threadnumber+"is running with priority number"+getPriority());
                Thread.sleep(1000);
                System.out.println("Thread number has finished execution"+threadnumber);
        }catch(InterruptedException e)
        {
            System.out.println(threadnumber+"has completed execution");
        }
    }

}


public class prioritytest {
    public static void main(String[] args) {
        priority p1=new priority(1);
        priority p2=new priority(2);
        priority p3=new priority(3);

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);
        p3.setPriority(Thread.NORM_PRIORITY);
        p1.start();
        p2.start();
        p3.start();

        try{
            p1.join();
            p2.join();
            p3.join();
        }catch(InterruptedException e){
            System.out.println("Thread is interrupted");
        }
        System.out.println("All threads have been completed");

    }
    
}
