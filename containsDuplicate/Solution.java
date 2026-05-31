import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };

        Boolean isValid = containsDuplicate(arr);

        System.out.println(isValid);
    }

    private static Boolean containsDuplicate(int[] nums) {

        Set<Integer> numSet = new HashSet<>();

        for (int n : nums) {
            if (!numSet.contains(n))
                numSet.add(n);
            else
                return true;
        }
        return false;
    }
}
