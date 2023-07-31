
public class LenghtOfLastWord {

    public static void main(String[] args) {
        System.out.println(LastWord.lenghtOfLastWord("Hello world     "));
    }
}

class LastWord {

    public static int lenghtOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >=0 && !Character.isLetter(s.charAt(i))) {
            i--;
        }
        int count = 0;
        while (i >=0 && Character.isLetter(s.charAt(i))) {
            count++;
            i--;
        }
        return count;
    }
}
