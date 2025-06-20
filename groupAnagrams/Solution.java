package groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> ans = groupAnagrams(strs);
        System.err.println(ans);
    }

    public static List<List<String>> groupAnagrams(String[] strs){

        Map<String, List<String>> res = new HashMap<>();
        
        for(String s:strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
