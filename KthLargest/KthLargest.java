import java.util.PriorityQueue;
import java.util.*;

public class KthLargest {
    List<Integer> arr;
    int k;

    public KthLargest(int k, int[] nums){
        this.k=k;
        arr = new ArrayList<>();

        for(int i=0;i<=nums.length;i++){
            arr.add(nums[i]);
        }
    }
    public int add(int val){
        arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size()-k);
    }

    public static void main(String[] args) {
        KthLargest kth = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kth.add(3));  // returns 4
        System.out.println(kth.add(5));  // returns 5
        System.out.println(kth.add(10)); // returns 5
        System.out.println(kth.add(9));  // returns 8
        System.out.println(kth.add(4));  // returns 8
    }
}
