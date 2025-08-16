class th1 implements Runnable{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread is runnning "+i);
        }
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            System.out.println("Thread Interrupted");
        }
    }

}



public class h {
    public static void main(String[] args) {
        th1 t1=new th1();
        Thread t2=new Thread(t1);

        t2.start();
    }
}
