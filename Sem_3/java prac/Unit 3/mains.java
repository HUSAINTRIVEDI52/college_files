// Write a program in Java in which a subclass constructor invokes the constructor of the
// super class and instantiate the value
class one
{
    private String firstname;
    private String lastname;

    one(String firstname,String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }
    void display()
    {
        System.out.println("The Firstname is "+firstname);
        System.out.println("The lastname is "+lastname);
    }
}
class two extends one{
    private int number;
    private String gender;
    public two(String firstname,String lastname,int number,String gender)
    {
        super(firstname,lastname);
        this.number=number;
        this.gender=gender;
    }
    void display()
    {
        // display();
        System.out.println("The number is "+number);
        System.out.println("The gender is"+gender);
    }
}
public class mains
{
    public static void main(String[] args)
    {
      two t1=new two("Husain","Trivedi",87,"Male");
      t1.display();
    }
}