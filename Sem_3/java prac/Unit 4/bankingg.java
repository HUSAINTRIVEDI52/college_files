class withdrawsurpas extends Exception
{
    public withdrawsurpas(String messege)
    {
super(messege);
    }
}
class bbanking {
    private double banking;

    bbanking(double balance)
    {
        this.banking=balance;
    }

    void depoosit(double balance)
    {
            if(balance>0)
            {
                balance+=banking;
                System.out.println("The deposited amount is "+balance);
                System.out.println("The total balance available is "+banking);
            }
    }

    void withdraw(int i) throws withdrawsurpas
    {
        if(banking<i)
        {
            throw new  withdrawsurpas("Insufficient Balance");

        }
        else
        {
            banking-=i;
            System.out.println("The withdrawn amount is  "+i);
            System.out.println("The balance available is "+banking);
        }
    }
    
    public double getbalance()
    {
        return banking;
    }
}
public class bankingg
{
    public static void main(String[] args)
    {
        bbanking b1=new bbanking(1000);

        try{
            b1.withdraw(500);
            b1.withdraw(400);
            b1.withdraw(300);
        }catch(withdrawsurpas e)
        {
            System.out.println(e.getMessage());
        }
    }
}
