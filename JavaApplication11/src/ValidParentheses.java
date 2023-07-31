
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(Valid.isValidParentheses("{}()[]"));

    }
}

class Valid {

    public static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (char i : str.toCharArray()) {
            if (i == '(') {
                stack.add(')');
            } else if (i == '{') {
                stack.add('}');
            } else if (i == '[') {
                stack.add(']');
            } else if (stack.isEmpty() || stack.pop() != i) {
                return false;
            }
        }
        return true;
    }
}
