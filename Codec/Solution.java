import java.util.ArrayList;
import java.util.List;

class Solution{
	public static void main(String[] args) {
        List<String> strs = java.util.Arrays.asList("sreeram","charagundla","modda","guduv");
        String s = encode(strs);
        System.out.println(s);
        List<String> decodedStrs = decode(s);

        for(String str : decodedStrs){
            System.out.println(str);
        }
    }

    private static List<String> decode(String s) {
        
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#') j++;
            int length = Integer.parseInt(s.substring(i, j));
            i=j+1;
            j=i+length;
            res.add(s.substring(i, j));
            i=j;
        }
        
        return res;    
    }

    private static String encode(List<String> strs) {
        
        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length()).append('#').append(s);
        }
        
        return res.toString();
    }
}