public class Solution {
    public static void main(String[] args) {
        int nums[] = new int[]{4,5,0,1,2,3};
        int ans = findMin(nums);
        System.out.println(ans);
    }

    private static int findMin(int[] nums) {

        int left=0, right=nums.length-1;
        

        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid]<nums[right])
                right = mid;
            else left = mid+1;
        }
        return nums[left];
    }
}
