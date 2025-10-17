import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,4,4,1,6,9,0,4,4,7,6};
        int k = 2;

        int[] result = topKFrequent(nums,k);
        for(int n: result)
        System.out.print(n+" ");
    
    }
    public static int[] topKFrequent(int [] nums, int k){
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int num:nums){
            countMap.put(num,countMap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
       
        for(Map.Entry<Integer,Integer> entry:countMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i++] = minHeap.poll().getKey();
        }
        return result;
    }
}
