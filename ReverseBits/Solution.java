package ReverseBits;

public class Solution {
    public static void main(String[] args) {
        int n = 00000000000000000000000000010101;
        int reverse = reverseBits(n);
        System.out.println(reverse);
        System.out.println(Integer.toBinaryString(reverse));
    }

    private static int reverseBits(int n) {

        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            res += (bit << (31 - i));
        }
        return res;
    }
}
