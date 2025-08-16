 class Run1 implements Runnable {
    public void run()
    {
        try{
            System.out.println("Thread 1");
                Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Thread 1 is implemented");
        }
    }
}
class Run2 implements Runnable
{
    public void run()
    {
        try{
            System.out.println("Thread 2");
            Thread.sleep(3000);
        }catch(InterruptedException e)
        {
            System.out.println("Thread 2 is implemented");
        }
    }
}
public class run{
    public static void main(String[] args) {
        Run1 r1=new Run1();
        Run2 r2=new Run2();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        
    }
}
