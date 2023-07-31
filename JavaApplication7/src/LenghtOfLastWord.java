
public class LenghtOfLastWord {
    public static void main(String[] args)
    {
      System.out.println(Solution.LenghtOfLastWord("hello world     "));
 
    }
}
class Solution
{
    public static int LenghtOfLastWord(String s)
    {
      int len = s.length()-1;
      while(!Character.isLetter(s.charAt(len)))
      {
          len--;
          continue;
          
      }
        int count = 0;
      while(len >= 0 && Character.isLetter(s.charAt(len)))
      {
           count++;
            len--;

      }
        return count;
    }
}


