import java.util.*;



public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("H");
        lhs.add("B");
        lhs.add(null);
        lhs.add("Q");
        lhs.add("N");
        lhs.add("J");
        lhs.add("O");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println("THe size of the linkedhashset is "+lhs.size());
        System.out.println("Remove:"+lhs.remove(null));
        System.out.println("----");
        System.out.println(lhs);
        System.out.println("Contains: "+lhs.contains("B"));

    }
}
