public class Solution {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int ans = characterReplacement(s,k);
        System.out.println(ans);
    }

    private static int characterReplacement(String s, int k) {

        int start = 0; 
        int[] frequencyMap = new int[26];
        int maxFrequency = 0;
        int longestSubstringLength = 0;

        for(int end = 0; end<s.length();end++){
            
            int currentChar = s.charAt(end)-'A';
            frequencyMap[currentChar] += 1;

            maxFrequency = Math.max(frequencyMap[currentChar],maxFrequency);
            
            Boolean isValid = (end+1-start-maxFrequency<=k);

            if(!isValid){

                int outgoingChar = s.charAt(start) - 'A';

                frequencyMap[outgoingChar] -= 1;

                start +=1;

            }

            longestSubstringLength = end + 1 - start;

        }

        return longestSubstringLength;
    }
}
