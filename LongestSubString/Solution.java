package LongestSubString;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "xyzxyzx";        
        int ans = LongestSubString(s);
        System.out.println("Ans = "+ans);        
        }
        
            private static int LongestSubString(String s) {
                int l=0;
                int ans=0;
                Set<Character> charSet = new HashSet<>();
                for(int r=0;r<s.length();r++){
                    System.out.println("==========Loop r = "+r+"===========");
                    while(charSet.contains(s.charAt(r))){
                        System.out.println("inside while");
                        System.out.println("removed "+s.charAt(l));
                        charSet.remove(s.charAt(l));
                        System.out.println("set now after removal");
                        for(char c:charSet)System.out.print(c+" ");
                        System.out.println();                            
                        l++;
                        System.out.println("updated l = "+l);
                    }
                    System.out.println("adding char "+s.charAt(r)+" to the set");
                    charSet.add(s.charAt(r));
                    ans=Math.max(ans,r-l+1);
                    System.out.println("Summary of the loop l = "+l+" r = "+r+" ans = "+ans+" charset = ");
                    for(char c:charSet)System.out.print(c+" ");
                    System.out.println();
                }
                return ans;
            }
}
