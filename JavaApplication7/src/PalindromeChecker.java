
public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for (int start = 0, end = str.length() - 1; start < end; start++, end--) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
