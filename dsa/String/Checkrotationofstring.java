package dsa.String;

public class Checkrotationofstring {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "defabc";
        if (s1.length() != s2.length()) {
            System.out.println("s2 is not rotation of s1");
        }else {
            String sr = s1+s1;
            System.out.println(sr);
            if (sr.contains(s2)) {
                System.out.println("s2 is rotation of s1");
            }else {
                System.out.println("s2 is not rotation of s1");
            }
        }
    }
}
