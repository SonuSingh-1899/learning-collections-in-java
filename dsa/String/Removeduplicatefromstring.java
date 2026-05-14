package dsa.String;

public class Removeduplicatefromstring {
    public static void main(String[] args) {
        String str = "aabbccdef";
        char arr[] = str.toCharArray();
        System.out.println(arr);
        String result = "";
        for(int i=0 ; i<arr.length;i++){

            boolean isduplicate = false;
            for(int j = 0; j<i;j++){
                if (arr[i] == arr[j]) {
                 isduplicate = true;
                 break;
                }
            }
            if (!isduplicate) {
                result += arr[i];
            }
        }
        System.out.println(result);
    }
}
