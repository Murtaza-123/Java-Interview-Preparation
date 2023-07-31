
import static java.lang.Math.pow;

public class toIntValue {

    public static int stringToInt(String str) {
        int count = 0;
        int len = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            count += Character.getNumericValue(str.charAt(i)) * Math.pow(10, (len - i ));
        }

        return count;
    }

    public static void main(String[] args) {
    stringToInt("123456789");
    }
}
