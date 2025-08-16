import java.util.*;
public class ListDemo3
{
    public static void main (String[] args)
    {
        // Type safe array list, stores only string
        List<String> l = new ArrayList<String>(5);
 
        l.add("java"); //0
        l.add("Practice"); //1
        l.add("javaquiz"); //2
        l.add("IDE"); //3
        l.add("Courses"); //4
 
        List<String> range = new ArrayList<String>();
 
        // return List between 2nd(including)
        // and 4th element(excluding)
        range = l.subList(2, 4);
 
        System.out.println(range);  // [javaquiz, IDE]
    }
}






