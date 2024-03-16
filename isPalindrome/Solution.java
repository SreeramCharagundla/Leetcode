package isPalindrome;

public class Solution {
    public static void main(String[] args) {
        String s = "race a car";
        boolean isItAPalindrome = isPalindrome(s);
        System.out.println(isItAPalindrome);
    }

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        String reverse="";
        char[] rev = s.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
            reverse = reverse + rev[i];
        System.out.println(reverse);
        return s.equalsIgnoreCase(reverse)?true:false;
    }
}
