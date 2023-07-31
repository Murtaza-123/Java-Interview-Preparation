
public class Urlify {

    public static void main(String[] args) {
        String s = "My name is murtaza   ";
        s = s.trim();
        s = s.replaceAll("\\s", "%20");
        System.out.println(s);
    }

}
