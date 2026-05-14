package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


// Comparator ka use custom sorting ke liye hota hai


// Descending order comparator
class comp implements Comparator<Integer> {

    @Override
    public int compare(Integer A, Integer B) {

        // B - A => descending sorting
        return B - A;
    }

}


// String length comparator
class Stringlengthcompatrator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        // choti length wali string pehle aayegi
        return o1.length() - o2.length();
    }

}

public class Comparators {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(3);


        // default ascending sorting
        list.sort(null);

        System.out.println(list);


        // custom descending sorting
        list.sort(new comp());

        // lambda version
        list.sort((a,b) -> b - a);

        System.out.println(list);



        List<String> words =
                Arrays.asList("banana", "apple", "date");

        System.out.println(words);


        // sort by string length
        words.sort(new Stringlengthcompatrator());

        // lambda version
        words.sort((a,b) -> a.length() - b.length());

        System.out.println(words);



        /*
         compare() rules:

         negative -> first object pehle
         positive -> second object pehle
         zero     -> equal
         */

    }
}