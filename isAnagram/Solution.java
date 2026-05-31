public class Solution {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";

        Boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }

    static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] charCounts = new int[26];

        for (char ch : s.toCharArray()) {
            charCounts[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            charCounts[ch - 'a']++;
        }

        for (int count : charCounts) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
