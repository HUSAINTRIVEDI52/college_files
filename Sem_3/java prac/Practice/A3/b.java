// Write a Java program to create a class known as b with methods called
// getFirstName() and getLastName(). Create a subclass called Employee that adds a
// new method named getEmployeeId() and overrides the getLastName() method to
// include the employee's job title. (Value Should be taken from User).
import java.util.*;

public class b  {
    private String fname;
    private String lname;

    String getFirstname()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name:");
        fname=sc.nextLine();
        return fname;
    }
    public String getLastName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last name:");
        lname=sc.nextLine();
        return lname;
    }
    public static void main(String[] args) {
        b b1=new b();
        employee e1=new employee();
        String aa=b1.getFirstname();
        String ab=b1.getLastName();
        int ac=e1.getemployeeid();
        System.out.println("The First name of the employee is"+aa);
        System.out.println("The last name of the employee is"+ab);
        System.out.println("The Employee id is"+ac);
        // System.out.println("THe job title of the employee is"+e1.getLastName());
    }
    
}

class employee extends b{

    private int eID;
    private int jobtitle;
    public
    int getemployeeid()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee id");
        eID=sc.nextInt();
        return eID;
    }
    public String getLastName()
    {
        System.out.println("Enter employee job title");
        Scanner sc =new Scanner(System.in);
        jobtitle=sc.nextInt();
        b b1=new b();
         return b1.getLastName()+"job title is:"+jobtitle;
    }
}
