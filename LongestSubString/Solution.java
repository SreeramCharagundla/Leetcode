package LongestSubString;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "aabccabd";
        System.out.println("Im here");
        int ans = LongestSubString(s);
        }
        
            private static int LongestSubString(String s) {
                int l=0;
                int ans=0;
                Set<Character> charSet = new HashSet<>();
                for(int r=0;r<s.length();r++){
                    while(charSet.contains(s.charAt(r))){
                        charSet.remove(s.charAt(l));
                        l++;
                    }
                    charSet.add(s.charAt(r));
                    ans=Math.max(ans,r-l+1);
                }
                return ans;
            }
}
