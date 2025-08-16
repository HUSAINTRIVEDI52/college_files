import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Long> l1 = new LinkedList<Long>();
        l1.add(1L);
        l1.add(2L);
        l1.add(4L);
        l1.add(6L);
        for (Long l : l1) {
            System.out.println(l);
        }
        System.out.println("----------------------------------");

        System.out.println("First ELement:" + l1.peek());
        System.out.println("--------------------------------");
        System.out.println("The first element is " + l1.peek());
        System.out.println("Remove first element " + l1.poll());
        System.out.println("-------------------------------------");
        System.out.println(l1);

    }
}
