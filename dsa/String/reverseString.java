package dsa.String;

public class reverseString {
    public static void main(String[] args) {
        String a = "Hellow";
        char arr[] = a.toCharArray();
        int n = a.length();
        for(int i=0;i<n/2;i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println(new String(arr));
    }
}
