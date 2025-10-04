package isAnagram;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        Boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        else{
            int[] charFreq = new int[26];
            char[] c1 = s.toCharArray();
            char[] c2 = t.toCharArray();
            for(int i=0;i<s.length();i++){
                int a = c1[i]-'a';
                int b = c2[i]-'a';

                charFreq[a] += 1;
                charFreq[b] -= 1; 
            }

            for(int c: charFreq){
                if(c!=0){return false;}
            }
            return true;
        }
        
    }
}
