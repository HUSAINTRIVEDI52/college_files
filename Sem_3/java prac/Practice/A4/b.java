// 2. Write an small application in Java to develop Banking Application in which user 
// deposits the amount Rs1000.00 and then start withdrawing of Rs 400.00, Rs300.00 
// and it throws exception "Not Sufficient Fund" when user withdraws Rs. 500 
// thereafter

import java.util.*;
class notsufficientfundexception extends Exception
{
    public  notsufficientfundexception(String s)
    {
        super(s);
    }
}
public class b  {
    private int deposit;
    private int withdraw;

    public b(int deposit)
    {
        this.deposit=deposit;
    }
   public void deposit(int bal)
   {
    deposit+=bal;
    System.out.println("The successfully deposited money is"+bal);;
    System.out.println("The current balance is"+deposit);
   }
   public void withdraw(int with1) throws notsufficientfundexception{
if(with1>deposit)
{
   throw new notsufficientfundexception("Your amount is greater than the balance");
}
else{
    deposit-=with1;
    System.out.println("The withdrawn amount is"+with1);
    System.out.println("The updated balance is"+deposit);
}
   }
   double checkbalance()
   {
    return deposit;
   }
        public static void main(String[] args) throws notsufficientfundexception{
            b b1=new b(1000);
            b1.withdraw(400);
            b1.withdraw(300);
            b1.withdraw(500);
            double bal=b1.checkbalance();
            System.out.println("The balance in the account is"+bal);
        }
    
}
