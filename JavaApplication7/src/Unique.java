
import java.util.Arrays;


public class Unique {
    public static void main(String[] args)
    {
        Distinct.isUnique("shana");
    }
}
class Distinct
{
    public static boolean isUnique(String str)
    {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int len = ch.length-1;
        for(int i = 0; i < len;i++)
        {
            if(ch[i] == ch[i+1])
            {
                return false;
            }
        }
        return true;
    }
}