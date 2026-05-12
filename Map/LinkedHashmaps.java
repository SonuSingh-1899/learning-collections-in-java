package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>(16, 0.75f,true);
        linkedhashmap.put("Sonu", 19);
        linkedhashmap.put("sakshi", 20);
        linkedhashmap.put("monu", 18);
        linkedhashmap.put("shubham", 28);
        linkedhashmap.put("anita", 38);
        linkedhashmap.get("monu");
        linkedhashmap.putIfAbsent("vishal", 29);
        for(Map.Entry<String, Integer> entery : linkedhashmap.entrySet()){
            System.out.println(entery.getKey() + " : " + entery.getValue());
        }
        System.out.println();









        // HashMap<String, Integer> hashmap = new HashMap<>();
        // hashmap.put("Sonu", 19);
        // hashmap.put("sakshi", 20);
        // hashmap.put("monu", 18);
        // hashmap.put("shubham", 28);
        // hashmap.put("anita", 38);
        // for(Map.Entry<String, Integer> entery : hashmap.entrySet()){
        //     System.out.println(entery.getKey() + " : " + entery.getValue());
        // }
        



        // about linked hashmap
        // LinkedHashMap is a class in the Java Collections Framework that stores data in key-value pairs and provides fast access like a HashMap, but its special feature is that it maintains the order of elements. Internally, it uses a combination of a Hash Table and a Doubly Linked List, which allows it to preserve either insertion order or access order. If the accessOrder parameter is set to false, elements remain in the order they were inserted, while setting it to true moves recently accessed elements to the end. LinkedHashMap allows one null key and multiple null values, does not allow duplicate keys, and provides an average time complexity of O(1) for put(), get(), and remove() operations. It is commonly used in applications such as LRU Cache, browser history, recently viewed items, and systems where maintaining order is important.
    }
}
