
public class SumArray {

    public static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (isNumber(ar[i])) {
                sum += Integer.parseInt(ar[i]);
            }
        }
        System.out.println(sum);
    }
}
