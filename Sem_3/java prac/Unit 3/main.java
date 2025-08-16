// Write a Java program to create a class known as Person with methods called
// getFirstName() and getLastName(). Create a subclass called Employee that adds a
// new method named getEmployeeId() and overrides the getLastName() method to
// include the employee's job title. (Value Should be taken from User).
import java.util.*;
class person
{
    private String firstname;
    private String lastname;

   public person(String firstname,String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }

    String  getfirstname()
    { 
          return firstname;
    }
    String getlastname()
    {
        return lastname;
    }
}
class employee extends person
{
    private int employeeid;
    private String jobtitle;
    public employee(String firstname,String lastname,String jobtitle,int employeeid)
    {
        super(firstname,lastname);
        this.jobtitle=jobtitle;
        this.employeeid=employeeid;
    }
    int getemployeeid()
    { 
        return employeeid;
    }
    String jobtitle()
    {
        return jobtitle;
    }
}

public class main
{
    public static void main(String[] args)
    {
        String jtitle,fname,lname;
        int eid;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name");
        fname=sc.nextLine();
        System.out.println("Enter your last name");
        lname=sc.nextLine();
        System.out.println("Enter your job Title");
        jtitle=sc.nextLine();
        System.out.println("Enter your employee id");
        eid=sc.nextInt();
        employee e1=new employee(fname,lname,jtitle,eid);
        System.out.println("The name of the employee is "+e1.getfirstname()+" "+e1.getlastname());
        System.out.println("The job title of the employee is "+e1.jobtitle());
        System.out.println("The employee id of the employee is "+e1.getemployeeid());


    }
}

