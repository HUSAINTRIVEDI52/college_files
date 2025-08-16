
import java.util.*;

public class hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hh = new HashMap<String, Integer>();
        hh.put("Husain", 77);
        hh.put("Trivedi", 89);
        hh.put("Raj", 44);
        hh.put(null, null);
        hh.put("Prince", 789);
        hh.put(null, 989);
        hh.put("Lomdi", null);
        System.out.println(hh);

        for (Map.Entry b : hh.entrySet()) {

            
            System.out.println(b.getKey() + " " + b.getValue());
        }
    }
}
