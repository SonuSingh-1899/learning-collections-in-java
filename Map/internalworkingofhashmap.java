package Map;

import java.util.HashMap;

public class internalworkingofhashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> fruits = new HashMap<>();
        fruits.put("Apple", 50);
        fruits.put("Banana", 30);
        fruits.put("Graps", 20);
        fruits.put("Orange", 80);
        System.out.println(fruits);
    }
}
