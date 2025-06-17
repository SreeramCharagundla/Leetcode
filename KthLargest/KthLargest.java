import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargest(int k, int[] nums){
        this.k=k;
        minHeap = new PriorityQueue<>();
        for(int num:nums){
            add(num);
        }
    }
    public int add(int val){
        minHeap.offer(val);
        if(minHeap.size()>k) minHeap.poll();
        return minHeap.peek();
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
