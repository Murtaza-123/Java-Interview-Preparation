
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {

        Pattern.wordpattern("abba", "dog dog dog dog");

    }
}

class Pattern {

    public static boolean wordpattern(String pattern, String words) {
        String[] str = words.split(" ");
        if (str.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char S = pattern.charAt(i);
            String word = str[i];

            if (map1.containsKey(S)) {
                if (!map1.get(S).equals(word)) {
                    return false;
                }
            } else {
                if(map2.containsKey(word))
                {
                    return false;
                }

                map1.put(S, word);
                map2.put(word, true);
            }

        }

        return true;
    }
}
