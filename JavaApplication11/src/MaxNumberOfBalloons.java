
public class MaxNumberOfBalloons {
    public static void main(String[] args)
    {
        System.out.println(MaxNoOfBalloons.noOFBalloons("nlaebolko"));
    }
}
class MaxNoOfBalloons
{
    public static int noOFBalloons(String Text)
    {
        int a = 0 , b = 0 , l = 0 , o = 0 , n = 0,count=0;
        for(char c:Text.toCharArray())
        {
            switch(c)
            {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
                   
            }
             if(a>=1 && b>=1 && n>=1 && l >=2 && o>=2)
                    {
                        count++;
                        a-=1;b-=1;n-=1;l-=2;o-=2;
                    }
        }
        return count;
    }
}
