// Write a Java program to swap two numbers without taking the third variable value
// that should be taken from the Scanner class
import java.util.*;
public class q2 {
    public static void main(String[] args)
    {
        int num1;
        int num2;
        System.out.println("Enter number 1 for the swapping of the numbers: ");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();

        System.out.println("Enter number 2 for the swapping of the number:");
        num2=sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println(num1+" "+num2);

        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping");
        System.out.println(num1+" "+num2);

    }
}
