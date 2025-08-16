/* This programme shows the creation of List interface object using various subclass of it
It demostrate the add(), addAll(), remove(), set() methods of the list interface.
*/ 


import java.util.*;
public class ListDemo
{
    public static void main (String[] args)
    {
        // Let us create a list
        List l1 = new ArrayList();
        l1.add(0, "vidhi"); 
        l1.add(1, 22); 
        System.out.println(l1);  

        // Let us create another list
        List l2 = new ArrayList();
        l2.add(15);
        l2.add(63);
        l2.add(37);
	System.out.println(l2); 

        // will add list l2 from 1 index
        l1.addAll(1, l2); 
        System.out.println(l1); 
 
        l1.remove(1);     // remove element from index 1
        System.out.println(l1); //
 
        // prints element at index 3
        System.out.println(l1.get(3));
 
        l1.set(0, 5);   // replace 0th element with 5
        System.out.println(l1);  // [5, 2, 3, 2]
    }
}







