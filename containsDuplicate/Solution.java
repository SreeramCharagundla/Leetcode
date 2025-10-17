import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};

        Boolean isValid = containsDuplicate(arr);

        System.out.println(isValid);
    }

    private static Boolean containsDuplicate(int[] nums) {
       Set<Integer> isUnique  = new HashSet<>();

       for(int num:nums){
            if(isUnique.contains(num))
                return true;
            isUnique.add(num);
       }

        return false;
    }
}
