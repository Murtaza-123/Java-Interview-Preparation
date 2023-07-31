
package array;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args)
    {
        System.out.println(Valid.isValidAnagram("rat", "cat"));
    }
}
class Valid
{
    public static boolean isValidAnagram(String s , String t)
    {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1, s2))
        {
            return true;
        }
        return false;
    }
}
