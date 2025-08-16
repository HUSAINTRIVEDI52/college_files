// 4. Write a Java program to create a class called Product. Each product has a  name, a 
// product code, and manufacturer name. Define variables, methods, and construcotr for
// the product class. Write a class called b with the main method to test the 
// methods and constructors of the Product class

import java.util.*;



class product{
    private String name;
    private int Pcode;
    private String manname;


    product(String name,int Pcode,String manname)
    {
        this.name=name;
        this.Pcode=Pcode;
        this.manname=manname;
    }
    void getdetails()
    {
        // System.out.println("Enter the name of the product:");
        // Scanner sc=new Scanner(System.in);
        // name=sc.nextLine();
        // System.out.println("Enter the Product Code"+Pcode);
        // Pcode=sc.nextInt();
        // System.out.println("Enter the manufacturer name:");
        // manname=sc.nextLine();
    }
    void display()
    {
        System.out.println("\nThe name of the products is"+name);
        System.out.println("\nThe Code of the product is"+Pcode);
        System.out.println("\nThe name of the manufacturer is "+manname);
    }
}
public class b {
    public static void main(String[] args) {
        product p1=new product("Name",20,"Husain");
        p1.getdetails();
        p1.display();
    }
    
}
