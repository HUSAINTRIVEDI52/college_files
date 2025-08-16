/* This programme shows the creation of List interface object using ArrayList class.
It demostrate indexOf(), lastIndexOf() methods of the list interface.
*/ 
import java.util.*;
 
public class ListDemo2
{
    public static void main(String[] args)
    {
        // type safe array list, stores only string
        List<String> l = new ArrayList<String>(5);
        l.add("gls"); //0
        l.add("for"); //1
        l.add("gls"); //2
	
 
        // Using indexOf() and lastIndexOf()
        System.out.println("first index of gls:" +l.indexOf("gls")); //0
        System.out.println("last index of gls:" +l.lastIndexOf("gls")); //2
        System.out.println("Index of element not present : " +l.indexOf("Hello"));
    }
}








