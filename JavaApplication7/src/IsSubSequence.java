public class IsSubSequence
{
    public static void main(String[] args)
    {
          SubSequence.isSubSequence("abc", "ahbghc");
    }
}
class SubSequence
{
    public static boolean isSubSequence(String str1 , String str2)
    {
        int len1 = str1.length() , len2 = str2.length() ;
        int i = 0 , j = 0;
        while(i < len1 && j < len2)
        {
           if(str1.charAt(i) == str2.charAt(j))
           {
               i++;
           }
           j++;
        }
        
        return i == len1;
    }
}