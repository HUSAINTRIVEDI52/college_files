import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class banking {
    private Scanner sc = new Scanner(System.in);
    private int balance;

    public banking() {
        this.balance = 1000; // Initial deposit
    }

    public void deposit() {
        System.out.println("Enter the amount you want to deposit:");
        int depositAmt = sc.nextInt();
        balance += depositAmt;
        System.out.println("Deposited: " + depositAmt + ". Current balance: " + balance);
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Not Sufficient Funds");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ". Current balance: " + balance);
    }

    public static void main(String[] args) {
        banking b1 = new banking();
        
        // Initial deposits and withdrawals
        try {
            b1.withdraw(400);
            b1.withdraw(300);
            b1.withdraw(500); // This should throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
