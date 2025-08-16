// Write a program that executes two threads. One thread will print the even 
// numbers and the thread will print odd numbers from 1 to 50.

class th1 extends Thread{
    public void run()
    {
        try{

            for(int i=0;i<50;i++)
            {
                if(i%2==0)
                {
                    System.out.println("Thread 1:"+i);
                    Thread.sleep(1000);
                }
            }
        }catch(InterruptedException e)
        {
            System.out.println("Even numbers successfully printed");
        }
    }
}

class th2 extends Thread{
    public void run()
    {
        try{

            for(int i=0;i<50;i++)
            {
                if(i%2!=0)
                {
                    System.out.println("Thread 2:"+i);
                    Thread.sleep(1000);
                }
            }
        }catch(InterruptedException e)
        {
            System.out.println("odd numbers successfully printed");
        }
    }
}



public class g {
    public static void main(String[] args) {
        th1 t1=new th1();
        th2 t2=new th2();
        t1.start();
        t2.start();
    }
}
