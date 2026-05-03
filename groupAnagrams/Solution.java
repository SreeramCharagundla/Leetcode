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

        HashMap<String, List<String>> mapOfAnagrams = new HashMap<>();

        for (String s : strs) {
            int[] freqKey = new int[26];

            for (char c : s.toCharArray()) {
                freqKey[c - 'a']++;
            }
            String key = Arrays.toString(freqKey);
            System.out.println(key + " ");
            mapOfAnagrams.putIfAbsent(key, new ArrayList<>());
            mapOfAnagrams.get(key).add(s);
        }

        return new ArrayList<>(mapOfAnagrams.values());
    }
}
