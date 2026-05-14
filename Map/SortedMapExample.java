package Map;

import java.util.SortedMap;
import java.util.TreeMap;

// SortedMap keys ko automatically sorted order me store karta hai

public class SortedMapExample {

    public static void main(String[] args) {

        // TreeMap SortedMap interface implement karta hai
        SortedMap<Integer, String> students = new TreeMap<>();


        students.put(103, "Sonu");
        students.put(101, "Rahul");
        students.put(105, "Aman");
        students.put(102, "Vikas");


        // keys ascending order me print hongi
        System.out.println(students);


        // first key
        System.out.println("First Key : " + students.firstKey());

        // last key
        System.out.println("Last Key : " + students.lastKey());


        // key se pehle wale elements
        System.out.println("HeadMap : " + students.headMap(103));

        // key ke baad wale elements
        System.out.println("TailMap : " + students.tailMap(103));


        // range ke elements
        System.out.println("SubMap : " + students.subMap(101, 105));
    }
}