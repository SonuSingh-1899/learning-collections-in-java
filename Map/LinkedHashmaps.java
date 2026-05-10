package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>();
        linkedhashmap.put("Sonu", 19);
        linkedhashmap.put("sakshi", 20);
        linkedhashmap.put("monu", 18);
        linkedhashmap.put("shubham", 28);
        linkedhashmap.put("anita", 38);
        for(Map.Entry<String, Integer> entery : linkedhashmap.entrySet()){
            System.out.println(entery.getKey() + " : " + entery.getValue());
        }
        System.out.println();
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Sonu", 19);
        hashmap.put("sakshi", 20);
        hashmap.put("monu", 18);
        hashmap.put("shubham", 28);
        hashmap.put("anita", 38);
        for(Map.Entry<String, Integer> entery : hashmap.entrySet()){
            System.out.println(entery.getKey() + " : " + entery.getValue());
        }
        
    }
}
