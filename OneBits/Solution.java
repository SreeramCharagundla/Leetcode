public class Solution {
    public static void main(String[] args) {
        int n = 00000000000000000000000000010111;
        int ans = oneBits(n);
        System.out.println(ans);
    }

    private static int oneBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
