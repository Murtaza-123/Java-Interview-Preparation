
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(Ananagram.isAnagram("taar", "raat"));
    }
}

class Ananagram {

    public static boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] c = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        boolean result = Arrays.equals(ch, c);
        if (result) {
            return true;
        }
        return false;

    }
}
