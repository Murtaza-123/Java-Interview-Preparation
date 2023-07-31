package array;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.print(LongestPrefix.longestCommonPrefix(str));
    }
}

class LongestPrefix {

    public static String longestCommonPrefix(String[] str) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str);
        char[] s = str[0].toCharArray();
        char[] t = str[str.length - 1].toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == t[i]) {
                sb.append(t[i]);
            }
        }
        return sb.toString();

    }
}
