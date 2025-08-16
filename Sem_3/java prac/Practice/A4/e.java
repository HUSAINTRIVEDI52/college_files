class thread1 extends Thread{
    public void run()
    {
        try{
            
            
                System.out.println("Thread 1");
                Thread.sleep(2000);
            
        }catch(InterruptedException e){
            System.out.println("Thread1 successfully executed");

        }
    }
}

class thread3 extends Thread{
    public void run()
    {
        try{

            
            
                System.out.println("Thread 2");
                Thread.sleep(4000);
            
        }catch(InterruptedException e)
        {
            System.out.println("Thread 2 successfully executed");
        }
    }
}

public class e{
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread3 t2=new thread3();
        t1.run();
        t2.run();
    }
}