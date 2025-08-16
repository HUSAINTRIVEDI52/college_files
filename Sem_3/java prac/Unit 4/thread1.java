class thread extends Thread
{
    public void run()
    {
        try{
            while(true)
            {
                System.out.println("Thread 1");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e)
        {
            System.out.println("Thread 1 Executed");
        }
    }
}
class thread2 extends Thread{
    public void run()
    {
        try{
            while(true)
            {
                System.out.println("Threaad 2");
                Thread.sleep(4000);
            }
        }
        catch(InterruptedException e){
                System.out.println("Thread 2 executed");
        }
    }
}
public class thread1
{
    public static void main(String[] args) {
        thread t1=new thread();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
}