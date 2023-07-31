
public class compressedString {

    public static String Compressed(String str) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if ((i + 1) > str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {

                builder.append(str.charAt(i));
                builder.append(count);
                
                count = 0;
           
       

            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Compressed("aaaabbbbcccdessssaaaaa"));
    }
}
