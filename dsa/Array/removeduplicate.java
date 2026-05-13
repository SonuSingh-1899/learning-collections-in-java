package dsa.Array;

public class removeduplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,3,1,5,6,7,8};

        for(int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for(int j = 0; j < i; j++) {

                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        
    }
}
