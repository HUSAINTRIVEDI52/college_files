// Write a java program to create two threads. One using runnable interface and 
// other by extending thread. First thread will print all odd numbers and second will 
// print all even numbers between 1 to 10
class Even implements Runnable{
    
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even thread"+i);
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                System.out.println("Interface (odd numbers) successfullt implemented");
            }
        }
    }
}
class odd extends Thread{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Odd thread"+i);
            }
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e)
            {
                System.out.println("Thread 1 (oddd numbers) successfully implemented");
            }
        }
    }

}

public class both {
    public static void main(String[] args) {
        odd o1=new odd();
        Even e1=new Even();
        Thread eventhread =new Thread(e1);
        eventhread.start();
        o1.start();
        
    }
}
