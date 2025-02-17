package evalRPN;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        String[] tokens = { "2", "1", "+", "3", "*" };
        int result = evalRPN(tokens);
        System.out.println(result);
    }

    public static int evalRPN(String[] tokens){

        Stack<Integer> stack = new Stack<>();
        for(String s: tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(s.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a-b);
            }else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a/b);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }        

        return stack.pop();
    }
}
