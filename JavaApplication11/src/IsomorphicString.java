
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class IsomorphicString {
   public static void main(String[] args)
   {
       System.out.println(Isomorphic.isomorphicString("egg", "add"));
   }
}
class Isomorphic
{
    public static boolean isomorphicString(String s , String t)
    {
     Map<Character,Character> map = new HashMap();
      Set<Character> set1 = new HashSet();
      Set<Character> set2 = new HashSet();
     for(int i = 0 ; i < s.length();i++)
     {
         if(!map.containsKey(s.charAt(i)))
         {
             map.put(s.charAt(i), t.charAt(i));
         }
         else if(map.get(s.charAt(i)) != t.charAt(i))
         {
             return false;
         }
         set1.add(s.charAt(i));
         set2.add(t.charAt(i));
     }
        return map == set1 && map == set2;
    }
}
