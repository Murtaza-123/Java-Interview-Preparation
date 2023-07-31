
public class IsSubSequence {

    public static void main(String[] args) {
        Sequence.isSubSequence("axc", "ahbgdc");
    }
}

class Sequence {

    public static boolean isSubSequence(String s, String t) {

        int i = 0, j = 0;
        int len1 = s.length();
        int len2 = t.length();
        while (i < len1 && j < len2) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == len1;
    }
}
