
class CountDown {

    public static void countDown(int number) {
        //Base Case
        if (number == 1) {
            System.out.println(number);
        } else {
            System.out.println(number);
            countDown(number - 1);
        }
    }

    public static void main(String args[]) {
        CountDown.countDown(5);
    }
}
