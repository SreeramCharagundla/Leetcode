import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        int ans = minEatingSpeed(piles, h);
        System.out.println(ans);
    }

    static int minEatingSpeed(int[] piles, int h){
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while(l<=r){
            int k=(l+r)/2;
            int totalTime = 0;

            for(int p:piles){
                totalTime += Math.ceil((double) p/k);
            }

            if(totalTime<=h){
                res = r;
                r=k-1;
            }else{
                l=k+1;
            }
        }
        return res;
    }
}
