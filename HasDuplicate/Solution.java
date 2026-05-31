package HasDuplicate;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };

        Boolean result = hasDuplicate(nums);

        System.out.println(result);
    }

    private static Boolean hasDuplicate(int[] nums) {

        Set<Integer> records = new HashSet<>();

        for (int i : nums) {
            if (!records.contains(i))
                records.add(i);
            else
                return false;
        }

        return true;
    }
}
