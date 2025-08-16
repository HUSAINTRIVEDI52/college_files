import java.util.*;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<Long> l1 = new LinkedList<Long>();
        l1.add(new Long(80));
        l1.add(new Long(70));
        l1.add(new Long(60));
        l1.add(new Long(50));
        l1.add(new Long(40));
        l1.add(new Long(30));
        l1.add(new Long(20));


        for (Long b : l1) {
            System.out.println(b);
        }
        System.out.println("-------------------------------------------");
        System.out.println("The first element is " + l1.peek());
        System.out.println("Remove first element"+l1.pop());
        System.out.println(l1);
    }
}
