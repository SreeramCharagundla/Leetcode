import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        
        for(int i : nums1)
        System.out.print( i+" ");
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1copy = Arrays.copyOf(nums1,m);
        int idx = 0;
        int i=0,j=0;

        while(idx<m+n){
            if(j>=n || (i<m && nums1copy[i]<nums2[j])){
                nums1[idx++] = nums1copy[i++];
            }else{
                nums1[idx++] = nums2[j++]; 
            }
        }
    }
}