package array;

public class MaximumNumberOfballons {

    public static void main(String[] args) {
        System.out.print(MaximumBalloons.maximumNumbersOfBalloons("loonbalxballpoon"));
    }
}

class MaximumBalloons {

    public static int maximumNumbersOfBalloons(String str) {
        int b = 0, a = 0, l = 0, o = 0, n = 0, count = 0;
        for (char item : str.toCharArray()) {
            switch (item) {
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
            if (a >= 1 && b >= 1 && n >= 1 && o >= 2 && l >= 2) {
                count++;
                a -= 1;
                b -= 1;
                n -= 1;
                o -= 2;
                l -= 2;
            }
        }
        return count;
    }
}
