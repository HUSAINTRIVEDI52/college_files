package pack;

public class P2 {
    private int balance;
    private int deposit;
    private int withdraw;

   public  P2(int balance)
    {
        this.balance=balance;
    }
    public void deposit(int dep)
    {
        System.out.println("THe deposied amount is "+dep);
        balance+=dep;
        System.out.println("The updated balance is "+balance);
    }
    public void withdraw(int with)
    {
        if(with>balance)
        {
            System.out.println("THe amount is greater then the balance");
        }
        else{

            System.out.println("The withdrawn amount is "+with);
            balance=-+with;
            System.out.println("THe updated balance is "+balance);
        }

    }
    int chkbalance(){
        return balance;

    }
    
}
