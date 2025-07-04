package ProductExceptSelf;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = ProductExceptSelf(nums);
        for(int n:res){
            System.out.print(n+" ");
        }
    }

    private static int[] ProductExceptSelf(int[] nums) {
        
        int[] left = new int[nums.length];
        left[0] = 1;
        int[] right = new int[nums.length];
        right[nums.length-1] = 1;

        int[] ans = new int[nums.length];

        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            right[i] = nums[i+1]*right[i+1];
        }

        for(int i=0;i<nums.length;i++){
            ans[i] = left[i]*right[i];
        }

        return ans;
    }
}
