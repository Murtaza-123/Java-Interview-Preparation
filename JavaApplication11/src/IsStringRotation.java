
public class IsStringRotation {

    public static void main(String[] args) {
        System.out.println(StringRotation.isStringRotation("murtaza", "azarutm"));
    }
}

class StringRotation {

    public static boolean isStringRotation(String s1, String s2) {
        String s3 = s1 + s1;

        return s3.contains(s2);

    }
}
