// Write a Java program to calculate the circumference of a circle value that should be
// taken from the Scanner class
import java.util.*;
class q1
{
    public static void main(String[] args)
    {

        System.out.print("Enter a value to calculate the circumference of the circle");
        float Area;
         Scanner sc= new Scanner(System.in);
          Area=sc.nextFloat();
          double circumference=(2*3.14)*Area;
          System.out.print(circumference);
    }
}