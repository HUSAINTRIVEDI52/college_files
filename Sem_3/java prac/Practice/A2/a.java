// 1. Write a Java program that will create class room having lenght and breadth as data
// members and add two methods getdata() and area() as member function. Ask user to
// input room dimensions (l*b) and calculates the area.
import java.util.*;

public class a{
    private
    int length;
    private
    int breadth;
    public
    // a(int length,int breadth)
    // {
    //     this.length=length;
    //     this.breadth=breadth;
    // }
    void getdata()
    {
        System.out.println("Enter the Length:");
        Scanner sc=new Scanner(System.in);
         length=sc.nextInt();

        System.out.println("Enter the breadth:");
        breadth=sc.nextInt();

    }
    void area()
    {
        System.err.println("The area is "+length*breadth);
    }
    public static void main(String[] args) {
        a a1=new a();
        a1.getdata();
        a1.area();
    }
}