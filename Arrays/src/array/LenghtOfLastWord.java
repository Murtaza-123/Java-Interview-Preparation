package array;

public class LenghtOfLastWord {

    public static void main(String[] args) {
        System.out.println(FindLengthOflastword.lenghtOflastWord("This is a moon    "));
    }
}

class FindLengthOflastword {

    public static int lenghtOflastWord(String sentence) {
        int count = 0;
        int i = sentence.length() - 1;
        while (!Character.isLetter(sentence.charAt(i))) {
            i--;
        }
        while (i < sentence.length() && Character.isLetter(sentence.charAt(i))) {
            i--;
            count++;
        }
        return count;
    }
}
