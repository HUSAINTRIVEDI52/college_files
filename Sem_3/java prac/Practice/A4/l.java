class Mythread extends Thread{
    private String threadname;
    Mythread(String threadname)
    {
        this.threadname=threadname;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(threadname +" "+i);
        }try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.println("Thread successfully interruptred");
        }
    }

}

public class l {
    public static void main(String[] args) {
        
        Mythread t1=new Mythread("low Priority thread");
        Mythread t2=new Mythread("NormalPriority thread");
        Mythread t3=new Mythread("High Priority thread");

        t1.setPriority(t1.MIN_PRIORITY);
        t2.setPriority(t2.NORM_PRIORITY);
        t3.setPriority(t3.MAX_PRIORITY);

        System.out.println("The Low priority thread is"+t1.getPriority());
        System.out.println("The Normal priority thread is"+t2.getPriority());
        System.out.println("The High priority thread is"+t3.getPriority());
        
    }
}
