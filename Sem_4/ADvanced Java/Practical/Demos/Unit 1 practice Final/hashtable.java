import java.util.*;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<String,Double> ht = new Hashtable<String,Double>();

        double bal;
        ht.put("Zahra", new Double(150.10));
        ht.put("Aadam", new Double(40.54));
        ht.put("langdi", new Double(500.65));
        ht.put("Kanjab", new Double(55.33));
        ht.put("joker", new Double(777.65));

        System.out.println(ht);

        bal = ((Double) ht.get("Zahra")).doubleValue();
        ht.put("Zahra", new Double(bal + 1000));
        System.out.println("Zahra's new balance= " + ht.get("Zahra"));
    }
}
