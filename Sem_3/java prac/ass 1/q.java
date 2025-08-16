import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1 for the swapping of the numbers: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter number 2 for the swapping of the number:");
        int num2 = sc.nextInt();
        
        System.out.println("Before Swapping");
        System.out.println("num1: " + num1 + ", num2: " + num2);
        
        // Swapping without using a third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After Swapping");
        System.out.println("num1: " + num1 + ", num2: " + num2);
    }
}
