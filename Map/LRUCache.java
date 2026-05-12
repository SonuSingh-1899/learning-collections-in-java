package Map;

import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f,true);
        this.capacity = capacity;
    }

    
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size() > capacity;
    }


    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("bob",99);
        studentMap.put("alice",89);
        studentMap.put("ram",91);
        studentMap.get("bob"); 
        studentMap.put("vipul",91);
        System.out.println(studentMap);
    }



    // about it :

    // This code teaches how to create a simple LRU Cache in Java using LinkedHashMap. When the cache becomes full, the least recently used item is removed automatically. In this example, "alice" is removed because "bob" was recently accessed using get("bob").


    
}
