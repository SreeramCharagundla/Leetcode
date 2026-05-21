package characterReplacement;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int ans = characterReplacement(s, k);
        System.out.println(ans);
    }

    private static int characterReplacement(String s, int k) {

        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;

        int l = 0, maxf = 0;
        for (int r = 0; r < s.length(); r++) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, count.get(r));

            while ((r - l + 1) - maxf > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
