public class ForLoop{
    public static int Increment(WrapperVariable val)
    {
        System.out.println("Incrementing....");
     return val.i++;
    }
    public static boolean Condition(WrapperVariable val,int n)
    {
      System.out.println("If condition is true");  
        return val.i <= n;
    }
    public static void Intialization()
    {
        System.out.println("Intialization....");
    }
    public static void main(String[] args)
    {
        WrapperVariable m = new WrapperVariable();
       for(Intialization();Condition(m,20);Increment(m))
       {
           System.out.println(m.i);
       }
    }
}
class WrapperVariable
{
    int i = 0;
}
