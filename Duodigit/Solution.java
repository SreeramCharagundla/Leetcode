public class Solution {
    public static void main(String[] args) {
        int a = 100;
        char c = duoDigit(a);
        System.out.println("is a duodigit? " + c);
    }

    public static char duoDigit(int a) {

        if (a == 0) {
            return 'y';
        }

        boolean[] seen = new boolean[10];
        int distinct = 0;

        while (a > 0) {
            int digit = a % 10;
            if (!seen[digit]) {
                seen[digit] = true;
                distinct++;

                if (distinct > 2) {
                    return 'n';
                }
            }
            a /= 10;
        }
        return 'y';
    }
}
