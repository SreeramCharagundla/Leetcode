public class Solution {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int depth = MaxDepth(s);
        System.out.println(depth);
    }

    private static int MaxDepth(String s) {
        int maxDepth = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            maxDepth = Math.max(maxDepth, count);
        }
        return maxDepth;
    }
}
