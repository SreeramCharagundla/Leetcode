package Sample;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String s = "aabbccc";
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {

            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        String result = "";

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            result = result + entry.getKey() + entry.getValue();
        }

        System.out.println(result);
    }
}
