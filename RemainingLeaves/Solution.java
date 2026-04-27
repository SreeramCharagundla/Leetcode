public class Solution {
    // int width, int height, int[][] leaves, String winds
    public static void main(String[] args) {
        int width = 5;
        int height = 4;

        int[][] leaves = {
                { 0, 2, 0, 1, 0 },
                { 3, 0, 0, 0, 4 },
                { 0, 1, 0, 2, 0 },
                { 0, 0, 5, 0, 0 }
        };
        String winds = "URDL";

        int totalLeaves = remainingLeaves(width, height, leaves, winds);

        System.out.println("remaining total leaves = " + totalLeaves);

    }

    public static int remainingLeaves(int width, int height, int[][] leaves, String winds) {

        for (char w : winds.toCharArray()) {
            int[][] next = new int[height][width];

            for (int r = 0; r < height; r++) {
                for (int c = 0; c < width; c++) {

                    int val = leaves[r][c];
                    if (val == 0)
                        continue;

                    int nr = r, nc = c;

                    if (w == 'U')
                        nr = r - 1;
                    else if (w == 'D')
                        nr = r + 1;
                    else if (w == 'L')
                        nc = c - 1;
                    else if (w == 'R')
                        nc = c + 1;

                    // If inside grid → move
                    if (nr >= 0 && nr < height && nc >= 0 && nc < width) {
                        next[nr][nc] += val;
                    }
                    // else → leaves fly away (ignored)
                }
            }

            leaves = next;
        }

        // Sum remaining leaves
        int total = 0;
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                total += leaves[r][c];
            }
        }

        return total;

    }
}
