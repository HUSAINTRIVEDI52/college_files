import java.util.*;

public class hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(101, "Abc");
        ht.put(102, "def");
        ht.put(103, "ghi");
        ht.put(104, "jkl");
        ht.put(105, "mno");
        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(ht);
    }    
}
