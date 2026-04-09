package dsa.practice;

public class findlargestnumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,4,3,2};

        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum value is " + max);
    }
}
