package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


// this is how to use comparator :::


// class comp implements Comparator<Integer> {

//     @Override
//     public int compare(Integer A, Integer B) {
//         return B - A;
//     }
   
// }

// class Stringlengthcompatrator implements Comparator<String> {

//     @Override
//     public int compare(String o1, String o2) {
//         return o1.length() - o2.length();
//     }
    
// }

public class Comparators {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(null);
        System.out.println(list);
        // list.sort( new comp());
        list.sort((a,b) -> b - a);
        System.out.println(list);





        List<String> words = Arrays.asList("banana", "apple", "date");
        System.out.println(words);
        // words.sort(new Stringlengthcompatrator());
        words.sort((a,b) -> a.length() - b.length());
        System.out.println(words);

        
    }
}
