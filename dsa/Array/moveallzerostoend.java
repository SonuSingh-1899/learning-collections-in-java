package dsa.Array;

import java.util.Arrays;

public class moveallzerostoend {
    // this is how to move all zeros to right side using 2 pointer aproach
    public static void main(String[] args) {
        int arr[] = {1,2,0,3,0,4,5,0,6};
        int n = arr.length;
        int j = 0;
        for(int i=0;i<n;i++ ){
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
