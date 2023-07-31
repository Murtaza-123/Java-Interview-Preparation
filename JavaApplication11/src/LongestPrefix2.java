
import java.util.Arrays;

public class LongestPrefix2 {

    public static void main(String[] args) {
        String[] array = {"flower", "fire", "flight"};
        System.out.println(Longest2.longestPrefix(array));

    }
}

class Longest2 {

    public static String longestPrefix(String[] str) {
        StringBuilder builder = new StringBuilder();
        Arrays.sort(str);
        char[] s = str[0].toCharArray();
        char[] t = str[str.length - 1].toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == t[i]) {
                builder.append(t[i]);
            }
        }
        return builder.toString();

    }
}
