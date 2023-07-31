package javaapplication11;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(IsAnagram.isAnagram("murtaza", "azatmur"));
    }

}

class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] v = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(v);
        if (Arrays.equals(c, v)) {
            return true;
        }
        return false;

    }
}
