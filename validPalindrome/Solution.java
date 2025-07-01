package validPalindrome;

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrime(s);
        System.out.println(ans);
    }

    private static boolean isPalindrime(String s) {
        
        for(int i=0,j=s.length()-1; i<j;i++,j--){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
