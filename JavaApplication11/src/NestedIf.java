
public class NestedIf {

    public static void main(String[] args) {
        System.out.println(Nested.Test(5));
    }
}

class Nested {

    public static int Test(int n) {
        //Base Case
        if (n < 1) {
            return 0;
        } else {
            return n + Test(n - 1);
        }

    }
}
