package lengthOfLongestSubstring;

import java.util.*;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    private static int lengthOfLongestSubstring(String s) {
        
        Set<Character> charSet = new HashSet<>();
        for(char c: s.toCharArray()){
            charSet.add(c);
        }

        if(s.length()==charSet.size()) return s.length();
        else if (charSet.size()==1) return 1;

        Map<Character, Integer> chars = new HashMap<>();
        int right = 0;
        int left = 0;

        int res = 0;

        while(right<s.length()){
            char r = s.charAt(right);
            chars.put(r,chars.getOrDefault(r, 0)+1);

            while(chars.get(r)>1){
                char l = s.charAt(left);
                chars.put(l,chars.get(l)-1);
                left++;
            }

            res = Math.max(res,right-left+1);
            right++;
        }

        return res;
    }
}
