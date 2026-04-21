package dsa.Array;

public class Checkifsorted {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8};
        int arr[] = {8,7,6,5,4,3,2,1};
        int n= arr.length;
        for(int i=1;i<=n;i++){
            if (arr[i] > arr[i-1]) {
                System.out.println("sorted in decending");
                break;
            } else if (arr[i] < arr[i-1]) {
                System.out.println("sorted in assending");
                break;
            }
        }
    }
}
