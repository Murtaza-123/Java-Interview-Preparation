
public class TestStringBuilder {

    public static String Reverse(String name) {

        StringBuilder builder = new StringBuilder(name.length());
        for (int i = name.length() - 1; i >= 0; i--) {
            builder.append(name.charAt(i));

        }
        return builder.toString();
    }

    public static void main(String[] args){
        System.out.println(Reverse("murtaza"));

    }
}
