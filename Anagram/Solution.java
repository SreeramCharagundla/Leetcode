package Anagram;

public class Solution {
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";

        System.out.println(isAnagram(s, t));
    }

    private static Boolean isAnagram(String s, String t) {

        int[] word = new int[26];
        for (char c : s.toCharArray()) {
            int v = c - 'a';
            word[v]++;
        }
        for (char c : t.toCharArray()) {
            int v = c - 'a';
            word[v]--;
        }
        for (int i : word) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
