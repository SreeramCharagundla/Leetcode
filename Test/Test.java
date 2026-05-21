package Test;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 5, 5, 2, 3, 4 };

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = Arrays.stream(arr)
                .boxed()
                .filter(num -> !seen.add(num))
                .collect(Collectors.toSet());

        System.out.println(duplicates);

        String s = "hello";
        String reversed = s.chars().mapToObj(c -> (char) c).reduce("", (a, b) -> b + a, (a, b) -> b + a);
        System.out.println(reversed);
    }
}
