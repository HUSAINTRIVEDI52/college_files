 package MyPackage;

// Create a package named MyPackage which consists a class named Student which
// stores information like the roll number, first name, middle name, last name, address
// and age of the student. The class should also contain appropriate get and set methods.




public class Student
{
    private int rollno;
    private String fname;
    private String mname;
    private String lname;
    private String Address;
    private int age;

    public Student(int rollno,String fname,String mname,String lname,String Address,int age)
    {
        this.rollno=rollno;
        this.fname=fname;
        this.mname=mname;
        this.lname=lname;
        this.Address=Address;
        this.age=age;
    }
    int getrollno()
    {
        return rollno;
    }
    void setrollno(int rollno)
    {
        this.rollno=rollno;
    }
    String getfname()
    {
        return fname;
    }
    void getfname(String fname)
    {
        this.fname=fname;
    }
    String getmname()
    {
        return mname;
    }
    void setmname(String mname)
    {
        this.mname=mname;
    }
    String getlname()
    {
        return lname;
    }
    void setlname(String lname)
    {
        this.lname=lname;
    }
    String getaddress()
    {
        return Address;
    }
    void setAddress(String Address)
    {
        this.Address=Address;
    }
    int getage()
    {
        return age;
    }
    void setage(int age)
    {
        this.age=age;
    }
     public void displayinfo()
    {
        System.out.println("The name of the Student is "+fname+" "+mname+" "+lname);
        System.out.println("The Address of the student is "+Address);
        System.out.println("The Roll no of the student is "+rollno);
        System.out.println("The age of the student is "+age);
    }
    
}