
import java.util.Arrays;

public class comesFromPalindrome {

    public static boolean canMakePalindrome(String str) {
        int[] array = new int[128];
        Arrays.fill(array, 0);
        for (int i = 0; i < str.length(); i++) {
            array[str.charAt(i)]++;
        }
        int odd = 0;
        for (int i = 96; i < 128; i++) {

            if ((array[i] % 2) == 1) {
                odd++;
            }
            if (odd > 1) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(canMakePalindrome("ccatota"));

    }
}
