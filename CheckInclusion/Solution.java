package CheckInclusion;

public class Solution {
    public static void main(String[] args) {
        String s1="abc";
        String s2="bbbca";
        boolean isPossible = checkInclusion(s1,s2);
        System.out.println(isPossible);
    }

    public static boolean checkInclusion(String s1, String s2){
        if(s1.length()>s2.length()){
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i=0;i<s1.length();i++){
            s1Count[s1.charAt(i)-'a']++;
            s2Count[s2.charAt(i)-'a']++;
        }

        int matches = 0;
        for(int i=0;i<26;i++){
            if(s1Count[i]==s2Count[i]) matches++;
        }
        System.out.println("initial matches = "+matches);

        int l=0;
        for(int r=s1.length();r<s2.length();r++){
            System.out.println("r="+r);
            if(matches==26){
                return true;
            }

            int index = s2.charAt(r)-'a';
            s2Count[index]++;

            if(s1Count[index]==s2Count[index]) matches++;
            else if(s1Count[index]+1 == s2Count[index]) matches--;

            index = s2.charAt(l)-'a';
            s2Count[index]--;

            if(s1Count[index]==s2Count[index]) matches++;
            else if(s1Count[index]-1 == s2Count[index]) matches--;

            l++;
        }


        return matches==26;
    }
}
