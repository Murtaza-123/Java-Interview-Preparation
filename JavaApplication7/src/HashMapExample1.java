
import java.util.*;

public class HashMapExample1 {

    public static void main(String args[]) {
        Map<String, String> map = new HashMap<String, String>();//Creating HashMap    
        map.put("a", "dog");  //Put elements in Map  
        map.put("b", "cat");
        map.put("a", "cat");
        map.put("b", "dog");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
