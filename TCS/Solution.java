import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {

        String sentence = "Java is great, and Java is powerful.";

        List<String> uniqueWords = Arrays.stream(sentence.toLowerCase().split("\\W+"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(uniqueWords);
    }
}