import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s="ab#c", t="ad#c";
        boolean ans = backspaceCompare(s,t);
        System.out.println(ans);
    }

    public static boolean backspaceCompare(String s,String t){

        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c!='#') sStack.push(c);
            else if(c=='#' && sStack.size()==0) continue;
            else if(c=='#' && sStack.size()>=1) sStack.pop();
            else return false;
        }
 
        for(Character c : t.toCharArray()){
            if(c!='#') tStack.push(c);
            else if(c=='#' && tStack.size()==0) continue;
            else if(c=='#' && tStack.size()>=1) tStack.pop();
            else return false;
        }

        return tStack.equals(sStack)?true:false;
    }
}
