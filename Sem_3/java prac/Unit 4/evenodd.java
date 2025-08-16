class even extends Thread {
    public void run() {
        for (int i = 2; i < +50; i += 2) {
            System.out.println("Even Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Even Numbers executed");
            }
        }
    }
}
class odd extends Thread{
    public void run()
    {
        for(int i=1;i<=50;i+=2)
        {
            System.out.println("Odd Number "+i);

            try{
                Thread.sleep(500);
            }catch(InterruptedException e)
            {
                System.out.println("Odd thread executed");
            }
        }
    }
}i

public class evenodd
{
    public static void main(String[] args)
    {
        even e1=new even();
        odd d1=new odd();
        e1.start();
        d1.start(); 
    }
}