package List;

import java.util.Vector;

public abstract class Vectors {
    public static void main(String[] args) {

        // how to create vector and we can print initial capacity only on vector 
        Vector<Integer> nums = new Vector<>(3,4);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        int cap =  nums.capacity();
        System.out.println(cap);
    }
}
