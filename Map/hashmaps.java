package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashmaps {

    // this is how hashmap impliments
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "sonu");
        map.put(2, "shubham");
        map.put(3, "jony");
        map.put(4, "vikas");
        // System.out.println(map);
        // System.out.println(map.containsKey(4));
        // System.out.println(map.get(3));
        // System.out.println(map.isEmpty());
        // System.out.println(map.put(5, "vishal"));
        // System.out.println(map);
        // System.out.println(map.remove(2));
        // System.out.println(map);
        // System.out.println(map.replace(3, "mataji"));
        // System.out.println(map);
        // System.out.println(map.size());
        // System.out.println();
        // Set<Integer> keys = map.keySet();
        for(int i: map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> enteries = map.entrySet();
        for(Map.Entry<Integer, String> entery : enteries){
            System.out.println(entery.getKey() + " : " + entery.getValue().toUpperCase());
        }
        
    }
}
