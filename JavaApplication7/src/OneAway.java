

public class OneAway {
    public static void main(String[] args)
    {
        System.out.println(Away.isOneAway("pale", "ple"));
    }
}
class Away
{
    public static boolean isOneAway(String s1 , String s2)
    {
        if(s1.length() == s2.length())
        {
            return isReplace(s1,s2);
        }
        else if(s1.length()+1 == s2.length())
        {
            return isInsertOrRemove(s1,s2);
        }
        else if(s1.length() - 1 == s2.length())
        {
            return isInsertOrRemove(s2,s1);
        }
        return false;
    }
   public static boolean isReplace(String s1 , String s2)
    {
        boolean difference = false;
        for(int i = 0; i < s1.length();i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                if(difference)
                {
                    return false;
                }
                difference = true;
            }
        }
        return true;
        
    }
   public static  boolean isInsertOrRemove(String s1 , String s2)
    {
        int i = 0;
        int j = 0;
        while(j < s2.length() && i < s1.length())
        {
            if(s1.charAt(i) != s2.charAt(j))
            {
                if(i != j)
                {
                    return false;
                }
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
        return true;
    }
}
