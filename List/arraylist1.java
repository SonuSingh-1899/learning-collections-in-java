package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist1 {
    public static void main(String[] args) {

        // ways to create arraylist
        // 1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(list);

        // 2
        ArrayList<String> list2 = new ArrayList<>(List.of("sonu","vishal","rahul"));
        System.out.println(list2);


        // 3
        List<String> list3 = Arrays.asList("sonu","monu","monuuuuu");
        System.out.println(list3);
    }
}
