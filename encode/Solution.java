import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> input = Arrays.asList("neet", "code", "love", "you");
        String encoded = solution.encode(input);
        List<String> decoded = solution.decode(encoded);

        System.out.println("Input   : " + input);
        System.out.println("Encoded : " + encoded);
        System.out.println("Decoded : " + decoded);
    }

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length());
            encoded.append('#');
            encoded.append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {

            int delimiterIndex = i;

            while (str.charAt(delimiterIndex) != '#') {
                delimiterIndex++;
            }

            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            int startOfString = delimiterIndex + 1;
            String actualString = str.substring(startOfString, startOfString + length);

            decoded.add(actualString);
            i = startOfString + length;
        }
        return decoded;
    }
}
