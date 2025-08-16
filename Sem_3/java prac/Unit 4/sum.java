class t1 extends Thread{
    private int start;
    private int end;
    private int sum;

    public t1(int start,int end)
    {
        this.start=start;
        this.end=end;
    }

    public void run()
    {
        sum=0;
        for(int i=start;i<=end;i++)
        {
            sum+=i;
        }
        System.out.println("The starting of the Thread"+start+"The ending of the thread is"+end+"The total of the thread is"+sum);
    }
    public int total()
    {
        return sum;
    }
}


public class sum
{
    public static void main(String[] args) throws InterruptedException {
        t1 t2=new t1(1,5);
        t1 t3=new t1(5,10);
        t1 t4=new t1(10,15);

        t2.start();
        t3.start();
        t4.start();

        t2.join();
        t3.join();
        t4.join();
        int totalsum=t2.total() + t3.total() +t4.total();
        double avg =totalsum/15;
        System.out.println("Total sum:"+totalsum);
        System.out.println("Average:"+avg);

        
    }
}