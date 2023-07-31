
public class isStringRotation {

    public static boolean isRotate(String str1, String str2) {
        if (str1.length() == str2.length() && str1.length() > 0) {
            String s1s1 = str1 + str1;
            return s1s1.contains(str2);

        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isRotate("murtaza", "azamurt"));
    }
}
