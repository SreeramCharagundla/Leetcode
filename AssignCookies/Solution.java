import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count=0;
        while(i<s.length && j<g.length){
            if(g[j]<=s[i]){ 
                count++;
                j++;
            }
            i++;
        }
        return count;
    }
}