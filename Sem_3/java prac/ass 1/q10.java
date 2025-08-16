// Write a Java Program to Check Whether the Entered Year is Leap Year or not.
import java.util.*;
public class q10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check to check if it is a leap year or not.....");
        int year=sc.nextInt();
       if(year%400==0 || year%100!=0 && year%4==0 )
       {
        System.out.println("This is a leap year");
       }
        else{
            System.out.println("This is not a leap year");
        }

               


    }
}
