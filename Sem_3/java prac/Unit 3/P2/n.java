

// Write a Program based on package. Create package P1 and P2 to perform following 
// task.
// P1 package will accept the customer accno and name.
// P2 pacakge will have following methods.
// Deposite amount
// Withdraw amount
// Check Balance
 

package P2;
// import P1.*;

public class n
{

    // private int deposit;
    // private int withdraw;

    private int balance;
    n(int balance)
    {
        this.balance=balance;
    }

    public void deposit(int deposit)
    {
        if(deposit>=0)
        {
            balance+=deposit;
            System.out.println("Balance deposited successfully");
        }
        else{
            System.out.println("Enter the valid amount");
        }
    }
        public void withdra(int withdraw)
        {
            if(withdraw>0 && withdraw<=balance)
            {
                balance-=withdraw;
                System.out.println("Balance withdrawn successfully");
                System.out.println("The remaining balance is" + balance);

            }
            else{
                System.out.println("Insufficient bank balance");
            }
        }
            public void checkbalance()
            {
                System.out.println("The bank balance is "+balance);
            }
    
}
