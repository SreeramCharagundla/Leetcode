package groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        List<List<String>> ans = groupAnagrams(strs);
        System.err.println(ans);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> grouped = new HashMap<>();

        for (String s : strs) {

            int[] chars = new int[26];

            for (char c : s.toCharArray()) {
                chars[c - 'a']++;
            }

            String key = Arrays.toString(chars);

            if (!grouped.containsKey(key))
                grouped.put(key, new ArrayList<>());

            grouped.get(key).add(s);

        }

        return new ArrayList<>(grouped.values());
    }
}
