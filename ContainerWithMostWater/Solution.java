package ContainerWithMostWater;

public class Solution {
    public static void main(String[] args) {
        int[] heights = { 1, 7, 2, 5, 4, 7, 3, 6 };

        int max = maxArea(heights);
        System.out.println(max);
    }

    private static int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxSoFar = 0;

        while (l < r) {
            int area = (r - l) * Math.min(heights[l], heights[r]);
            maxSoFar = Math.max(area, maxSoFar);

            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxSoFar;
    }
}
