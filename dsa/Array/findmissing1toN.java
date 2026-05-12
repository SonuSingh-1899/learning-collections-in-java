package dsa.Array;

public class findmissing1toN {

    // finding missing number from 1 to n number of array
    public static void main(String[] args) {
        int arr[] =  {1,2,4,5};
        int n = 5;
        // first calculate total some 
        int total = n*(n+1)/2;
        int actualsum = 0;

        // then calculate actual some of array
        for(int i = 0; i < arr.length; i++ ){
            actualsum += arr[i];
        }

        // find result 
        int result = total - actualsum;
        System.out.println(result);
        
    }
}
