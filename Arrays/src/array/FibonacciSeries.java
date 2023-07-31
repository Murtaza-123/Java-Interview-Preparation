package array;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci.fibonacciSeries(i) + " ");
        }
    }
}

class Fibonacci {
    
    public static int fibonacciSeries(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacciSeries(n - 2) + fibonacciSeries(n - 1);
        }
    }
}
