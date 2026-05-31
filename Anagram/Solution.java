package Anagram;

public class Solution {
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";

        System.out.println(isAnagram(s, t));
    }

    private static Boolean isAnagram(String s, String t) {

        int[] word = new int[26];
        for (char c : s.toCharArray()) {
            word[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            word[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (word[i] != 0)
                return false;
        }
        return true;
    }
}
