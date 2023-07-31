package twopointers;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(Palindrome.isValidPalindrome("A man, a plan, a canal: Panama"));
    }
}

class Palindrome {

    public static boolean isValidPalindrome(String str) {
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
