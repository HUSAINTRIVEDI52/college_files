class t1 extends Thread{
    private String s;
    t1(String s)
    {
        this.s=s;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(s+" "+i);
        }try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(s+"Executed");
        }
    }
}

public class j {
public static void main(String[] args) {
    t1 lowpriority=new t1("Low priority thread");
    t1 Normalpriority=new t1("Normal priority thread");
    t1 Highpriority=new t1("High priority thread");

    lowpriority.setPriority(t1.MIN_PRIORITY);
    Normalpriority.setPriority(t1.NORM_PRIORITY);
    Highpriority.setPriority(t1.MAX_PRIORITY);

lowpriority.start();
Normalpriority.start();
Highpriority.start();

System.out.println("Low priority thread:"+lowpriority.getPriority());
System.out.println("Normal priority thread:"+Normalpriority.getPriority());
System.out.println("High priority thread:"+Highpriority.getPriority());

try{
    lowpriority.join();
    Normalpriority.join();
    Highpriority.join();
}catch(InterruptedException e)
{
    System.out.println("Threads executed");
}





}    
}
