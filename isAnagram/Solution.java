package isAnagram;

public class Solution {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        Boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    static boolean isAnagram(String s, String t){

        if(s.length()!=t.length()) return false;
        int[] charArr = new int[26];
        for(int i=0;i<s.length();i++){
            charArr[s.charAt(i)-'a']++;
            charArr[t.charAt(i)-'a']--;
        }

        for(int a: charArr){
            if(a!=0) return false;
        }

        return true;
    }
}
