import java.util.*;

public class hashmapp {
    public static void main(String[] args) {
        HashMap<String, String> hh = new HashMap<String, String>();
        hh.put("Husain", "Trivedi");
        hh.put("Raj", "Patel");
        hh.put("Patel", "Riya");
        hh.put("Lomdi", "Harsh");
        System.out.println(hh);
        HashMap<String, String> hhh = new HashMap<String, String>();
        hhh.putAll(hh);
        System.out.println(hh.put("Raj", "Lomdi"));
        System.out.println(hh);
        System.out.println("Key in Map");
        for (String s : hh.values()) {
            System.out.println(s);
        }
        System.out.println("Value associated with Raj: " + hh.get("Raj"));
        System.out.println("THe size of the hashmap is " + hh.size());
        System.out.println("Remove Raj" + hh.remove("Raj"));
        System.out.println(hh);

    }
}