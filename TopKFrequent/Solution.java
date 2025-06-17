package TopKFrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,4,4,1,6,9,0,4,4,7,6};
        int k = 2;

        int[] result = topKFrequent(nums,k);
        for(int n: result)
        System.out.print(n+" ");
    
    }
    public static int[] topKFrequent(int [] nums, int k){
        
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int n: nums){
            freqMap.put(n, freqMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> e : freqMap.entrySet()){
            minHeap.offer(e);

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
