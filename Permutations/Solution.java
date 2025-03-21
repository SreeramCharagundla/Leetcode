import java.util.*;

public class Solution{
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> answer = permute(nums);
        System.out.println(answer);
        
    }        
    
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(),ans,nums);
        return ans;
    }

    public static void backtrack(List<Integer> curr, List<List<Integer>> ans, int[] nums){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int num:nums){
            if(!curr.contains(num)){
                curr.add(num);
                backtrack(curr,ans,nums);
                curr.remove(curr.size()-1);
            }
        }
    }
}