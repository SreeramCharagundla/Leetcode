public class Solution {
    public static void main(String[] args) {
        int valOne = 654, valTwo = 344, calcResult = 898;

        String ans = compute(valOne, valTwo, calcResult);

        System.out.println(ans);
    }

    public static String compute(int a, int b, int c) {

        int i = 0;
        while (a > 0 || b > 0 || c > 0) {
            int a1 = a % 10;
            int b1 = b % 10;
            int c1 = c % 10;

            if (a1 + b1 != c1) {
                return String.valueOf(i);
            }

            a /= 10;
            b /= 10;
            c /= 10;
            i++;
        }
        return "ok";
    }
}
