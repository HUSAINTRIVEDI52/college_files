// 3) Prepare String ArrayList of size 5 and use add, indexof, lastindexof methods.
-> import java.util.*;
public class demo5 {
public static void main(String[] args)
{
ArrayList<String> list = new ArrayList<String>();
list.add("Java");
list.add("DBMS");
list.add("XML");
list.add("LSS");
list.add("C++");
System.out.println("Arraylist:" +list);
System.out.println("Index of DBMS:" +list.indexOf("DBMS"));
System.out.println("Last Index of:" +list.lastIndexOf("LSS"));
}
}