// Write a Java program to create a class called Shape with a method called getArea.
// Create a subclass called Rectangle that overrides the getArea() method to calculate
// the area of a rectangle. (Value should be taken from User)
import java.util.*;
class shape{

    public
     double getarea()
    {
        return 0;
    }
}
public class a extends shape{
private int length;
private int breadth;

public

void getinput()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the breadth of the Rectangle:");
    breadth=sc.nextInt();

    System.out.println("Enter the length of the Rectangle:");
    length=sc.nextInt();
}
public   double getarea()
{
    return length*breadth;
}

void display()
{
    System.out.println("The area of rectangle is "+getarea());
}
public static void main(String[] args) {
    a a1=new a();
    a1.getinput();
    // a1.getarea();    
    a1.display();
}
}