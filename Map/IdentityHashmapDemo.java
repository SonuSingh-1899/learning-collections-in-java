package Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashmapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String,Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);



        // about 
        // HashMap compares keys based on their content using equals() and hashCode(). If two objects contain the same data, HashMap treats them as the same key. On the other hand, IdentityHashMap compares keys using the == operator, which checks whether both references point to the exact same object in memory. So even if two objects contain the same data, IdentityHashMap treats them as different keys if they are different objects. In simple words, HashMap checks “same data,” while IdentityHashMap checks “same object/reference.”
    }
}
