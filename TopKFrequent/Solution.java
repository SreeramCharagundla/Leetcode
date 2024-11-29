package TopKFrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public int[] topKFrequent(int [] nums, int k){
        HashMap<Integer, Integer> countOfOccurrence = new HashMap<>();
        for(int i: nums){
            if(!countOfOccurrence.containsKey(i)){
                countOfOccurrence.put(i,0);                
            }
            countOfOccurrence.replace(i,countOfOccurrence.get(i)+1);
        }

        Map<Integer,Integer> hm1 = sortByValue(countOfOccurrence);
        ArrayList<Integer> ans = new ArrayList<>();

        hm1.forEach((key,value) -> {
            if(ans.size()<k){
                ans.add(key);
            }
        });
        
        int[] res = ans.stream().mapToInt(id -> id).toArray();
        return res;
    }

    public static HashMap<Integer,Integer> sortByValue(HashMap<Integer,Integer> hm){
        HashMap<Integer,Integer> temp = hm.entrySet().stream()
        .sorted((i1,i2)->i2.getValue().compareTo(i1.getValue()))
        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
        (e1,e2)-> e1, LinkedHashMap::new));

        return temp;
    }
}
