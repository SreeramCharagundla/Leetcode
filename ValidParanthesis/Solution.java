package ValidParanthesis;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "([{}])";
        boolean isValid = validParanthesis(s);
        System.out.println(isValid);
    }

    public static boolean validParanthesis(String s){

        Stack<Character> checker = new Stack<>();

        for(Character c: s.toCharArray()){
            switch (c){
                case '(':
                checker.push(c);
                break;

                case '{':
                checker.push(c);
                break;

                case '[':
                checker.push(c);
                break;

                case ')':
                if(checker.size()>0 && checker.peek()=='(')
                    checker.pop();
                else
                    return false;
                break;

                case '}':
                if(checker.size()>0 && checker.peek()=='{')
                    checker.pop();
                else
                    return false;
                break;

                case ']':
                if(checker.size()>0 && checker.peek()=='[')
                    checker.pop();
                else
                    return false;
                break;


                default: return false;
            }                
        }

        return checker.empty()?true:false;
    }
}
