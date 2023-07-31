
import java.util.Arrays;


public class ComesFromPalindrome {
    public static void main(String[] args)
    {
        System.out.println(Palindrome.comesFromPalindrome("ccatota"));
    }
}
class Palindrome
{
    public static boolean comesFromPalindrome(String s)
    {
        int[] array = new int[128];
        Arrays.fill(array, 0);
        for(int i = 0; i < s.length();i++)
        {
            array[s.charAt(i)]++;
        }
        int odd = 0;
        for(int i = 96; i < 128;i++)
        {
            if(array[i] % 2 == 1)
            {
                odd++;
            }
            if(odd > 1)
            {
                return false;
            }
        }
        return true;
    }
}
