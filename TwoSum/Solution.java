package TwoSum;

import java.util.HashMap;

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
        HashMap<Integer,Integer> numIndex = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            numIndex.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];

            if(numIndex.containsKey(diff) && numIndex.get(diff)!=i)
                return new int[]{i,numIndex.get(diff)};
        }
       
        return null;
    }
}
