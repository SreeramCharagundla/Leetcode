import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,3,3,1,1,6,4,4,5};

        Map<Integer, Integer> frequencies = new HashMap<>();

        for(int i:nums){
            if(!frequencies.containsKey(i)){
                frequencies.put(i,1);
            }else{
                int freq = frequencies.get(i);
                freq++;
                frequencies.replace(i, freq);
            }
        }
        for(Map.Entry<Integer,Integer>map : frequencies.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
    }
}
