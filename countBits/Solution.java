package countBits;

class Solution {
    public static void main(String[] args) {
        int n = 4;
        int[] ans = countbits(n);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    private static int[] countbits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            int num = i;
            int count = 0;
            while (num > 0) {
                count++;
                num &= (num - 1);
            }
            ans[i] = count;
        }
        return ans;
    }
}