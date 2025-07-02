package TwoSum;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;
        int[] ans = TwoSum(nums, target);
        for(int num: ans){
            System.out.println(num);
        }
        
    }    

    public static int[] TwoSum(int[] nums, int target){
        HashMap<Integer,Integer> indexMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            indexMap.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(indexMap.containsKey(diff) && indexMap.get(diff)!=i){
                return new int[]{i,indexMap.get(diff)};
            }
        }
        return null;
    }
}
