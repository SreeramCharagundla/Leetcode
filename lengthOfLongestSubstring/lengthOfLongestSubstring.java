package lengthOfLongestSubstring;

import java.util.*;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = LongestSubstring(s);
        System.out.println(ans);
    }

    private static int LongestSubstring(String s) {

        if (s.length() <= 1)
            return s.length();

        Map<Character, Integer> countMap = new HashMap<>();
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            countMap.put(rightChar, countMap.getOrDefault(rightChar, 0) + 1);

            while (countMap.get(rightChar) > 1) {
                char leftChar = s.charAt(left);
                countMap.put(leftChar, countMap.get(leftChar) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);

        }
        return result;
    }
}
