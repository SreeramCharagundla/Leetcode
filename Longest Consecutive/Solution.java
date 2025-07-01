import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int n = longestConsecutive(nums);
        System.out.println(n);
    }
    public static int longestConsecutive(int[] nums) {
        
        Set<Integer> num_set = new HashSet<>();
        for(int num:nums){
            num_set.add(num);
        }

        int longestStreak = 0;

        for(int num:num_set){
            if(!num_set.contains(num-1)){
                int currNum = num;
                int currentStreak = 1;
                while(num_set.contains(currNum+1)){
                    currentStreak += 1;
                    currNum+=1;
                }
                longestStreak = Math.max(currentStreak,longestStreak);
            }
        }
        return longestStreak;
    }
}
