// Create a package named MyPackage which consists a class named Student which
// stores information like the roll number, first name, middle name, last name, address
// and age of the student. The class should also contain appropriate get and set methods.

import MyPackage.*;
public class Studen
{
    public static void main(String[] args) {
        
        Student s1=new Student(20,"Trivedi","Husain","M","Ahmedabad",20);
        s1.displayinfo();
    }
}
