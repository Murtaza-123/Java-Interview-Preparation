
import java.util.Arrays;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(Valid.validPalindrome("abc"));
    }
}

class Valid {

    public static boolean validPalindrome(String str) {

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
          
            else if ( odd == 1 || odd == 2) {
                return true;
            }
            else
            {
                return true;
            }

        }
        return false;
    }
}
