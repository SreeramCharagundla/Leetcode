package evalRPN;

import java.util.*;
import java.util.function.BiFunction;

class Solution {

    public static void main(String[] args) {
        String[] tokens = { "2", "1", "+", "3", "*" };
        int result = evalRPN(tokens);
        System.out.println(result);
    }

    private static final Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = new HashMap<>();

    // Ensure this only gets done once for ALL test cases.
    static {
        OPERATIONS.put("+", (a, b) -> a + b);
        OPERATIONS.put("-", (a, b) -> a - b);
        OPERATIONS.put("*", (a, b) -> a * b);
        OPERATIONS.put("/", (a, b) -> a / b);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!OPERATIONS.containsKey(token)) {
                stack.push(Integer.valueOf(token));
                continue;
            }

            int number2 = stack.pop();
            int number1 = stack.pop();
            BiFunction<Integer, Integer, Integer> operation;
            operation = OPERATIONS.get(token);
            int result = operation.apply(number1, number2);
            stack.push(result);
        }

        return stack.pop();
    }
}
