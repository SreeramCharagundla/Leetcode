public class Solution {
    public static void main(String[] args) {
        int[] digits = {1,2,3,4};
        int[] answer = plusOne(digits);
        
        for(int i:answer)
            System.out.println(i);
    }

    public static int[] plusOne(int[] digits){

        int n = digits.length;

        for(int i=n-1;i>=0;--i){

            if(digits[i]==9) digits[i] = 0;
            else{
                digits[i]++;
                return digits;
            }

        }

        digits = new int[n+1];
        digits[0]=1;
        return digits;
        
    }
}
