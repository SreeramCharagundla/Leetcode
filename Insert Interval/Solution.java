import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] res = insert(intervals, newInterval);
        System.out.print("[");
        for(int[] a : res){
            System.out.print("[");
            for(int b : a){
                System.out.print(b+",");
            }
            System.out.print("],");
        }
        System.out.print("]");

    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        List<int[]> res = new ArrayList<>();

        // Case 1: No overlapping before merging intervals
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        // Case 2: Overlapping and merging intervals
        while (i < n && newInterval[1] >= intervals[i][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        // Case 3: No overlapping after merging newInterval
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        // Convert List to array
        return res.toArray(new int[res.size()][]);
    }
}