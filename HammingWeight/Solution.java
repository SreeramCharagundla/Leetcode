package HammingWeight;

public class Solution {
    public static void main(String[] args) {
        int n = 127;
        int ans = hammingWeight(n);
        System.out.println("number of set bits = "+ans);
    }

    private static int hammingWeight(int n) {
        
        int sum = 0;
        while(n!=0){
            sum+=1;
            n&=(n-1);
        }
        return sum;
    }
}
