// // Write a Java program to create a class called Shape with a method called getArea.
// Create a subclass called Rectangle that overrides the getArea() method to calculate
// the area of a rectangle. (Value should be taken from User)



import java.util.Scanner;

  class Shape
{
    int get_area()
    {
      return 0; 
    }
}
class rectangle extends Shape
{
    private int length;
    private int breadth;

    public rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    int get_area()
    { 
       return  length*breadth;

    }
}

public class Mai
{

    public static void main(String[] args)

    {
        int len,bd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        len=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        bd=sc.nextInt();

        rectangle r1=new rectangle(len,bd);
System.out.println("The area of the rectangle is "+r1.get_area());
    }
}