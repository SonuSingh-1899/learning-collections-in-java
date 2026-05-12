package dsa.Array;

import java.util.HashSet;

public class findduplicate {
    // this is how to find duplicate from an array using hashset
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,3,1,5,6,7,8};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length;i++){
            if (set.contains(arr[i])) {
                System.out.println("this is duplicate value : "+arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
    }
}
