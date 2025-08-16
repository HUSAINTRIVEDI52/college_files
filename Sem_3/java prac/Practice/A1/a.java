// Write a Java program to calculate the circumference of a circle value that should be
// taken from the Scanner class

import java.util.*;

public class a
{
    public static void main(String[] args) {
        System.out.println("Enter a value to find the circumference of the Circle:");
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double pi=3.14;
        double rad=2*pi*radius;
        System.out.println("The Radius of the circle is "+rad);
    }
}
