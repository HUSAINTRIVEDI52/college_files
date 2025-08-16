// Describe abstract class called Shape which has three subclasses say Triangle,
// Rectangle, Circle. Define one method area() in the abstract class and override this
// area() in these three subclasses to calculate for specific object i.e. area() of Triangle
// subclass should calculate area of triangle etc. Same for Rectangle and Circl
 abstract class shappe
{ 
    abstract double  area();
}
class triangle extends shappe{
 private int len,bdth;
 triangle(int len,int bdth)
 {
    this.len=len;
    this.bdth=bdth;
 }
    double area()
 {
    return 0.5*(len*bdth);
 }
}
class rectangle extends shappe
{
    private int len,bdth;
     rectangle(int len,int bdth)
     {
        this.len=len;
        this.bdth=bdth;
     }
     double area()
     {
        return len*bdth;
     }

}
class circle extends shappe{
private int r;
circle(int r)
{
    this.r=r;
}
double area()
{
    return 2*3.14*r;
}
}

public class m
{
   public static void main(String[] args)
   {
      triangle t1=new triangle(39,98);
      System.out.println("The area of the triangle is" +t1.area());
      circle c1=new circle(87);
      System.out.println("The area of the circle is" +c1.area());
      rectangle r1=new rectangle(39,88);
      System.out.println("The area of the rectangle is" +r1.area());



   }
}
