class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min = nums[i];
            if(nums[i]>max) max = nums[i];
        } 
        max-=k;
        min+=k;
        if(max-min<0) return 0;
        else return max-min;
    }
}
