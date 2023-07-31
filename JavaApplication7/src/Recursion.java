
public class Recursion {

    public static void main(String[] args) {

        System.out.println(fib(5));
    }

    public static int fib(int n) {
        //Base Case
        if (n < 1) {
            return 1;
        } else {
            return n * fib(n-1);
        }

    }
}
