
import java.util.ArrayList;

public class shuffledPalindromeChecker {
    
    public static  boolean isEven(String str) {
        return str.length() % 2 == 0 ;
    }
     public static  boolean isOdd(String str) {
        return str.length() % 2 == 1 ;
    }

    public static boolean comesFromPalindrom(String str) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                list.remove((Character)str.charAt(i));
            } else {
                list.add(str.charAt(i));
            }
           
        }
           
        if (isEven(str) && list.isEmpty()  || (isOdd(str)) && list.size()==1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        comesFromPalindrom("ab");
    }
}
